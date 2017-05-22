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

import com.transaksi.KodeSmsCenter;
import com.transaksi.R;

public class KodeSmsCenter extends ListActivity {
	 /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.transaksi_first);
       final TextView txtTitle = (TextView) findViewById(R.id.title);
       Intent i = getIntent();
       // Receiving the Data
       final String title = i.getStringExtra("title");
       final String name = i.getStringExtra("name");
       final String name_operator = i.getStringExtra("name");
       final String alias = i.getStringExtra("alias");
       final String pemb = i.getStringExtra("pemb");
       final String cekh = i.getStringExtra("cekh");
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
       
       
       if(title.equalsIgnoreCase(pemb+"|Token PLN")){ 
         	 String[] menu = new String[] { "20","25","30","40","50","75","100","150","200","250","300","500","1000"};
      		this.setListAdapter(new ArrayAdapter<String>(this,
      				R.layout.main,R.id.item_title, menu));
      		
      		 
             final ListView lv = getListView();
             lv.setTextFilterEnabled(true);	
             lv.setOnItemClickListener(new OnItemClickListener() {
             	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
             		 Intent i = new Intent(getApplicationContext(), Transaksi_Second.class);
             		 i.putExtra("title", pemb + "|" + name + "|" + lv.getItemAtPosition(position).toString());
             		 i.putExtra("name", lv.getItemAtPosition(position).toString());
             		 i.putExtra("name2", lv.getItemAtPosition(position).toString());
             		 i.putExtra("alias", alias.toString());
             		 i.putExtra("pemb", pemb.toString());
             		 i.putExtra("cekh", cekh.toString());
             		 i.putExtra("name_operator", name_operator.toString());
             		 startActivity(i);
             		 
     			}
     		});
         }
       
       if(title.equalsIgnoreCase(pemb+"|Telkomsel")){ 
         	 String[] menu = new String[] {"5","10","20","25","50","100"};
      		this.setListAdapter(new ArrayAdapter<String>(this,
      				R.layout.main,R.id.item_title, menu));
      		
      		 
             final ListView lv = getListView();
             lv.setTextFilterEnabled(true);	
             lv.setOnItemClickListener(new OnItemClickListener() {
             	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
             		 Intent i = new Intent(getApplicationContext(), Transaksi_Second.class);
             		 i.putExtra("title", pemb + "|" + name + "|" + lv.getItemAtPosition(position).toString());
             		 i.putExtra("name", lv.getItemAtPosition(position).toString());
             		 i.putExtra("name2", lv.getItemAtPosition(position).toString());
             		 i.putExtra("alias", alias.toString());
             		 i.putExtra("pemb", pemb.toString());
             		 i.putExtra("cekh", cekh.toString());
             		 i.putExtra("name_operator", name_operator.toString());
             		 startActivity(i);
             		 
     			}
     		});
         }
       
       if(title.equalsIgnoreCase(pemb+"|Indosat")){ 
        	 String[] menu = new String[] {"5","10","20","25","50","100","5SMS","10SMS","25SMS","5GPRS","25GPRS"};
     		this.setListAdapter(new ArrayAdapter<String>(this,
     				R.layout.main,R.id.item_title, menu));
     		
     		 
            final ListView lv = getListView();
            lv.setTextFilterEnabled(true);	
            lv.setOnItemClickListener(new OnItemClickListener() {
            	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
            		 Intent i = new Intent(getApplicationContext(), Transaksi_Second.class);
            		 i.putExtra("title", pemb + "|" + name + "|" + lv.getItemAtPosition(position).toString());
            		 
            		 String data =  lv.getItemAtPosition(position).toString();
            		 
            		 if(data == "5" || data == "10" || data == "20" || data == "25" || data == "50"
            			|| data == "100"){
            			 
            			i.putExtra("name", lv.getItemAtPosition(position).toString());	 
            			i.putExtra("name2", lv.getItemAtPosition(position).toString());
            		 }
           		 if(data == "5SMS"){
           		 i.putExtra("name2", data.toString().replace("5SMS", "5"));
           		 i.putExtra("name", lv.getItemAtPosition(position).toString());
           		 }
           		 if(data == "10SMS"){
               		 i.putExtra("name2", data.toString().replace("10SMS", "10"));
               		 i.putExtra("name", lv.getItemAtPosition(position).toString());
           		 }
           		 if(data == "25SMS"){
               		 i.putExtra("name2", data.toString().replace("25SMS", "25"));
               		 i.putExtra("name", lv.getItemAtPosition(position).toString());
           		 }
           		 if(data == "5GPRS"){
               		 i.putExtra("name2", data.toString().replace("5GPRS", "5"));
               		 i.putExtra("name", lv.getItemAtPosition(position).toString());
           		 }
           		 if(data == "25GPRS"){
               		 i.putExtra("name2", data.toString().replace("25GPRS", "25"));
               		 i.putExtra("name", lv.getItemAtPosition(position).toString());
               	 }
           		 
            		 i.putExtra("alias", alias.toString());
            		 i.putExtra("pemb", pemb.toString());
            		 i.putExtra("cekh", cekh.toString());
            		 i.putExtra("name_operator", name_operator.toString());
            		 startActivity(i);
            		 
    			}
    		});
        }
       
       if(title.equalsIgnoreCase(pemb+"|XL")){ 
       	 String[] menu = new String[] {"5","10","25","50","100"};
    		this.setListAdapter(new ArrayAdapter<String>(this,
    				R.layout.main,R.id.item_title, menu));
    		
    		 
           final ListView lv = getListView();
           lv.setTextFilterEnabled(true);	
           lv.setOnItemClickListener(new OnItemClickListener() {
           	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
           		 Intent i = new Intent(getApplicationContext(), Transaksi_Second.class);
           		 i.putExtra("title", pemb + "|" + name + "|" + lv.getItemAtPosition(position).toString());
           		 i.putExtra("name", lv.getItemAtPosition(position).toString());
           		 i.putExtra("name2", lv.getItemAtPosition(position).toString());
           		 i.putExtra("alias", alias.toString());
           		 i.putExtra("pemb", pemb.toString());
           		 i.putExtra("cekh", cekh.toString());
           		 i.putExtra("name_operator", name_operator.toString());
           		 startActivity(i);
           		 
   			}
   		});
       }
       
       if(title.equalsIgnoreCase(pemb+"|Three")){ 
      	 String[] menu = new String[] {"1","3","5","10","20","30","50","100"};
   		this.setListAdapter(new ArrayAdapter<String>(this,
   				R.layout.main,R.id.item_title, menu));
   		
   		 
          final ListView lv = getListView();
          lv.setTextFilterEnabled(true);	
          lv.setOnItemClickListener(new OnItemClickListener() {
          	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
          		 Intent i = new Intent(getApplicationContext(), Transaksi_Second.class);
          		 i.putExtra("title", pemb + "|" + name + "|" + lv.getItemAtPosition(position).toString());
          		 i.putExtra("name", lv.getItemAtPosition(position).toString());
          		 i.putExtra("name2", lv.getItemAtPosition(position).toString());
          		 i.putExtra("alias", alias.toString());
          		 i.putExtra("pemb", pemb.toString());
          		 i.putExtra("cekh", cekh.toString());
          		 i.putExtra("name_operator", name_operator.toString());
          		 startActivity(i);
          		 
  			}
  		});
      }
       
       if(title.equalsIgnoreCase(pemb+"|Axis")){ 
      	 String[] menu = new String[] {"1","3","5","10","20","25","50","100"};
   		this.setListAdapter(new ArrayAdapter<String>(this,
   				R.layout.main,R.id.item_title, menu));
   		
   		 
          final ListView lv = getListView();
          lv.setTextFilterEnabled(true);	
          lv.setOnItemClickListener(new OnItemClickListener() {
          	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
          		 Intent i = new Intent(getApplicationContext(), Transaksi_Second.class);
          		 i.putExtra("title", pemb + "|" + name + "|" + lv.getItemAtPosition(position).toString());
          		 i.putExtra("name", lv.getItemAtPosition(position).toString());
          		 i.putExtra("name2", lv.getItemAtPosition(position).toString());
          		 i.putExtra("alias", alias.toString());
          		 i.putExtra("pemb", pemb.toString());
          		 i.putExtra("cekh", cekh.toString());
          		 i.putExtra("name_operator", name_operator.toString());
          		 startActivity(i);
          		 
  			}
  		});
      }
       
       if(title.equalsIgnoreCase(pemb+"|Esia")){ 
      	 String[] menu = new String[] {"1","3","5","10","25","50","100"};
   		this.setListAdapter(new ArrayAdapter<String>(this,
   				R.layout.main,R.id.item_title, menu));
   		
   		 
          final ListView lv = getListView();
          lv.setTextFilterEnabled(true);	
          lv.setOnItemClickListener(new OnItemClickListener() {
          	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
          		 Intent i = new Intent(getApplicationContext(), Transaksi_Second.class);
          		 i.putExtra("title", pemb + "|" + name + "|" + lv.getItemAtPosition(position).toString());
          		 i.putExtra("name", lv.getItemAtPosition(position).toString());
          		 i.putExtra("name2", lv.getItemAtPosition(position).toString());
          		 i.putExtra("alias", alias.toString());
          		 i.putExtra("pemb", pemb.toString());
          		 i.putExtra("cekh", cekh.toString());
          		 i.putExtra("name_operator", name_operator.toString());
          		 startActivity(i);
          		 
  			}
  		});
      }
       
       if(title.equalsIgnoreCase(pemb+"|Flexi")){ 
      	 String[] menu = new String[] {"5","10","25","50","100"};
   		this.setListAdapter(new ArrayAdapter<String>(this,
   				R.layout.main,R.id.item_title, menu));
   		
   		 
          final ListView lv = getListView();
          lv.setTextFilterEnabled(true);	
          lv.setOnItemClickListener(new OnItemClickListener() {
          	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
          		 Intent i = new Intent(getApplicationContext(), Transaksi_Second.class);
          		 i.putExtra("title", pemb + "|" + name + "|" + lv.getItemAtPosition(position).toString());
          		 i.putExtra("name", lv.getItemAtPosition(position).toString());
          		 i.putExtra("name2", lv.getItemAtPosition(position).toString());
          		 i.putExtra("alias", alias.toString());
          		 i.putExtra("pemb", pemb.toString());
          		 i.putExtra("cekh", cekh.toString());
          		 i.putExtra("name_operator", name_operator.toString());
          		 startActivity(i);
          		 
  			}
  		});
      }
       
       if(title.equalsIgnoreCase(pemb+"|Smart")){ 
      	 String[] menu = new String[] {"5","10","20","50","100"};
   		this.setListAdapter(new ArrayAdapter<String>(this,
   				R.layout.main,R.id.item_title, menu));
   		
   		 
          final ListView lv = getListView();
          lv.setTextFilterEnabled(true);	
          lv.setOnItemClickListener(new OnItemClickListener() {
          	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
          		 Intent i = new Intent(getApplicationContext(), Transaksi_Second.class);
          		 i.putExtra("title", pemb + "|" + name + "|" + lv.getItemAtPosition(position).toString());
          		 i.putExtra("name", lv.getItemAtPosition(position).toString());
          		 i.putExtra("name2", lv.getItemAtPosition(position).toString());
          		 i.putExtra("alias", alias.toString());
          		 i.putExtra("pemb", pemb.toString());
          		 i.putExtra("cekh", cekh.toString());
          		 i.putExtra("name_operator", name_operator.toString());
          		 startActivity(i);
          		 
  			}
  		});
      }
      
       if(title.equalsIgnoreCase(pemb+"|Fren")){ 
         	 String[] menu = new String[] {"5","10","20","50","100"};
      		this.setListAdapter(new ArrayAdapter<String>(this,
      				R.layout.main,R.id.item_title, menu));
      		
      		 
             final ListView lv = getListView();
             lv.setTextFilterEnabled(true);	
             lv.setOnItemClickListener(new OnItemClickListener() {
             	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
             		 Intent i = new Intent(getApplicationContext(), Transaksi_Second.class);
             		 i.putExtra("title", pemb + "|" + name + "|" + lv.getItemAtPosition(position).toString());
             		 i.putExtra("name", lv.getItemAtPosition(position).toString());
             		 i.putExtra("name2", lv.getItemAtPosition(position).toString());
             		 i.putExtra("alias", alias.toString());
             		 i.putExtra("pemb", pemb.toString());
             		 i.putExtra("cekh", cekh.toString());
             		 i.putExtra("name_operator", name_operator.toString());
             		 startActivity(i);
             		 
     			}
     		});
         }
       
       
       if(title.equalsIgnoreCase(pemb+"|Hepi")){ 
         	 String[] menu = new String[] {"5","10","20","50","100"};
      		this.setListAdapter(new ArrayAdapter<String>(this,
      				R.layout.main,R.id.item_title, menu));
      		
      		 
             final ListView lv = getListView();
             lv.setTextFilterEnabled(true);	
             lv.setOnItemClickListener(new OnItemClickListener() {
             	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
             		 Intent i = new Intent(getApplicationContext(), Transaksi_Second.class);
             		 i.putExtra("title", pemb + "|" + name + "|" + lv.getItemAtPosition(position).toString());
             		 i.putExtra("name", lv.getItemAtPosition(position).toString());
             		 i.putExtra("name2", lv.getItemAtPosition(position).toString());
             		 i.putExtra("alias", alias.toString());
             		 i.putExtra("pemb", pemb.toString());
             		 i.putExtra("cekh", cekh.toString());
             		 i.putExtra("name_operator", name_operator.toString());
             		 startActivity(i);
             		 
     			}
     		});
         }
       
       if(title.equalsIgnoreCase(pemb+"|Ceria")){ 
      	 String[] menu = new String[] {"5","10","20","50","100"};
   		this.setListAdapter(new ArrayAdapter<String>(this,
   				R.layout.main,R.id.item_title, menu));
   		
   		 
          final ListView lv = getListView();
          lv.setTextFilterEnabled(true);	
          lv.setOnItemClickListener(new OnItemClickListener() {
          	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
          		 Intent i = new Intent(getApplicationContext(), Transaksi_Second.class);
          		 i.putExtra("title", pemb + "|" + name + "|" + lv.getItemAtPosition(position).toString());
          		 i.putExtra("name", lv.getItemAtPosition(position).toString());
          		 i.putExtra("name2", lv.getItemAtPosition(position).toString());
          		 i.putExtra("alias", alias.toString());
          		 i.putExtra("pemb", pemb.toString());
          		 i.putExtra("cekh", cekh.toString());
          		 i.putExtra("name_operator", name_operator.toString());
          		 startActivity(i);
          		 
  			}
  		});
      }
       
       if(title.equalsIgnoreCase(pemb+"|Starone")){ 
         	 String[] menu = new String[] {"5","10","20","50","100"};
      		this.setListAdapter(new ArrayAdapter<String>(this,
      				R.layout.main,R.id.item_title, menu));
      		
      		 
             final ListView lv = getListView();
             lv.setTextFilterEnabled(true);	
             lv.setOnItemClickListener(new OnItemClickListener() {
             	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {       
             		 Intent i = new Intent(getApplicationContext(), Transaksi_Second.class);
             		 i.putExtra("title", pemb + "|" + name + "|" + lv.getItemAtPosition(position).toString());
             		 i.putExtra("name", lv.getItemAtPosition(position).toString());
             		 i.putExtra("name2", lv.getItemAtPosition(position).toString());
             		 i.putExtra("alias", alias.toString());
             		 i.putExtra("pemb", pemb.toString());
             		 i.putExtra("cekh", cekh.toString());
             		 i.putExtra("name_operator", name_operator.toString());
             		 startActivity(i);
             		 
     			}
     		});
         }
       
   }
}