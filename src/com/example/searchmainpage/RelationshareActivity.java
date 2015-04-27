package com.example.searchmainpage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.example.personalmainpage.PersonalblogActivity;
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

public class RelationshareActivity extends Activity{
	private Button Back;
	private String[] mListTitle = {"王城程","施克济","孔丁科","张文亮","项美康"};
	private String[] mListStr = {"杭州西湖","杭州西湖","杭州西湖","杭州西湖","杭州西湖"};
	private int[] imageId2 = new int[] { R.drawable.xihu, R.drawable.xihu,R.drawable.xihu,R.drawable.xihu,R.drawable.xihu};
	private int[] imageId1 = new int[] { R.drawable.wangchengcheng, R.drawable.shikeji,R.drawable.kongdingke,R.drawable.zhangwenliang,R.drawable.xiangmeikang};
	ListView sharelist = null;
	
	ArrayList<Map<String,Object>> mData= new ArrayList<Map<String,Object>>();
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.relationshare);
		
		Back = (Button)findViewById(R.id.Back);
		Back.setOnClickListener(new BackListener());
		
		sharelist = (ListView)findViewById(R.id.sharelist);
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
		sharelist.setAdapter(adapter);	
		sharelist.setOnItemClickListener(new sharelistItemClickListener());
	}
	private final class sharelistItemClickListener implements OnItemClickListener{
		public void onItemClick(AdapterView arg0, View arg1, int arg2,long arg3) {
			Intent intent = new Intent();
			intent.setClass(RelationshareActivity.this,PersonalblogActivity.class);
			startActivity(intent);
		}
	}
	class BackListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(RelationshareActivity.this,SpotActivity.class);
			startActivity(intent);
		}
	}

}
