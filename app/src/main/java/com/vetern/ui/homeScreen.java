package com.vetern.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;
import android.widget.ImageView;
import com.vetern.R;

public class homeScreen extends Activity {

    private ImageView profile;
    private ImageButton pil1;
    private ImageButton pil2;
    private ImageButton pil3;
    private ImageButton pil4;
    private ImageButton pil5;
    private ImageButton plus;
    private ImageButton dash;
    private ImageButton pro;
    private ImageButton forum;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);

        profile = (ImageView) findViewById(R.id.profile);
        pil1 = (ImageButton) findViewById(R.id.pil1);
        pil2 = (ImageButton) findViewById(R.id.pil2);
        pil3 = (ImageButton) findViewById(R.id.pil3);
        pil4 = (ImageButton) findViewById(R.id.pil4);
        pil5 = (ImageButton) findViewById(R.id.pil5);
        plus = (ImageButton) findViewById(R.id.plus);
        dash = (ImageButton) findViewById(R.id.dash);
        pro = (ImageButton) findViewById(R.id.pro);
        forum = (ImageButton) findViewById(R.id.forum);

        profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), profileScreen.class);
                startActivity(nextScreen);
            }
        });

        pil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendeskripsiScreen();
            }
        });

        pil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendeskripsiScreen();
            }
        });

        pil3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendeskripsiScreen();
            }
        });

        pil4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendeskripsiScreen();
            }
        });

        pil5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendeskripsiScreen();
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), eksplorScreen.class);
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

    private void opendeskripsiScreen() {
        Intent nextScreen = new Intent(getApplicationContext(), deskripsiScreen.class);
        startActivity(nextScreen);
    }

}