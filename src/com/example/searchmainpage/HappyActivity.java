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

public class HappyActivity extends Activity{
	ListView list18 = null;
	private String[] mListTitle = {"兰州拉拉面","巴贝隆","向日葵","歌江维嘉","神秘树餐厅"};
	private String[] mListStr = {"学正街55号","学林街2号","文海南路5号","学正街11号","学林街1号"};
	private int[] imageId1 = new int[] { R.drawable.lalamian, R.drawable.babeilong,R.drawable.xiangrikui,R.drawable.gejiangweijia,R.drawable.shenmishu};
	private Button Back06;
	ArrayList<Map<String,Object>> mData= new ArrayList<Map<String,Object>>();
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.happy);
		list18 = (ListView)findViewById(R.id.list18);
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
		list18.setAdapter(adapter);
		
		Back06 = (Button)findViewById(R.id.Back06);
		Back06.setOnClickListener(new Back06Listener());
	}
	class Back06Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(HappyActivity.this,NearActivity.class);
			startActivity(intent);
		}
	}
}
