package com.transaksi;

import java.util.HashMap;

import android.app.Activity;
import android.app.ListActivity;
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

import com.transaksi.Transaksi_First;
import com.transaksi.R;
 

public class Transaksi_First extends ListActivity {
	 /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.transaksi_first);
       final TextView txtTitle = (TextView) findViewById(R.id.title);
       Intent i = getIntent();
       // Receiving the Data
       final String name = i.getStringExtra("name");
    
       txtTitle.setText(name);
               
       final String pemb = "Pembelian";
       final String pemb2 = "Pembelian2";
       final String pemb3 = "Pembelian3";
       
       final String pemb4 = "Pembayaran";
       
       final String cekh = "Cek Harga";
       final String cekh_2 = "CH";
       final String ceks = "Cek Saldo";
       final String ceks_2 = "S";
       final String cekr = "Cek Rekap harian";
       final String cekr_2 = "R";
       
       final String gpin = "Ganti Pin";
       final String gpin_2 = "GP";
       final String trfd = "Transfer Deposit";
       final String trfd_2 = "TD";
       final String reg = "Registrasi Agen";
       final String reg_2 = "R";
       
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
       
       
       if(name.equalsIgnoreCase(pemb)){ 
       	String[] menu = new String[] { "Token PLN", "Telkomsel", "Indosat", 
    				"XL", "Three", "Axis","Esia","Flexi","Smart","Fren","Hepi","Ceria","Starone"};
       	
    		//this.setListAdapter(new ArrayAdapter<String>(this,
    				//R.layout.main,R.id.item_title, menu));
       	setListAdapter(new MyPerformanceArrayAdapter(this, menu));
    		 
    		 
           final ListView lv = getListView();
           lv.setTextFilterEnabled(true);	
           lv.setOnItemClickListener(new OnItemClickListener() {
           	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
           		 Intent i = new Intent(getApplicationContext(), KodeSmsCenter.class);
           		 i.putExtra("title", pemb + "|" + lv.getItemAtPosition(position).toString());
           		 i.putExtra("name", lv.getItemAtPosition(position).toString());
           		 
           		 String data =  lv.getItemAtPosition(position).toString();
           		 
           		 if(data == "Token PLN"){
           		 i.putExtra("alias", data.toString().replace("Token PLN", "PLNKU"));
           		 }
           		 if(data == "Telkomsel"){
           		 i.putExtra("alias", data.toString().replace("Telkomsel", "TSEL"));
           		 }
           		 if(data == "Indosat"){
           		 i.putExtra("alias", data.toString().replace("Indosat", "ISAT"));
           		 }
           		 if(data == "XL"){
           		 i.putExtra("alias", data.toString().replace("XL", "XL"));
           		 }
           		 if(data == "Three"){
               		 i.putExtra("alias", data.toString().replace("Three", "TRI"));
           		 }
           		 if(data == "Axis"){
               		 i.putExtra("alias", data.toString().replace("Axis", "AXIS"));
               	 }
           		 if(data == "Esia"){
               		 i.putExtra("alias", data.toString().replace("Esia", "ESIA"));
               	 }
           		 if(data == "Flexi"){
               		 i.putExtra("alias", data.toString().replace("Flexi", "FLEXI"));
               	 }
           		 if(data == "Smart"){
               		 i.putExtra("alias", data.toString().replace("Smart", "SMART"));
               	 }
           		 
           		 if(data == "Fren"){
               		 i.putExtra("alias", data.toString().replace("Fren", "FREN"));
               	 }
           		 if(data == "Hepi"){
               		 i.putExtra("alias", data.toString().replace("Hepi", "HEPI"));
               	 }
           		 
           		 if(data == "Ceria"){
               		 i.putExtra("alias", data.toString().replace("Ceria", "CR"));
               	 }
           		 
           		 if(data == "Starone"){
               		 i.putExtra("alias", data.toString().replace("Starone", "STR"));
               	 }
           		 
           		 i.putExtra("pemb", pemb.toString());
           		 i.putExtra("cekh", cekh.toString());
           		 startActivity(i);
           		 
   			}
   		});
       }
       
       
       if(name.equalsIgnoreCase(pemb2)){ 
       	String[] menu = new String[] { "Token PLN", "Telkomsel", "Indosat", 
    				"XL", "Three", "Axis","Esia","Flexi","Smart","Fren","Hepi","Ceria","Starone"};
       	setListAdapter(new MyPerformanceArrayAdapter(this, menu));
    		//this.setListAdapter(new ArrayAdapter<String>(this,
    				//R.layout.main,R.id.item_title, menu));
    		 
    		 
           final ListView lv = getListView();
           lv.setTextFilterEnabled(true);	
           lv.setOnItemClickListener(new OnItemClickListener() {
           	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
           		 Intent i = new Intent(getApplicationContext(), KodeSmsCenter.class);
           		 i.putExtra("title", pemb2 + "|" + lv.getItemAtPosition(position).toString());
           		 i.putExtra("name", lv.getItemAtPosition(position).toString());
           		 
           		 String data =  lv.getItemAtPosition(position).toString();
           		 
           		 if(data == "Token PLN"){
           		 i.putExtra("alias", data.toString().replace("Token PLN", "PLNKU"));
           		 }
           		 if(data == "Telkomsel"){
           		 i.putExtra("alias", data.toString().replace("Telkomsel", "TSEL"));
           		 }
           		 if(data == "Indosat"){
           		 i.putExtra("alias", data.toString().replace("Indosat", "ISAT"));
           		 }
           		 if(data == "XL"){
           		 i.putExtra("alias", data.toString().replace("XL", "XL"));
           		 }
           		 if(data == "Three"){
               		 i.putExtra("alias", data.toString().replace("Three", "TRI"));
           		 }
           		 if(data == "Axis"){
               		 i.putExtra("alias", data.toString().replace("Axis", "AXIS"));
               	 }
           		 if(data == "Esia"){
               		 i.putExtra("alias", data.toString().replace("Esia", "ESIA"));
               	 }
           		 if(data == "Flexi"){
               		 i.putExtra("alias", data.toString().replace("Flexi", "FLEXI"));
               	 }
           		 if(data == "Smart"){
               		 i.putExtra("alias", data.toString().replace("Smart", "SMART"));
               	 }
           		 
           		 
           		 if(data == "Fren"){
               		 i.putExtra("alias", data.toString().replace("Fren", "FREN"));
               	 }
           		 if(data == "Hepi"){
               		 i.putExtra("alias", data.toString().replace("Hepi", "HEPI"));
               	 }
           		 
           		 if(data == "Ceria"){
               		 i.putExtra("alias", data.toString().replace("Ceria", "CR"));
               	 }
           		 
           		 
           		 if(data == "Starone"){
               		 i.putExtra("alias", data.toString().replace("Starone", "STR"));
               	 }
           		 
           		 i.putExtra("pemb", pemb2.toString());
           		 i.putExtra("cekh", cekh.toString());
           		 startActivity(i);
           		 
   			}
   		});
       }
       
       
       if(name.equalsIgnoreCase(pemb3)){ 
       	String[] menu = new String[] { "Token PLN", "Telkomsel", "Indosat", 
    				"XL", "Three", "Axis","Esia","Flexi","Smart","Fren","Hepi","Ceria","Starone"};
       	setListAdapter(new MyPerformanceArrayAdapter(this, menu));
    		//this.setListAdapter(new ArrayAdapter<String>(this,
    				//R.layout.main,R.id.item_title, menu));
    		 
    		 
           final ListView lv = getListView();
           lv.setTextFilterEnabled(true);	
           lv.setOnItemClickListener(new OnItemClickListener() {
           	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
           		 Intent i = new Intent(getApplicationContext(), KodeSmsCenter.class);
           		 i.putExtra("title", pemb3 + "|" + lv.getItemAtPosition(position).toString());
           		 i.putExtra("name", lv.getItemAtPosition(position).toString());
           		 
           		 String data =  lv.getItemAtPosition(position).toString();
           		 
           		 if(data == "Token PLN"){
           		 i.putExtra("alias", data.toString().replace("Token PLN", "PLNKU"));
           		 }
           		 if(data == "Telkomsel"){
           		 i.putExtra("alias", data.toString().replace("Telkomsel", "TSEL"));
           		 }
           		 if(data == "Indosat"){
           		 i.putExtra("alias", data.toString().replace("Indosat", "ISAT"));
           		 }
           		 if(data == "XL"){
           		 i.putExtra("alias", data.toString().replace("XL", "XL"));
           		 }
           		 if(data == "Three"){
               		 i.putExtra("alias", data.toString().replace("Three", "TRI"));
           		 }
           		 if(data == "Axis"){
               		 i.putExtra("alias", data.toString().replace("Axis", "AXIS"));
               	 }
           		 if(data == "Esia"){
               		 i.putExtra("alias", data.toString().replace("Esia", "ESIA"));
               	 }
           		 if(data == "Flexi"){
               		 i.putExtra("alias", data.toString().replace("Flexi", "Flexi"));
               	 }
           		 if(data == "Smart"){
               		 i.putExtra("alias", data.toString().replace("Smart", "SMART"));
               	 }
           		 
           		 if(data == "Fren"){
               		 i.putExtra("alias", data.toString().replace("Fren", "FREN"));
               	 }
           		 if(data == "Hepi"){
               		 i.putExtra("alias", data.toString().replace("Hepi", "HEPI"));
               	 }
           		 
           		 if(data == "Ceria"){
               		 i.putExtra("alias", data.toString().replace("Ceria", "CR"));
               	 }
           		 
           		 
           		 if(data == "Starone"){
               		 i.putExtra("alias", data.toString().replace("Starone", "STR"));
               	 }
           		 
           		 i.putExtra("pemb", pemb3.toString());
           		 i.putExtra("cekh", cekh.toString());
           		 startActivity(i);
           		 
   			}
   		});
       }
       if(name.equalsIgnoreCase(cekh)){ 
       	String[] menu = new String[] { "Token PLN", "Telkomsel", "Indosat", 
    				"XL", "Three", "Axis","Esia","Flexi","Smart","Fren","Hepi","Ceria","Starone"};
   		//this.setListAdapter(new ArrayAdapter<String>(this,
   				//R.layout.main,R.id.item_title, menu));
       	setListAdapter(new MyPerformanceArrayAdapter(this, menu));
   		
   		final ListView lv = getListView();
           lv.setTextFilterEnabled(true);	
           lv.setOnItemClickListener(new OnItemClickListener() {
           	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
           		 Intent i = new Intent(getApplicationContext(), Cek_Harga.class);
           		 i.putExtra("title", cekh + "|" + lv.getItemAtPosition(position).toString());
           		 i.putExtra("name", lv.getItemAtPosition(position).toString());
           		 
           		 String data =  lv.getItemAtPosition(position).toString();
           		 if(data == "Token PLN"){
           		 i.putExtra("alias", data.toString().replace("Token PLN", "PLNKU"));
           		 }
           		 if(data == "Telkomsel"){
           		 i.putExtra("alias", data.toString().replace("Telkomsel", "TSEL"));
           		 }
           		 if(data == "Indosat"){
           		 i.putExtra("alias", data.toString().replace("Indosat", "ISAT"));
           		 }
           		 if(data == "XL"){
           		 i.putExtra("alias", data.toString().replace("XL", "XL"));
           		 }
           		 if(data == "Three"){
               		 i.putExtra("alias", data.toString().replace("Three", "TRI"));
           		 }
           		 if(data == "Axis"){
               		 i.putExtra("alias", data.toString().replace("Axis", "AXIS"));
               	 }
           		 if(data == "Esia"){
               		 i.putExtra("alias", data.toString().replace("Esia", "ESIA"));
               	 }
           		 if(data == "Flexi"){
               		 i.putExtra("alias", data.toString().replace("Flexi", "Flexi"));
               	 }
           		 if(data == "Smart"){
               		 i.putExtra("alias", data.toString().replace("Smart", "SMART"));
               	 }
           		 
           		 if(data == "Fren"){
               		 i.putExtra("alias", data.toString().replace("Fren", "FREN"));
               	 }
           		 if(data == "Hepi"){
               		 i.putExtra("alias", data.toString().replace("Hepi", "HEPI"));
               	 }
           		 
           		 if(data == "Ceria"){
               		 i.putExtra("alias", data.toString().replace("Ceria", "CR"));
               	 }
           		 
           		 
           		 if(data == "Starone"){
               		 i.putExtra("alias", data.toString().replace("Starone", "STR"));
               	 }
           		 
           		 i.putExtra("cekh", cekh.toString());
           		 i.putExtra("ceks", ceks.toString());
           		 startActivity(i);
           		 
   			}
   		});
      }
       
     if(name.equalsIgnoreCase(ceks)){ 
         //langsung ke cek_harga = cek saldo
      }
       
     
     if(name.equalsIgnoreCase(pemb4)){ 
   	  txtTitle.setText("Untuk sementara layanan ini tidak tersedia");
     }
     
      
   }
}