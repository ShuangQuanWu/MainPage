package com.example.teammainpage;

import com.example.weixing.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IamcreaterActivity extends Activity{
	private Button checkmember;
	private Button yaoqing;
	private Button jiesan;
	private Button baocun;
	private Button Back13;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.iamcreater);
		
		checkmember = (Button)findViewById(R.id.checkmember);
		checkmember.setOnClickListener(new checkmemberListener());

		yaoqing = (Button)findViewById(R.id.yaoqing);
		yaoqing.setOnClickListener(new yaoqingListener());
		
		jiesan = (Button)findViewById(R.id.jiesan);
		jiesan.setOnClickListener(new jiesanListener());
		
		baocun = (Button)findViewById(R.id.baocun);
		baocun.setOnClickListener(new baocunListener());
		
		Back13 = (Button)findViewById(R.id.Back13);
		Back13.setOnClickListener(new Back13Listener());
	}
	class checkmemberListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(IamcreaterActivity.this,CheckmemberActivity.class);
			startActivity(intent);
		}
	}
	class yaoqingListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(IamcreaterActivity.this,AddmemberActivity.class);
			startActivity(intent);
		}
	}
	class jiesanListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(IamcreaterActivity.this,TeammainpageActivity.class);
			startActivity(intent);
		}
	}
	class baocunListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(IamcreaterActivity.this,TeammainpageActivity.class);
			startActivity(intent);
		}
	}
	class Back13Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(IamcreaterActivity.this,TeammainpageActivity.class);
			startActivity(intent);
		}
	}
}
