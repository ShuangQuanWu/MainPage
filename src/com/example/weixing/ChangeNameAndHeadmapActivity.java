package com.example.weixing;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

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

public class ChangeNameAndHeadmapActivity extends Activity implements OnClickListener{
	private Button btn01;
	private Button btn02;
	private ImageButton imagebtn01;
	private Button choose;
	private static final int PHOTO_REQUEST_TAKEPHOTO = 1;
	private static final int PHOTO_REQUEST_GALLERY = 2;
	private static final int PHOTO_REQUEST_CUT = 3;
	File tempFile = new File(Environment.getExternalStorageDirectory(),getPhotoFileName());
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.changenameandheadmap);
		init();
		
		btn01 = (Button)findViewById(R.id.btn01);
		btn01.setOnClickListener(new btn01Listener());
		
		btn02 = (Button)findViewById(R.id.btn02);
		btn02.setOnClickListener(new btn02Listener());
	}
	//��ʼ���ؼ�
	private void init() {
		imagebtn01 = (ImageButton)findViewById(R.id.imagebtn01);
		choose = (Button)findViewById(R.id.choose);
        
        //ΪImageButton��Button��Ӽ����¼�
		imagebtn01.setOnClickListener(this);
		choose.setOnClickListener(this);
    }
	//����¼�
	public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
        case R.id.imagebtn01:
            showDialog();
            break;

        case R.id.choose:
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
            imagebtn01.setBackgroundDrawable(drawable);
        }
    }
 // ʹ��ϵͳ��ǰ���ڼ��Ե�����Ϊ��Ƭ������
	private String getPhotoFileName() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat dateFormat = new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss");
        return dateFormat.format(date) + ".jpg";
    }
	
	class btn01Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(ChangeNameAndHeadmapActivity.this,MainPageActivity.class);
			startActivity(intent);
		}
	}
	
	class btn02Listener implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(ChangeNameAndHeadmapActivity.this,MainPageActivity.class);
			startActivity(intent);
		}
	}
}
