package com.newsmart;




import com.newsmart.R.id;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.view.Menu;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {
ProgressBar pb;
int myprogres=0;

Integer img=R.drawable.nlogo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
		
		
		
		//ActionBar ab=getActionBar();
		//ColorDrawable cd=new ColorDrawable(Color.parseColor("#ff9900"));
		//ab.setBackgroundDrawable(cd);
		//ab.setIcon(img);
		//pb=(ProgressBar)findViewById(R.id.progressBar1);
		 
		new Thread(myThread).start();
		}
			 
		private Runnable myThread = new Runnable(){
			 
		@Override
		public void run() 
		{
		// TODO Auto-generated method stub
		while (myprogres<100)
		{
		 try
		  {
			
		  myHandle.sendMessage(myHandle.obtainMessage());
		  Thread.sleep(20);
		  }
		 catch(Throwable t)
		  { }
		}
		Intent i=new Intent(MainActivity.this,Select_Language.class);
		startActivity(i);
		finish();
		}
			 
		Handler myHandle = new Handler()
		{

		@Override
		public void handleMessage(Message msg) 
		{
		// TODO Auto-generated method stub
			myprogres++;
		//pb.setProgress(myprogres);

		}
		};
		};
	
public void abc(View v)
{
	Intent i=new Intent(MainActivity.this,Select_Language.class);
	startActivity(i);
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
