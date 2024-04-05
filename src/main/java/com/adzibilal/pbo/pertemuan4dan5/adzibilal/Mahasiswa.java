/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adzibilal.pbo.pertemuan4dan5.adzibilal;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    public String nim;
    public String nama;
    public String alamat;
    public double ipk;
    
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        // Tidak melakukan apapun
    }
    
    // Konstruktor dengan parameter nim
    public Mahasiswa(String nim) {
        this.nim = nim;
    }
    
    // Konstruktor dengan parameter lengkap
    public Mahasiswa(String nimBaru, String namaBaru, String alamatBaru, double ipkBaru) {
        this.nim = nimBaru;
        this.nama = namaBaru;
        this.alamat = alamatBaru;
        this.ipk = ipkBaru;
    }
    
    // Method untuk menentukan predikat berdasarkan IPK
    public String predikat(double ipk) {
        if (ipk >= 2.0 && ipk <= 2.75) {
            return "Memuaskan";
        } else if (ipk >= 2.76 && ipk <= 3.5) {
            return "Sangat memuaskan";
        } else if (ipk >= 3.51 && ipk <= 4.0) {
            return "Dengan pujian";
        } else {
            return "-";
        }
    }
    
    // Method untuk mencetak informasi mahasiswa
    public void cetak() {
        System.out.println("Nama = " + nama);
        System.out.println("Alamat = " + alamat);
        System.out.println("NIM = " + nim);
        System.out.println("IPK = " + ipk);
        System.out.println("Predikat = " + predikat(ipk));
    }
    
    public static void main(String[] args) {
        // Membuat objek mahasiswa pertama
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Adzi";
        mahasiswa1.alamat = "Bandung Barat";
        mahasiswa1.nim = "1";
        mahasiswa1.ipk = 3.80;
        mahasiswa1.cetak();
    }
}
