package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class activity extends AppCompatActivity {

    private ImageView img1, img2, img3 ,img4;
    private TextView textRole;
    private TextView textRes;
    private TextView textLink;
    private Spinner spinner;
    private ImageButton btBack;

    private String[] myActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //remove title bar
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_activity);

        findViewById();
        arraySpinner();



        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMain();
            }
        });

    }

    private void findViewById(){
        img1 = findViewById(R.id.image1);
        img2 = findViewById(R.id.image2);
        img3 = findViewById(R.id.image3);
        img4 = findViewById(R.id.image4);
        textRole = findViewById(R.id.role);
        textRes = findViewById(R.id.responsibility);
        textLink = findViewById(R.id.link);
        spinner = findViewById(R.id.spinner2);
        btBack = findViewById(R.id.back);

    }

    private void openActivityMain(){
        Intent intent = new Intent(activity.this,MainActivity.class);
        startActivity(intent);
    }

    private void arraySpinner(){
        myActivity = getResources().getStringArray(R.array.myActivity);
        ArrayAdapter<String> activity = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,myActivity);
        spinner.setAdapter(activity);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    textRole.setText(getString(R.string.a1));
                    textRes.setText(getString(R.string.a2));
                    textLink.setText(getString(R.string.link0));
                    img1.setImageResource(R.drawable.register1);
                    img2.setImageResource(R.drawable.register2);
                    img3.setImageResource(R.drawable.register3);
                    img4.setImageResource(R.drawable.register4);
                }
                else if (position == 1){
                    textRole.setText(getString(R.string.b1));
                    textRes.setText(getString(R.string.b2));
                    textLink.setText(getString(R.string.linkGame));
                    img1.setImageResource(R.drawable.game1);
                    img2.setImageResource(R.drawable.game2);
                    img3.setImageResource(R.drawable.game3);
                    img4.setImageResource(R.drawable.game4);
                }
                else if (position == 2){
                    textRole.setText(getString(R.string.c1));
                    textRes.setText(getString(R.string.c2));
                    textLink.setText(getString(R.string.link0));
                    img1.setImageResource(R.drawable.open1);
                    img2.setImageResource(R.drawable.open2);
                    img3.setImageResource(R.drawable.open3);
                    img4.setImageResource(R.drawable.open4);
                }
                else if (position == 3){
                    textRole.setText(getString(R.string.d1));
                    textRes.setText(getString(R.string.d2));
                    textLink.setText(getString(R.string.link0));
                    img1.setImageResource(R.drawable.asa1);
                    img2.setImageResource(R.drawable.asa2);
                    img3.setImageResource(R.drawable.asa3);
                    img4.setImageResource(R.drawable.asa4);
                }
                else if (position == 4){
                    textRole.setText(getString(R.string.e1));
                    textRes.setText(getString(R.string.e2));
                    textLink.setText(getString(R.string.link0));
                    img1.setImageResource(R.drawable.idea1);
                    img2.setImageResource(R.drawable.idea2);
                    img3.setImageResource(R.drawable.idea3);
                    img4.setImageResource(R.drawable.idea4);
                }
                else if (position == 5){
                    textRole.setText(getString(R.string.f1));
                    textRes.setText(getString(R.string.f2));
                    textLink.setText(getString(R.string.linkFreshy));
                    img1.setImageResource(R.drawable.freshy1);
                    img2.setImageResource(R.drawable.freshy2);
                    img3.setImageResource(R.drawable.freshy3);
                    img4.setImageResource(R.drawable.freshy4);
                }
                else if (position == 6){
                    textRole.setText(getString(R.string.g1));
                    textRes.setText(getString(R.string.g2));
                    textLink.setText(getString(R.string.linkLine));
                    img1.setImageResource(R.drawable.sticker1);
                    img2.setImageResource(R.drawable.sticker2);
                    img3.setImageResource(R.drawable.sticker3);
                    img4.setImageResource(R.drawable.sticker4);
                }
                else if (position == 7){
                    textRole.setText(getString(R.string.h1));
                    textRes.setText(getString(R.string.h2));
                    textLink.setText(getString(R.string.linkAnimation));
                    img1.setImageResource(R.drawable.animation1);
                    img2.setImageResource(R.drawable.animation2);
                    img3.setImageResource(R.drawable.animation3);
                    img4.setImageResource(R.drawable.animation4);
                }
                else if (position == 8){
                    textRole.setText(getString(R.string.i1));
                    textRes.setText(getString(R.string.i2));
                    textLink.setText(getString(R.string.link0));
                    img1.setImageResource(R.drawable.geo1);
                    img2.setImageResource(R.drawable.geo2);
                    img3.setImageResource(R.drawable.geo3);
                    img4.setImageResource(R.drawable.geo4);
                }
                else if (position == 9){
                    textRole.setText(getString(R.string.j1));
                    textRes.setText(getString(R.string.j2));
                    textLink.setText(getString(R.string.link0));
                    img1.setImageResource(R.drawable.nsc1);
                    img2.setImageResource(R.drawable.nsc2);
                    img3.setImageResource(R.drawable.nsc3);
                    img4.setImageResource(R.drawable.nsc4);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}