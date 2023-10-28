/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.regpagi.pkg22166025.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Lenovo
 * Nama : Nandya M Daffa
 * Kelas : PBO1 Reg Pagi
 * NIM : 22166025
 * Deskripsi Program : waktu saat ini
 */
public class SIRegPagi22166025Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date waktuSaatIni = new Date();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMM yyyy HH:mm:ss", new Locale("id-ID"));
        String waktuFormat = dateFormat.format(waktuSaatIni);
        
        System.out.println("Hari ini adalah hari : " + waktuFormat);
        
    }}
    