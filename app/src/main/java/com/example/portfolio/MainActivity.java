package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ImageButton btSetting;
    private ImageButton btResume;
    private ImageButton btActivity;
    private ImageButton btContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //remove title bar
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        findViewById();

        btResume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityResume();
            }
        });
        btActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityActivity();
            }
        });
        btContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityHistory();
            }
        });


    }

    private void findViewById(){
        btSetting = findViewById(R.id.setting);
        btResume = findViewById(R.id.resume);
        btActivity = findViewById(R.id.activity);
        btContact = findViewById(R.id.contact);
    }

    private void openActivityResume(){
        Intent intent = new Intent(MainActivity.this,resume.class);
        startActivity(intent);
    }

    private void openActivityActivity(){
        Intent intent = new Intent(MainActivity.this,activity.class);
        startActivity(intent);
    }

    private void openActivityHistory(){
        Intent intent = new Intent(MainActivity.this,history.class);
        startActivity(intent);
    }
}