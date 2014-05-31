package com.newsmart;


import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class News extends Activity {
WebView web;
ProgressBar pb;
String url;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
		setContentView(R.layout.activity_news);
		web=(WebView)findViewById(R.id.webView1);
		
		web.setWebViewClient(new WebViewClient());
		pb=(ProgressBar)findViewById(R.id.progressBar1);
		ActionBar ab=getActionBar();
		ColorDrawable cd=new ColorDrawable(Color.parseColor("#000000"));
		ab.setBackgroundDrawable(cd);
		ab.setDisplayHomeAsUpEnabled(true);
		
		WebSettings ws=web.getSettings();
		ws.setBuiltInZoomControls(true);
		ws.setUserAgentString("Mozilla/5.0 (Linux; U; Android 2.2; en-us; Nexus One Build/FRF91) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1");
		
		web.setWebViewClient(new WebViewClient());
		
		web.setWebChromeClient(new WebChromeClient() {

	        // this will be called on page loading progress

	        @Override

	        public void onProgressChanged(WebView view, int newProgress) {

	            super.onProgressChanged(view, newProgress);


	            pb.setProgress(newProgress);

	            // hide the progress bar if the loading is complete

	            if (newProgress == 100) {

	                pb.setVisibility(View.VISIBLE);

	            } else {

	                pb.setVisibility(View.VISIBLE);

	            }

	        }

	    });
		
		
		
		
		
		
		
		//ws.enableSmoothTransition(true);
		web.getSettings().setJavaScriptEnabled(true);
		Intent i=getIntent();
		i.getExtras();
		url=i.getStringExtra("Value");
		String name=i.getStringExtra("Name");
		ab.setTitle(name);
		web.loadUrl(url);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		//return super.onKeyDown(keyCode, event);
		if(event.getAction()==KeyEvent.ACTION_DOWN)
		{
			switch(keyCode)
			{
            case KeyEvent.KEYCODE_BACK:
                if(web.canGoBack()){
                    web.goBack();
                }else{
                    finish();
                }
                return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }
		
	@Override
	public void onBackPressed() {
	    super.onBackPressed();
	    overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);
	}
	
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.action_refresh:
	        	web.loadUrl(url);
	            return true;
	        case R.id.action_search:
	           Intent ii=new Intent(this,Select_Language.class);
	           startActivity(ii);
	            return true;
	        case R.id.item4:
	        	web.loadUrl("https://docs.google.com/spreadsheet/viewform?fromEmail=true&formkey=dExNSWxnWmduU0JCSlVKZ0RCTlFmcHc6MA");
	        	return true;
	        case R.id.item3:
	        	web.loadUrl("http://newsinpbr.wix.com/newsin");
	        	return true;
	        case R.id.item2:
	        	Intent send=new Intent();
	        	send.setAction(Intent.ACTION_SEND);
	        	send.putExtra(Intent.EXTRA_STREAM,url);
	        	send.setType("text/plain");
	        	startActivity(Intent.createChooser(send, getResources().getText(R.string.send)));
	        	return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_main, menu);
		return true;
	}

}
