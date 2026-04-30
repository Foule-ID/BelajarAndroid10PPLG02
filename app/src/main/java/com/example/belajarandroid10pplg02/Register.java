package com.example.belajarandroid10pplg02;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    Button btnRegister;
    EditText edNama;
    EditText edEmail;
    EditText edAlamat;
    EditText edNomorWA;
    EditText edPassword;
    EditText edConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnRegister = findViewById(R.id.btnRegister);
        edNama = findViewById(R.id.edNama);
        edEmail = findViewById(R.id.edEmail);
        edAlamat = findViewById(R.id.edAlamat);
        edNomorWA = findViewById(R.id.edNomorWA);
        edPassword = findViewById(R.id.edPassword);
        edConfirmPassword = findViewById(R.id.edConfirmPassword);

        btnRegister.setOnClickListener(v -> {
            String nama = edNama.getText().toString();
            String email = edEmail.getText().toString();
            String alamat = edAlamat.getText().toString();
            String nomorWA = edNomorWA.getText().toString();
            String password = edPassword.getText().toString();
            String confirmPassword = edConfirmPassword.getText().toString();

            Intent INTENT = new Intent(Register.this, ConfirmRegister.class);
            INTENT.putExtra("nama",nama);
            INTENT.putExtra("email",email);
            INTENT.putExtra("alamat",alamat);
            INTENT.putExtra("nomorWA",nomorWA);
            INTENT.putExtra("password",password);
            INTENT.putExtra("confirmPassword",confirmPassword);
            startActivity(INTENT);
        });
    }
}
