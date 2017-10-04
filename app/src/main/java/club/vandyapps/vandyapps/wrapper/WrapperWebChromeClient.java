package club.vandyapps.vandyapps.wrapper;

import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;

public class WrapperWebChromeClient extends WebChromeClient {
    @Override
    public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
        callback.invoke(origin, true, true);
    }
}