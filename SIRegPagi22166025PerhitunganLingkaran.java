/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.regpagi.pkg22166025.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * Nama : Nandya M Daffa
 * Kelas : PBO1 Reg Pagi
 * NIM : 22166025
 * Deskripsi Program : Perhitungan Lingkaran
 */
public class SIRegPagi22166025PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     try (Scanner input = new Scanner(System.in)) {
            System.out.println("=======Perhitungan Lingkaran=======");
            
            double diameter = 0;
            boolean inputValid = false;
            
            while (!inputValid) {
                System.out.print("Masukkan nilai diameter lingkaran : ");
                String inputDiameter = input.nextLine();
                
                try {
                    diameter = Double.parseDouble(inputDiameter);
                    inputValid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Nilai diameter tidak sesuai");
                }
            }
            
            double jariJari = diameter / 2;
    }
        double jariJari = 0;
    double luas = Math.PI * Math.pow(jariJari, 2);
            double keliling = 2 * Math.PI * jariJari;
            
            System.out.println("\n=======Hasil Perhitungan Lingkaran=======");
            System.out.println("Jari-jari lingkaran = " + jariJari + " cm");
            System.out.println("Luas lingkaran = " + String.format("%.2f", luas) + " cm^2");
              System.out.println("Keliling lingkaran = " + String.format("%.2f", keliling) + " cm");
        }
    }

