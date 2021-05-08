package rs.ac.uns.pmf.footballteamfinder.presentation.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.button.MaterialButton;

import org.osmdroid.api.IMapController;
import org.osmdroid.config.Configuration;
import org.osmdroid.events.MapListener;
import org.osmdroid.events.ScrollEvent;
import org.osmdroid.events.ZoomEvent;
import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.views.CustomZoomButtonsController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

import java.util.Objects;

import rs.ac.uns.pmf.footballteamfinder.BuildConfig;
import rs.ac.uns.pmf.footballteamfinder.R;
import rs.ac.uns.pmf.footballteamfinder.framework.LeagueViewModel;
import rs.ac.uns.pmf.footballteamfinder.presentation.App;
import rs.ac.uns.pmf.footballteamfinder.presentation.BaseFragment;


public class MapFragment extends BaseFragment {

    private MainActivity mainActivityContext;

    private LeagueViewModel mLeagueViewModel;

    private MapView map;
    private Marker marker;

    private MaterialButton setLocationButton;

    private boolean isReloadedData = false;

    public static MapFragment newInstance() {
        Bundle args = new Bundle();
        MapFragment fragment = new MapFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.mainActivityContext = (MainActivity) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_map, container, false);
    }


    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // load/initialize 'map' lib configuration
        Context ctx = mainActivityContext.getApplicationContext();
        Configuration.getInstance().load(ctx, PreferenceManager.getDefaultSharedPreferences(ctx));

        setLocationButton = view.findViewById(R.id.set_location);
        map = view.findViewById(R.id.map);

        GeoPoint initPosition = new GeoPoint(45.0, 21.0);
        setupMaps(map, initPosition.getLatitude(), initPosition.getLongitude(), 5, 1, 20);

        map.getController().setZoom(5.0);
        map.getController().animateTo(initPosition);

        map.addMapListener(new MapListener() {
            @Override
            public boolean onScroll(ScrollEvent event) {
                marker.setPosition(new GeoPoint(map.getMapCenter()));
                return false;
            }

            @Override
            public boolean onZoom(ZoomEvent event) {
                return false;
            }
        });

        // show marker
        marker = new Marker(map);
        marker.setPosition(initPosition);
        marker.setPosition(initPosition);
        marker.setIcon(getResources().getDrawable(R.drawable.ic_pin_location));
        marker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);

        marker.setTitle(getString(R.string.set_location_of_issue_on_map));
        if (!marker.isInfoWindowOpen()) {
            marker.showInfoWindow();
        }
        map.getOverlays().add(marker);

        setLocationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLeagueViewModel.executeGetReverseGeoCoddingAddressData(marker.getPosition().getLongitude(),
                        marker.getPosition().getLatitude());
                isReloadedData = true;
            }
        });

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mLeagueViewModel = new ViewModelProvider(requireActivity(), ((App) Objects.requireNonNull(getActivity()).getApplication()).getAppViewModelFactory()).get(LeagueViewModel.class);

        if (!isReloadedData) {
            mLeagueViewModel.addressData.observe(requireActivity(), address ->
            {
                if (null != address) {
                    mainActivityContext.getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, LeagueFragment.newInstance(address.getCountry()))
                            .addToBackStack(null)
                            .commit();
                }
            });
        }

    }

    private void setupMaps(MapView map, double latitude, double longitude, double zoomLevel,
                           int zoomMinLevel, int zoomMaxLevel) {

        //setup WTS resource server
        OnlineTileSourceBase onlineTileSourceBase = new OnlineTileSourceBase("OSM", zoomMinLevel, zoomMaxLevel, 256, ".png",
                new String[]{BuildConfig.WMS_TILE_BASE_URL}) {
            @Override
            public String getTileURLString(long pMapTileIndex) {
                return getBaseUrl()
                        + MapTileIndex.getZoom(pMapTileIndex)
                        + "/" + MapTileIndex.getX(pMapTileIndex)
                        + "/" + MapTileIndex.getY(pMapTileIndex)
                        + mImageFilenameEnding;
            }
        };
        map.setTileSource(onlineTileSourceBase);

        //set zoom and map point focus
        GeoPoint startPoint = new GeoPoint(latitude, longitude);
        IMapController mapController = map.getController();
        mapController.setZoom(zoomLevel);
        map.getZoomController().setVisibility(CustomZoomButtonsController.Visibility.NEVER);
        map.setMultiTouchControls(true);
        map.setFlingEnabled(true);
        mapController.setCenter(startPoint);
    }

}