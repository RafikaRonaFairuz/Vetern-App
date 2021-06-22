package com.vetern.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.vetern.R;

public class profileScreen extends Activity {

    private ImageButton back;
    private ImageButton settings;
    private ImageButton plus;
    private ImageButton dash;
    private ImageButton forum;
    private ImageButton ihom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profilescreen);

        back = (ImageButton) findViewById(R.id.back);
        settings = (ImageButton) findViewById(R.id.settings);
        plus = (ImageButton) findViewById(R.id.plus);
        dash = (ImageButton) findViewById(R.id.dash);
        forum = (ImageButton) findViewById(R.id.forum);
        ihom = (ImageButton) findViewById(R.id.ihom);

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), homeScreen.class);
                startActivity(nextScreen);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), settingsScreen.class);
                startActivity(nextScreen);
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

        ihom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), homeScreen.class);
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