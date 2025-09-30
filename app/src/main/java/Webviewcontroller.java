import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Webviewcontroller extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String Url) {
        view.loadUrl(Url);


        return true;
    }
}
