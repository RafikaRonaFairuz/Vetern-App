package com.vetern.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import com.vetern.R;

public class registScreen extends Activity {

	private ImageButton button_back;
	private Button signup;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.registrasiscreen);

		button_back = (ImageButton) findViewById(R.id.button_back);
		signup = (Button) findViewById(R.id.signup);

		button_back.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), loginScreen.class);
				startActivity(nextScreen);
			}
		});

		signup.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), loginScreen.class);
				startActivity(nextScreen);
			}
		});
	}
}