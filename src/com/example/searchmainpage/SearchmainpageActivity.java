package com.example.searchmainpage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.personalmainpage.PersonalmainpageActivity;
import com.example.sharemainpage.SharemainpageActivity;
import com.example.weixing.MainPageActivity;
import com.example.weixing.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.SimpleAdapter;

public class SearchmainpageActivity extends Activity{
	private String[] mListStr1 = {"杭州西湖","日本富士山"};
	private String[] mListStr2 = {"杭州西湖","日本富士山"};
	ListView list24 = null;
	ListView list25 = null;
	private Button mainpage;
	private Button sharemainpage;
	private Button personalmainpage;
	private Button search_name;
	private Button search_to;
	ArrayList<Map<String,Object>> mData1 = new ArrayList<Map<String,Object>>();
	ArrayList<Map<String,Object>> mData2 = new ArrayList<Map<String,Object>>();
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.searchmainpage);
		list24 = (ListView)findViewById(R.id.list24);
		int lengh = mListStr1.length;
		for(int i =0; i < lengh; i++) {
	        Map<String,Object> item = new HashMap<String,Object>();  
	        item.put("spotname01", mListStr1[i]);  
	        mData1.add(item);
	    }
		SimpleAdapter adapter = new SimpleAdapter(this,mData1,R.layout.mylist,
		        new String[]{"spotname01"},new int[]{R.id.spotname01});  
		list24.setAdapter(adapter);
		list24.setOnItemClickListener(new list24ItemClickListener());
		
		list25 = (ListView)findViewById(R.id.list25);
		int lengh1 = mListStr1.length;
		for(int i =0; i < lengh1; i++) {
	        Map<String,Object> item = new HashMap<String,Object>();  
	        item.put("spotname01", mListStr2[i]);  
	        mData2.add(item);
	    }
		SimpleAdapter adapter1 = new SimpleAdapter(this,mData1,R.layout.mylist,
		        new String[]{"spotname01"},new int[]{R.id.spotname01});  
		list25.setAdapter(adapter1);
		list25.setOnItemClickListener(new list24ItemClickListener());
		
		mainpage = (Button)findViewById(R.id.mainpage);
		mainpage.setOnClickListener(new mainpageListener());
		
		sharemainpage = (Button)findViewById(R.id.sharemainpage);
		sharemainpage.setOnClickListener(new SharemainpageListener());
		
		personalmainpage = (Button)findViewById(R.id.personalmainpage);
		personalmainpage.setOnClickListener(new PersonalmainpageListener());
		
		search_name = (Button)findViewById(R.id.search_name);
		search_name.setOnClickListener(new searchnameListener());
		
		search_to = (Button)findViewById(R.id.search_to);
		search_to.setOnClickListener(new searchtoListener());
	}
	private final class list24ItemClickListener implements OnItemClickListener{
		public void onItemClick(AdapterView arg0, View arg1, int arg2,long arg3) {
			Intent intent = new Intent();
			intent.setClass(SearchmainpageActivity.this,SpotActivity.class);
			startActivity(intent);
		}
	}
	class mainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SearchmainpageActivity.this,MainPageActivity.class);
			startActivity(intent);
		}
	}
	class SharemainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SearchmainpageActivity.this,SharemainpageActivity.class);
			startActivity(intent);
		}
	}
	class PersonalmainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SearchmainpageActivity.this,PersonalmainpageActivity.class);
			startActivity(intent);
		}
	}
	class searchnameListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SearchmainpageActivity.this,SearchnamepageActivity.class);
			startActivity(intent);
		}
	}
	class searchtoListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SearchmainpageActivity.this,SpotActivity.class);
			startActivity(intent);
		}
	}
}
