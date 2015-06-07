package com.example.personalmainpage;

import com.example.searchmainpage.SpotActivity;
import com.example.weixing.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CollectblogActivity extends Activity{
	private ImageView headpicture;
	private TextView Nickname;
	private ImageView addfriend;
	private ImageView delete;
	private Button Back07;
	private ImageView pinglun;
	private TextView pinglunt;
	private ImageView dianzan;
	private TextView dianzant;
	private ImageView collectI;
	private TextView collectt;
	private ImageView xiangguan;
	private TextView xiangguant;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.collectblog);
		
		headpicture = (ImageView)findViewById(R.id.headpicture);
		headpicture.setOnClickListener(new changenameandheadmapListener());
		
		Nickname = (TextView)findViewById(R.id.Nickname);
		Nickname.setOnClickListener(new changenameandheadmapListener());
		
		delete = (ImageView)findViewById(R.id.delete);
		delete.setOnClickListener(new deleteListener());
		
		addfriend = (ImageView)findViewById(R.id.addfriend);
		addfriend.setOnClickListener(new addfriendListener());
		
		Back07 = (Button)findViewById(R.id.Back07);
		Back07.setOnClickListener(new Back07Listener());
		
		pinglun = (ImageView)findViewById(R.id.pinglun);
		pinglun.setOnClickListener(new pinglunListener());
		
		pinglunt = (TextView)findViewById(R.id.pinglunt);
		pinglunt.setOnClickListener(new pingluntListener());
		
		dianzan = (ImageView)findViewById(R.id.dianzan);
		dianzan.setOnClickListener(new dianzanListener());
		
		dianzant = (TextView)findViewById(R.id.dianzant);
		dianzant.setOnClickListener(new dianzantListener());
		
		collectI = (ImageView)findViewById(R.id.collectI);
		collectI.setOnClickListener(new collectIListener());
		
		collectt = (TextView)findViewById(R.id.collcett);
		collectt.setOnClickListener(new collecttListener());
		
		xiangguan = (ImageView)findViewById(R.id.xiangguan);
		xiangguan.setOnClickListener(new xiangguanListener());
		
		xiangguant = (TextView)findViewById(R.id.xiangguant);
		xiangguant.setOnClickListener(new xiangguantListener());
	}
	
	class changenameandheadmapListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectblogActivity.this,ChangeNameAndHeadmapActivitytwo.class);
			startActivity(intent);
		}
	}
	class addfriendListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectblogActivity.this,MessageActivity.class);
			startActivity(intent);
		}
	}
	class deleteListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectblogActivity.this,PersonalmainpageActivity.class);
			startActivity(intent);
		}
	}
	class Back07Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectblogActivity.this,CollectActivity.class);
			startActivity(intent);
		}
	}
	class pinglunListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectblogActivity.this,PinglunActivity.class);
			startActivity(intent);
		}
	}
	class pingluntListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectblogActivity.this,PinglunActivity.class);
			startActivity(intent);
		}
	}
	class dianzanListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectblogActivity.this,CollectblogActivity.class);
			startActivity(intent);
		}
	}
	class dianzantListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectblogActivity.this,CollectblogActivity.class);
			startActivity(intent);
		}
	}
	class collectIListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectblogActivity.this,CollectActivity.class);
			startActivity(intent);
		}
	}
	class collecttListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectblogActivity.this,CollectActivity.class);
			startActivity(intent);
		}
	}
	class xiangguanListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectblogActivity.this,SpotActivity.class);
			startActivity(intent);
		}
	}
	class xiangguantListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectblogActivity.this,SpotActivity.class);
			startActivity(intent);
		}
	}

}
