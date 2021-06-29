package com.vetern.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.vetern.R;
import com.vetern.modal.User;

public class loginScreen extends Activity {

	private FirebaseAuth mAuth;
	private Button daftar, login;
	private EditText email1, password1;
	private FirebaseDatabase mFirebaseDatabase;
	private DatabaseReference mFirebaseReference;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginscreen);

		mAuth = FirebaseAuth.getInstance();
		daftar = (Button) findViewById(R.id.daftar);
		login = (Button) findViewById(R.id.login);

		mFirebaseDatabase = FirebaseDatabase.getInstance();
		mFirebaseReference = mFirebaseDatabase.getReference("User");

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

	public void Click1(View view) {
		email1 = (EditText) findViewById(R.id.email1);
		password1 = (EditText) findViewById(R.id.password1);

		String email = email1.getText().toString();
		String password = password1.getText().toString();

		User user = new User(email, password);

		mFirebaseReference.child(email).setValue(user);
		Toast.makeText(this, "User ditambahkan", Toast.LENGTH_LONG).show();
	}
}
	
	