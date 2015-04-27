package com.example.searchmainpage;

import com.example.weixing.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NearActivity extends Activity{
	private Button btn05;
	private Button btn06;
	private Button btn07;
	private Button btn08;
	private Button Back02;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.near);
		
		btn05 = (Button)findViewById(R.id.btn05);
		btn05.setOnClickListener(new btn05Listener());
		
		btn06 = (Button)findViewById(R.id.btn06);
		btn06.setOnClickListener(new btn06Listener());
		
		btn07 = (Button)findViewById(R.id.btn07);
		btn07.setOnClickListener(new btn07Listener());
		
		btn08 = (Button)findViewById(R.id.btn08);
		btn08.setOnClickListener(new btn08Listener());
		
		Back02 = (Button)findViewById(R.id.Back02);
		Back02.setOnClickListener(new Back02Listener());
	}
	
	class btn05Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(NearActivity.this,ShoppingActivity.class);
			startActivity(intent);
		}
	}
	class btn06Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(NearActivity.this,EatingActivity.class);
			startActivity(intent);
		}
	}
	class btn07Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(NearActivity.this,HotelActivity.class);
			startActivity(intent);
		}
	}
	class btn08Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(NearActivity.this,HappyActivity.class);
			startActivity(intent);
		}
	}
	class Back02Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(NearActivity.this,SpotActivity.class);
			startActivity(intent);
		}
	}
}
