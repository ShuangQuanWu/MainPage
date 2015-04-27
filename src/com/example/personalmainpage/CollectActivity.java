package com.example.personalmainpage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.searchmainpage.SearchmainpageActivity;
import com.example.sharemainpage.SharemainpageActivity;
import com.example.teammainpage.TeammainpageActivity;
import com.example.weixing.MainPageActivity;
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

public class CollectActivity extends Activity{
	private String[] mListTitle = {"王城程","施克济","孔丁科","张文亮","项美康"};
	private String[] mListStr = {"杭州西湖","日本富士山","台湾","厦门","西藏"};
	private int[] imageId2 = new int[] { R.drawable.xihu, R.drawable.fushishan,R.drawable.taiwan,R.drawable.xiamen,R.drawable.xizang};
	private int[] imageId1 = new int[] { R.drawable.wangchengcheng, R.drawable.shikeji,R.drawable.kongdingke,R.drawable.zhangwenliang,R.drawable.xiangmeikang};
	ListView list14 = null;
	private ImageView headpicture;
	private TextView Nickname;
	private Button mine;
	private Button friends;
	private Button message;
	private Button searchmainpage;
	private Button sharemainpage;
	private Button mainpage;
	ArrayList<Map<String,Object>> mData= new ArrayList<Map<String,Object>>();

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.collect);
		list14 = (ListView)findViewById(R.id.list14);
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
		list14.setAdapter(adapter);
		list14.setOnItemClickListener(new list14ItemClickListener());
		
		headpicture = (ImageView)findViewById(R.id.headpicture);
		headpicture.setOnClickListener(new changenameandheadmapListener());
		
		Nickname = (TextView)findViewById(R.id.Nickname);
		Nickname.setOnClickListener(new changenameandheadmapListener());
		
		mine = (Button)findViewById(R.id.mine);
		mine.setOnClickListener(new mineListener());
		
		friends = (Button)findViewById(R.id.friends);
		friends.setOnClickListener(new friendsListener());
		
		message = (Button)findViewById(R.id.message);
		message.setOnClickListener(new messageListener());
		
		searchmainpage = (Button)findViewById(R.id.searchmainpage);
		searchmainpage.setOnClickListener(new SearchmainpageListener());
		
		sharemainpage = (Button)findViewById(R.id.sharemainpage);
		sharemainpage.setOnClickListener(new SharemainpageListener());
		
		mainpage = (Button)findViewById(R.id.mainpage);
		mainpage.setOnClickListener(new mainpageListener());
	}
	private final class list14ItemClickListener implements OnItemClickListener{
		public void onItemClick(AdapterView arg0, View arg1, int arg2,long arg3) {
			Intent intent = new Intent();
			intent.setClass(CollectActivity.this,CollectblogActivity.class);
			startActivity(intent);
		}
	}
	class changenameandheadmapListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectActivity.this,ChangeNameAndHeadmapActivitytwo.class);
			startActivity(intent);
		}
	}
	class mineListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectActivity.this,PersonalmainpageActivity.class);
			startActivity(intent);
		}
	}
	class friendsListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectActivity.this,FriendsActivity.class);
			startActivity(intent);
		}
	}
	class messageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectActivity.this,MessageActivity.class);
			startActivity(intent);
		}
	}
	class SearchmainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectActivity.this,SearchmainpageActivity.class);
			startActivity(intent);
		}
	}
	class SharemainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectActivity.this,SharemainpageActivity.class);
			startActivity(intent);
		}
	}
	class mainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(CollectActivity.this,MainPageActivity.class);
			startActivity(intent);
		}
	}
}
