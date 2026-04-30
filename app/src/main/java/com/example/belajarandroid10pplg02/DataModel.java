package com.example.belajarandroid10pplg02;

public class DataModel {


    String namaGame;
    String genre;
    String developer;
    String Detailinfo;
    int gambar;

    public DataModel(String namaGame,String genre, String developer,String Detailinfo,int gambar){
        this.namaGame = namaGame;
        this.developer = developer;
        this.genre = genre;
        this.Detailinfo = Detailinfo;
        this.gambar = gambar;
    }

    public int getGambar() {
        return gambar;
    }
    public String getDeveloper() {
        return developer;
    }

    public String getNamaGame() {
        return namaGame;
    }

    public String getGenre() {
        return genre;
    }

    public String getDetailinfo() {
        return Detailinfo;
    }

}
