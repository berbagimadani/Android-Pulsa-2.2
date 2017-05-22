package com.transaksi;
 
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils.TruncateAt;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
 
public class Welcome extends ListActivity {
	AnimationDrawable lightsAnimation;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        ImageView lights = (ImageView) findViewById(R.id.MainMenu_AnimView2);
        lightsAnimation=(AnimationDrawable) lights.getDrawable();
        
 
       // final Button btn_registrasi = ( Button) findViewById(R.id.daftar);
        //final Button btn_exit = ( Button) findViewById(R.id.exit);
        
       // final Button txtTitle2 = ( Button) findViewById(R.id.on);
        /*
        txtTitle2.setText(Html.fromHtml("<a href='http://www.rumahmuslim.net/'>Online Shopping Rumah Muslim</a>"));
        txtTitle2.setClickable(true);
        txtTitle2.setMovementMethod(LinkMovementMethod.getInstance());
        */
    
        //final TextView txtT = (TextView) findViewById(R.id.text);
         
		
        final TextView tv2 = (TextView) this.findViewById(R.id.title_head);  
        tv2.setEllipsize(TruncateAt.MARQUEE);
        
       // tv2.setText("Selamat Datang Di Online Store RumahMuslim, Nikmati Segala Kemudahan Dan Fasilitas Berbelanja Yang Terdapat Di Aplikasi Android							");
        tv2.setSelected(true);
        tv2.setText(Html.fromHtml("<a href='http://www.rumahmuslim.net/'>Kunjungi Online Shopping RumahMuslim.Net</a>																		"));
        tv2.setClickable(true);
        tv2.setMovementMethod(LinkMovementMethod.getInstance());
        
        
        
        String[] menu = new String[] { "Masuk", "Registrasi Member", "Kunjungi Situs Kami", "Petunjuk Penggunaan", "Hubungi Kami", "Keluar"};
    	
 		//this.setListAdapter(new ArrayAdapter<String>(this,
 				//R.layout.row_welcome,R.id.title, menu));
        
        setListAdapter(new MyPerformanceArrayAdapter2(this, menu));
        
        final TextView tv = (TextView) this.findViewById(R.id.text);  
        tv.setEllipsize(TruncateAt.MARQUEE);

        //tv.setText("");
        tv.setSelected(true);
       
        final ListView lv = getListView();
        lv.setTextFilterEnabled(true);	
        lv.setOnItemClickListener(new OnItemClickListener() {
        	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {    
        		 String data =  lv.getItemAtPosition(position).toString();
        		
        		 if(data == "Masuk"){
        			 Intent i = new Intent(getApplicationContext(), TransaksiPulsaActivity.class);
        			 startActivity(i);
        		 }
        		 
        		 if(data == "Registrasi Member"){
        			 Intent i = new Intent(getApplicationContext(), Reg_Member.class);
        			i.putExtra("title", "Registrasi Member");
     		        i.putExtra("ceks",  "Registrasi Member");
     		        i.putExtra("cekh",  "Registrasi Member");
     		        i.putExtra("alias", "");
     				i.putExtra("name","Registrasi Member");
        			 startActivity(i);
        		 }
        		 
        		 if(data == "Petunjuk Penggunaan"){ 
         			Intent i = new Intent(getApplicationContext(), Info.class);
          			i.putExtra("title", "Petunjuk Penggunaan");
       		        i.putExtra("ceks",  "Petunjuk Penggunaan");
       		        i.putExtra("cekh",  "Petunjuk Penggunaan");
       		        i.putExtra("alias", "");
       				i.putExtra("name","Petunjuk Penggunaan");
          			 startActivity(i);
         		 }
        		 
        		 if(data == "Hubungi Kami"){ 
          			Intent i = new Intent(getApplicationContext(), Info.class);
           			i.putExtra("title", "Hubungi Kami");
        		        i.putExtra("ceks",  "Hubungi Kami");
        		        i.putExtra("cekh",  "Hubungi Kami");
        		        i.putExtra("alias", "");
        				i.putExtra("name","Hubungi Kami");
           			 startActivity(i);
          		 }
        		 if(data == "Keluar"){ 
        			 finish(); 
        		 }
        		 
        		 if(data == "Kunjungi Situs Kami"){ 
        			 String url = "http://www.rumahmuslim.net";
        			 Intent i = new Intent(Intent.ACTION_VIEW);
        			 i.setData(Uri.parse(url));
        			 startActivity(i);

        		 }
        		 
        	}
		});
    }
    public void onWindowFocusChanged(boolean hasFocus) {
    	super.onWindowFocusChanged(hasFocus);
        lightsAnimation.start();
    }
}
