package com.transaksi;

import com.transaksi.Transaksi_First;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.transaksi.R;

public class TransaksiPulsaActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_layout);
        
        final ImageView btn_home = (ImageView) findViewById(R.id.home);
        
        final Button btn_pembelian = (Button) findViewById(R.id.pembelian);
        final Button btn_pembelian2 = (Button) findViewById(R.id.pembelian2);
        final Button btn_pembelian3 = (Button) findViewById(R.id.pembelian3);
        
        final Button btn_pembayaran = (Button) findViewById(R.id.pembayaran);
        final Button btn_cekharga = (Button) findViewById(R.id.cekharga);
        final Button btn_ceksaldo = (Button) findViewById(R.id.ceksaldo);
        
        final Button btn_cekrekap = (Button) findViewById(R.id.cekrekap);
        final Button btn_gantipin = (Button) findViewById(R.id.gantipin);
        final Button btn_transfer = (Button) findViewById(R.id.transferdeposite);
        final Button btn_registrasi = (Button) findViewById(R.id.registrasi);
        
        final Button btn_tiket = (Button) findViewById(R.id.tiket);
        final Button btn_komplain = (Button) findViewById(R.id.komplain);
        final Button btn_belanja = (Button) findViewById(R.id.belanja);
        
        final Button btn_info = (Button) findViewById(R.id.info);
        final Button btn_exit = (Button) findViewById(R.id.exit);
        
        
     // Listening to News Feed button click
        
        btn_home.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), TransaksiPulsaActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				i.putExtra("EXIT", true);    // just value to indicate i want to  exit the application
				startActivity(i);
				
			}
		});

        btn_pembelian.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Transaksi_First.class);
				i.putExtra("name", btn_pembelian.getText().toString());
				startActivity(i);
				
			}
		});
        
        
        btn_pembelian2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Transaksi_First.class);
				i.putExtra("name", btn_pembelian2.getText().toString());
				startActivity(i);
				
			}
		});
        
        btn_pembelian3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Transaksi_First.class);
				i.putExtra("name", btn_pembelian3.getText().toString());
				startActivity(i);
				
			}
		});

        btn_pembayaran.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Transaksi_First.class);
				i.putExtra("name", btn_pembayaran.getText().toString());
				startActivity(i);
			}
		});
        
        btn_cekharga.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Transaksi_First.class);
				i.putExtra("name", btn_cekharga.getText().toString());
				startActivity(i);
			}
		});
        
        btn_ceksaldo.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Cek_Harga.class);
			    i.putExtra("title", "Cek Saldo");
		        i.putExtra("ceks", "Cek Saldo");
		        i.putExtra("cekh", "Cek Saldo");
		        i.putExtra("alias", "");
				i.putExtra("name", btn_ceksaldo.getText().toString());
				startActivity(i);
			}
		});
        
        btn_cekrekap.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Cek_Harga.class);
			    i.putExtra("title", "Cek Rekap Harian");
		        i.putExtra("ceks", "Cek Rekap Harian");
		        i.putExtra("cekh", "Cek Rekap Harian");
		        i.putExtra("alias", "");
				i.putExtra("name", btn_ceksaldo.getText().toString());
				startActivity(i);
			}
		});
        
        btn_gantipin.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Ganti_Pin.class);
			    i.putExtra("title", "Ganti Pin");
		        i.putExtra("ceks", "Ganti Pin");
		        i.putExtra("cekh", "Ganti Pin");
		        i.putExtra("alias", "");
				i.putExtra("name", btn_gantipin.getText().toString());
				startActivity(i);
			}
		});
        
        btn_transfer.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Transfer_Deposit.class);
			    i.putExtra("title", btn_transfer.getText().toString());
		        i.putExtra("ceks", btn_transfer.getText().toString());
		        i.putExtra("cekh", btn_transfer.getText().toString());
		        i.putExtra("alias", "");
				i.putExtra("name", btn_transfer.getText().toString());
				startActivity(i);
			}
		});
        
        btn_registrasi.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Reg_Agen.class);
			    i.putExtra("title", btn_registrasi.getText().toString());
		        i.putExtra("ceks",  btn_registrasi.getText().toString());
		        i.putExtra("cekh",  btn_registrasi.getText().toString());
		        i.putExtra("alias", "");
				i.putExtra("name", btn_registrasi.getText().toString());
				startActivity(i);
			}
		});
        
        btn_tiket.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Tiket.class);
			    i.putExtra("title",btn_tiket.getText().toString());
		        i.putExtra("ceks", btn_tiket.getText().toString());
		        i.putExtra("cekh", btn_tiket.getText().toString());
		        i.putExtra("alias", "");
				i.putExtra("name", btn_tiket.getText().toString());
				startActivity(i);
			}
		});
        
        btn_komplain.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Komplain.class);
			    i.putExtra("title",btn_komplain.getText().toString());
		        i.putExtra("ceks", btn_komplain.getText().toString());
		        i.putExtra("cekh", btn_komplain.getText().toString());
		        i.putExtra("alias", "");
				i.putExtra("name", btn_komplain.getText().toString());
				startActivity(i);
			}
		});
        
        btn_belanja.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Belanja.class);
			    i.putExtra("title", btn_belanja.getText().toString());
		        i.putExtra("ceks", btn_belanja.getText().toString());
		        i.putExtra("cekh", btn_belanja.getText().toString());
		        i.putExtra("alias", "");
				i.putExtra("name", btn_belanja.getText().toString());
				startActivity(i);
			}
		});
        
        
        btn_info.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Info.class);
			    i.putExtra("title", btn_info.getText().toString());
		        i.putExtra("ceks", btn_info.getText().toString());
		        i.putExtra("cekh", btn_info.getText().toString());
		        i.putExtra("alias", "");
				i.putExtra("name", btn_info.getText().toString());
				startActivity(i);
			}
		});

        btn_exit.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				finish();
			}
		});
        
    }
}