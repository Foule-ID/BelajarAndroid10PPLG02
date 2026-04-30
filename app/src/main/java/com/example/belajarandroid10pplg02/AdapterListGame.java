package com.example.belajarandroid10pplg02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterListGame extends RecyclerView.Adapter<AdapterListGame.ViewHolder> {

    private List<DataModel> listGame;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(DataModel data);
    }

    public AdapterListGame(List<DataModel> listGame, OnItemClickListener listener) {
        this.listGame = listGame;
        this.listener = listener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtNamaGame, txtGenre, txtDeveloper;
        ImageView imgGame;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNamaGame = itemView.findViewById(R.id.txtNamaGame);
            txtGenre = itemView.findViewById(R.id.txtGenre);
            txtDeveloper = itemView.findViewById(R.id.txtDeveloper);
            imgGame = itemView.findViewById(R.id.imgGame);
        }
    }

    @NonNull
    @Override
    public AdapterListGame.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_layout_game, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListGame.ViewHolder holder, int position) {

        DataModel data = listGame.get(position);

        holder.txtNamaGame.setText(data.getNamaGame());
        holder.txtGenre.setText("Genre : " + data.getGenre());
        holder.txtDeveloper.setText("Developer : " + data.getDeveloper());

        holder.imgGame.setImageResource(data.getGambar());

        holder.itemView.setOnClickListener(v -> {
            listener.onItemClick(data);
        });
    }

    @Override
    public int getItemCount() {
        return listGame.size();
    }
}