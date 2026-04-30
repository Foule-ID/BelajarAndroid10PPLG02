package com.example.belajarandroid10pplg02;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailListGame extends AppCompatActivity {

    TextView txtNamaGame, txtGenre, txtDeveloper, txtDetail;
    ImageView imgGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_game);

        txtNamaGame = findViewById(R.id.txtNamaGame);
        txtGenre = findViewById(R.id.txtGenre);
        txtDeveloper = findViewById(R.id.txtDeveloper);
        txtDetail = findViewById(R.id.txtDetail);
        imgGame = findViewById(R.id.imgGame);

        String nama = getIntent().getStringExtra("namaGame");
        String genre = getIntent().getStringExtra("genre");
        String developer = getIntent().getStringExtra("developer");
        String detail = getIntent().getStringExtra("detail");
        int gambar = getIntent().getIntExtra("gambar", R.drawable.download);

        txtNamaGame.setText(nama);
        txtGenre.setText("Genre : " + genre);
        txtDeveloper.setText("Developer : " + developer);
        txtDetail.setText(detail);
        imgGame.setImageResource(gambar);
    }
}