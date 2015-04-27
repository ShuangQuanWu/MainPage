package com.example.teammainpage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.personalmainpage.ChangeNameAndHeadmapActivitytwo;
import com.example.personalmainpage.CollectActivity;
import com.example.personalmainpage.FriendsActivity;
import com.example.personalmainpage.MessageActivity;
import com.example.personalmainpage.PersonalmainpageActivity;
import com.example.searchmainpage.SearchmainpageActivity;
import com.example.sharemainpage.SharemainpageActivity;
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

public class TeammainpageActivity extends Activity{
	private int[] imageId1 = new int[] { R.drawable.wangchengcheng, R.drawable.wangchengcheng,R.drawable.wangchengcheng,R.drawable.wangchengcheng,R.drawable.wangchengcheng};
	private String[] mListTitle1 = {"王城程","王城程","王城程","王城程","王城程"};
	private String[] mListStr1 = {"杭州西湖","日本富士山","台湾","厦门","西藏"};
	private int[] imageId2 = new int[] { R.drawable.shikeji, R.drawable.fuweiwei,R.drawable.kongdingke,R.drawable.zhangwenliang,R.drawable.xiangmeikang};
	private String[] mListTitle2 = {"施克济","付伟伟","孔丁科","张文亮","项美康"};
	private String[] mListStr2 = {"杭州西湖","日本富士山","台湾","厦门","西藏"};
	ListView list31 = null;
	ListView list32 = null;
	private Button collect;
	private Button friends;
	private Button message;
	private Button searchmainpage;
	private Button sharemainpage;
	private Button blogbtn;
	private Button mainpage;
	private ImageView imagebtnone;
	private TextView Chuangjian;
	private ImageView headpicture;
	private TextView Nickname;
	ArrayList<Map<String,Object>> mData1= new ArrayList<Map<String,Object>>();
	ArrayList<Map<String,Object>> mData2= new ArrayList<Map<String,Object>>();
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.teammainpage);
		list31 = (ListView)findViewById(R.id.list31);
		int lengh = mListTitle1.length;
		for(int i =0; i < lengh; i++) {
	        Map<String,Object> item = new HashMap<String,Object>();  
	        item.put("image11", imageId1[i]);
	        item.put("textView11", mListTitle1[i]);  
	        item.put("textView12", mListStr1[i]);  
	        mData1.add(item);
	    }
		SimpleAdapter adapter = new SimpleAdapter(this,mData1,R.layout.teamlist,
		        new String[]{"image11","textView11","textView12"},new int[]{R.id.image11,R.id.textView11,R.id.textView12});  
		list31.setAdapter(adapter);
		list31.setOnItemClickListener(new list31ItemClickListener());
		
		list32 = (ListView)findViewById(R.id.list32);
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
		list32.setAdapter(adapter1);
		list32.setOnItemClickListener(new list32ItemClickListener());
		
		collect = (Button)findViewById(R.id.collect);
		collect.setOnClickListener(new collectListener());
		
		friends = (Button)findViewById(R.id.friends);
		friends.setOnClickListener(new friendsListener());
		
		message = (Button)findViewById(R.id.message);
		message.setOnClickListener(new messageListener());
		
		headpicture = (ImageView)findViewById(R.id.headpicture);
		headpicture.setOnClickListener(new changenameandheadmapListener());
		
		Nickname = (TextView)findViewById(R.id.Nickname);
		Nickname.setOnClickListener(new changenameandheadmapListener());
		
		searchmainpage = (Button)findViewById(R.id.searchmainpage);
		searchmainpage.setOnClickListener(new SearchmainpageListener());
		
		sharemainpage = (Button)findViewById(R.id.sharemainpage);
		sharemainpage.setOnClickListener(new SharemainpageListener());
		
		blogbtn = (Button)findViewById(R.id.blogbtn);
		blogbtn.setOnClickListener(new blogbtnListener());
		
		mainpage = (Button)findViewById(R.id.mainpage);
		mainpage.setOnClickListener(new mainpageListener());
		
		imagebtnone = (ImageView)findViewById(R.id.imagebtnone);
		imagebtnone.setOnClickListener(new chuangjianListener());
		
		Chuangjian = (TextView)findViewById(R.id.Chuangjian);
		Chuangjian.setOnClickListener(new chuangjianListener());
	}
	private final class list31ItemClickListener implements OnItemClickListener{
		public void onItemClick(AdapterView arg0, View arg1, int arg2,long arg3) {
			Intent intent = new Intent();
			intent.setClass(TeammainpageActivity.this,IamcreaterActivity.class);
			startActivity(intent);
		}
	}
	private final class list32ItemClickListener implements OnItemClickListener{
		public void onItemClick(AdapterView arg0, View arg1, int arg2,long arg3) {
			Intent intent = new Intent();
			intent.setClass(TeammainpageActivity.this,IamnotcreaterActivity.class);
			startActivity(intent);
		}
	}
	class collectListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(TeammainpageActivity.this,CollectActivity.class);
			startActivity(intent);
		}
	}
	class friendsListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(TeammainpageActivity.this,FriendsActivity.class);
			startActivity(intent);
		}
	}
	class messageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(TeammainpageActivity.this,MessageActivity.class);
			startActivity(intent);
		}
	}
	class changenameandheadmapListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(TeammainpageActivity.this,ChangeNameAndHeadmapActivitytwo.class);
			startActivity(intent);
		}
	}
	class SearchmainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(TeammainpageActivity.this,SearchmainpageActivity.class);
			startActivity(intent);
		}
	}
	class SharemainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(TeammainpageActivity.this,SharemainpageActivity.class);
			startActivity(intent);
		}
	}
	class blogbtnListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(TeammainpageActivity.this,PersonalmainpageActivity.class);
			startActivity(intent);
		}
	}
	class mainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(TeammainpageActivity.this,MainPageActivity.class);
			startActivity(intent);
		}
	}
	class chuangjianListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(TeammainpageActivity.this,CreateTeamActivity.class);
			startActivity(intent);
		}
	}
}
