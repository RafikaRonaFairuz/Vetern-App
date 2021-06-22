package com.vetern.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.vetern.R;
import com.vetern.modal.EmailPasswordActivity;

public class loginScreen extends Activity {

	private FirebaseAuth mAuth;

	private Button daftar, login;
	private EditText TextEmail, TextPassword;
	private DatabaseReference db_vetern;
	private String EmailPassowrdActivity;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginscreen);

		mAuth = FirebaseAuth.getInstance();

		login = (Button) findViewById(R.id.login);
		daftar = (Button) findViewById(R.id.daftar);
		TextEmail = findViewById(R.id.email);
		TextPassword = findViewById(R.id.password);
		db_vetern = FirebaseDatabase.getInstance().getReference("EmailPasswprdActivity");
		EmailPassowrdActivity = db_vetern.push().getKey();

		daftar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent nextScreen = new Intent(getApplicationContext(), registScreen.class);
				startActivity(nextScreen);
			}
		});

		login.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				simpanData();
				Intent nextScreen = new Intent(getApplicationContext(), homeScreen.class);
				startActivity(nextScreen);
			}
		});
	}

	private void simpanData() {
		EmailPasswordActivity emailpasswordactivity = new EmailPasswordActivity(TextEmail.getText().toString(),
				TextPassword.getText().toString());

		db_vetern.child(String.valueOf(TextEmail)).setValue(emailpasswordactivity);
	}
}
	
	