package com.example.teammainpage;

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

public class AddmemberActivity extends Activity{
	private String[] mListTitle = {"顾明辉","施克济","孔丁科","张文亮","项美康"};
	private int[] imageId1 = new int[] { R.drawable.guminghui, R.drawable.shikeji,R.drawable.kongdingke,R.drawable.zhangwenliang,R.drawable.xiangmeikang};
	private Button addmemberbtn;
	private Button Back12;
	ListView list29 = null;
	ArrayList<Map<String,Object>> mData= new ArrayList<Map<String,Object>>();
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addmember);
		list29 = (ListView)findViewById(R.id.list29);
		int lengh = mListTitle.length;
		for(int i =0; i < lengh; i++) {
	        Map<String,Object> item = new HashMap<String,Object>();  
	        item.put("image20", imageId1[i]);
	        item.put("textView20", mListTitle[i]);  
	        mData.add(item);
	    }
		SimpleAdapter adapter = new SimpleAdapter(this,mData,R.layout.addmemberlist,
		        new String[]{"image20","textView20"},new int[]{R.id.image20,R.id.textView20});  
		list29.setAdapter(adapter);
		
		addmemberbtn = (Button)findViewById(R.id.addmemberbtn);
		addmemberbtn.setOnClickListener(new addmemberbtnListener());
		
		Back12 = (Button)findViewById(R.id.Back12);
		Back12.setOnClickListener(new Back12Listener());
	}
	
	class addmemberbtnListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(AddmemberActivity.this,CreateTeamActivity.class);
			startActivity(intent);
		}
	}
	class Back12Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(AddmemberActivity.this,CreateTeamActivity.class);
			startActivity(intent);
		}
	}
}
