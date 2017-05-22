package com.transaksi;

import java.util.HashMap;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
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

import com.transaksi.Info;
import com.transaksi.R;

public class Info extends Activity {
	EditText no_pin;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onStart();
        setContentView(R.layout.info);
        final TextView txtTitle = (TextView) findViewById(R.id.title);
        final TextView txtTitle2 = (TextView) findViewById(R.id.isi);
        Intent i = getIntent();
        // Receiving the Data
        final String title = i.getStringExtra("title");
        final String name = i.getStringExtra("name");
        final String cekh = i.getStringExtra("cekh");
        final String ceks = i.getStringExtra("ceks");
        final String alias = i.getStringExtra("alias");
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
        
String info1 = "Flash Machine Jawara adalah Software pulsa dengan komunitas terbesar di Indonesia, ";
String info2 = "Memiliki pengguna yang tersebar di 31 propinsi indonesia sehingga memudahkan untuk penggunanya dalam pengembangan jaringan bisnis. Flash Machine juga satu-satunya pengembang software pulsa yang menghadirkan pengembangan bisnis selain pulsa untuk memberdayakan jaringan yang ada pada setiap pengguna disebabkan setiap Server pulsa mempunyai downline yang cukup banyak untuk mendistribusikan diantaranya PPOB,Voucher Asuransi,Voucher Discount,Voucher Game Online,JNE dsb.<br>";
String info3 = "Flash Machine Jawara (mungkin satu-satunya di Indonesia) yang dibangun menggunakan .NET Framework. .NET Framework dan Windows adalah dua produk yang dibuat oleh perusahaan yang sama (Microsoft). oleh karena itu kami yakin antara .NET Framework dan Windows dapat bersinergi dengan sangat baik. keuntungan menggunakan .NET Framework adalah ukuran program yang sangat kecil, efisiensi hardware, serta efektifitas waktu yg digunakan untuk penulisan program. hingga saat ini (mungkin) FM adalah software pulsa dengan installer terkecil serta paling mudah diinstall oleh user. <br>Flash Machine juga mencatat proses instalasi tercepat (2-8 detik), serta ukuran database terkecil (1 mb per 50.000 transaksi)";

String info4 = "Visi dan Misi <br>'The largest IT solution in Indonesia Deliver more than excellent<br>'Be the best friends and consultant for our customers' <br> Deliver excellent resources for our customersDeliver excellent service for our customers Educate Market with passion to help customers grow";
   
String infos = info1.toString() + info2.toString() + info3.toString() + info4.toString();
//txtTitle2.setText(Html.fromHtml("<a href='http://www.rumahmuslim.net/'>Info Rumah Muslim</a>"));
//txtTitle2.setClickable(true);
//txtTitle2.setMovementMethod(LinkMovementMethod.getInstance());
 

if(title.equalsIgnoreCase("Hubungi Kami")){
	txtTitle2.setText(Html.fromHtml("Rumah Muslim:<br><br>" +
			 "Ruko Pasar Modern paramount serpong blok AA No 3.<br>"+
			 "Gading serpong, Tangerang<br>" +
			 "Telp : 021 93390 390/ 0818 865 400<br>" +
			 "email : info@rumahmuslim.net <br><br>" +
			 "" +
			 "" +
			 "" +
			 "" +
			 ""));
			    
}

  
if(title.equalsIgnoreCase("Petunjuk Penggunaan")){
txtTitle2.setText(Html.fromHtml("Petunjuk Penggunaan:<br><br>" +
 "1. Daftarkan Nama,Alamat dan No HP yang digunakan di Android anda<br><br>" +
 "2. Silahkan Transfer sejumlah dana ke Rekening Kami<br><br>" +
 "&nbsp; A.N LUCKY PRIHARTANTI<br>" +
 "&nbsp; BCA<br>" +
 "&nbsp; 497.1135.888<br><br>" +
 "&nbsp; MANDIRI<br>" +
 "&nbsp; 1180.0052.19620<br><br>" +
 "&nbsp; BNI<br>" +
 "&nbsp; 1039854728<br><br>" +
 
 "3. Setelah mendapat konfirmasi deposit anda telah bertambah maka<br>" +
 "   anda sudah dapat melakukan transaksi<br><br>" +
 "4. Untuk Layanan Deposit dan Customer Service dapat menghubungi<br>" +
 "   (021) 5384714 atau YM : eflashreload_trx (Setiap hari dari Jam 8:00 - 21:00) <br><br>" +
 "5. Pengiriman transaksi dilakukan via SMS dan dikenakan biaya sesuai<br>" +
 	 "ketentuan masing-masing operator maka pastikan pulsa anda mencukupi<br><br>"+
 "6. Transaksi PULSA ELEKTRIK,TOKEN PLN & Pembayaran akan langsung mendapatkan notifikasi SUKSES,<br>"+
 	 "bila belum masuk mohon menunggu  1 x 24 jam atau hubungi Customer Care.<br><br>"+
 "6. Kode keamanan transaksi berdasarkan dari No HP anda yang terdaftar dan PIN bukan<br>"+
 	 "melalui PIN Blackberry anda. Kami tidak bertanggung jawab atas penyalah gunaan dari No HP anda."));
    }
    }
}