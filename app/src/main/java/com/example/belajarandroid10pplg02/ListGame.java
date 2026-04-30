package com.example.belajarandroid10pplg02;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListGame extends AppCompatActivity {

    RecyclerView rvListgame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_game);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvListgame = findViewById(R.id.rvListgame);

        ArrayList<DataModel> listDataGame = new ArrayList<>();

        listDataGame.add(new DataModel("Mobile Legends","MOBA","Moonton","Game moba 5v5",R.drawable.mobilelegends));
        listDataGame.add(new DataModel("PUBG Mobile","Battle Royale","Krafton","100 player survive",R.drawable.pubg));
        listDataGame.add(new DataModel("Valorant","FPS","Riot Games","Tactical shooter",R.drawable.valo));
        listDataGame.add(new DataModel("Wuthering Wave","RPG","Kuro Games","Open world fantastis",R.drawable.wuwa));
        listDataGame.add(new DataModel("Minecraft","Sandbox","Mojang","Game kreatif",R.drawable.minecraft));
        listDataGame.add(new DataModel("Free Fire","Battle Royale","Garena","Game burik ",R.drawable.ff));
        listDataGame.add(new DataModel("Roblox","Multiplayer","david","Game multiplayer seru dan bermain bersama",R.drawable.roblox));
        listDataGame.add(new DataModel("punishing gray raven","rpg","kuro games","game yang bertema dengan apocalpsy",R.drawable.pgr));

        AdapterListGame adapter = new AdapterListGame(listDataGame, data -> {

            Toast.makeText(this,
                    data.getNamaGame(),
                    Toast.LENGTH_SHORT).show();

            Intent in = new Intent(ListGame.this, DetailListGame.class);
            //melempar data ke detail
            in.putExtra("namaGame", data.getNamaGame());
            in.putExtra("genre", data.getGenre());
            in.putExtra("developer", data.getDeveloper());
            in.putExtra("detail", data.getDetailinfo());
            in.putExtra("gambar", data.getGambar());

            startActivity(in);
        });

        rvListgame.setLayoutManager(new LinearLayoutManager(this));
        rvListgame.setAdapter(adapter);
    }
}