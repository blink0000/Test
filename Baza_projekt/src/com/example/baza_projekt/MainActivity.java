package com.example.baza_projekt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	TextView name, lastName, brIndex, year;
	EditText mName, mLname, mBrIndex, mYear;
	Button save, view;

	private Database mDatabase;
	private Studenti newStudent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		elements();

		mDatabase = new Database(this);

	}

	public void elements() {

		name = (TextView) findViewById(R.id.main_txtv_name);
		mName = (EditText) findViewById(R.id.main_edit_name);

		lastName = (TextView) findViewById(R.id.main_txtv_lastname);
		mLname = (EditText) findViewById(R.id.main_edit_lastname);

		brIndex = (TextView) findViewById(R.id.main_txtv_brindex);
		mBrIndex = (EditText) findViewById(R.id.main_edit_brindex);

		year = (TextView) findViewById(R.id.main_txtv_year);
		mYear = (EditText) findViewById(R.id.main_edit_year);

		save = (Button) findViewById(R.id.main_btn_save);

		view = (Button) findViewById(R.id.main_btn_view);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		switch (v.getId()) {
		case R.id.main_btn_save:

			newStudent = new Studenti();
			
			newStudent.setIme(mName.getText().toString());
			newStudent.setPrezime(mLname.getText().toString());
			newStudent.setBrojIndexa(mBrIndex.getText().toString());
			newStudent.setGodinaStudija(mYear.getText().toString());
			
			mDatabase.helper.insertStudenti(newStudent);

			break;

		case R.id.main_btn_view:

			Intent intent = new Intent(MainActivity.this, Drugi_activity.class);
			startActivity(intent); 
			
			break;
	
		default:
			break;
		}

	}

}
