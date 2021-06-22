package com.vetern.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import com.vetern.R;

public class loginScreen extends Activity {

	private Button login;
	private Button daftar;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginscreen);

		login = (Button) findViewById(R.id.login);
		daftar = (Button) findViewById(R.id.daftar);

		daftar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), registScreen.class);
				startActivity(nextScreen);
			}
		});

		login.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), homeScreen.class);
				startActivity(nextScreen);
			}
		});
	}
}
	
	