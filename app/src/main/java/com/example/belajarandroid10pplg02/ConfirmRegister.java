package com.example.belajarandroid10pplg02;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ConfirmRegister extends AppCompatActivity {
    TextView tvNama;
    TextView tvEmail;
    TextView tvAlamat;
    TextView tvPassword;
    TextView tvNomorWA;
    TextView tvConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_register);

        tvNama = findViewById(R.id.tvNama);
        tvEmail  = findViewById(R.id.tvEmail);
        tvAlamat = findViewById(R.id.tvAlamat);
        tvNomorWA = findViewById(R.id.tvNomorWA);
        tvPassword  = findViewById(R.id.tvPassword);
        tvConfirmPassword = findViewById(R.id.tvConfirmPassword);

        String nama = getIntent().getStringExtra("nama");
        String email = getIntent().getStringExtra("email");
        String alamat = getIntent().getStringExtra("alamat");
        String nomorWA  = getIntent().getStringExtra("nomorWA");
        String password = getIntent().getStringExtra("password");
        String confirmPassword = getIntent().getStringExtra("confirmPassword");

        tvNama.setText("Nama: " + nama);
        tvEmail.setText("Email: " + email);
        tvAlamat.setText("Alamat: " + alamat);
        tvNomorWA.setText("Nomor WA: " + nomorWA);
        tvPassword.setText("Password: " + password);
        tvConfirmPassword.setText("Confirm Password: " + confirmPassword);
    }
}