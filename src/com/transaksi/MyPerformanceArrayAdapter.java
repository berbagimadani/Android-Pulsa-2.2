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

public class MyPerformanceArrayAdapter extends ArrayAdapter<String> {
	private final Activity context;
	private final String[] names;

	public MyPerformanceArrayAdapter(Activity context, String[] names) {
		super(context, R.layout.rowlayout, names);
		this.context = context;
		this.names = names;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView = inflater.inflate(R.layout.rowlayout, null, true);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		String s = names[position];
		textView.setText(s);
		if (s.startsWith("Token PLN")) {
			imageView.setImageResource(R.drawable.pln);
		}
		if (s.startsWith("Telkomsel")) {
			imageView.setImageResource(R.drawable.telkomsel);
		}
		if (s.startsWith("Indosat")) {
			imageView.setImageResource(R.drawable.indosat);
		}
		if (s.startsWith("XL")) {
			imageView.setImageResource(R.drawable.xl);
		}
		if (s.startsWith("Three")) {
			imageView.setImageResource(R.drawable.three);
		}
		if (s.startsWith("Axis")) {
			imageView.setImageResource(R.drawable.axis);
		}
		if (s.startsWith("Esia")) {
			imageView.setImageResource(R.drawable.esia);
		}
		if (s.startsWith("Flexi")) {
			imageView.setImageResource(R.drawable.flexi);
		}
		if (s.startsWith("Smart")) {
			imageView.setImageResource(R.drawable.smart);
		}
		if (s.startsWith("Fren")) {
			imageView.setImageResource(R.drawable.fren);
		}
		if (s.startsWith("Hepi")) {
			imageView.setImageResource(R.drawable.hepi);
		}
		if (s.startsWith("Ceria")) {
			imageView.setImageResource(R.drawable.ceria);
		}
		if (s.startsWith("Starone")) {
			imageView.setImageResource(R.drawable.starone);
		}  

		return rowView;
	}
}

