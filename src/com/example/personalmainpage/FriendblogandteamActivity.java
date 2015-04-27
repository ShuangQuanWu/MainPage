package com.example.personalmainpage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.weixing.R;
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

public class FriendblogandteamActivity extends Activity{
	private String[] mListTitle = {"施克济","施克济","施克济","施克济","施克济"};
	private String[] mListStr = {"杭州西湖","日本富士山","台湾","厦门","西藏"};
	private int[] imageId2 = new int[] { R.drawable.xihu, R.drawable.fushishan,R.drawable.taiwan,R.drawable.xiamen,R.drawable.xizang};
	private int[] imageId1 = new int[] { R.drawable.shikeji, R.drawable.shikeji,R.drawable.shikeji,R.drawable.shikeji,R.drawable.shikeji};
	ListView list02 = null;
	private ImageView headpicture;
	private TextView Nickname;
	private Button Back08;
	private Button teambtn;
	ArrayList<Map<String,Object>> mData= new ArrayList<Map<String,Object>>();
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.friendblogandteam);
		list02 = (ListView)findViewById(R.id.list02);
		int lengh = mListTitle.length;
		for(int i =0; i < lengh; i++) {
	        Map<String,Object> item = new HashMap<String,Object>();  
	        item.put("tourist", imageId1[i]);
	        item.put("spotpic", imageId2[i]);
	        item.put("touristname", mListTitle[i]);  
	        item.put("spottitle", mListStr[i]);  
	        mData.add(item);
	    }
		SimpleAdapter adapter = new SimpleAdapter(this,mData,R.layout.mainpagelist,
		        new String[]{"tourist","touristname","spotpic","spottitle"},new int[]{R.id.tourist,R.id.touristname,R.id.spotpic,R.id.spottitle});  
		list02.setAdapter(adapter);
		list02.setOnItemClickListener(new list02ItemClickListener());
		
		headpicture = (ImageView)findViewById(R.id.headpicture);
		headpicture.setOnClickListener(new changenameandheadmapListener());
		
		Nickname = (TextView)findViewById(R.id.Nickname);
		Nickname.setOnClickListener(new changenameandheadmapListener());
		
		Back08 = (Button)findViewById(R.id.Back08);
		Back08.setOnClickListener(new Back08Listener());
		
		teambtn = (Button)findViewById(R.id.teambtn);
		teambtn.setOnClickListener(new teambtnListener());
	}
	private final class list02ItemClickListener implements OnItemClickListener{
		public void onItemClick(AdapterView arg0, View arg1, int arg2,long arg3) {
			Intent intent = new Intent();
			intent.setClass(FriendblogandteamActivity.this,CollectblogActivity.class);
			startActivity(intent);
		}
	}
	class changenameandheadmapListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(FriendblogandteamActivity.this,ChangeNameAndHeadmapActivitytwo.class);
			startActivity(intent);
		}
	}
	class teambtnListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(FriendblogandteamActivity.this,FriendblogandteamtwoActivity.class);
			startActivity(intent);
		}
	}
	class Back08Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(FriendblogandteamActivity.this,FriendsActivity.class);
			startActivity(intent);
		}
	}

}
