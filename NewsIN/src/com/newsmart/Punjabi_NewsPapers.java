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

public class Punjabi_NewsPapers extends Activity {
	ListView list;


	String[] web = {
			"\tAj Di Awaz",
				"\n\tAjit Punjabi Newspaper",
				"\n\tJag Bani",
				"\n\tPunjabi Jagran",
				"\n\tPunjab bitri",
				"\n\tPunjabi Times",
				"\n\tRozana Apokeman"
				
				
		} ;
		Integer[] imageId = {
				R.drawable.ajdiawaz,
				R.drawable.ajitpunjabipaper,
				R.drawable.jagvani,
				R.drawable.punjabijagran,
				R.drawable.punjabitri,
				R.drawable.punjabtimes,
				R.drawable.rozanaspokesmanlogo
				
				
			
				
				
				
				
		};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_punjabi__news_papers);
		
		overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
		
		
		Cou adapter = new
				Cou(Punjabi_NewsPapers.this, web, imageId);
		list=(ListView)findViewById(R.id.listView1);
		ActionBar ab=getActionBar();
		ColorDrawable cd=new ColorDrawable(Color.parseColor("#000000"));
		ab.setBackgroundDrawable(cd);
		ab.setTitle("Punjabi NewsPaper List");
		//ColorDrawable cd=new ColorDrawable(Color.parseColor("#ff0000"));
		//list.setBackgroundDrawable(cd);
		
				list.setAdapter(adapter);
				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		            @Override
		            public void onItemClick(AdapterView<?> parent, View view,
		                                    int position, long id) {
		                Toast.makeText(Punjabi_NewsPapers.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
Object o=position;
String cc=o.toString();

Toast.makeText(Punjabi_NewsPapers.this, "You Clicked at "+ position, Toast.LENGTH_SHORT).show();
if(position==0)
{
	Intent i=new Intent(Punjabi_NewsPapers.this,News.class);
	String sss="http://www.ajdiawaaz.com/";
	String aj="Aj Di Awaaz";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==1)
{
	Intent i=new Intent(Punjabi_NewsPapers.this,News.class);
	String sss="http://beta.ajitjalandhar.com/";
	String aj="Ajit";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==2)
{
	Intent i=new Intent(Punjabi_NewsPapers.this,News.class);
	String sss="http://www.jagbani.com/";
	String aj="Jag Bani";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==3)
{
	Intent i=new Intent(Punjabi_NewsPapers.this,News.class);
	String sss="http://punjabi.jagran.com/";
	String aj="Panjabi Jagran";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}

if(position==5)
{
	Intent i=new Intent(Punjabi_NewsPapers.this,News.class);
	String sss="http://www.dailypunjabtimes.com/welcome/";
	String aj="Panjab Times";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==6)
{
	Intent i=new Intent(Punjabi_NewsPapers.this,News.class);
	String sss="http://www.rozanaspokesman.com/";
	String aj="Panjab Times";
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
		getMenuInflater().inflate(R.menu.punjabi__news_papers, menu);
		return true;
	}

}
