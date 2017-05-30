package endlessentertainment.endlessentertainment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Fragment_Facebook extends Fragment {

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_facebook, container, false);

        WebView view = (WebView) rootView.findViewById(R.id.webview);
        view.setWebViewClient(new WebViewClient());
        String url = "https://www.facebook.com/endlessentertainment.de";
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);

        return rootView ;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Facebook");
    }
}
