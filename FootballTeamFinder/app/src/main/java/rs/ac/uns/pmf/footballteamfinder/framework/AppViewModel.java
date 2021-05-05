package rs.ac.uns.pmf.footballteamfinder.framework;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import rs.ac.uns.pmf.footballteamfinder.core.interactors.Interactors;

public class AppViewModel extends AndroidViewModel {

    private final Application application;
    private final Interactors interactors;

    public AppViewModel(@NonNull Application application, Interactors interactors) {
        super(application);
        this.application = application;
        this.interactors = interactors;
    }

    public Interactors getInteractors() {
        return interactors;
    }

}