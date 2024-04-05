/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.adzibilal.pbo.pertemuan4dan5.adzibilal;

/**
 *
 * @author LENOVO
 */
public class PboPertemuan4dan5Adzibilal {

    public static void main(String[] args) {
        // Membuat objek lingkaran
        Lingkaran lingkaran1 = new Lingkaran(); // menggunakan konstruktor pertama
        Lingkaran lingkaran2 = new Lingkaran(5.0); // menggunakan konstruktor kedua
        Lingkaran lingkaran3 = new Lingkaran(7.0); // menggunakan konstruktor kedua
        
        // Menampilkan informasi lingkaran
        System.out.println("Informasi Lingkaran 1:");
        System.out.println("Luas: " + lingkaran1.getLuas());
        System.out.println("Keliling: " + lingkaran1.getKeliling());
        System.out.println();
        
        System.out.println("Informasi Lingkaran 2:");
        System.out.println("Luas: " + lingkaran2.getLuas());
        System.out.println("Keliling: " + lingkaran2.getKeliling());
        System.out.println();
        
        System.out.println("Informasi Lingkaran 3:");
        System.out.println("Luas: " + lingkaran3.getLuas());
        System.out.println("Keliling: " + lingkaran3.getKeliling());
        System.out.println();
        
        // Membuat objek piramida
        Piramida piramida1 = new Piramida(5, "kayu", false);
        Piramida piramida2 = new Piramida(7, "batu", true);
        
        // Menampilkan informasi piramida
        System.out.println("Informasi Piramida 1:");
        piramida1.infoPiramida();
        System.out.println("Gambar Piramida 1:");
        piramida1.gambarPiramida();
        
        System.out.println("Informasi Piramida 2:");
        piramida2.infoPiramida();
        System.out.println("Gambar Piramida 2:");
        piramida2.gambarPiramida();
        System.out.println();
        
        // Membuat objek mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("1", "Adzi Bilal", "Bandung Barat", 3.80);
        
        // Menampilkan informasi mahasiswa
        System.out.println("Informasi Mahasiswa:");
        mahasiswa1.cetak();
    }
}
