package com.example.belajarandroid10pplg02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewHolder> {

    private List<DataModule> listSiswa;
    private OnItemClickListener listener;

    // interface klik
    public interface OnItemClickListener {
        void onItemClick(DataModule data);
    }

    // constructor
    //di tambah listener untuk menyambungkan ke activi
    public AdapterList(List<DataModule> listSiswa, OnItemClickListener listener) {
        this.listSiswa = listSiswa;
        this.listener = listener;
    }

    // ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, TvAbsen, TvAlamat;
        ImageView imgProfile;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.nama);
            TvAbsen = itemView.findViewById(R.id.absen);
            TvAlamat = itemView.findViewById(R.id.tvAlamat);
            imgProfile = itemView.findViewById(R.id.imgProfile);
        }
    }

    @NonNull
    @Override
    public AdapterList.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterList.ViewHolder holder, int position) {
        DataModule data = listSiswa.get(position);

        holder.tvNama.setText(data.getNama());
        holder.TvAbsen.setText("Absen: " + data.getAbsen());
        holder.TvAlamat.setText("Alamat: " + data.getAlamat());

        holder.imgProfile.setImageResource(data.getGambar());

        holder.itemView.setOnClickListener(v -> {
            listener.onItemClick(data);
        });
    }

    @Override
    public int getItemCount() {
        return listSiswa.size();
    }
}