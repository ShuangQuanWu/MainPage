package com.example.searchmainpage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.personalmainpage.PersonalmainpageActivity;
import com.example.sharemainpage.SharemainpageActivity;
import com.example.teammainpage.IamcreaterActivity;
import com.example.weixing.MainPageActivity;
import com.example.weixing.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;

public class NameActivity extends Activity{
	private int[] imageId1 = new int[] { R.drawable.wangchengcheng, R.drawable.shikeji,R.drawable.fuweiwei,R.drawable.xiangmeikang,R.drawable.zhangwenliang};
	private String[] mListTitle1 = {"王城程","施克济","付伟伟","项美康","张文亮"};
	private String[] mListStr1 = {"日本富士山","日本北海道","日本大阪","日本金阁寺","日本东京"};
	ListView spottlist = null;
	private Button mainpage;
	private Button sharemainpage;
	private Button personalmainpage;
	private Button search_spot;
	private Button searchtbtn;
	ArrayList<Map<String,Object>> mData1 = new ArrayList<Map<String,Object>>();
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.name);
		spottlist = (ListView)findViewById(R.id.spottlist);
		int lengh = mListTitle1.length;
		for(int i =0; i < lengh; i++) {
	        Map<String,Object> item = new HashMap<String,Object>();  
	        item.put("neartimg", imageId1[i]);
	        item.put("nearttext", mListTitle1[i]);  
	        item.put("nearttitle", mListStr1[i]);  
	        mData1.add(item);
	    }
		SimpleAdapter adapter = new SimpleAdapter(this,mData1,R.layout.nearteamlist,
		        new String[]{"neartimg","nearttext","nearttitle","spottitle"},new int[]{R.id.neartimg,R.id.nearttext,R.id.nearttitle});  
		spottlist.setAdapter(adapter);
		spottlist.setOnItemClickListener(new spottlistItemClickListener());
		
		mainpage = (Button)findViewById(R.id.mainpage);
		mainpage.setOnClickListener(new mainpageListener());
		
		sharemainpage = (Button)findViewById(R.id.sharemainpage);
		sharemainpage.setOnClickListener(new SharemainpageListener());
		
		personalmainpage = (Button)findViewById(R.id.personalmainpage);
		personalmainpage.setOnClickListener(new PersonalmainpageListener());
		
		search_spot = (Button)findViewById(R.id.search_spot);
		search_spot.setOnClickListener(new searchspotListener());
		
		searchtbtn = (Button)findViewById(R.id.searchtbtn);
		searchtbtn.setOnClickListener(new searchtbtnListener());
	}
	private final class spottlistItemClickListener implements OnItemClickListener{
		public void onItemClick(AdapterView arg0, View arg1, int arg2,long arg3) {
			Intent intent = new Intent();
			intent.setClass(NameActivity.this,IamcreaterActivity.class);
			startActivity(intent);
		}
	}
	class mainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(NameActivity.this,MainPageActivity.class);
			startActivity(intent);
		}
	}
	class SharemainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(NameActivity.this,SharemainpageActivity.class);
			startActivity(intent);
		}
	}
	class PersonalmainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(NameActivity.this,PersonalmainpageActivity.class);
			startActivity(intent);
		}
	}
	class searchspotListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(NameActivity.this,SearchmainpageActivity.class);
			startActivity(intent);
		}
	}
	class searchtbtnListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(NameActivity.this,NameActivity.class);
			startActivity(intent);
		}
	}
}
