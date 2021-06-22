package com.vetern.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;
import com.vetern.R;

public class deskripsiScreen extends Activity {

    private ImageButton button_back;
    private ImageButton chat;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.deskripsiscreen);

        button_back = (ImageButton) findViewById(R.id.button_back);
        chat = (ImageButton) findViewById(R.id.chat);

        button_back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), forumScreen.class);
                startActivity(nextScreen);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), chatScreen.class);
                startActivity(nextScreen);
            }
        });

    }
}