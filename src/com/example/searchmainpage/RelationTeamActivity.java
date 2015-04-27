package com.example.searchmainpage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.example.teammainpage.CreateTeamActivity;
import com.example.weixing.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class RelationTeamActivity extends Activity{
	private Button Createteam;
	private Button Back;
	private int[] imageId2 = new int[] { R.drawable.wangchengcheng, R.drawable.fuweiwei,R.drawable.kongdingke,R.drawable.zhangwenliang,R.drawable.xiangmeikang};
	private String[] mListTitle2 = {"王城程","付伟伟","孔丁科","张文亮","项美康"};
	private String[] mListStr2 = {"杭州西湖","杭州西湖","杭州西湖","杭州西湖","杭州西湖"};
	ListView list23 = null;
	ArrayList<Map<String,Object>> mData2= new ArrayList<Map<String,Object>>();
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.relationteam);
		list23 = (ListView)findViewById(R.id.list23);
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
		list23.setAdapter(adapter1);
		
		Createteam = (Button)findViewById(R.id.Createteam);
		Createteam.setOnClickListener(new createteamListener());
		
		Back = (Button)findViewById(R.id.Back);
		Back.setOnClickListener(new backListener());
	}
	class createteamListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(RelationTeamActivity.this,CreateTeamActivity.class);
			startActivity(intent);
		}
	}
	class backListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(RelationTeamActivity.this,SpotActivity.class);
			startActivity(intent);
		}
	}

}
