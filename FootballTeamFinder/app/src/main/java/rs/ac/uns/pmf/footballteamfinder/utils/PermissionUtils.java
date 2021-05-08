package rs.ac.uns.pmf.footballteamfinder.utils;

import android.Manifest;

public class PermissionUtils {

    // public static final int REQUIRED_PERMISSION = 1;

    // required permission
    public static String[] requiredPermissions = new String[]{
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

}
