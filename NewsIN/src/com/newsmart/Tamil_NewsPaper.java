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

public class Tamil_NewsPaper extends Activity {
	ListView list;


	String[] web = {
			"\tBBC Tamil",
				"\n\tDinasudar",
				"\n\tDina Mani",
				"\n\tMalai Malar",
				"\n\tOne India Tamil",
				"\n\tDina Thanthi",
				"\n\tTheekkathir",
				"\n\tThe Hindu Tamil"
				
				
		} ;
		Integer[] imageId = {
				R.drawable.bbctamil,
				R.drawable.dina,
				
				R.drawable.dinamanipaper,
				R.drawable.malaimalar,
				R.drawable.oneindiatamil,
				R.drawable.dinathanthi,
				R.drawable.theekkathirogo,
				R.drawable.thehindutamillogo,
				R.drawable.head,
			
				
			
				
				
				
				
		};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tamil__news_paper);
		
		overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
		Cou adapter = new
				Cou(Tamil_NewsPaper.this, web, imageId);
		list=(ListView)findViewById(R.id.listView1);
		ActionBar ab=getActionBar();
		ColorDrawable cd=new ColorDrawable(Color.parseColor("#000000"));
		ab.setBackgroundDrawable(cd);
		ab.setTitle("Tamil NewsPaper List");
		//ColorDrawable cd=new ColorDrawable(Color.parseColor("#ff0000"));
		//list.setBackgroundDrawable(cd);
		
				list.setAdapter(adapter);
				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		            @Override
		            public void onItemClick(AdapterView<?> parent, View view,
		                                    int position, long id) {
		                Toast.makeText(Tamil_NewsPaper.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
Object o=position;
String cc=o.toString();

Toast.makeText(Tamil_NewsPaper.this, "You Clicked at "+ position, Toast.LENGTH_SHORT).show();
if(position==0)
{
	Intent i=new Intent(Tamil_NewsPaper.this,News.class);
	String sss="http://www.bbc.co.uk/tamil/";
	String aj="BBC Tamil";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==1)
{
	Intent i=new Intent(Tamil_NewsPaper.this,News.class);
	String sss="http://www.dinasudar.co.in/";
	String aj="Dinasudar";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==2)
{
	Intent i=new Intent(Tamil_NewsPaper.this,News.class);
	String sss="http://www.dinamani.com/";
	String aj="Dina Mani";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==3)
{
	Intent i=new Intent(Tamil_NewsPaper.this,News.class);
	String sss="http://www.maalaimalar.com/";
	String aj="Maalaimalar";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==4)
{
	Intent i=new Intent(Tamil_NewsPaper.this,News.class);
	String sss="http://tamil.oneindia.in/";
	String aj="One India Tamil";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==5)
{
	Intent i=new Intent(Tamil_NewsPaper.this,News.class);
	String sss="http://www.dailythanthi.com/";
	String aj="Daily Thanthi";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==6)
{
	Intent i=new Intent(Tamil_NewsPaper.this,News.class);
	String sss="http://theekkathir.in/";
	String aj="TheekKathir";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==7)
{
	Intent i=new Intent(Tamil_NewsPaper.this,News.class);
	String sss="http://www.thehindu.com/news/national/tamil-nadu/";
	String aj="Thehindu Tamil";
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
		getMenuInflater().inflate(R.menu.tamil__news_paper, menu);
		return true;
	}

}
