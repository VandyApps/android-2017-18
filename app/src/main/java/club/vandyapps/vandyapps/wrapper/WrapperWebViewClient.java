package club.vandyapps.vandyapps.wrapper;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WrapperWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}