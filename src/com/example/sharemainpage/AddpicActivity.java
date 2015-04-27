package com.example.sharemainpage;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

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

public class AddpicActivity extends Activity implements OnClickListener{
	private Button button01;
	private Button button02;
	private ImageButton imagebtn02;
	private Button choose02;
	private static final int PHOTO_REQUEST_TAKEPHOTO = 1;
	private static final int PHOTO_REQUEST_GALLERY = 2;
	private static final int PHOTO_REQUEST_CUT = 3;
	File tempFile = new File(Environment.getExternalStorageDirectory(),getPhotoFileName());
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addpic);
		init();
		
		button01 = (Button)findViewById(R.id.button01);
		button01.setOnClickListener(new button01Listener());
		
		button02 = (Button)findViewById(R.id.button02);
		button02.setOnClickListener(new button02Listener());
	}
	//��ʼ���ؼ�
		private void init() {
			imagebtn02 = (ImageButton)findViewById(R.id.imagebtn02);
			choose02 = (Button)findViewById(R.id.choose02);
	        
	        //ΪImageButton��Button��Ӽ����¼�
			imagebtn02.setOnClickListener(this);
			choose02.setOnClickListener(this);
	    }
		//����¼�
		public void onClick(View v) {
	        // TODO Auto-generated method stub
	        switch (v.getId()) {
	        case R.id.imagebtn02:
	            showDialog();
	            break;

	        case R.id.choose02:
	            showDialog();
	            break;
	        }

	    }
		//��ʾ�Ի��򷽷�
	    private void showDialog() {
	        new AlertDialog.Builder(this)
	                .setTitle("ͷ������")
	                .setPositiveButton("����", new DialogInterface.OnClickListener() {

	                    @Override
	                    public void onClick(DialogInterface dialog, int which) {
	                        // TODO Auto-generated method stub
	                        dialog.dismiss();
	                        // ����ϵͳ�����չ���
	                        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
	                        // ָ������������պ���Ƭ�Ĵ���·��
	                        intent.putExtra(MediaStore.EXTRA_OUTPUT,Uri.fromFile(tempFile));
	                        startActivityForResult(intent, PHOTO_REQUEST_TAKEPHOTO);
	                    }
	                })
	                .setNegativeButton("���", new DialogInterface.OnClickListener() {

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
	        // cropΪtrue�������ڿ�����intent��������ʾ��view���Լ���
	        intent.putExtra("crop", "true");

	        // aspectX aspectY �ǿ�ߵı���
	        intent.putExtra("aspectX", 1);
	        intent.putExtra("aspectY", 1);

	        // outputX,outputY �Ǽ���ͼƬ�Ŀ��
	        intent.putExtra("outputX", size);
	        intent.putExtra("outputY", size);
	        intent.putExtra("return-data", true);

	        startActivityForResult(intent, PHOTO_REQUEST_CUT);
	    }
	  //�����м��ú��ͼƬ��ʾ��UI������
	    private void setPicToView(Intent picdata) {
	        Bundle bundle = picdata.getExtras();
	        if (bundle != null) {
	            Bitmap photo = bundle.getParcelable("data");
	            Drawable drawable = new BitmapDrawable(photo);
	            imagebtn02.setBackgroundDrawable(drawable);
	        }
	    }
	 // ʹ��ϵͳ��ǰ���ڼ��Ե�����Ϊ��Ƭ������
		private String getPhotoFileName() {
	        Date date = new Date(System.currentTimeMillis());
	        SimpleDateFormat dateFormat = new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss");
	        return dateFormat.format(date) + ".jpg";
	    }
		
		class button02Listener implements OnClickListener{
			public void onClick(View v){
				Intent intent = new Intent();
				intent.setClass(AddpicActivity.this,SharemainpageActivity.class);
				startActivity(intent);
			}
		}
		
		class button01Listener implements OnClickListener{
			public void onClick(View v){
				Intent intent = new Intent();
				intent.setClass(AddpicActivity.this,SharemainpageActivity.class);
				startActivity(intent);
			}
		}
}
