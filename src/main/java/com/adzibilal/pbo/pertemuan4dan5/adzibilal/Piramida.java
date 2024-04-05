/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adzibilal.pbo.pertemuan4dan5.adzibilal;

/**
 *
 * @author LENOVO
 */
public class Piramida {
     private int tinggi;
    private String bahan;
    private boolean terbalik;
    
    // Konstruktor dengan parameter
    public Piramida(int tinggi, String bahan, boolean terbalik) {
        this.tinggi = tinggi;
        this.bahan = bahan;
        this.terbalik = terbalik;
    }
    
    // Method untuk menampilkan informasi tentang piramida
    public void infoPiramida() {
        System.out.println("Informasi Piramida:");
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Bahan: " + bahan);
        System.out.println("Terbalik: " + terbalik);
        System.out.println();
    }
    
    // Method untuk menampilkan gambar piramida
    public void gambarPiramida() {
        if (!terbalik) {
            for (int i = 1; i <= tinggi; i++) {
                for (int j = 1; j <= tinggi - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            for (int i = tinggi; i >= 1; i--) {
                for (int j = 1; j <= tinggi - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        // Membuat objek piramida pertama
        Piramida piramida1 = new Piramida(5, "kayu", false);
        piramida1.infoPiramida();
        piramida1.gambarPiramida();
        
        // Membuat objek piramida kedua
        Piramida piramida2 = new Piramida(7, "batu", true);
        piramida2.infoPiramida();
        piramida2.gambarPiramida();
    }
}
