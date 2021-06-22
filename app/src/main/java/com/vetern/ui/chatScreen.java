package com.vetern.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.vetern.R;

public class chatScreen extends Activity {

    private ImageButton button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatscreen);

        button_back = (ImageButton) findViewById(R.id.button_back);

        button_back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), deskripsiScreen.class);
                startActivity(nextScreen);
            }
        });

    }
}