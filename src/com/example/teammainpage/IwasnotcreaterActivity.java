package com.example.teammainpage;

import com.example.weixing.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IwasnotcreaterActivity extends Activity{
	private Button checkmember;
	private Button Back17;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.iamcreater);
		
		checkmember = (Button)findViewById(R.id.checkmember);
		checkmember.setOnClickListener(new checkmemberListener());
		
		Back17 = (Button)findViewById(R.id.Back17);
		Back17.setOnClickListener(new Back17Listener());
	}
	class checkmemberListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(IwasnotcreaterActivity.this,CheckmemberActivity.class);
			startActivity(intent);
		}
	}
	class Back17Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(IwasnotcreaterActivity.this,TeammainpageActivity.class);
			startActivity(intent);
		}
	}
}
