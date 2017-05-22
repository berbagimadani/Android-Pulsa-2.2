package com.transaksi;

import java.text.DecimalFormat;
import java.util.HashMap;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import com.transaksi.FieldSmsCenter2;
import com.transaksi.R;

public class FieldSmsCenter2 extends ListActivity {
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaksi_first);
        final TextView txtTitle = (TextView) findViewById(R.id.title);
        Intent i = getIntent();
        // Receiving the Data
        final String title = i.getStringExtra("title");
        final String no_pin = i.getStringExtra("no_pin");
        final String no_pin_lama = i.getStringExtra("no_pin_lama");
        final String kode_agen = i.getStringExtra("kode_agen");
        final String nominal = i.getStringExtra("nominal");
        
        final String nama = i.getStringExtra("nama");
        final String alamat = i.getStringExtra("alamat");
        final String no_hp = i.getStringExtra("no_hp");
        
        final String cekh = i.getStringExtra("cekh");
        final String name = i.getStringExtra("name");
        final String alias = i.getStringExtra("alias");
        final String ceks = i.getStringExtra("ceks");
        
        
        
        //final String output =  "CH."+alias+"."+no_pin;
 
        txtTitle.setText(title);
       
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
        
       	String[] menu = new String[] { "SMS Center Indosat", "SMS Center Telkomsel", "SMS Center XL"};
    	this.setListAdapter(new ArrayAdapter<String>(this,
    	R.layout.main,R.id.item_title, menu));
    		
    		final ListView lv = getListView();
            lv.setTextFilterEnabled(true);	
            lv.setOnItemClickListener(new OnItemClickListener() {
            	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {    
            		
            		/*
            		 Intent i = new Intent(getApplicationContext(), dialog2.class);
            		 i.putExtra("title", title + "|" + lv.getItemAtPosition(position).toString());
            		 
            		 String data =  lv.getItemAtPosition(position).toString();
            		 
	            		if(data == "SMS Center Indosat"){
	            		i.putExtra("alias_no", data.toString().replace("SMS Center Indosat", "5556"));
	            		}
	                	if(data == "SMS Center Telkomsel"){
	                	i.putExtra("alias_no", data.toString().replace("SMS Center Telkomsel", "089636845137"));
	                	}
	                	if(data == "SMS Center XL"){
	                	i.putExtra("alias_no", data.toString().replace("SMS Center XL", "08999090908"));
	                	}
	                	
	                 i.putExtra("no_pin", no_pin.toString());	
            		 i.putExtra("cekh", cekh.toString());
            		 i.putExtra("ceks", ceks.toString());
            		 i.putExtra("name", name.toString());
            		 
	            		if(ceks.equalsIgnoreCase("Cek Saldo")){
	         	            String output =  "S."+no_pin;
	         	            i.putExtra("output", output.toString());
	         	            }
	         	        if(cekh.equalsIgnoreCase("Cek Harga")){
	         	        	 String output =  "CH."+alias+"."+no_pin;
	         	        	 i.putExtra("output", output.toString());
	         	        	}
	         	        if(cekh.equalsIgnoreCase("Cek Rekap Harian")){
	       	        	 String output =  "R."+alias+"."+no_pin;
	       	        	 i.putExtra("output", output.toString());
	       	        	}
         		 
            		// i.putExtra("output", output.toString());
            		 startActivity(i);
            		 
            		 */
            		
            		final String data =  lv.getItemAtPosition(position).toString();
            		
            		
                    
            		AlertDialog alertDialog = new AlertDialog.Builder(FieldSmsCenter2.this).create();
            		if(ceks.equalsIgnoreCase("Cek Saldo")){
                        String confirm = "Apakah anda ingin melakukan " + ceks;
                    	alertDialog.setMessage(confirm.toString());
            	            }
                    
            	     	if(cekh.equalsIgnoreCase("Cek Harga")){
            	         String confirm = "Apakah anda ingin melakukan " + cekh + " " +name;
            	     	alertDialog.setMessage(confirm.toString());
	            	    }
	            	     if(cekh.equalsIgnoreCase("Cek Rekap Harian")){
	            	         String confirm = "Apakah anda ingin melakukan " + cekh ;
	            	     	alertDialog.setMessage(confirm.toString());
	            	    }
	            	     if(cekh.equalsIgnoreCase("Ganti Pin")){
	            	         String confirm = "Apakah anda ingin melakukan " + cekh ;
	            	     	alertDialog.setMessage(confirm.toString());
	            	    }
	            	     if(cekh.equalsIgnoreCase("Transfer Deposit")){
	            	    	 String nominal_cv = getFormat(nominal);
	            	         String confirm = "Apakah anda ingin melakukan " + cekh + " " +nominal_cv + " ke "+ kode_agen;
	            	     	alertDialog.setMessage(confirm.toString());
	            	    }
	            	     if(cekh.equalsIgnoreCase("Registrasi Agen")){
	            	         String confirm = "Apakah anda ingin melakukan " + cekh + 
	            	         " dengan data: " +nama + "<br>" + alamat + "<br>"+ no_hp;
	            	     	 alertDialog.setMessage(Html.fromHtml(confirm.toString()));
	            	    }
	            	    if(cekh.equalsIgnoreCase("Tiket")){
	            	    	 String nominal_cv = getFormat(nominal);
	            	         String confirm = "Apakah anda ingin melakukan pesanan " + cekh + 
	            	         " dengan nominal: " +nominal_cv;
	            	     	 alertDialog.setMessage(Html.fromHtml(confirm.toString()));
	            	    }
	            	    if(cekh.equalsIgnoreCase("Komplain")){
	            	         String confirm = "Apakah anda ingin melakukan " + cekh + " ( "+no_pin+" )";
	            	     	alertDialog.setMessage(confirm.toString());
		            	}
	            	    if(cekh.equalsIgnoreCase("Belanja")){
	            	    	String nominal_cv = getFormat(nominal);
	            	        String confirm = "Apakah anda ingin melakukan " + cekh + " nominal " +nominal_cv +" dengan Merchant Gateway " +kode_agen;
	            	     	alertDialog.setMessage(confirm.toString());
		            	}
            		alertDialog.setButton("Yes", new DialogInterface.OnClickListener() {
            		      public void onClick(DialogInterface dialog, int which) {
            		    	  		
            		    	  		
            	                 Intent i = new Intent(getApplicationContext(), Splash.class);
            	                 i.putExtra("no_pin", no_pin.toString());	
                        		 i.putExtra("cekh", cekh.toString());
                        		 i.putExtra("ceks", ceks.toString());
                        		 i.putExtra("name", name.toString());
                        		 
                        		 if(data == "SMS Center Indosat"){
                        			 i.putExtra("alias_no", data.toString().replace("SMS Center Indosat", "089636845137"));
	         	            		}
                        		 	if(data == "SMS Center Telkomsel"){
             	                	i.putExtra("alias_no", data.toString().replace("SMS Center Telkomsel", "089636845137"));
             	                	}
             	                	if(data == "SMS Center XL"){
             	                	i.putExtra("alias_no", data.toString().replace("SMS Center XL", "089636845137"));
             	                	}
            	                
            	                if(ceks.equalsIgnoreCase("Cek Saldo")){
            	         	            String output =  "S."+no_pin;
            	         	            i.putExtra("output", output.toString());
            	         	     }
            	         	    if(cekh.equalsIgnoreCase("Cek Harga")){
            	         	        	 String output =  "H."+alias+"."+no_pin;
            	         	        	 i.putExtra("output", output.toString());
            	         	      }
            	         	    if(cekh.equalsIgnoreCase("Cek Rekap Harian")){
            	       	        	 String output =  "R"+alias+"."+no_pin;
            	       	        	 i.putExtra("output", output.toString());
            	       	        }
            	         	    if(cekh.equalsIgnoreCase("Ganti Pin")){
            	         	    	i.putExtra("no_pin_lama", no_pin_lama.toString());	
           	       	        		String output =  "GP."+no_pin+"."+no_pin_lama;
           	       	        		i.putExtra("output", output.toString());
            	         	    }
            	         	    if(cekh.equalsIgnoreCase("Transfer Deposit")){
            	         	    	i.putExtra("kode_agen", kode_agen.toString());
            	         	    	i.putExtra("nominal", nominal.toString());	
              	       	        	String output =  "TD."+kode_agen+"."+nominal+"."+no_pin;
              	       	        	i.putExtra("output", output.toString());
               	         	    }
            	         	    if(cekh.equalsIgnoreCase("Registrasi Agen")){
	           	         	    	i.putExtra("nama", nama.toString());
	           	         	    	i.putExtra("alamat", alamat.toString());
	           	         	    	i.putExtra("no_hp", no_hp.toString());	
             	       	        	String output =  "DAFTAR#"+nama+"#"+alamat+"#"+no_hp;
             	       	        	i.putExtra("output", output.toString());
              	         	    }
            	         	    if(cekh.equalsIgnoreCase("Tiket")){
            	         	    	i.putExtra("nominal", nominal.toString());
             	       	        	String output =  "TIKET."+nominal+"."+no_pin;
             	       	        	i.putExtra("output", output.toString());
              	         	    }
            	         	   if(cekh.equalsIgnoreCase("Komplain")){
            	         		    String output =  "K."+no_pin;
     	         	        	 	i.putExtra("output", output.toString());
             	         	    }
            	         	   if(cekh.equalsIgnoreCase("Belanja")){
          	         	    	i.putExtra("kode_agen", kode_agen.toString());
          	         	    	i.putExtra("nominal", nominal.toString());	
            	       	        	String output =  "BAYAR."+kode_agen+"."+nominal+"."+no_pin;
            	       	        	i.putExtra("output", output.toString());
             	         	    }
            	           		 startActivity(i);
            		 
            		    } }); 
            		alertDialog.setButton2("Cancel", new DialogInterface.OnClickListener() {
          		      public void onClick(DialogInterface dialog, int which) {
          		 
          		    	 //Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();
          		 
          		    } }); 
            		alertDialog.setIcon(R.drawable.ic_launcher);
            		alertDialog.show();
            		 
    			}

				private String getFormat(String number) {
					 String displayedString = "";
				        
				        if(number.length() == 0){
				            displayedString = "Rp. 0";
				        }else{
				            if(number.length()>3){
				                int length = number.length();
				                
				                for(int i = length; i>0; i -=3){
				                    if(i>3){
				                        String myStringPrt1 = number.substring(0, i-3);
				                        String myStringPrt2 = number.substring(i-3);
				                        
				                        String combinedString;
				                        
				                        combinedString = myStringPrt1 + ".";
				                                                
				                        combinedString += myStringPrt2;
				                        number = combinedString;
				                        
				                        displayedString = "Rp. " + combinedString;
				                    }
				                }
				            }else{
				                displayedString = "Rp. " + number;
				            }
				        }
				                
				        return displayedString;
				    }
 
    		});
    
    }
}