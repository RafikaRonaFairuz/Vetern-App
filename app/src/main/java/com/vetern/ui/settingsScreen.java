package com.vetern.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.vetern.R;

public class settingsScreen extends Activity {

    private ImageButton back;
    private ImageButton logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settingsscreen);

        back = (ImageButton) findViewById(R.id.back);
        logout = (ImageButton) findViewById(R.id.logout);

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), homeScreen.class);
                startActivity(nextScreen);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent nextScreen = new Intent(getApplicationContext(), loginScreen.class);
                startActivity(nextScreen);
            }
        });
    }
}