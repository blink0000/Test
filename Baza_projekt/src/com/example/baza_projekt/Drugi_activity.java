package com.example.baza_projekt;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class Drugi_activity extends Activity {

	private ListView mListView;

	private CustomStudentAdapter mAdapter;

	private ArrayList<Studenti> mStudents;

	private Database mDatabase;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		mDatabase = new Database(this);

		mStudents = mDatabase.helper.getAllStudents();

		mListView = (ListView) findViewById(R.id.sec_listview);

		mAdapter = new CustomStudentAdapter(this, mStudents);

		mListView.setAdapter(mAdapter);

	}

}
