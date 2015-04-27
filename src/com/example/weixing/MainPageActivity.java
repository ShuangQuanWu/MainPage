package com.example.weixing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.example.personalmainpage.CollectblogActivity;
import com.example.personalmainpage.PersonalmainpageActivity;
import com.example.searchmainpage.SearchmainpageActivity;
import com.example.sharemainpage.SharemainpageActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class MainPageActivity extends Activity {
	private String[] mListTitle = {"王城程","施克济","孔丁科","张文亮","项美康"};
	private String[] mListStr = {"杭州西湖","日本富士山","台湾","厦门","西藏"};
	private int[] imageId2 = new int[] { R.drawable.xihu, R.drawable.fushishan,R.drawable.taiwan,R.drawable.xiamen,R.drawable.xizang};
	private int[] imageId1 = new int[] { R.drawable.wangchengcheng, R.drawable.shikeji,R.drawable.kongdingke,R.drawable.zhangwenliang,R.drawable.xiangmeikang};
	ListView listone = null;
	private Button searchmainpage;
	private Button sharemainpage;
	private Button personalmainpage;
	private Button zuire;
	private ImageView headpicture;
	private TextView Nickname;
	ArrayList<Map<String,Object>> mData= new ArrayList<Map<String,Object>>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainpage);
		listone = (ListView)findViewById(R.id.listone);
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
		listone.setAdapter(adapter);	
		listone.setOnItemClickListener(new listoneItemClickListener());
		
		searchmainpage = (Button)findViewById(R.id.searchmainpage);
		searchmainpage.setOnClickListener(new SearchmainpageListener());
		
		sharemainpage = (Button)findViewById(R.id.sharemainpage);
		sharemainpage.setOnClickListener(new SharemainpageListener());
		
		personalmainpage = (Button)findViewById(R.id.personalmainpage);
		personalmainpage.setOnClickListener(new PersonalmainpageListener());
		
		zuire = (Button)findViewById(R.id.zuire);
		zuire.setOnClickListener(new zuireListener());
		
		headpicture = (ImageView)findViewById(R.id.headpicture);
		headpicture.setOnClickListener(new changenameandheadmapListener());
		
		Nickname = (TextView)findViewById(R.id.Nickname);
		Nickname.setOnClickListener(new changenameandheadmapListener());
	}
	private final class listoneItemClickListener implements OnItemClickListener{
		public void onItemClick(AdapterView arg0, View arg1, int arg2,long arg3) {
			Intent intent = new Intent();
			intent.setClass(MainPageActivity.this,CollectblogActivity.class);
			startActivity(intent);
		}
	}
	class zuireListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(MainPageActivity.this,MainPagetwoActivity.class);
			startActivity(intent);
		}
	}
	class SearchmainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(MainPageActivity.this,SearchmainpageActivity.class);
			startActivity(intent);
		}
	}
	class SharemainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(MainPageActivity.this,SharemainpageActivity.class);
			startActivity(intent);
		}
	}
	class PersonalmainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(MainPageActivity.this,PersonalmainpageActivity.class);
			startActivity(intent);
		}
	}
	class changenameandheadmapListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(MainPageActivity.this,ChangeNameAndHeadmapActivity.class);
			startActivity(intent);
		}
	}	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_page, menu);
		return true;
	}

}