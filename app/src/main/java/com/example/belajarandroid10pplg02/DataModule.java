package com.example.belajarandroid10pplg02;

public class DataModule {
    String nama;
    String absen;
    String alamat;
    int gambar;
    String detailinfo;

    public DataModule(String nama, String absen, String alamat,String detalinfo,int gambar) {
        this.nama = nama;
        this.absen = absen;
        this.alamat = alamat;
        this.detailinfo = detalinfo;
        this.gambar = gambar;
    }

    public String getDetalinfo() {
        return detailinfo;
    }

    public String getNama() {
        return nama;
    }

    public String getAbsen() {
        return absen;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getGambar() {
        return gambar;
    }

}
