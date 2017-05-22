package com.transaksi;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyPerformanceArrayAdapter2 extends ArrayAdapter<String> {
	private final Activity context;
	private final String[] names;

	public MyPerformanceArrayAdapter2(Activity context, String[] names) {
		super(context, R.layout.rowlayout, names);
		this.context = context;
		this.names = names;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView = inflater.inflate(R.layout.row_welcome, null, true);
		TextView textView = (TextView) rowView.findViewById(R.id.title);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		String s = names[position];
		textView.setText(s);
		if (s.startsWith("Masuk")) {
			imageView.setImageResource(R.drawable.home_wel);
		}
		if (s.startsWith("Registrasi Member")) {
			imageView.setImageResource(R.drawable.btn_registrasi);
		}

		if (s.startsWith("Petunjuk Penggunaan")) {
			imageView.setImageResource(R.drawable.petunjuk);
		}
		if (s.startsWith("Hubungi Kami")) {
			imageView.setImageResource(R.drawable.komplain1);
		}
		if (s.startsWith("Keluar")) {
			imageView.setImageResource(R.drawable.btn_keluar);
		}
		if (s.startsWith("Kunjungi Situs Kami")) {
			imageView.setImageResource(R.drawable.icon);
		}
	 
		return rowView;
	}
}

