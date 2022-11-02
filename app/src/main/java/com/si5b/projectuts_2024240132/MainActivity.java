package com.si5b.projectuts_2024240132;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnDaftar;
    EditText etNamaLengkap;
    EditText etNomorPendaftaran;

    CheckBox cbfacebook;
    CheckBox cbInstagram;
    CheckBox cbWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("projectuts_2024240132");

        etNamaLengkap = findViewById(R.id.et_nama_lengkap);
        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        cbfacebook = findViewById(R.id.cb_facebook);
        cbInstagram = findViewById(R.id.cb_instagram);
        cbWebsite = findViewById(R.id.cb_website);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                switch (view.getId()) {
                    case R.id.cb_facebook:
                        if (cbfacebook.isChecked())
                            Toast.makeText(MainActivity.this, "Facebook", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.cb_instagram:
                        if (cbInstagram.isChecked())
                            Toast.makeText(MainActivity.this, "Instagram", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.cb_website:
                        if (cbWebsite.isChecked())
                            Toast.makeText(MainActivity.this, "Website", Toast.LENGTH_SHORT).show();
                        break;
                }
                String namalengkap = etNamaLengkap.getText().toString();
                String nomorpendaftran = etNomorPendaftaran.getText().toString();

                if (namalengkap.trim().equals("")) {
                    etNamaLengkap.setError("Nama Wajib Diisi");
                } else if (nomorpendaftran.trim().equals("")) {
                    etNomorPendaftaran.setError("Nomor Wajib Diisi");
                } else if (!cbfacebook.isChecked() && !cbInstagram.isChecked() && !cbWebsite.isChecked()) {
                    Toast.makeText(MainActivity.this, "Wajib Memilih Salah Satu", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("varNamaLengkap", namalengkap);
                    intent.putExtra("varNomorPendaftaran", nomorpendaftran);
                    startActivity(intent);
                }


            }
        });
        ;
    }
}