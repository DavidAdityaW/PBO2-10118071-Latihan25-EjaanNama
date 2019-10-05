/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan25.ejaannama;
// package scanner
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     ejaan dari input user  
 * 
 */
public class PBO210118071Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // membuat objek dari class scanner
        Scanner input = new Scanner(System.in);
        // variabel untuk menyimpan input dari user
        String nama;
        int no = 1;
        
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = input.next();
        System.out.println("\nEjaan untuk " + '"' + nama + '"' + " adalah :");
        
        for (int i = 0; i <= nama.length()-1; i++) {
            System.out.println("Huruf ke-" + no + " : " + nama.charAt(i));
            no++;
	}
    }
    
}
