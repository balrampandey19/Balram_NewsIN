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

public class Marathi_NewsPaper extends Activity {
	
	
	
			
				
			
				
				
				
				
	ListView list;


	String[] web = {
			"\n\tDivya Marathi",
				"\n\tLokmanya Lokshakti",
				"\n\tLokmat",
				"\n\tMaharastra Times",
				"\n\tPudhari",
				"\n\tSakal"
				
				
		} ;
		Integer[] imageId = {
				R.drawable.divyamarathi,
				R.drawable.lokmanyalokshakti,
				
				R.drawable.lokmatm,
				R.drawable.maharashtratimes,
				R.drawable.pudhari,
				R.drawable.sakalmasthead
		};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_marathi__news_paper);
		overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
		overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
		Cou adapter = new
				Cou(Marathi_NewsPaper.this, web, imageId);
		list=(ListView)findViewById(R.id.listView1);
		ActionBar ab=getActionBar();
		ColorDrawable cd=new ColorDrawable(Color.parseColor("#000000"));
		ab.setBackgroundDrawable(cd);
		ab.setTitle("Marathi NewsPaper List");
		//ColorDrawable cd=new ColorDrawable(Color.parseColor("#ff0000"));
		//list.setBackgroundDrawable(cd);
		
				list.setAdapter(adapter);
				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		            @Override
		            public void onItemClick(AdapterView<?> parent, View view,
		                                    int position, long id) {
		                Toast.makeText(Marathi_NewsPaper.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

Toast.makeText(Marathi_NewsPaper.this, "You Clicked at "+ position, Toast.LENGTH_SHORT).show();
if(position==0)
{
	Intent i=new Intent(Marathi_NewsPaper.this,News.class);
	String sss="http://divyamarathi.bhaskar.com/";
	String aj="Divya Marathi";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==1)
{
	Intent i=new Intent(Marathi_NewsPaper.this,News.class);
	String sss="http://www.amarujala.com/";
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==2)
{
	Intent i=new Intent(Marathi_NewsPaper.this,News.class);
	String sss="http://onlinenews1.lokmat.com/staticpages/editions/today/main/MainEdition-MainNews.php";
	String aj="Lokmat";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==3)
{
	Intent i=new Intent(Marathi_NewsPaper.this,News.class);
	String sss="http://maharashtratimes.indiatimes.com/";
	String aj="Maharastra Times";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==4)
{
	Intent i=new Intent(Marathi_NewsPaper.this,News.class);
	String sss="http://epaper.pudhari.com/epapermain.aspx";
	String aj="Pudhari";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==5)
{
	Intent i=new Intent(Marathi_NewsPaper.this,News.class);
	String sss="http://www.esakal.com/";
	String aj="Sakal";
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
		getMenuInflater().inflate(R.menu.marathi__news_paper, menu);
		return true;
	}

}
