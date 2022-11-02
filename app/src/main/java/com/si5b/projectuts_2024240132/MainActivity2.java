package com.si5b.projectuts_2024240132;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tvNamalengkap;
    TextView tvNomorpendaftaran;
    TextView tvInformasipendaftaran;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNamalengkap = findViewById(R.id.tv_tampil_nama_lengkap);
        tvNomorpendaftaran = findViewById(R.id.tv_tampil_nomor_pendaftaran);
        tvInformasipendaftaran = findViewById(R.id.tv_tampil_informasi_pendaftaran);

        Intent intent = getIntent();
        tvNamalengkap.setText(intent.getStringExtra("varNamalengka"));
        tvNomorpendaftaran.setText(intent.getStringExtra("varNomorpendaftaran"));
        tvInformasipendaftaran.setText(intent.getStringExtra("varInformasipendaftaran"));

    }
}