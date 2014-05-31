package com.newsmart;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Business_NewsPaper extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_business__news_paper);
		overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
	}
	@Override
	public void onBackPressed() {
	    super.onBackPressed();
	    overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.business__news_paper, menu);
		return true;
	}

}
