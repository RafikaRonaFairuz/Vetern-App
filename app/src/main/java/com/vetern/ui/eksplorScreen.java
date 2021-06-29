package com.vetern.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.vetern.R;

public class eksplorScreen extends Activity {

    private ImageButton button_back;
    private ImageButton dash;
    private ImageButton pro;
    private ImageButton forum;
    private ImageButton ihom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eksplorscreen);

        button_back = (ImageButton) findViewById(R.id.button_back);
        dash = (ImageButton) findViewById(R.id.dash);
        pro = (ImageButton) findViewById(R.id.pro);
        forum = (ImageButton) findViewById(R.id.forum);
        ihom = (ImageButton) findViewById(R.id.ihom);

        button_back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), homeScreen.class);
                startActivity(nextScreen);
            }
        });


        ihom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), homeScreen.class);
                startActivity(nextScreen);
            }
        });

        dash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), dashboardScreen.class);
                startActivity(nextScreen);
            }
        });

        pro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), profileScreen.class);
                startActivity(nextScreen);
            }
        });

        forum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), forumScreen.class);
                startActivity(nextScreen);
            }
        });
    }
}