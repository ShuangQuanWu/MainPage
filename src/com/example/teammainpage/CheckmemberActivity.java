package com.example.teammainpage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.weixing.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class CheckmemberActivity extends Activity{
	private String[] mListTitle = {"顾明辉","施克济","孔丁科","张文亮","项美康"};
	private int[] imageId1 = new int[] { R.drawable.guminghui, R.drawable.shikeji,R.drawable.kongdingke,R.drawable.zhangwenliang,R.drawable.xiangmeikang};
	ListView list30 = null;
	ArrayList<Map<String,Object>> mData= new ArrayList<Map<String,Object>>();
	private Button checkmemberbtn;
	private Button Back14;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.checkmember);
		list30 = (ListView)findViewById(R.id.list30);
		int lengh = mListTitle.length;
		for(int i =0; i < lengh; i++) {
	        Map<String,Object> item = new HashMap<String,Object>();  
	        item.put("image20", imageId1[i]);
	        item.put("textView20", mListTitle[i]);  
	        mData.add(item);
	    }
		SimpleAdapter adapter = new SimpleAdapter(this,mData,R.layout.addmemberlist,
		        new String[]{"image20","textView20"},new int[]{R.id.image20,R.id.textView20});  
		list30.setAdapter(adapter);
		
		checkmemberbtn = (Button)findViewById(R.id.checkmemberbtn);
		checkmemberbtn.setOnClickListener(new checkmemberbtnListener());
		
		Back14 = (Button)findViewById(R.id.Back14);
		Back14.setOnClickListener(new Back14Listener());
	}
	class checkmemberbtnListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CheckmemberActivity.this,IamcreaterActivity.class);
			startActivity(intent);
		}
	}
	class Back14Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CheckmemberActivity.this,IamcreaterActivity.class);
			startActivity(intent);
		}
	}

}
