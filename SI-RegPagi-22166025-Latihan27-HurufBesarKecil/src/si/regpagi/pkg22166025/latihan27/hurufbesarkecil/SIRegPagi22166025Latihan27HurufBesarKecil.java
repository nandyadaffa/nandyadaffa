/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.regpagi.pkg22166025.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * Nama : Nandya M Daffa
 * Kelas : PBO1 Reg Pagi
 * NIM : 22166025
 * Deskripsi Program : huruf besar kecil 
 */
public class SIRegPagi22166025Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan kalimat: ");
            String kalimat = input.nextLine();
            
            // hasil formatting
            System.out.println("====Hasil Formatting====");
            System.out.println("Huruf Besar:");
            System.out.println(kalimat.toUpperCase());
            System.out.println("Huruf Kecil:");
            System.out.println(kalimat.toLowerCase());
        }
        
    }
    }
    