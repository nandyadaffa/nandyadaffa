/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.regpagi.pkg22166025.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * Nama : Nandya M Daffa
 * Kelas : PBO1 Reg Pagi
 * NIM : 22166025
 * Deskripsi Program : ejaan nama 
 */
public class SIRegPagi22166025Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukan nama depan anda untuk di eja :");
            String nama = input.nextLine();
            
            System.out.print("Ejaan untuk nama anda adalah");
            for (int i =0; i < nama.length(); i++) {
                System.out.println("Hurud ke-" + (i + 1) + " : " + nama.charAt(i));
            }
        }
    }
}
