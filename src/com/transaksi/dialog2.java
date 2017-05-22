package com.transaksi;

import java.text.DecimalFormat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.transaksi.dialog2;
import com.transaksi.R;

public class dialog2 extends Activity {
	

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onStart();
        setContentView(R.layout.dialog);
        final TextView txtTitle = (TextView) findViewById(R.id.title);
        final TextView txtConfirm = (TextView) findViewById(R.id.txt_confirm);
        Intent i = getIntent();
        // Receiving the Data
        final String title = i.getStringExtra("title");
        final String no_pin = i.getStringExtra("no_pin");
        final String alias_no = i.getStringExtra("alias_no");
        final String cekh = i.getStringExtra("cekh");
        final String ceks = i.getStringExtra("ceks");
        final String name = i.getStringExtra("name");
        final String output = i.getStringExtra("output");
        final String phoneNo = "085";
        txtTitle.setText(title);
        
        if(ceks.equalsIgnoreCase("Cek Saldo")){
            String confirm = "Apakah anda ingin melakukan " + ceks;
            txtConfirm.setText(confirm);
	            }
        
	     if(cekh.equalsIgnoreCase("Cek Harga")){
	         String confirm = "Apakah anda ingin melakukan " + cekh + " " +name;
	         txtConfirm.setText(confirm);
	    }
        //int nominal = Integer.parseInt(name);
        //DecimalFormat twoPlaces = new DecimalFormat("0.000");
        //String nominal_convert = twoPlaces.format(nominal);
  
      
        
        final Button btn_ok = (Button) findViewById(R.id.ok);
        final Button btn_cancel = (Button) findViewById(R.id.cancel);
        
        	btn_ok.setOnClickListener(new View.OnClickListener() {
   			
   			public void onClick(View view) {
   			 Intent i = new Intent(getApplicationContext(), Splash.class);
    		 i.putExtra("title", title.toString());
    		 i.putExtra("phoneNo", phoneNo.toString());
    		 i.putExtra("alias_no", alias_no.toString());
    		 i.putExtra("name", name.toString());
    		 i.putExtra("cekh", cekh.toString());
    		 i.putExtra("output", output.toString());
     		 startActivity(i);
    		 
    		 
   			}
   		});
        	
        	btn_cancel.setOnClickListener(new View.OnClickListener() {
       			
       		public void onClick(View view) {
       			 Intent i = new Intent(getApplicationContext(), TransaksiPulsaActivity.class);
       			 i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
       			 i.putExtra("EXIT", true);    // just value to indicate i want to  exit the application
        		 startActivity(i);
       			}
       		});
        	
        }
    
}