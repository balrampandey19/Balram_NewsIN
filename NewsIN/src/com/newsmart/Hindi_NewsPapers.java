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

public class Hindi_NewsPapers extends Activity {
ListView list;
String[] web = {
	"\tAajTak",
		"\n\tAmar Ujala",
		"\n\tBBC Hindi",
		"\n\tDanik Bhasker",
		"\n\tHindustan",
		"\n\tRastriya Sahara",
		"\n\tNai Duniya",
		"\n\tNavBharat Times",
		"\n\tRajasthan Patrika",
		"\n\tDanik Jagran",
		"\n\tNDTV India",
		"\n\tTez",
		"\n\tRanchi Express",
		"\n\tONE India",
		"\n\tNews 24",
		"\n\tABP News",
		"\n\tBusiness Standard",
		"\n\tPatrika",
		"\n\tDesh Bandhu",
		"\n\tDainik Navjyoti"
} ;
Integer[] imageId = {
		R.drawable.aajtak,
		R.drawable.amarujala,
		R.drawable.bbchindi,
		R.drawable.danikbhasker,
		R.drawable.hindustan,
		R.drawable.logo,
		R.drawable.naiduniya,
		R.drawable.nbt,
		R.drawable.rp,
		R.drawable.lllll,
		R.drawable.ndtvindia,
		R.drawable.taz,
		R.drawable.ranchiexp,
		R.drawable.oneind,
		R.drawable.news24,
		R.drawable.abp,
		R.drawable.business,
		R.drawable.pk,
		R.drawable.desh,
		R.drawable.dannav
		
		
		
		
};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hindi__news_papers);
		
		overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
		Cou adapter = new
				Cou(Hindi_NewsPapers.this, web, imageId);
		list=(ListView)findViewById(R.id.listView1);
		ActionBar ab=getActionBar();
		ColorDrawable cd=new ColorDrawable(Color.parseColor("#000000"));
		ab.setBackgroundDrawable(cd);
		ab.setTitle("Hindi NewsPaper List");
		//ColorDrawable cd=new ColorDrawable(Color.parseColor("#ff0000"));
		//list.setBackgroundDrawable(cd);
		
				list.setAdapter(adapter);
				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		            @Override
		            public void onItemClick(AdapterView<?> parent, View view,
		                                    int position, long id) {
		                Toast.makeText(Hindi_NewsPapers.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
Object o=position;
String cc=o.toString();

Toast.makeText(Hindi_NewsPapers.this, "You Clicked at "+ position, Toast.LENGTH_SHORT).show();
if(position==0)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="https://m.facebook.com/";
	String aj="Aaj Tak";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==1)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://www.amarujala.com/";
	String aj="Amar Ujala";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==2)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://www.bbc.co.uk/hindi/";
	String aj="BBC Hindi";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==3)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://m.bhaskar.com/home/800-t/";
	String aj="Danik Bhaskar";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==4)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://www.livehindustan.com/";
	String aj="Live Hindustan";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==5)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://www.rashtriyasahara.com/";
	String aj="Rashtriya Shara";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==6)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://naidunia.jagran.com/";
	String aj="Nai Duniya";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==7)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://navbharattimes.indiatimes.com/";
	String aj="Navbhrat Times";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==8)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://rajasthanpatrika.patrika.com/";
	String aj="Rajsthan Patrika";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==9)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://m.jagran.com/home.php";
	String aj="Danik Jagran";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==10)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://khabar.ndtv.com/";
	String aj="NDTV India";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==11)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://teznews.com/";
	String aj="Tez News";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==12)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://ranchiexpress.com/";
	String aj="Ranchi Express";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==13)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://hindi.oneindia.in/";
	String aj="One India";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==14)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://zeenews.india.com/hindi/";
	String aj="Zee News";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==15)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://abpnews.abplive.in/";
	String aj="ABP  News Hindi";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==16)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://hindi.business-standard.com/";
	String aj="Business Standard";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==17)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://www.patrika.com/";
	String aj="Patrika";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==18)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://www.deshbandhu.co.in/";
	String aj="Desh Bandhu";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
	startActivity(i);
	
}
if(position==19)
{
	Intent i=new Intent(Hindi_NewsPapers.this,News.class);
	String sss="http://www.dainiknavajyoti.com/hindi/";
	String aj="Danik Navajyoti";
	i.putExtra("Value", sss);
	i.putExtra("Name",aj);
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
		getMenuInflater().inflate(R.menu.hindi__news_papers, menu);
		return true;
	}

}
