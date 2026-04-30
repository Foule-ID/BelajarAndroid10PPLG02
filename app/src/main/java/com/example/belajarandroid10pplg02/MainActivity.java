package com.example.belajarandroid10pplg02;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnRegister, btnLogin;
    EditText edUsername, edPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences sp = getSharedPreferences("UserData", MODE_PRIVATE);
        boolean isLogin = sp.getBoolean("isLogin", false);

        if (isLogin){
            Intent intent = new Intent(MainActivity.this, SkeletonPreferences.class);
            startActivity(intent);
            finish();
        }

        setContentView(R.layout.activity_main);

        btnRegister = findViewById(R.id.btnRegister);
        btnLogin = findViewById(R.id.btnLogin);
        edUsername = findViewById(R.id.edUsername);
        edPassword = findViewById(R.id.edPassword);

        btnRegister.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Register.class);
            startActivity(intent);
        });

        btnLogin.setOnClickListener(v -> {

            String username = edUsername.getText().toString();
            String password = edPassword.getText().toString();

            if (username.equals("arhaqi") && password.equals("admin")){

                Toast.makeText(this, "Sukses login", Toast.LENGTH_SHORT).show();

                SharedPreferences.Editor editor = sp.edit();
                editor.putString("username", username);
                editor.putBoolean("isLogin", true);
                editor.apply();

                Intent intent = new Intent(MainActivity.this, SkeletonPreferences.class);
                startActivity(intent);
                finish();

            } else {
                Toast.makeText(this, "Login gagal", Toast.LENGTH_SHORT).show();
            }
        });
    }
}