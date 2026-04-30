package com.example.belajarandroid10pplg02;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailListSiswa extends AppCompatActivity {

    TextView detail;
    TextView txtNama;
    TextView txtAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_list_siswa);

        detail = findViewById(R.id.detail);
        txtNama = findViewById(R.id.txtNama);
        txtAlamat = findViewById(R.id.txtAlamat);

        String nama = getIntent().getStringExtra("name");
        String detailInfo = getIntent().getStringExtra("detail");
        String alamat = getIntent().getStringExtra("alamat");

        txtNama.setText(nama);
        detail.setText(detailInfo);
        txtAlamat.setText(alamat);
    }
}