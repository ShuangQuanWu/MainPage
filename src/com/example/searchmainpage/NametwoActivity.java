package com.example.searchmainpage;

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

public class NametwoActivity extends Activity{
	private int[] imageId1 = new int[] { R.drawable.guminghui, R.drawable.guminghui,R.drawable.guminghui,R.drawable.guminghui,R.drawable.guminghui};
	private String[] mListTitle1 = {"顾明辉","顾明辉","顾明辉","顾明辉","顾明辉"};
	private String[] mListStr1 = {"杭州西湖","日本富士山","台湾","厦门","西藏"};
	private int[] imageId2 = new int[] { R.drawable.wangchengcheng, R.drawable.fuweiwei,R.drawable.kongdingke,R.drawable.zhangwenliang,R.drawable.xiangmeikang};
	private String[] mListTitle2 = {"王城程","付伟伟","孔丁科","张文亮","项美康"};
	private String[] mListStr2 = {"杭州西湖","日本富士山","台湾","厦门","西藏"};
	ListView list21 = null;
	ListView list22 = null;
	private Button addfriend;
	private Button blogbtn;
	private Button Back18;
	ArrayList<Map<String,Object>> mData1= new ArrayList<Map<String,Object>>();
	ArrayList<Map<String,Object>> mData2= new ArrayList<Map<String,Object>>();
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nametwo);
		list21 = (ListView)findViewById(R.id.list21);
		int lengh = mListTitle1.length;
		for(int i =0; i < lengh; i++) {
	        Map<String,Object> item = new HashMap<String,Object>();  
	        item.put("image11", imageId1[i]);
	        item.put("textView11", mListTitle1[i]);  
	        item.put("textView12", mListStr1[i]);  
	        mData1.add(item);
	    }
		SimpleAdapter adapter = new SimpleAdapter(this,mData1,R.layout.teamlist,
		        new String[]{"image11","textView11","textView12"},new int[]{R.id.image11,R.id.textView11,R.id.textView12});  
		list21.setAdapter(adapter);
		
		list22 = (ListView)findViewById(R.id.list22);
		int lengh1 = mListTitle2.length;
		for(int i =0; i < lengh1; i++) {
	        Map<String,Object> item1 = new HashMap<String,Object>();  
	        item1.put("image11", imageId2[i]);
	        item1.put("textView11", mListTitle2[i]);  
	        item1.put("textView12", mListStr2[i]);  
	        mData2.add(item1);
	    }
		SimpleAdapter adapter1 = new SimpleAdapter(this,mData2,R.layout.teamlist,
		        new String[]{"image11","textView11","textView12"},new int[]{R.id.image11,R.id.textView11,R.id.textView12});  
		list22.setAdapter(adapter1);
		
		addfriend = (Button)findViewById(R.id.addfriend);
		addfriend.setOnClickListener(new addfriendListener());
		
		blogbtn = (Button)findViewById(R.id.blogbtn);
		blogbtn.setOnClickListener(new blogbtnListener());
		
		Back18 = (Button)findViewById(R.id.Back18);
		Back18.setOnClickListener(new Back18Listener());
	}
	class addfriendListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(NametwoActivity.this,NametwoActivity.class);
			startActivity(intent);
		}
	}
	class blogbtnListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(NametwoActivity.this,NameActivity.class);
			startActivity(intent);
		}
	}
	class Back18Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(NametwoActivity.this,SearchnamepageActivity.class);
			startActivity(intent);
		}
	}

}
