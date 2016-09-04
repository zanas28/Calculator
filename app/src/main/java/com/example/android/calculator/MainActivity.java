package com.example.android.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Deklarasi Variabel
    private EditText angka1;
    private EditText angka2;
    private TextView hasil;
    private Button tambah;
    private Button kurang;
    private Button kali;
    private Button bagi;
    private Button pangkat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Memanggil ID dari content_main.xml
        angka1 = (EditText) findViewById(R.id.angka1);
        angka2 = (EditText) findViewById(R.id.angka2);
        hasil = (TextView) findViewById(R.id.hasil);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);
        pangkat = (Button) findViewById(R.id.pangkat);

        // Pemanggilan method ketika tombol diklik
        tambah.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               // Cek kondisi apakah angka 1 ada isinya atau tidak, jika ada lakukan proses
               // perhitungan, jika tidak maka hasil tetap bernilai 0.0
               if ((angka1.getText().length()) > 0 && (angka2.getText().length() > 0)) {

                   // Mengubah number menjadi string
                   double ang1 = Double.parseDouble(angka1.getText().toString());
                   double ang2 = Double.parseDouble(angka2.getText().toString());

                   double penjumlahan = ang1 + ang2;
                   hasil.setText(Double.toString(penjumlahan));
               }
               else {
                   hasil.setText("0.0");
               }
           }
       });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length()) > 0 && (angka2.getText().length() > 0)) {
                    double ang1 = Double.parseDouble(angka1.getText().toString());
                    double ang2 = Double.parseDouble(angka2.getText().toString());

                    double pengurangan = ang1 - ang2;
                    hasil.setText(Double.toString(pengurangan));
                }
                else {
                    hasil.setText("0.0");
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length()) > 0 && (angka2.getText().length() > 0)) {
                    double ang1 = Double.parseDouble(angka1.getText().toString());
                    double ang2 = Double.parseDouble(angka2.getText().toString());

                    double perkalian = ang1 * ang2;
                    hasil.setText(Double.toString(perkalian));
                }
                else {
                    hasil.setText("0.0");
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length()) > 0 && (angka2.getText().length() > 0)) {
                    double ang1 = Double.parseDouble(angka1.getText().toString());
                    double ang2 = Double.parseDouble(angka2.getText().toString());

                    double pembagian = ang1 / ang2;
                    hasil.setText(Double.toString(pembagian));
                }
                else {
                    hasil.setText("0.0");
                }
            }
        });

        pangkat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angka1.getText().length()) > 0 && (angka2.getText().length() > 0)) {
                    double ang1 = Double.parseDouble(angka1.getText().toString());
                    double ang2 = Double.parseDouble(angka2.getText().toString());

                    double diPangkat = Math.pow(ang1, ang2);
                    hasil.setText(Double.toString(diPangkat));
                }
                else {
                    hasil.setText("0.0");
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
