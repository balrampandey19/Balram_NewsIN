
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

public class Talugu_NewsPaper extends Activity {
	ListView list;


	String[] web = {
			"\tAndhra Bhoomi",
				"\n\tAndhra Prabha",
				"\n\tPraja Sakti",
				"\n\tSakshi",
				"\n\tSurya"
				
				
		} ;
		Integer[] imageId = {
				R.drawable.andhrabhoomi,
				R.drawable.andhraprabhaepaper,
				
				R.drawable.prajasakthi,
				R.drawable.sakshi,
				R.drawable.surya
				
			
				
			
				
				
				
				
		};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_talugu__news_paper);
		
		overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
		Cou adapter = new
				Cou(Talugu_NewsPaper.this, web, imageId);
		list=(ListView)findViewById(R.id.listView1);
		ActionBar ab=getActionBar();
		ColorDrawable cd=new ColorDrawable(Color.parseColor("#000000"));
		ab.setBackgroundDrawable(cd);
		ab.setTitle("Talugu NewsPaper List");
		//ColorDrawable cd=new ColorDrawable(Color.parseColor("#ff0000"));
		//list.setBackgroundDrawable(cd);
		
				list.setAdapter(adapter);
				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		            @Override
		            public void onItemClick(AdapterView<?> parent, View view,
		                                    int position, long id) {
		                Toast.makeText(Talugu_NewsPaper.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
Object o=position;
String cc=o.toString();

Toast.makeText(Talugu_NewsPaper.this, "You Clicked at "+ position, Toast.LENGTH_SHORT).show();
if(position==0)
{
	Intent i=new Intent(Talugu_NewsPaper.this,News.class);
	String sss="http://www.andhrabhoomi.net/";
	String aj="Andhra Bhoomi";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==1)
{
	Intent i=new Intent(Talugu_NewsPaper.this,News.class);
	String sss="http://www.andhraprabha.com/";
	String aj="Andhra Prabha";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==2)
{
	Intent i=new Intent(Talugu_NewsPaper.this,News.class);
	String sss="http://www.prajasakti.com/";
	String aj="Praja Sakti";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==3)
{
	Intent i=new Intent(Talugu_NewsPaper.this,News.class);
	String sss="http://www.sakshi.com/";
	String aj="Sakshi";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==4)
{
	Intent i=new Intent(Talugu_NewsPaper.this,News.class);
	String sss="http://www.suryaa.com/";
	String aj="Suryaa";
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
		getMenuInflater().inflate(R.menu.talugu__news_paper, menu);
		return true;
	}

}
