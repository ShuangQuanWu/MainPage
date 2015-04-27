package com.example.sharemainpage;


import com.example.personalmainpage.PersonalmainpageActivity;
import com.example.searchmainpage.SearchmainpageActivity;
import com.example.weixing.MainPageActivity;
import com.example.weixing.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class SharemainpageActivity extends Activity{
	private Button btntwo;
	private ImageView addtitleimg;
	private Button mainpage;
	private Button searchmainpage;
	private Button personalmainpage;
	private Button btnone;

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sharemainpage);
		
		btntwo = (Button)findViewById(R.id.btntwo);
		btntwo.setOnClickListener(new btntwoListener());
		
		addtitleimg = (ImageView)findViewById(R.id.addtitleimg);
		addtitleimg.setOnClickListener(new addtitleimgListener());
		
		btnone = (Button)findViewById(R.id.btnone);
		btnone.setOnClickListener(new btnoneListener());
		
		mainpage = (Button)findViewById(R.id.mainpage);
		mainpage.setOnClickListener(new mainpageListener());
		
		searchmainpage = (Button)findViewById(R.id.searchmainpage);
		searchmainpage.setOnClickListener(new SearchmainpageListener());
		
		personalmainpage = (Button)findViewById(R.id.personalmainpage);
		personalmainpage.setOnClickListener(new PersonalmainpageListener());
		
	}
	class addtitleimgListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SharemainpageActivity.this,AddspotActivity.class);
			startActivity(intent);
		}
	}
	class btntwoListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SharemainpageActivity.this,AddpicActivity.class);
			startActivity(intent);
		}
	}
	class btnoneListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SharemainpageActivity.this,PersonalmainpageActivity.class);
			startActivity(intent);
		}
	}
	class mainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SharemainpageActivity.this,MainPageActivity.class);
			startActivity(intent);
		}
	}
	class SearchmainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SharemainpageActivity.this,SearchmainpageActivity.class);
			startActivity(intent);
		}
	}
	class PersonalmainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SharemainpageActivity.this,PersonalmainpageActivity.class);
			startActivity(intent);
		}
	}
}
