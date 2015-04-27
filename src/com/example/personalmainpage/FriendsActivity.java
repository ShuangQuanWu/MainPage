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

public class FriendsActivity extends Activity{
	private String[] mListTitle = {"付伟伟","施克济","孔丁科","张文亮","项美康"};
	private int[] imageId1 = new int[] { R.drawable.fuweiwei, R.drawable.shikeji,R.drawable.kongdingke,R.drawable.zhangwenliang,R.drawable.xiangmeikang};
	ListView list11 = null;
	private ImageView headpicture;
	private TextView Nickname;
	private Button mine;
	private Button collect;
	private Button message;
	private Button searchmainpage;
	private Button sharemainpage;
	private Button mainpage;
	ArrayList<Map<String,Object>> mData= new ArrayList<Map<String,Object>>();
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.friends);
		list11 = (ListView)findViewById(R.id.list11);
		int lengh = mListTitle.length;
		for(int i =0; i < lengh; i++) {
	        Map<String,Object> item = new HashMap<String,Object>();  
	        item.put("image12", imageId1[i]);
	        item.put("textView13", mListTitle[i]);   
	        mData.add(item);
	    }
		SimpleAdapter adapter = new SimpleAdapter(this,mData,R.layout.friendlist,
		        new String[]{"image12","textView13"},new int[]{R.id.image12,R.id.textView13});  
		list11.setAdapter(adapter);
		list11.setOnItemClickListener(new list11ItemClickListener());
		
		headpicture = (ImageView)findViewById(R.id.headpicture);
		headpicture.setOnClickListener(new changenameandheadmapListener());
		
		Nickname = (TextView)findViewById(R.id.Nickname);
		Nickname.setOnClickListener(new changenameandheadmapListener());
		
		mine = (Button)findViewById(R.id.mine);
		mine.setOnClickListener(new mineListener());
		
		collect = (Button)findViewById(R.id.collect);
		collect.setOnClickListener(new collectListener());
		
		message = (Button)findViewById(R.id.message);
		message.setOnClickListener(new messageListener());
		
		searchmainpage = (Button)findViewById(R.id.searchmainpage);
		searchmainpage.setOnClickListener(new SearchmainpageListener());
		
		sharemainpage = (Button)findViewById(R.id.sharemainpage);
		sharemainpage.setOnClickListener(new SharemainpageListener());
		
		mainpage = (Button)findViewById(R.id.mainpage);
		mainpage.setOnClickListener(new mainpageListener());
	}
	private final class list11ItemClickListener implements OnItemClickListener{
		public void onItemClick(AdapterView arg0, View arg1, int arg2,long arg3) {
			Intent intent = new Intent();
			intent.setClass(FriendsActivity.this,FriendblogandteamActivity.class);
			startActivity(intent);
		}
	}
	class changenameandheadmapListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(FriendsActivity.this,ChangeNameAndHeadmapActivitytwo.class);
			startActivity(intent);
		}
	}
	class collectListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(FriendsActivity.this,CollectActivity.class);
			startActivity(intent);
		}
	}
	class mineListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(FriendsActivity.this,PersonalmainpageActivity.class);
			startActivity(intent);
		}
	}
	class messageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(FriendsActivity.this,MessageActivity.class);
			startActivity(intent);
		}
	}
	class SearchmainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(FriendsActivity.this,SearchmainpageActivity.class);
			startActivity(intent);
		}
	}
	class SharemainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(FriendsActivity.this,SharemainpageActivity.class);
			startActivity(intent);
		}
	}
	class mainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(FriendsActivity.this,MainPageActivity.class);
			startActivity(intent);
		}
	}
}
