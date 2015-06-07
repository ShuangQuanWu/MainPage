package com.example.sharemainpage;


import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

import com.example.personalmainpage.PersonalmainpageActivity;
import com.example.searchmainpage.SearchmainpageActivity;
import com.example.weixing.MainPageActivity;
import com.example.weixing.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SharemainpageActivity extends Activity implements OnClickListener{
	private Button btntwo;
	private ImageButton imagebtn10;
	private ImageView addtitleimg;
	private Button mainpage;
	private Button searchmainpage;
	private Button personalmainpage;
	private Button btnone;
	private static final int PHOTO_REQUEST_TAKEPHOTO = 1;
	private static final int PHOTO_REQUEST_GALLERY = 2;
	private static final int PHOTO_REQUEST_CUT = 3;
	File tempFile = new File(Environment.getExternalStorageDirectory(),getPhotoFileName());

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sharemainpage);
		init();
		
		addtitleimg = (ImageView)findViewById(R.id.addtitleimg);
		addtitleimg.setOnClickListener(new addtitleimgListener());
		
		btnone = (Button)findViewById(R.id.btnone);
		btnone.setOnClickListener(new btnoneListener());
		
		mainpage = (Button)findViewById(R.id.mainpage);
		mainpage.setOnClickListener(new mainpageListener());
		
		searchmainpage = (Button)findViewById(R.id.searchmainpage);
		searchmainpage.setOnClickListener(new SearchmainpageListener());
		
		personalmainpage = (Button)findViewById(R.id.personalmainpage);
		personalmainpage.setOnClickListener(new PersonalmainpageListener());
		
	}
	//初始化控件
		private void init() {
			imagebtn10 = (ImageButton)findViewById(R.id.imagebtn10);
			btntwo = (Button)findViewById(R.id.btntwo);
	        
	        //为ImageButton和Button添加监听事件
			imagebtn10.setOnClickListener(this);
			btntwo.setOnClickListener(this);
	    }
		//点击事件
		public void onClick(View v) {
	        // TODO Auto-generated method stub
	        switch (v.getId()) {
	        case R.id.imagebtn10:
	            showDialog();
	            break;

	        case R.id.btntwo:
	            showDialog();
	            break;
	        }

	    }
		//提示对话框方法
	    private void showDialog() {
	        new AlertDialog.Builder(this)
	                .setTitle("头像设置")
	                .setPositiveButton("拍照", new DialogInterface.OnClickListener() {

	                    @Override
	                    public void onClick(DialogInterface dialog, int which) {
	                        // TODO Auto-generated method stub
	                        dialog.dismiss();
	                        // 调用系统的拍照功能
	                        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
	                        // 指定调用相机拍照后照片的储存路径
	                        intent.putExtra(MediaStore.EXTRA_OUTPUT,Uri.fromFile(tempFile));
	                        startActivityForResult(intent, PHOTO_REQUEST_TAKEPHOTO);
	                    }
	                })
	                .setNegativeButton("相册", new DialogInterface.OnClickListener() {

	                    @Override
	                    public void onClick(DialogInterface dialog, int which) {
	                        // TODO Auto-generated method stub
	                        dialog.dismiss();
	                        Intent intent = new Intent(Intent.ACTION_PICK, null);
	                        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,"image/*");
	                        startActivityForResult(intent, PHOTO_REQUEST_GALLERY);
	                    }
	                }).show();
	    }
	    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	        // TODO Auto-generated method stub

	        switch (requestCode) {
	        case PHOTO_REQUEST_TAKEPHOTO:
	            startPhotoZoom(Uri.fromFile(tempFile), 150);
	            break;

	        case PHOTO_REQUEST_GALLERY:
	            if (data != null)
	                startPhotoZoom(data.getData(), 150);
	            break;

	        case PHOTO_REQUEST_CUT:
	            if (data != null) 
	                setPicToView(data);
	            break;
	        }
	        super.onActivityResult(requestCode, resultCode, data);

	    }
	    private void startPhotoZoom(Uri uri, int size) {
	        Intent intent = new Intent("com.android.camera.action.CROP");
	        intent.setDataAndType(uri, "image/*");
	        // crop为true是设置在开启的intent中设置显示的view可以剪裁
	        intent.putExtra("crop", "true");

	        // aspectX aspectY 是宽高的比例
	        intent.putExtra("aspectX", 1);
	        intent.putExtra("aspectY", 1);

	        // outputX,outputY 是剪裁图片的宽高
	        intent.putExtra("outputX", size);
	        intent.putExtra("outputY", size);
	        intent.putExtra("return-data", true);

	        startActivityForResult(intent, PHOTO_REQUEST_CUT);
	    }
	  //将进行剪裁后的图片显示到UI界面上
	    private void setPicToView(Intent picdata) {
	        Bundle bundle = picdata.getExtras();
	        if (bundle != null) {
	            Bitmap photo = bundle.getParcelable("data");
	            Drawable drawable = new BitmapDrawable(photo);
	            imagebtn10.setBackgroundDrawable(drawable);
	        }
	    }
	 // 使用系统当前日期加以调整作为照片的名称
		private String getPhotoFileName() {
	        Date date = new Date(System.currentTimeMillis());
	        SimpleDateFormat dateFormat = new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss");
	        return dateFormat.format(date) + ".jpg";
	    }
	class addtitleimgListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SharemainpageActivity.this,AddspotActivity.class);
			startActivity(intent);
		}
	}
	class btnoneListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SharemainpageActivity.this,PersonalmainpageActivity.class);
			startActivity(intent);
		}
	}
	class mainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SharemainpageActivity.this,MainPageActivity.class);
			startActivity(intent);
		}
	}
	class SearchmainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SharemainpageActivity.this,SearchmainpageActivity.class);
			startActivity(intent);
		}
	}
	class PersonalmainpageListener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(SharemainpageActivity.this,PersonalmainpageActivity.class);
			startActivity(intent);
		}
	}
}
