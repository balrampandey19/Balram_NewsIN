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

public class Malayalam_NewsPaper extends Activity {
	
	
	ListView list;


	String[] web = {
			"\n\tDeshabhimani",
				"\n\tKerala Kaumudi",
				"\n\tMadhyamam",
				"\n\tMangalam",
				"\n\tMalayala Manorama",
				"\n\tMathrubhumi"
				
				
		} ;
		Integer[] imageId = {
				R.drawable.deshabhimani,
				R.drawable.keralakaumudi,
				R.drawable.madhyamam,
	            R.drawable.mangalam,
				R.drawable.malayalamanorama,
				R.drawable.mathrubhumi
		};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_malayalam__news_paper);
		overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
		
		Cou adapter = new
				Cou(Malayalam_NewsPaper.this, web, imageId);
		list=(ListView)findViewById(R.id.listView1);
		ActionBar ab=getActionBar();
		ColorDrawable cd=new ColorDrawable(Color.parseColor("#000000"));
		ab.setBackgroundDrawable(cd);
		ab.setTitle("Malayalam NewsPaper List");
		//ColorDrawable cd=new ColorDrawable(Color.parseColor("#ff0000"));
		//list.setBackgroundDrawable(cd);
		
				list.setAdapter(adapter);
				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		            @Override
		            public void onItemClick(AdapterView<?> parent, View view,
		                                    int position, long id) {
		                Toast.makeText(Malayalam_NewsPaper.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
Object o=position;
String cc=o.toString();

Toast.makeText(Malayalam_NewsPaper.this, "You Clicked at "+ position, Toast.LENGTH_SHORT).show();
if(position==0)
{
	Intent i=new Intent(Malayalam_NewsPaper.this,News.class);
	String sss="http://www.deshabhimani.com/home.php";
	String aj="Deshabhimani";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==1)
{
	Intent i=new Intent(Malayalam_NewsPaper.this,News.class);
	String sss="http://news.keralakaumudi.com/";
	String aj="Kerala Kaumudi";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==2)
{
	Intent i=new Intent(Malayalam_NewsPaper.this,News.class);
	String sss="http://www.madhyamam.com/";
	String aj="Madhyamam";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==3)
{
	Intent i=new Intent(Malayalam_NewsPaper.this,News.class);
	String sss="http://www.mangalam.com/";
	String aj="Mangalam";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==4)
{
	Intent i=new Intent(Malayalam_NewsPaper.this,News.class);
	String sss="http://www.mathrubhumi.com/online/";
	String aj="mathrubhumi";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==4)
{
	Intent i=new Intent(Malayalam_NewsPaper.this,News.class);
	String sss="http://www.manoramaonline.com/cgi-bin/MMOnline.dll/portal/ep/home.do?tabId=0";
	String aj="Malayala Manorama";
	i.putExtra("Name",aj);
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
		getMenuInflater().inflate(R.menu.malayalam__news_paper, menu);
		return true;
	}

}
