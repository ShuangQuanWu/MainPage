package com.example.teammainpage;

import com.example.weixing.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IamnotcreaterActivity extends Activity{
	private Button checkmember;
	private Button yaoqing;
	private Button Back15;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.iamcreater);
		
		checkmember = (Button)findViewById(R.id.checkmember);
		checkmember.setOnClickListener(new checkmemberListener());
		
		yaoqing = (Button)findViewById(R.id.yaoqing);
		yaoqing.setOnClickListener(new yaoqingListener());

		Back15 = (Button)findViewById(R.id.Back15);
		Back15.setOnClickListener(new Back15Listener());
	}
	class checkmemberListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(IamnotcreaterActivity.this,CheckmemberActivity.class);
			startActivity(intent);
		}
	}
	class yaoqingListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(IamnotcreaterActivity.this,AddmemberActivity.class);
			startActivity(intent);
		}
	}
	class Back15Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(IamnotcreaterActivity.this,TeammainpageActivity.class);
			startActivity(intent);
		}
	}
}
