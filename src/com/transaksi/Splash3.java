package com.transaksi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.gsm.SmsManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Splash3 extends Activity{
   
   private static int progress = 0;
   private int status = 0;
   ProgressBar progressBar;
   Handler handler = new Handler();
   
   public void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.splash);
      final TextView txtTitle = (TextView) findViewById(R.id.title);
      Intent i = getIntent();
      // Receiving the Data
      final String title = i.getStringExtra("title");
      final String phoneNo = i.getStringExtra("no_center");
      final String alias_no = i.getStringExtra("alias_no");
      final String cekh = i.getStringExtra("cekh");
      final String name = i.getStringExtra("name");
      final String output = i.getStringExtra("output");
      txtTitle.setText(title);
      
     
      progressBar = (ProgressBar) findViewById(R.id.progg1);
      
      new Thread(new Runnable() {
         
         @Override
         public void run() {
            // TODO Auto-generated method stub
            while(status < 100){
               status = loading();
               handler.post(new Runnable() {
                  
                  @Override
                  public void run() {
                     // TODO Auto-generated method stub
                  progressBar.setProgress(status);   
                  }
               });
               
            }
            handler.post(new Runnable() {
               
               @Override
               public void run() {
                  // TODO Auto-generated method stub
            	//Intent close = new Intent(getApplicationContext(), TransaksiPulsaActivity.class);
           		//close.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
           		////close.putExtra("EXIT", true);    // just value to indicate i want to  exit the application
           		//startActivity(close); 
           	 sendSMS(alias_no, output);  
               }

               
            });
         }
         
         public int loading(){
            try{
               Thread.sleep(20);
            }catch(InterruptedException ie){
               ie.printStackTrace();
            }
            return ++progress;
         }
      }).start();
      
   }

   private void sendSMS(String phoneNumber, String message)
   {      
   	/*
       PendingIntent pi = PendingIntent.getActivity(this, 0,
               new Intent(this, test.class), 0);                
           SmsManager sms = SmsManager.getDefault();
           sms.sendTextMessage(phoneNumber, null, message, pi, null);        
       */
   	
   	String SENT = "SMS_SENT";
   	String DELIVERED = "SMS_DELIVERED";
   	
       PendingIntent sentPI = PendingIntent.getBroadcast(this, 0,
           new Intent(SENT), 0);
       
       PendingIntent deliveredPI = PendingIntent.getBroadcast(this, 0,
           new Intent(DELIVERED), 0);
   	
       //---when the SMS has been sent---
       registerReceiver(new BroadcastReceiver(){
			@Override
			public void onReceive(Context arg0, Intent arg1) {
				switch (getResultCode())
				{
				    case Activity.RESULT_OK:
					    Toast.makeText(getBaseContext(), "Data terkirim", 
					    		Toast.LENGTH_SHORT).show();
					    break;
				    case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
					    Toast.makeText(getBaseContext(), "Generic failure", 
					    		Toast.LENGTH_SHORT).show();
					    break;
				    case SmsManager.RESULT_ERROR_NO_SERVICE:
					    Toast.makeText(getBaseContext(), "No service", 
					    		Toast.LENGTH_SHORT).show();
					    break;
				    case SmsManager.RESULT_ERROR_NULL_PDU:
					    Toast.makeText(getBaseContext(), "Null PDU", 
					    		Toast.LENGTH_SHORT).show();
					    break;
				    case SmsManager.RESULT_ERROR_RADIO_OFF:
					    Toast.makeText(getBaseContext(), "Radio off", 
					    		Toast.LENGTH_SHORT).show();
					    break;
				}
			}
       }, new IntentFilter(SENT));
       
       //---when the SMS has been delivered---
       registerReceiver(new BroadcastReceiver(){
			@Override
			public void onReceive(Context arg0, Intent arg1) {
				switch (getResultCode())
				{
				    case Activity.RESULT_OK:
					    Toast.makeText(getBaseContext(), "SMS delivered", 
					    		Toast.LENGTH_SHORT).show();
					    break;
				    case Activity.RESULT_CANCELED:
					    Toast.makeText(getBaseContext(), "SMS not delivered", 
					    		Toast.LENGTH_SHORT).show();
					    break;					    
				}
			}
       }, new IntentFilter(DELIVERED));        
   	
       SmsManager sms = SmsManager.getDefault();
       sms.sendTextMessage(phoneNumber, null, message, sentPI, deliveredPI); 
      
        Intent close = new Intent(getApplicationContext(), Welcome.class);
		close.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		close.putExtra("EXIT", true);    // just value to indicate i want to  exit the application
		startActivity(close);
		  
   }    
}
