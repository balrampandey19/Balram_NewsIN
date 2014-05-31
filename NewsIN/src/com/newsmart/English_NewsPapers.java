
package com.newsmart;



import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class English_NewsPapers extends Activity {
ListView list;


String[] web = {
		"\tTimes Of India",
			"\n\tHindustan Times",
			"\n\tIndian Express",
			"\n\tDaccan Herald",
			"\n\tThe Hindu",
			"\n\tGreater Kashmir",
			"\n\tHeadlines Today",
			"\n\tIndia Today",
			"\n\tMid Day",
			"\n\tOne India",
			"\n\tMalyalan Manorama"
			
	} ;
	Integer[] imageId = {
			R.drawable.toi,
			R.drawable.hindustantimes,
			R.drawable.indianexpress,
			R.drawable.thehindu,
			R.drawable.greaterkashmir,
			R.drawable.headlines,
			R.drawable.indiatoday,
			R.drawable.midday,
			R.drawable.oneindia,
			R.drawable.malyalam
			
			
			
			
			
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_english__news_papers);
		
		overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
		Cou adapter = new
				Cou(English_NewsPapers.this, web, imageId);
		list=(ListView)findViewById(R.id.listView1);
		ActionBar ab=getActionBar();
		ColorDrawable cd=new ColorDrawable(Color.parseColor("#000000"));
		ab.setBackgroundDrawable(cd);
		ab.setTitle("English NewsPaper List");
		
		//ColorDrawable cd=new ColorDrawable(Color.parseColor("#ff0000"));
		//list.setBackgroundDrawable(cd);
		
				list.setAdapter(adapter);
				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		            @Override
		            public void onItemClick(AdapterView<?> parent, View view,
		                                    int position, long id) {
		                Toast.makeText(English_NewsPapers.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

Toast.makeText(English_NewsPapers.this, "You Clicked at "+ position, Toast.LENGTH_SHORT).show();
if(position==0)
{
	Intent i=new Intent(English_NewsPapers.this,News.class);
	String sss="http://m.timesofindia.com/";
	String aj="The Times of India";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==1)
{
	Intent i=new Intent(English_NewsPapers.this,News.class);
	String sss="http://m.hindustantimes.com/home.action";
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==2)
{
	Intent i=new Intent(English_NewsPapers.this,News.class);
	String sss="http://indianexpress.com/";
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==3)
{
	Intent i=new Intent(English_NewsPapers.this,News.class);
	String sss="http://www.deccanherald.com/";
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==4)
{
	Intent i=new Intent(English_NewsPapers.this,News.class);
	String sss="http://www.thehindu.com/";
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==5)
{
	Intent i=new Intent(English_NewsPapers.this,News.class);
	String sss="http://www.greaterkashmir.com/";
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==6)
{
	Intent i=new Intent(English_NewsPapers.this,News.class);
	String sss="http://headlinestoday.intoday.in/";
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==7)
{
	Intent i=new Intent(English_NewsPapers.this,News.class);
	String sss="http://indiatoday.intoday.in/";
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==8)
{
	Intent i=new Intent(English_NewsPapers.this,News.class);
	String sss="http://www.mid-day.com/";
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==9)
{
	Intent i=new Intent(English_NewsPapers.this,News.class);
	String sss="http://www.oneindia.in/";
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==10)
{
	Intent i=new Intent(English_NewsPapers.this,News.class);
	String sss="http://www.manoramaonline.com/cgi-bin/MMOnline.dll/portal/ep/home.do?tabId=0";
	i.putExtra("Value", sss);
	startActivity(i);
	
}


		            }
		        });
		
		
		
		
	}
	@Override
	public void onBackPressed() {
	    super.onBackPressed();
	    overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.english__news_papers, menu);
		return true;
	}

}
