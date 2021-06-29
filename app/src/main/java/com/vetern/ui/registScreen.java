package com.vetern.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.vetern.R;
import com.vetern.modal.User2;

public class registScreen extends Activity {

	private FirebaseAuth mAuth;
	private ImageButton button_back;
	private Button signup;
	private EditText TextEmail, TextNama, TextNo_tlp, TextPassword, TextKonfr1;
	private FirebaseDatabase mFirebaseDatabase;
	private DatabaseReference mFirebaseReference;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.registrasiscreen);

		mAuth = FirebaseAuth.getInstance();
		button_back = (ImageButton) findViewById(R.id.button_back);
		signup = (Button) findViewById(R.id.signup);

		mFirebaseDatabase = FirebaseDatabase.getInstance();
		mFirebaseReference = mFirebaseDatabase.getReference("User2");

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

	public void signup(View view) {

		TextEmail = (EditText) findViewById(R.id.email);
		TextNama = (EditText) findViewById(R.id.nama);
		TextNo_tlp = (EditText) findViewById(R.id.no_tlp);
		TextPassword = (EditText) findViewById(R.id.password);
		TextKonfr1 = (EditText) findViewById(R.id.konfr1);

		String email = TextEmail.getText().toString();
		String nama = TextNama.getText().toString();
		String no_tlp = TextNo_tlp.getText().toString();
		String password = TextNama.getText().toString();
		String konfr1 = TextKonfr1.getText().toString();

		User2 user2 = new User2(email, nama, no_tlp, password, konfr1);

		mFirebaseReference.child(email).setValue(user2);
		Toast.makeText(this, "User ditambahkan", Toast.LENGTH_LONG).show();
	}
}