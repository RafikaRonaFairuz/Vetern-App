package com.vetern.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.vetern.R;
import com.vetern.modal.EmailPasswordActivity;

public class registScreen extends Activity {

	private DatabaseReference db_vetern;
	private String EmailPassowrdActivity;

	private ImageButton button_back;
	private Button signup;
	private EditText TextEmail, TextNama, TextNo_tlp, TextPassword, TextKonfr1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.registrasiscreen);

		button_back = (ImageButton) findViewById(R.id.button_back);
		signup = (Button) findViewById(R.id.signup);

		db_vetern = FirebaseDatabase.getInstance().getReference("EmailPasswprdActivity");
		EmailPassowrdActivity = db_vetern.push().getKey();

		button_back.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), loginScreen.class);
				startActivity(nextScreen);
			}
		});

		signup.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				simpanData();
				Intent nextScreen = new Intent(getApplicationContext(), loginScreen.class);
				startActivity(nextScreen);
			}
		});
	}
	private void simpanData() {
		EmailPasswordActivity emailpasswordactivity = new EmailPasswordActivity(TextEmail.getText().toString(),
				TextNama.getText().toString()
		);

		db_vetern.child(String.valueOf(TextEmail)).setValue(emailpasswordactivity);
	}
}