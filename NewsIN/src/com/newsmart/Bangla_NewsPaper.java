package com.newsmart;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;




public class Bangla_NewsPaper extends Activity {
	
	ListView list;


	String[] web = {
			"\tAaj Kaal",
				"\n\tAnandbazar Patrika",
				"\n\tBartaman",
				"\n\tBBC Bangla",
				"\n\tEi-Anmay",
				"\n\tGanadabi",
				"\n\tThe Stateman",
				"\n\tCentury Sangbad",
				"\n\tThe Telegraph",
				"\n\tSangbad Pratidin"
				
		} ;
		Integer[] imageId = {
				R.drawable.ajkaalogo,
				R.drawable.anandabazar,
				R.drawable.bartamanlogo,
				R.drawable.bbcbangla,
				R.drawable.eisamay,
				R.drawable.ganashakti,
				R.drawable.statesmanlogo,
				R.drawable.head,
				R.drawable.telegraphlogo,
				R.drawable.sangbadpratidin
				
			
				
				
				
				
		};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bangla__news_paper);
		
		overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
		
		
		Cou adapter = new
				Cou(Bangla_NewsPaper.this, web, imageId);
		list=(ListView)findViewById(R.id.listView1);
		ActionBar ab=getActionBar();
		ColorDrawable cd=new ColorDrawable(Color.parseColor("#000000"));
		ab.setBackgroundDrawable(cd);
		ab.setTitle("Bangla NewsPaper List");
		//ColorDrawable cd=new ColorDrawable(Color.parseColor("#ff0000"));
		//list.setBackgroundDrawable(cd);
		
				list.setAdapter(adapter);
				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		            @Override
		            public void onItemClick(AdapterView<?> parent, View view,
		                                    int position, long id) {
		                Toast.makeText(Bangla_NewsPaper.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
Object o=position;
String cc=o.toString();

Toast.makeText(Bangla_NewsPaper.this, "You Clicked at "+ position, Toast.LENGTH_SHORT).show();
if(position==0)
{
	Intent i=new Intent(Bangla_NewsPaper.this,News.class);
	String sss="http://www.aajkaal.net/";
	String aj="AajKaal";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==1)
{
	Intent i=new Intent(Bangla_NewsPaper.this,News.class);
	String sss="http://www.anandabazar.com/";
	String aj="Anandabazar";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==2)
{
	Intent i=new Intent(Bangla_NewsPaper.this,News.class);
	String sss="http://bartamanpatrika.com/";
	String aj="Bartaman Patrika";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==3)
{
	Intent i=new Intent(Bangla_NewsPaper.this,News.class);
	String sss="http://www.bbc.co.uk/bengali/mobile/";
	String aj="BBC Bangali";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==4)
{
	Intent i=new Intent(Bangla_NewsPaper.this,News.class);
	String sss="http://eisamay.indiatimes.com/";
	String aj="Ei-Samay";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==5)
{
	Intent i=new Intent(Bangla_NewsPaper.this,News.class);
	String sss="http://www.ganadabi.in/resources/ganadabi.htm";
	String aj="Ganadabi";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==6)
{
	Intent i=new Intent(Bangla_NewsPaper.this,News.class);
	String sss="http://www.thestatesman.net/";
	String aj="The Stateman";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==7)
{
	Intent i=new Intent(Bangla_NewsPaper.this,News.class);
	String sss="http://www.suprovat.com/";
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==8)
{
	Intent i=new Intent(Bangla_NewsPaper.this,News.class);
	String sss="http://www.telegraphindia.com/";
	String aj="The Telegraph";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==9)
{
	Intent i=new Intent(Bangla_NewsPaper.this,News.class);
	String sss="http://epratidin.in/";
	String aj="Sangbad Pratidin";
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
		getMenuInflater().inflate(R.menu.bangla__news_paper, menu);
		return true;
	}

}
