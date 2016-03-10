package pjx.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true); //Activar JavaScript
        myWebView.addJavascriptInterface(new WebAppInterface(this), "Android");//Creen Toast Mensajes
        myWebView.setWebViewClient(new WebViewClient()); //Para que los links sean abiertos tambien en Webview y no en navegador
        myWebView.loadUrl("http://rarup777.github.io/");

    }
}
