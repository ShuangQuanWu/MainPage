package com.example.teammainpage;

import com.example.weixing.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IwascreaterActivity extends Activity{
	private Button checkmember;
	private Button yaoqing;
	private Button Back16;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.iamcreater);
		
		checkmember = (Button)findViewById(R.id.checkmember);
		checkmember.setOnClickListener(new checkmemberListener());
		
		yaoqing = (Button)findViewById(R.id.yaoqing);
		yaoqing.setOnClickListener(new yaoqingListener());

		Back16 = (Button)findViewById(R.id.Back16);
		Back16.setOnClickListener(new Back16Listener());
	}
	class checkmemberListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(IwascreaterActivity.this,CheckmemberActivity.class);
			startActivity(intent);
		}
	}
	class yaoqingListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(IwascreaterActivity.this,AddmemberActivity.class);
			startActivity(intent);
		}
	}
	class Back16Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(IwascreaterActivity.this,TeammainpageActivity.class);
			startActivity(intent);
		}
	}
}
