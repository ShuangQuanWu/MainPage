package com.example.personalmainpage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

import com.example.teammainpage.IamnotcreaterActivity;
import com.example.teammainpage.IwasnotcreaterActivity;
import com.example.weixing.R;

public class FriendblogandteamtwoActivity extends Activity{
	private int[] imageId1 = new int[] { R.drawable.shikeji, R.drawable.shikeji,R.drawable.shikeji,R.drawable.shikeji,R.drawable.shikeji};
	private String[] mListTitle1 = {"施克济","施克济","施克济","施克济","施克济"};
	private String[] mListStr1 = {"杭州西湖","日本富士山","台湾","厦门","西藏"};
	private int[] imageId2 = new int[] { R.drawable.wangchengcheng, R.drawable.fuweiwei,R.drawable.kongdingke,R.drawable.zhangwenliang,R.drawable.xiangmeikang};
	private String[] mListTitle2 = {"王城程","付伟伟","孔丁科","张文亮","项美康"};
	private String[] mListStr2 = {"杭州西湖","日本富士山","台湾","厦门","西藏"};
	ListView list03 = null;
	ListView list04 = null;
	private ImageView headpicture;
	private TextView Nickname;
	private Button Back09;
	private Button blogbtn;
	ArrayList<Map<String,Object>> mData1= new ArrayList<Map<String,Object>>();
	ArrayList<Map<String,Object>> mData2= new ArrayList<Map<String,Object>>();
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.friendblogandteamtwo);
		list03 = (ListView)findViewById(R.id.list03);
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
		list03.setAdapter(adapter);
		list03.setOnItemClickListener(new list03ItemClickListener());
		
		list04 = (ListView)findViewById(R.id.list04);
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
		list04.setAdapter(adapter1);
		list04.setOnItemClickListener(new list04ItemClickListener());
		
		headpicture = (ImageView)findViewById(R.id.headpicture);
		headpicture.setOnClickListener(new changenameandheadmapListener());
		
		Nickname = (TextView)findViewById(R.id.Nickname);
		Nickname.setOnClickListener(new changenameandheadmapListener());
		
		Back09 = (Button)findViewById(R.id.Back09);
		Back09.setOnClickListener(new Back09Listener());
		
		blogbtn = (Button)findViewById(R.id.blogbtn);
		blogbtn.setOnClickListener(new blogbtnListener());
	}
	private final class list03ItemClickListener implements OnItemClickListener{
		public void onItemClick(AdapterView arg0, View arg1, int arg2,long arg3) {
			Intent intent = new Intent();
			intent.setClass(FriendblogandteamtwoActivity.this,IamnotcreaterActivity.class);
			startActivity(intent);
		}
	}
	private final class list04ItemClickListener implements OnItemClickListener{
		public void onItemClick(AdapterView arg0, View arg1, int arg2,long arg3) {
			Intent intent = new Intent();
			intent.setClass(FriendblogandteamtwoActivity.this,IwasnotcreaterActivity.class);
			startActivity(intent);
		}
	}
	class changenameandheadmapListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(FriendblogandteamtwoActivity.this,ChangeNameAndHeadmapActivitytwo.class);
			startActivity(intent);
		}
	}
	class blogbtnListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(FriendblogandteamtwoActivity.this,FriendblogandteamActivity.class);
			startActivity(intent);
		}
	}
	class Back09Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(FriendblogandteamtwoActivity.this,FriendsActivity.class);
			startActivity(intent);
		}
	}
}
