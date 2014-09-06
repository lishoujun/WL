package mars.word;

import mars.bigwork.R;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class Word extends Activity {
	private TextView tips;
	private EditText editText;
	private WebView webView;
	private String[] url = {"file:///android_asset/en2cn.html",
			"file:///android_asset/cn2en.html"};
	private String[] chooseStr={"英语->简体中文","简体中文->英语"};
	private Handler tHandler = new Handler();
		
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word);
        
        webView=(WebView)findViewById(R.id.toutput);
        final Button submit=(Button)findViewById(R.id.submit);
        editText=(EditText)findViewById(R.id.tinput);
        tips=(TextView)findViewById(R.id.tips);
        final Spinner l_select=(Spinner)findViewById(R.id.l_select);
  
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, 
        		android.R.layout.simple_spinner_item,chooseStr);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); 
        l_select.setPrompt("请选择翻译的方式");
        l_select.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				if(((TextView)arg1).getText()==chooseStr[0])
					webView.loadUrl(url[0]);
				if(((TextView)arg1).getText()==chooseStr[1])
					webView.loadUrl(url[1]);	
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				webView.loadUrl(url[0]);
			}
		});
        l_select.setAdapter(adapter);
        
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSaveFormData(false);
        webSettings.setSavePassword(false);
        webSettings.setSupportZoom(false);
        
        submit.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				tips.setVisibility(TextView.VISIBLE);
				webView.setVisibility(WebView.VISIBLE);
				tHandler.post(new Runnable(){
			        public void run(){
			          if (editText.getText().toString() != ""){
			        	  webView.loadUrl("javascript:translate('"+ 
			        			  editText.getText().toString() + "')");
			          }
			        }
			    });
			}
		});
    }
}
// editText.getText().toString()