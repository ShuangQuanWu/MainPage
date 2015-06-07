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

public class PersonalblogActivity extends Activity{
	private ImageView headpicture;
	private TextView Nickname;
	private ImageView delete;
	private Button Back06;
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
		setContentView(R.layout.personalblog);
		
		headpicture = (ImageView)findViewById(R.id.headpicture);
		headpicture.setOnClickListener(new changenameandheadmapListener());
		
		Nickname = (TextView)findViewById(R.id.Nickname);
		Nickname.setOnClickListener(new changenameandheadmapListener());
		
		delete = (ImageView)findViewById(R.id.delete);
		delete.setOnClickListener(new deleteListener());
		
		Back06 = (Button)findViewById(R.id.Back06);
		Back06.setOnClickListener(new Back06Listener());
		
		pinglun = (ImageView)findViewById(R.id.pinglun);
		pinglun.setOnClickListener(new pinglunListener());
		
		pinglunt = (TextView)findViewById(R.id.pinglunt);
		pinglunt.setOnClickListener(new pinglunListener());
		
		dianzan = (ImageView)findViewById(R.id.dianzan);
		dianzan.setOnClickListener(new dianzanListener());
		
		dianzant = (TextView)findViewById(R.id.dianzant);
		dianzant.setOnClickListener(new dianzanListener());
		
		collectI = (ImageView)findViewById(R.id.collectI);
		collectI.setOnClickListener(new collectIListener());
		
		collectt = (TextView)findViewById(R.id.collcett);
		collectt.setOnClickListener(new collectIListener());
		
		xiangguan = (ImageView)findViewById(R.id.xiangguan);
		xiangguan.setOnClickListener(new xiangguanListener());
		
		xiangguant = (TextView)findViewById(R.id.xiangguant);
		xiangguant.setOnClickListener(new xiangguanListener());
		
	}
	class changenameandheadmapListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(PersonalblogActivity.this,ChangeNameAndHeadmapActivitytwo.class);
			startActivity(intent);
		}
	}
	class deleteListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(PersonalblogActivity.this,PersonalmainpageActivity.class);
			startActivity(intent);
		}
	}
	class Back06Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(PersonalblogActivity.this,PersonalmainpageActivity.class);
			startActivity(intent);
		}
	}
	class pinglunListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(PersonalblogActivity.this,PinglunActivity.class);
			startActivity(intent);
		}
	}
	class dianzanListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(PersonalblogActivity.this,PersonalblogActivity.class);
			startActivity(intent);
		}
	}
	class collectIListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(PersonalblogActivity.this,CollectActivity.class);
			startActivity(intent);
		}
	}
	class xiangguanListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(PersonalblogActivity.this,SpotActivity.class);
			startActivity(intent);
		}
	}
}
