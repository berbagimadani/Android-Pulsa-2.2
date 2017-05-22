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

import com.transaksi.Belanja;
import com.transaksi.R;
import com.transaksi.FormatRP;

public class Belanja extends Activity {
	EditText kode_agen;
	EditText nominal;
	EditText no_pin;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onStart();
        setContentView(R.layout.belanja);
        final TextView txtTitle = (TextView) findViewById(R.id.title);
        Intent i = getIntent();
        // Receiving the Data
        final String title = i.getStringExtra("title");
        final String name = i.getStringExtra("name");
        final String cekh = i.getStringExtra("cekh");
        final String ceks = i.getStringExtra("ceks");
        final String alias = i.getStringExtra("alias");
        txtTitle.setText(title);
        
        final TextView tv = (TextView) this.findViewById(R.id.text);  
        tv.setEllipsize(TruncateAt.MARQUEE);
        tv.setSelected(true);
        
        kode_agen = (EditText) findViewById(R.id.editText1);
        nominal = (EditText) findViewById(R.id.editText2);
        no_pin = (EditText) findViewById(R.id.editText3);
        
        final Button btn_ok = (Button) findViewById(R.id.ok);
        
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
   	   		String agen_kode = kode_agen.getText().toString().trim();
   	   		String nom = nominal.getText().toString().trim();
   	   		String pin_no = no_pin.getText().toString().trim();
   	   		if (agen_kode.length()>0 && agen_kode.length()<100 && nom.length()>0 && pin_no.length()>0)  {	
   			 Intent i = new Intent(getApplicationContext(), FieldSmsCenter2.class);
    		 i.putExtra("title", title.toString());
    		 i.putExtra("name", name.toString());
    		 i.putExtra("kode_agen", agen_kode.toString());
    		 i.putExtra("nominal", nom.toString());
    		 i.putExtra("no_pin", no_pin.getText().toString());
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