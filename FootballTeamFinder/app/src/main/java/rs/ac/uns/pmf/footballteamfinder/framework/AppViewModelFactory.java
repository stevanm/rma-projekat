package rs.ac.uns.pmf.footballteamfinder.framework;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import java.lang.reflect.InvocationTargetException;

import rs.ac.uns.pmf.footballteamfinder.core.interactors.Interactors;

public class AppViewModelFactory extends ViewModelProvider.AndroidViewModelFactory {

    private final Application application;
    private final Interactors interactors;

    public AppViewModelFactory(@NonNull Application application, Interactors interactors) {
        super(application);
        this.application = application;
        this.interactors = interactors;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (AppViewModel.class.isAssignableFrom(modelClass)) {
            try {
                return modelClass.getConstructor(Application.class, Interactors.class).newInstance(application, interactors);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        } else {
            throw new IllegalStateException("ViewModel must extend AppViewModel");
        }
        return null;
    }


}
