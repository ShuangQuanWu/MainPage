package com.example.teammainpage;

import com.example.weixing.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CreateTeamActivity extends Activity{
	private Button addmember;
	private Button createsuccess;
	private Button Back11;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.createteam);
		
		addmember = (Button)findViewById(R.id.addmember);
		addmember.setOnClickListener(new addmemberListener());
		
		createsuccess = (Button)findViewById(R.id.createsuccess);
		createsuccess.setOnClickListener(new createsuccessListener());
		
		Back11 = (Button)findViewById(R.id.Back11);
		Back11.setOnClickListener(new Back11Listener());
	}
	
	class addmemberListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CreateTeamActivity.this, AddmemberActivity.class);
			startActivity(intent);
		}
	}
	class createsuccessListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CreateTeamActivity.this, TeammainpageActivity.class);
			startActivity(intent);
		}
	}
	class Back11Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CreateTeamActivity.this, TeammainpageActivity.class);
			startActivity(intent);
		}
	}
}
