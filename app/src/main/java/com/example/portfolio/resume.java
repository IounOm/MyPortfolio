package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class resume extends AppCompatActivity {

    private ImageView imageView;
    private Button btDownload;
    private ImageButton btBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //remove title bar
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_resume);

        ActivityCompat.requestPermissions(resume.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        findViewById();
        ActivityCompat.requestPermissions(resume.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);

        //make folder Resume and download image.png to internal (image name is currentTimeMillis.png)
        btDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img = findViewById(R.id.imageView);

                BitmapDrawable draw = (BitmapDrawable) img.getDrawable();
                Bitmap bitmap = draw.getBitmap();

                FileOutputStream outPutStream = null;
                File sdCard = Environment.getExternalStorageDirectory();
                File dir = new File(sdCard.getAbsolutePath() + "/SaveImages");
                dir.mkdirs();
                String fileName = String.format("%d.png", System.currentTimeMillis());
                File outFile = new File(dir, fileName);
                try {
                    outPutStream = new FileOutputStream(outFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, outPutStream);
                Toast.makeText(getApplicationContext(),"Image Save To Internal Storage",Toast.LENGTH_SHORT).show();
                try {
                    outPutStream.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    outPutStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMain();
            }
        });
    }

    private void findViewById(){
        imageView = findViewById(R.id.imageView);
        btDownload = findViewById(R.id.download);
        btBack = findViewById(R.id.back);
    }

    private void openActivityMain(){
        Intent intent = new Intent(resume.this,MainActivity.class);
        startActivity(intent);
    }
}