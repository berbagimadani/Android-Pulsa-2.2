package com.transaksi;

import java.util.HashMap;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
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

import com.transaksi.Transaksi_Second;
import com.transaksi.R;

public class Transaksi_Second extends ListActivity {
	EditText no_pin;
	EditText no_hp;
	
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_pembelian);
        final TextView txtTitle = (TextView) findViewById(R.id.title);
        Intent i = getIntent();
        
        // Receiving the Data
        final String title = i.getStringExtra("title");
        final String name = i.getStringExtra("name");
        final String alias = i.getStringExtra("alias");
        final String pemb = i.getStringExtra("pemb");
        final String cekh = i.getStringExtra("cekh");
        final String name_operator = i.getStringExtra("name_operator");
        txtTitle.setText(title);
        
        no_hp = (EditText) findViewById(R.id.hp);
        no_pin = (EditText) findViewById(R.id.pin);
		    
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
   				
   				
   			String hp_no = no_hp.getText().toString();
   		    String pin_no = no_pin.getText().toString();
   		       	
   			 if (hp_no.trim().length()>0 && pin_no.trim().length()>0 && hp_no.length()<100 && pin_no.length()<100)  {
   			 Intent i = new Intent(getApplicationContext(), FieldSmsCenter.class);
    		 i.putExtra("title", title.toString());
    		 i.putExtra("name", name.toString());
    		 i.putExtra("no_pin", no_pin.getText().toString());
    		 i.putExtra("no_hp", no_hp.getText().toString());
    		 i.putExtra("pemb", pemb.toString());
    		 i.putExtra("cekh", cekh.toString());
    		 i.putExtra("alias", alias.toString());
    		 i.putExtra("name_operator", name_operator.toString());
    		 startActivity(i);
    		 
   				//Toast.makeText(getBaseContext(), "Go", Toast.LENGTH_LONG).show();
   			 }
   			 else
   			 {
   				Toast.makeText(getBaseContext(), "Data tidak boleh kosong", Toast.LENGTH_LONG).show();
   			 }
   			 
   			}
   		});
        
    }
}