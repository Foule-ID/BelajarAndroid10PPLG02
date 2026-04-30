package com.example.belajarandroid10pplg02;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class List extends AppCompatActivity {

    RecyclerView rvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvList =(RecyclerView) findViewById(R.id.rvList);
        ArrayList<DataModule> listDataSiswa = new ArrayList<>();

        DataModule Model = new DataModule("albay","1","jati","Ini Detail Info profil Albay",R.drawable.cowok);
        DataModule Model1 = new DataModule("Abdillah","2","Ngambal","ini Detail info profil abdillah",R.drawable.cowok);
        DataModule Model2 = new DataModule("arbitro","3","mayong","Ini detail Info profil Arbitro",R.drawable.cowok);
        DataModule Model3 = new DataModule("rahman","4","damaran","Ini Detail info profil Rahman",R.drawable.cowok);
        DataModule Model4 = new DataModule("arhaqi","5","kuningan","ini Detail info profil Arhaqi",R.drawable.cowok);
        DataModule Model5 = new DataModule("bhisma", "6","jakarta selatan","Ini Detail info profil Bhisma",R.drawable.cowok);
        DataModule Model6 = new DataModule("daniswara","7","besito","Ini Detail info Daniswara",R.drawable.cewek);
        DataModule Model7 = new DataModule("diwa","8","cepu blora","Ini Detail info Diwa",R.drawable.cowok);
        DataModule Model8 = new DataModule("Devo","9","kaliputu","Ini Detail info Devo",R.drawable.cowok);
        DataModule Model9 = new DataModule("Dzaki","10","plosok","Ini Detail info Dzaki",R.drawable.cowok);

        listDataSiswa.add(Model);
        listDataSiswa.add(Model1);
        listDataSiswa.add(Model2);
        listDataSiswa.add(Model3);
        listDataSiswa.add(Model4);
        listDataSiswa.add(Model5);
        listDataSiswa.add(Model6);
        listDataSiswa.add(Model7);
        listDataSiswa.add(Model8);
        listDataSiswa.add(Model9);

        AdapterList adapter = new AdapterList(listDataSiswa, data -> {
            Toast.makeText(this, "Hallo " + data.getNama(), Toast.LENGTH_SHORT).show();
            //pindah halaman
            Intent in = new Intent(List.this, DetailListSiswa.class);
            in.putExtra("name", data.getNama());
            in.putExtra("detail", data.getDetalinfo());
            in.putExtra("alamat", data.getAlamat());
            startActivity(in);
        });

        rvList.setLayoutManager(new LinearLayoutManager(this));
        rvList.setAdapter(adapter);


    }
}