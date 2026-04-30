package com.example.belajarandroid10pplg02;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SkeletonPreferences extends AppCompatActivity {

    TextView txtUser;
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skeleton_preferences);

        txtUser = findViewById(R.id.txtUser);
        btnLogout = findViewById(R.id.btnLogout);

        SharedPreferences sp = getSharedPreferences("UserData", MODE_PRIVATE);
        String username = sp.getString("username", "Tidak ada");

        txtUser.setText("Halo " + username);


        btnLogout.setOnClickListener(v -> {

            SharedPreferences.Editor editor = sp.edit();
            editor.clear();
            editor.apply();

            Intent intent = new Intent(SkeletonPreferences.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}