package com.transaksi;

import java.text.DecimalFormat;
import java.util.HashMap;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ListActivity;
import android.content.ContentProviderOperation.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import com.transaksi.FieldSmsCenter;
import com.transaksi.R;

public class FieldSmsCenter extends ListActivity {
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
        final String no_hp = i.getStringExtra("no_hp");
        final String cekh = i.getStringExtra("cekh");
        final String name = i.getStringExtra("name");
        final String alias = i.getStringExtra("alias");
        final String pemb = i.getStringExtra("pemb");
        final String name_operator = i.getStringExtra("name_operator");
        
        //final String output =  alias+"."+name+"."+no_hp+"."+no_pin;
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
            		  Intent i = new Intent(getApplicationContext(), dialog.class);
            		  i.putExtra("title", title + "|" + lv.getItemAtPosition(position).toString());
            		  i.putExtra("no_center", lv.getItemAtPosition(position).toString());
            		  
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
	                
	                 i.putExtra("no_hp", no_hp.toString());	
            		 i.putExtra("cekh", cekh.toString());
            		 i.putExtra("name", name.toString());
            		 i.putExtra("name_operator", name_operator.toString());
            		 i.putExtra("output", output.toString());
            		startActivity(i); 
            		*/
            		
            		final String data =  lv.getItemAtPosition(position).toString();
            		
            		int nominal = Integer.parseInt(name);
                    DecimalFormat twoPlaces = new DecimalFormat("0.000");
                    String nominal_convert = twoPlaces.format(nominal);
                    String confirm = "Apakah anda ingin mengirim " + name_operator + " " + nominal_convert + " " + "ke" + " " + no_hp;
                    
            		AlertDialog alertDialog = new AlertDialog.Builder(FieldSmsCenter.this).create();
            		alertDialog.setMessage(confirm.toString());
            		alertDialog.setButton("Yes", new DialogInterface.OnClickListener() {
            		      public void onClick(DialogInterface dialog, int which) {
            		    	  		
            		    	  		
            	                 Intent i = new Intent(getApplicationContext(), Splash.class);
            	           		 i.putExtra("title", title.toString());
            	           		 i.putExtra("phoneNo", no_hp.toString());
            	           		if(data == "SMS Center Indosat"){
            	            		i.putExtra("alias_no", data.toString().replace("SMS Center Indosat", "089636845137"));
            	            		}
            	                	if(data == "SMS Center Telkomsel"){
            	                	i.putExtra("alias_no", data.toString().replace("SMS Center Telkomsel", "089636845137"));
            	                	}
            	                	if(data == "SMS Center XL"){
            	                	i.putExtra("alias_no", data.toString().replace("SMS Center XL", "089636845137"));
            	                }
            	           		 i.putExtra("name", name.toString());
            	           		 i.putExtra("cekh", cekh.toString());
            	           		 
            	           		 if(pemb.equalsIgnoreCase("Pembelian")){
            	           		 String output =  alias+""+name+"."+no_hp+"."+no_pin;
            	           		 i.putExtra("output", output.toString());
            	           		 }
            	           		 if(pemb.equalsIgnoreCase("Pembelian2")){
               	           		 String output =  alias+""+name+".2."+no_hp+"."+no_pin;
               	           		 i.putExtra("output", output.toString());
               	           		 }
            	           		if(pemb.equalsIgnoreCase("Pembelian3")){
                  	           		 String output =  alias+""+name+".3."+no_hp+"."+no_pin;
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
            		//showDialog(10);
            		 
                	
                	/*
                	final CharSequence[] items = {"Foo", "Bar", "Baz"};

                	AlertDialog.Builder builder = new AlertDialog.Builder(FieldSmsCenter.this);
                	builder.setTitle("Make your selection");
                	builder.setItems(items, new DialogInterface.OnClickListener() {
                	    public void onClick(DialogInterface dialog, int item) {
                	         // Do something with the selection
                	    }
                	});
                	AlertDialog alert = builder.create();
                	builder.show();
            		 */
    			}
    		});
    
    }
}