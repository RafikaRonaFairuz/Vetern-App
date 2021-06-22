package com.vetern.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;
import com.vetern.R;

public class launchScreen2 extends Activity {

	private ImageButton button_back;
	private Button button_lewati;
	private Button button_next;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.launchscreen2);

		button_back = (ImageButton) findViewById(R.id.button_back);
		button_lewati = (Button) findViewById(R.id.button_lewati);
		button_next = (Button) findViewById(R.id.button_next);

		button_back.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), launchScreen1.class);
				startActivity(nextScreen);
			}
		});

		button_next.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), launchScreen3.class);
				startActivity(nextScreen);
			}
		});

		button_lewati.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), loginScreen.class);
				startActivity(nextScreen);
			}
		});
	}
}