package com.example.sharemainpage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.searchmainpage.SpotActivity;
import com.example.weixing.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;

public class AddspotActivity extends Activity{
	private String[] mListTitle = {"杭州","温州","绍兴","北京","台湾","日本","泰国"};
	ListView spotlist = null;
	ImageButton imagebtn03;
	
	ArrayList<Map<String,Object>> mData= new ArrayList<Map<String,Object>>();
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addspot);
		
		spotlist = (ListView)findViewById(R.id.spotlist);
		int lengh = mListTitle.length;
		for(int i =0; i < lengh; i++) {
	        Map<String,Object> item = new HashMap<String,Object>();  
	        item.put("spotname02", mListTitle[i]);   
	        mData.add(item);
	    }
		SimpleAdapter adapter = new SimpleAdapter(this,mData,R.layout.addspotlist,
		        new String[]{"spotname02"},new int[]{R.id.spotname02});  
		spotlist.setAdapter(adapter);	
		spotlist.setOnItemClickListener(new spotlistItemClickListener());
		
		imagebtn03 = (ImageButton)findViewById(R.id.imagebtn03);
		imagebtn03.setOnClickListener(new imagebtn03Listener());
	}
	private final class spotlistItemClickListener implements OnItemClickListener{
		public void onItemClick(AdapterView arg0, View arg1, int arg2,long arg3) {
			Intent intent = new Intent();
			intent.setClass(AddspotActivity.this,SpotActivity.class);
			startActivity(intent);
		}
	}
	class imagebtn03Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(AddspotActivity.this,SpotActivity.class);
			startActivity(intent);
		}
	}
}
