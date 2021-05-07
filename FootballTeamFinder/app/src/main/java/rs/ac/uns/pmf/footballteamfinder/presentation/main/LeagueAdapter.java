package rs.ac.uns.pmf.footballteamfinder.presentation.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import rs.ac.uns.pmf.footballteamfinder.R;
import rs.ac.uns.pmf.footballteamfinder.core.domain.League;

public class LeagueAdapter extends RecyclerView.Adapter<LeagueAdapter.ViewHolder> {

    private Context context;

    List<League> leagues = new ArrayList<>();

    public LeagueAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.league_row_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        League league = leagues.get(position);

        holder.getLeagueNameTextView().setText(league.getName() == null || league.getName().isEmpty() ? "No data" : league.getName());
        holder.getLeagueCountryTextView().setText(league.getCountry() == null || league.getCountry().isEmpty() ? "No data" : league.getCountry());
        Picasso.get()
                .load(league.getLogo())
                .resize(60, 60)
                .into(holder.getImageView());

        holder.itemView.setOnClickListener(v ->
                ((MainActivity) context).onLeagueItemClick(leagues.get(position))
        );
    }

    @Override
    public int getItemCount() {
        return leagues.size();
    }


    public void setList(List<League> leagueList) {
        this.leagues = leagueList;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView leagueName;
        private TextView leagueCountry;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.logo);
            leagueName = itemView.findViewById(R.id.leagueName);
            leagueCountry = itemView.findViewById(R.id.leagueCountry);
        }

        public ImageView getImageView() {
            return imageView;
        }

        public TextView getLeagueNameTextView() {
            return leagueName;
        }

        public TextView getLeagueCountryTextView() {
            return leagueCountry;
        }

    }
}
