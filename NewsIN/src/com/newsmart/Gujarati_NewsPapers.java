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

public class Gujarati_NewsPapers extends Activity {
ListView  list;
String[] web = {
		"\n\t Aaj Kaal Daily Newspaper",
			"\n\tBombay Samachar",
			"\n\tSambhaav Newspaper",
			"\n\t Akila Daily",
			"\n\tGujarat Samachar",
			"\n\tSandesh"
			
	} ;
	Integer[] imageId = {
			R.drawable.aajkaal,
			R.drawable.bombay,
			R.drawable.sambhaav,
			R.drawable.akiladaily,
			R.drawable.gujsamachar,
			R.drawable.sandeshlogo
			
			
			
			
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gujarati__news_papers);
		overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
		Cou adapter = new
				Cou(Gujarati_NewsPapers.this, web, imageId);
		list=(ListView)findViewById(R.id.listView1);
		ActionBar ab=getActionBar();
		ColorDrawable cd=new ColorDrawable(Color.parseColor("#000000"));
		ab.setBackgroundDrawable(cd);
		ab.setTitle("Gujarati NewsPaper List");
		//ColorDrawable cd=new ColorDrawable(Color.parseColor("#ff0000"));
		//list.setBackgroundDrawable(cd);
		
				list.setAdapter(adapter);
				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		            @Override
		            public void onItemClick(AdapterView<?> parent, View view,
		                                    int position, long id) {
		                Toast.makeText(Gujarati_NewsPapers.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
Object o=position;
String cc=o.toString();

Toast.makeText(Gujarati_NewsPapers.this, "You Clicked at "+ position, Toast.LENGTH_SHORT).show();
if(position==0)
{
	Intent i=new Intent(Gujarati_NewsPapers.this,News.class);
	String sss="http://www.aajkaaldaily.com/home/today/index.htm";
	String aj="AajKaal Daily";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==1)
{
	Intent i=new Intent(Gujarati_NewsPapers.this,News.class);
	String sss="http://www.bombaysamachar.com/frmHome.aspx?City=1";
	String aj="Bombay Samachar";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==2)
{
	Intent i=new Intent(Gujarati_NewsPapers.this,News.class);
	String sss="http://www.sambhaav.com/";
	String aj="Sambhaav";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==3)
{
	Intent i=new Intent(Gujarati_NewsPapers.this,News.class);
	String sss="http://www.akilanews.com/";
	String aj="Akila news";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==4)
{
	Intent i=new Intent(Gujarati_NewsPapers.this,News.class);
	String sss="http://www.gujaratsamachar.com/";
	String aj="Gujarat Samachar";
	i.putExtra("Name",aj);
	i.putExtra("Value", sss);
	startActivity(i);
	
}
if(position==5)
{
	Intent i=new Intent(Gujarati_NewsPapers.this,News.class);
	String sss="http://www.sandesh.com/";
	String aj="Sanndesh";
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
		getMenuInflater().inflate(R.menu.gujarati__news_papers, menu);
		return true;
	}

	         

}



