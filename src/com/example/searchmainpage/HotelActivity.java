package com.example.searchmainpage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.weixing.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class HotelActivity extends Activity{
	private Button Back05;
	private String[] mListTitle = {"����������","�ͱ�¡","���տ�","�轭ά��","����������"};
	private String[] mListStr = {"ѧ����55��","ѧ�ֽ�2��","�ĺ���·5��","ѧ����11��","ѧ�ֽ�1��"};
	private int[] imageId1 = new int[] { R.drawable.lalamian, R.drawable.babeilong,R.drawable.xiangrikui,R.drawable.gejiangweijia,R.drawable.shenmishu};
	ListView list19 = null;
	ArrayList<Map<String,Object>> mData= new ArrayList<Map<String,Object>>();
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotel);
		list19 = (ListView)findViewById(R.id.list19);
		int lengh = mListTitle.length;
		for(int i =0; i < lengh; i++) {
	        Map<String,Object> item = new HashMap<String,Object>();  
	        item.put("image17", imageId1[i]);
	        item.put("textView17", mListTitle[i]);  
	        item.put("textView18", mListStr[i]);  
	        mData.add(item);
	    }
		SimpleAdapter adapter = new SimpleAdapter(this,mData,R.layout.storelist,
		        new String[]{"image17","textView17","textView18"},new int[]{R.id.image17,R.id.textView17,R.id.textView18});  
		list19.setAdapter(adapter);
		
		Back05 = (Button)findViewById(R.id.Back05);
		Back05.setOnClickListener(new Back05Listener());
	}
	class Back05Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(HotelActivity.this,NearActivity.class);
			startActivity(intent);
		}
	}
}
