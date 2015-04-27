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
import android.widget.Toast;

public class MessageActivity extends Activity{
	private String[] mListStr = {"施克济加你为好友","付伟伟加你为好友","申太良解散了队伍","孔丁科邀请你加入队伍","您解散了队伍“西湖一日游”"};
	ListView list15 = null;
	private ImageView headpicture;
	private TextView Nickname;
	private Button mine;
	private Button collect;
	private Button friends;
	private Button searchmainpage;
	private Button sharemainpage;
	private Button mainpage;
	ArrayList<Map<String,Object>> mData= new ArrayList<Map<String,Object>>();

	protected void onCreate(Bundle savedInstancestate){
		super.onCreate(savedInstancestate);
		setContentView(R.layout.message);
		list15 = (ListView)findViewById(R.id.list15);
		int lengh = mListStr.length;
		for(int i =0; i < lengh; i++) {
	        Map<String,Object> item = new HashMap<String,Object>();   
	        item.put("textView15", mListStr[i]);  
	        mData.add(item);
	    }
		SimpleAdapter adapter = new SimpleAdapter(this,mData,R.layout.messagelist,
		        new String[]{"textView15"},new int[]{R.id.textView15});  
		list15.setAdapter(adapter);
		list15.setOnItemClickListener(new list15ItemClickListener());
		
		headpicture = (ImageView)findViewById(R.id.headpicture);
		headpicture.setOnClickListener(new changenameandheadmapListener());
		
		Nickname = (TextView)findViewById(R.id.Nickname);
		Nickname.setOnClickListener(new changenameandheadmapListener());
		
		mine = (Button)findViewById(R.id.mine);
		mine.setOnClickListener(new mineListener());
		
		collect = (Button)findViewById(R.id.collect);
		collect.setOnClickListener(new collectListener());
		
		friends = (Button)findViewById(R.id.friends);
		friends.setOnClickListener(new friendsListener());
		
		searchmainpage = (Button)findViewById(R.id.searchmainpage);
		searchmainpage.setOnClickListener(new SearchmainpageListener());
		
		sharemainpage = (Button)findViewById(R.id.sharemainpage);
		sharemainpage.setOnClickListener(new SharemainpageListener());
		
		mainpage = (Button)findViewById(R.id.mainpage);
		mainpage.setOnClickListener(new mainpageListener());
	}
	private final class list15ItemClickListener implements OnItemClickListener{
		public void onItemClick(AdapterView arg0, View arg1, int arg2,long arg3) {
			Toast.makeText(MessageActivity.this,"已查看" , Toast.LENGTH_LONG).show(); 
		}
	}
	class changenameandheadmapListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(MessageActivity.this,ChangeNameAndHeadmapActivitytwo.class);
			startActivity(intent);
		}
	}
	class collectListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(MessageActivity.this,CollectActivity.class);
			startActivity(intent);
		}
	}
	class mineListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(MessageActivity.this,PersonalmainpageActivity.class);
			startActivity(intent);
		}
	}
	class friendsListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(MessageActivity.this,FriendsActivity.class);
			startActivity(intent);
		}
	}
	class SearchmainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(MessageActivity.this,SearchmainpageActivity.class);
			startActivity(intent);
		}
	}
	class SharemainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(MessageActivity.this,SharemainpageActivity.class);
			startActivity(intent);
		}
	}
	class mainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(MessageActivity.this,MainPageActivity.class);
			startActivity(intent);
		}
	}
}
