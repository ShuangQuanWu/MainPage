package com.example.searchmainpage;


import com.example.personalmainpage.CollectblogActivity;
import com.example.sharemainpage.AddspotActivity;
import com.example.weixing.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class SpotActivity extends Activity{
	private Button Near;
	private Button Back;
	private Button Relationteam;
	private Button Relationshare;
	private ImageView blogone;
	private ImageView blogtwo;
	private ImageView blogthree;
	private Button biaoqian;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spot);
		
		Relationshare = (Button)findViewById(R.id.Relationshare);
		Relationshare.setOnClickListener(new relationshareListener());
		
		biaoqian = (Button)findViewById(R.id.biaoqian);
		biaoqian.setOnClickListener(new biaoqianListener());
		
		blogone = (ImageView)findViewById(R.id.blogone);
		blogone.setOnClickListener(new blogListener());
		
		blogtwo = (ImageView)findViewById(R.id.blogtwo);
		blogtwo.setOnClickListener(new blogListener());
		
		blogthree = (ImageView)findViewById(R.id.blogthree);
		blogthree.setOnClickListener(new blogListener());
		
		Near = (Button)findViewById(R.id.Near);
		Near.setOnClickListener(new nearListener());
		
		Back = (Button)findViewById(R.id.Back);
		Back.setOnClickListener(new backListener());
		
		Relationteam = (Button)findViewById(R.id.Relationteam);
		Relationteam.setOnClickListener(new relationteamListener());
	}
	class biaoqianListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SpotActivity.this, AddspotActivity.class);
			SpotActivity.this.startActivity(intent);
		}
	}
	class blogListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SpotActivity.this, CollectblogActivity.class);
			SpotActivity.this.startActivity(intent);
		}
	}
	class nearListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SpotActivity.this, NearActivity.class);
			SpotActivity.this.startActivity(intent);
		}
	}
	class backListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SpotActivity.this, SearchmainpageActivity.class);
			SpotActivity.this.startActivity(intent);
		}
	}
	class relationshareListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SpotActivity.this, RelationshareActivity.class);
			SpotActivity.this.startActivity(intent);
		}
	}
	class relationteamListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SpotActivity.this, RelationTeamActivity.class);
			SpotActivity.this.startActivity(intent);
		}
	}
}
