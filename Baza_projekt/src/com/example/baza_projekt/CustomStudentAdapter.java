package com.example.baza_projekt;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomStudentAdapter extends BaseAdapter {

	private ArrayList<Studenti> mStudents;
	private Context mContext;
	private LayoutInflater mInflater;
	private ViewHolder mHolder;

	public CustomStudentAdapter(Context context, ArrayList<Studenti> students) {

		mContext = context;

		mStudents = students;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mStudents.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mStudents.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		mHolder = new ViewHolder();

		mInflater = (LayoutInflater) mContext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		convertView = mInflater.inflate(R.layout.list_item, null);

		mHolder.nameText = (TextView) convertView.findViewById(R.id.list_name);
		mHolder.lastNameText = (TextView) convertView.findViewById(R.id.list_lastname);
		mHolder.brIndexText = (TextView) convertView.findViewById(R.id.list_brindex);
		mHolder.yearText = (TextView) convertView.findViewById(R.id.list_year);

		Studenti student = mStudents.get(position);
		
		mHolder.nameText.setText(student.getIme());
		mHolder.lastNameText.setText(student.getPrezime());
		mHolder.brIndexText.setText(student.getBrojIndexa());
		mHolder.yearText.setText(student.getGodinaStudija());
		
		return convertView;
	}

	private class ViewHolder {

		TextView nameText, lastNameText, brIndexText, yearText;

	}

}
