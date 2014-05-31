package com.newsmart;



import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.Toast;
 

public class Select_Language extends ListActivity {

ListView list;

Intent i;
Integer a=R.drawable.uu;
Integer bb=R.drawable.newsmart;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
		
		//setContentView(R.layout.activity_select__language);
		
		ActionBar ab=getActionBar();
		ColorDrawable cd=new ColorDrawable(Color.parseColor("#000000"));
		ab.setBackgroundDrawable(cd);
		ab.setTitle("Select Language");
		getListView().setBackgroundResource(a);
		String a[]={"Hindi","English","Gujarati","Bangla","Punjabi","Tamil","Talugu","Malayalam","Marathi","Business","Tech","Life Style","Entertainment","Goole News","Yahoo News","MSN News","Sport","Live Cricket"};
		ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_list_item_1,a);
		setListAdapter(aa);
		
		
	}
	
	
	
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	    if (keyCode == KeyEvent.KEYCODE_BACK) {
	        exitByBackKey();

	        //moveTaskToBack(false);

	        return true;
	    }
	    return super.onKeyDown(keyCode, event);
	}

	protected void exitByBackKey() {

	    AlertDialog.Builder alertbox = new AlertDialog.Builder(this);
	    alertbox.setMessage("Do you want to Exit NewsMart?");
	    alertbox.setIcon(bb);
	    alertbox.setInverseBackgroundForced(true);
	    
	    alertbox.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

	        // do something when the button is clicked
	        public void onClick(DialogInterface arg0, int arg1) {

	            finish();
	            //close();


	        }
	    });
	    alertbox.setNegativeButton("No", new DialogInterface.OnClickListener() {

	        // do something when the button is clicked
	        public void onClick(DialogInterface arg0, int arg1) {
	                       }
	    })
	      .show();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select__language, menu);
		return true;
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		Object o=this.getListAdapter().getItem(position);
		String p=o.toString();
		if(p.equals("Hindi"))
		{
			Intent i=new Intent(Select_Language.this,Hindi_NewsPapers.class);
			
			startActivity(i);
		}
		if(p.equals("English"))
		{
			Intent i1=new Intent(Select_Language.this,GActivity.class);
			startActivity(i1);
		}
		if(p.equals("Gujarati"))
		{
			Intent i=new Intent(Select_Language.this,Gujarati_NewsPapers.class);
			startActivity(i);
		}
		if(p.equals("Bangla"))
		{
			Intent i=new Intent(Select_Language.this,Bangla_NewsPaper.class);
			startActivity(i);
		}
		if(p.equals("Punjabi"))
		{
			Intent i=new Intent(Select_Language.this,Punjabi_NewsPapers.class);
			startActivity(i);
		}
		if(p.equals("Tamil"))
		{
			Intent i=new Intent(Select_Language.this,Tamil_NewsPaper.class);
			startActivity(i);
		}
		if(p.equals("Talugu"))
		{
			Intent i=new Intent(Select_Language.this,Talugu_NewsPaper.class);
			startActivity(i);
		}
		if(p.equals("Malayalam"))
		{
			Intent i1=new Intent(Select_Language.this,Malayalam_NewsPaper.class);
			startActivity(i1);
		}
		if(p.equals("Marathi"))
		{
			Intent i=new Intent(Select_Language.this,Marathi_NewsPaper.class);
			startActivity(i);
		}
		if(p.equals("Business"))
		{
			
			
			
			
			
			
			
			
			
			
			
			
			Intent i=new Intent(Select_Language.this,Gujarati_NewsPapers.class);
			String sss="http://news.google.co.in/?edchanged=1&ned=hi_in&authuser=0http://news.google.co.in/?edchanged=1&ned=hi_in&authuser=0";
			String aj="Aaj Tak";
			i.putExtra("Value", sss);
			i.putExtra("Name",aj);
			startActivity(i);
		}
		
		if(p.equals("Tech"))
		{
			
			
			
			PopupMenu pp=new PopupMenu(this,v);
			MenuInflater mi=pp.getMenuInflater();
			mi.inflate(R.menu.popup_, pp.getMenu());
		
			pp.setOnMenuItemClickListener(new OnMenuItemClickListener() {
				
				@Override
				public boolean onMenuItemClick(MenuItem item) {
					// TODO Auto-generated method stub
					int id=item.getItemId();
					if(id==R.id.item1)
					{
						Intent i=new Intent(Select_Language.this,News.class);
						String sss="http://www.techtree.com/";
						String aj="Tech News";
						i.putExtra("Value", sss);
						i.putExtra("Name",aj);
						startActivity(i);
					}
					if(id==R.id.item2)
					{
						Intent i=new Intent(Select_Language.this,News.class);
						String sss="http://hindi.gizbot.com/";
						String aj="Tech News";
						i.putExtra("Value", sss);
						i.putExtra("Name",aj);
						startActivity(i);
					}
					
					
					
					
					return false;
				}
			});
			
			
			
			
			
			
			pp.show();	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		}
		if(p.equals("Life Style"))
		{

			Intent i=new Intent(Select_Language.this,News.class);
			String sss="http://m.indiatimes.com/lifestyle";
			String aj="Life Style";
			i.putExtra("Value", sss);
			i.putExtra("Name",aj);
			startActivity(i);
		}
		if(p.equals("Entertainment"))
		{
			PopupMenu pp=new PopupMenu(this,v);
			MenuInflater mi=pp.getMenuInflater();
			mi.inflate(R.menu.popup_, pp.getMenu());
			pp.setOnMenuItemClickListener(new OnMenuItemClickListener() {
				
				@Override
				public boolean onMenuItemClick(MenuItem item) {
					// TODO Auto-generated method stub
					int id=item.getItemId();
					if(id==R.id.item1)
					{
						Intent i=new Intent(Select_Language.this,News.class);
						String sss="http://m.newindianexpress.com/category/english";
						String aj="Entertainment News";
						i.putExtra("Value", sss);
						i.putExtra("Name",aj);
						startActivity(i);
					}
					if(id==R.id.item2)
					{
						Intent i=new Intent(Select_Language.this,News.class);
						String sss="http://m.jagran.com/entertainment.php";
						String aj="Entertainment News";
						i.putExtra("Value", sss);
						i.putExtra("Name",aj);
						startActivity(i);
					}
					
					
					
					
					return false;
				}
			});
			
			
			
			
			
			
			pp.show();
		}
		if(p.equals("Goole News"))
		{
			PopupMenu pp=new PopupMenu(this,v);
			MenuInflater mi=pp.getMenuInflater();
			mi.inflate(R.menu.popup_, pp.getMenu());
			pp.setOnMenuItemClickListener(new OnMenuItemClickListener() {
				
				@Override
				public boolean onMenuItemClick(MenuItem item) {
					// TODO Auto-generated method stub
					int id=item.getItemId();
					if(id==R.id.item1)
					{
						Intent i=new Intent(Select_Language.this,News.class);
						String sss="http://news.google.co.in/";
						String aj="Google News";
						i.putExtra("Value", sss);
						i.putExtra("Name",aj);
						startActivity(i);
					}
					if(id==R.id.item2)
					{
						Intent i=new Intent(Select_Language.this,News.class);
						String sss="http://news.google.co.in/?edchanged=1&ned=hi_in&authuser=0";
						String aj="Google News";
						i.putExtra("Value", sss);
						i.putExtra("Name",aj);
						startActivity(i);
					}
					
					
					
					
					return false;
				}
			});
			
			
			
			
			
			
			pp.show();
		
		}
		if(p.equals("Yahoo News"))
		{
			PopupMenu pp=new PopupMenu(this,v);
			MenuInflater mi=pp.getMenuInflater();
			mi.inflate(R.menu.popup_, pp.getMenu());
			pp.setOnMenuItemClickListener(new OnMenuItemClickListener() {
				
				@Override
				public boolean onMenuItemClick(MenuItem item) {
					// TODO Auto-generated method stub
					int id=item.getItemId();
					if(id==R.id.item1)
					{
						Intent i=new Intent(Select_Language.this,News.class);
						String sss="https://in.news.yahoo.com/";
						String aj="Yahoo News";
						i.putExtra("Value", sss);
						i.putExtra("Name",aj);
						startActivity(i);
					}
					if(id==R.id.item2)
					{
						Intent i=new Intent(Select_Language.this,News.class);
						String sss="https://hindi.yahoo.com/";
						String aj="Yahoo News";
						i.putExtra("Value", sss);
						i.putExtra("Name",aj);
						startActivity(i);
					}
					
					
					
					
					return false;
				}
			});
			
			
			
			
			
			
			pp.show();
		
		}
		if(p.equals("MSN News"))
		{
			PopupMenu pp=new PopupMenu(this,v);
			MenuInflater mi=pp.getMenuInflater();
			mi.inflate(R.menu.popup_, pp.getMenu());
			pp.setOnMenuItemClickListener(new OnMenuItemClickListener() {
				
				@Override
				public boolean onMenuItemClick(MenuItem item) {
					// TODO Auto-generated method stub
					int id=item.getItemId();
					if(id==R.id.item1)
					{
						Intent i=new Intent(Select_Language.this,News.class);
						String sss="http://news.in.msn.com/";
						String aj="MSN News";
						i.putExtra("Value", sss);
						i.putExtra("Name",aj);
						startActivity(i);
					}
					if(id==R.id.item2)
					{
						Intent i=new Intent(Select_Language.this,News.class);
						String sss="http://news.in.msn.com/regionalnews/";
						String aj="MSN News";
						i.putExtra("Value", sss);
						i.putExtra("Name",aj);
						startActivity(i);
					}
					
					
					
					
					return false;
				}
			});
			
			
			
			
			
			
			pp.show();
		}
		if(p.equals("Sport"))
		{
			PopupMenu pp=new PopupMenu(this,v);
			MenuInflater mi=pp.getMenuInflater();
			mi.inflate(R.menu.popup_, pp.getMenu());
			pp.setOnMenuItemClickListener(new OnMenuItemClickListener() {
				
				@Override
				public boolean onMenuItemClick(MenuItem item) {
					// TODO Auto-generated method stub
					int id=item.getItemId();
					if(id==R.id.item1)
					{
						Intent i=new Intent(Select_Language.this,News.class);
						String sss="https://in.news.yahoo.com/sports/";
						String aj="Yahoo News";
						i.putExtra("Value", sss);
						i.putExtra("Name",aj);
						startActivity(i);
					}
					if(id==R.id.item2)
					{
						Intent i=new Intent(Select_Language.this,News.class);
						String sss="http://zeenews.india.com/hindi/news/category/%E0%A4%96%E0%A5%87%E0%A4%B2-%E0%A4%96%E0%A4%BF%E0%A4%B2%E0%A4%BE%E0%A4%A1%E0%A4%BC%E0%A5%80";
						String aj="Sport News";
						i.putExtra("Value", sss);
						i.putExtra("Name",aj);
						startActivity(i);
					}
					
					
					
					
					return false;
				}
			});
			
			
			
			
			
			
			pp.show();
		}
		if(p.equals("Live Cricket"))
		{
			
			

			Intent i=new Intent(Select_Language.this,News.class);
			String sss="http://m.espncricinfo.com/ci/engine/match/index.html";
			String aj="Live  Cricket";
			i.putExtra("Value", sss);
			i.putExtra("Name",aj);
			startActivity(i);
			
			
			
			
			
			
			
		}
	}



	




}
