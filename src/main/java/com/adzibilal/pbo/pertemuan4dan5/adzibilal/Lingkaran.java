/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adzibilal.pbo.pertemuan4dan5.adzibilal;

/**
 *
 * @author LENOVO
 */
public class Lingkaran {
    private double jari_jari;
    private static double phi = 3.14;
    private static int jumlahLingkaran = 0;
    
    // Konstruktor pertama tanpa parameter
    public Lingkaran() {
        jumlahLingkaran++;
    }
    
    // Konstruktor kedua dengan parameter jari_jari_baru
    public Lingkaran(double jari_jari_baru) {
        this.jari_jari = jari_jari_baru;
        jumlahLingkaran++;
    }
    
    // Method untuk menghitung luas lingkaran
    public double getLuas() {
        return phi * jari_jari * jari_jari;
    }
    
    // Method untuk menghitung keliling lingkaran
    public double getKeliling() {
        return 2 * phi * jari_jari;
    }
    
    // Method untuk mendapatkan jumlah lingkaran yang dibuat
    public static int getJumlahLingkaran() {
        return jumlahLingkaran;
    }
    
    public static void main(String[] args) {
        // Membuat objek pertama tanpa inisialisasi jari_jari
        Lingkaran lingkaran1 = new Lingkaran();
        
        // Membuat objek kedua dengan inisialisasi jari_jari dari property
        Lingkaran lingkaran2 = new Lingkaran(5.0);
        
        // Membuat objek ketiga dengan inisialisasi jari_jari dari konstruktor
        Lingkaran lingkaran3 = new Lingkaran(7.0);
        
        // Menampilkan hasil
        System.out.println("Luas lingkaran 1: " + lingkaran1.getLuas());
        System.out.println("Keliling lingkaran 1: " + lingkaran1.getKeliling());
        System.out.println("Luas lingkaran 2: " + lingkaran2.getLuas());
        System.out.println("Keliling lingkaran 2: " + lingkaran2.getKeliling());
        System.out.println("Luas lingkaran 3: " + lingkaran3.getLuas());
        System.out.println("Keliling lingkaran 3: " + lingkaran3.getKeliling());
        System.out.println("Jumlah lingkaran yang dibuat: " + Lingkaran.getJumlahLingkaran());
    }

}
