package com.transaksi;

import java.util.HashMap;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import com.transaksi.Ganti_Pin;
import com.transaksi.R;

public class Ganti_Pin extends Activity {
	EditText no_pin;
	EditText no_pin_lama;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onStart();
        setContentView(R.layout.ganti_pin);
        final TextView txtTitle = (TextView) findViewById(R.id.title);
        Intent i = getIntent();
        // Receiving the Data
        final String title = i.getStringExtra("title");
        final String name = i.getStringExtra("name");
        final String cekh = i.getStringExtra("cekh");
        final String ceks = i.getStringExtra("ceks");
        final String alias = i.getStringExtra("alias");
        txtTitle.setText(title);
        
       
        
        no_pin = (EditText) findViewById(R.id.pin);
        no_pin_lama = (EditText) findViewById(R.id.pin_lama);
        
        final Button btn_ok = (Button) findViewById(R.id.ok);
        
        final TextView tv = (TextView) this.findViewById(R.id.text);  
        tv.setEllipsize(TruncateAt.MARQUEE);
        tv.setSelected(true);
        
        final ImageView btn_home = (ImageView) findViewById(R.id.home);
        btn_home.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), TransaksiPulsaActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				i.putExtra("EXIT", true);    // just value to indicate i want to  exit the application
				startActivity(i);
				
			}
		});
        
        
        // Listening to News Feed button click
           btn_ok.setOnClickListener(new View.OnClickListener() {
   			
   			public void onClick(View view) {
   	   		String pin_no = no_pin.getText().toString();
   	   		if (pin_no.trim().length()>0 && pin_no.length()<100)  {	
   			 Intent i = new Intent(getApplicationContext(), FieldSmsCenter2.class);
    		 i.putExtra("title", title.toString());
    		 i.putExtra("name", name.toString());
    		 i.putExtra("no_pin", no_pin.getText().toString());
    		 i.putExtra("no_pin_lama", no_pin_lama.getText().toString());
    		 i.putExtra("cekh", cekh.toString());
    		 i.putExtra("alias", alias.toString());
    		 i.putExtra("ceks", ceks.toString());
    		 
    		 startActivity(i);
   	   		}
   	   		else
			 {
				Toast.makeText(getBaseContext(), "Data tidak boleh kosong", Toast.LENGTH_LONG).show();
			 }
			 
   			}
   		});
           
        
    }
}