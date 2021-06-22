package com.vetern.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.vetern.R;

public class splashScreen extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);

		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent nextScreen = new Intent(splashScreen. this, launchScreen1.class);
				startActivity(nextScreen);
				finish();
			}
		}, 4000);
	}
}
	
	