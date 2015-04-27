package com.example.login;

import com.example.weixing.MainPageActivity;
import com.example.weixing.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoginpageActivity extends Activity{
	private Button denglu;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginpage);
		
		denglu = (Button)findViewById(R.id.denglu);
		denglu.setOnClickListener(new dengluListener());
	}
	class dengluListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(LoginpageActivity.this, MainPageActivity.class);
			startActivity(intent);
		}
	}
}
