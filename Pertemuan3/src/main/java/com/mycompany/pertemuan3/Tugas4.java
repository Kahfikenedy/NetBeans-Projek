/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;

/**
 *
 * @author user
 */
import java.util.Scanner;


public class Tugas4{
    public static void main (String [] hady){
        Scanner in = new Scanner (System.in);
        String nama , nim ;
        int jurusan;
        System.out.print("Masukan nama : ");
        nama = in.nextLine();
        System.out.print("Masukan nim : ");
        nim = in.nextLine();
        System.out.print("Pilihan : \n 1. Sistem Informasi \n 2. Sistem Komputer \n 3. Teknik Informatika \n\n Masukan pilihan :");
        jurusan = in.nextInt();
        switch (jurusan){
            case 1:
                System.out.println("\n"+nama+" dengan nim "+nim+" memilih jurusan Sistem Informasi");
                break;
            case 2:
                System.out.println("\n"+nama+" dengan nim "+nim+" memilih jurusan Sistem Komputer");
                break;
            case 3:
                System.out.println("\n"+nama+" dengan nim "+nim+" memilih jurusan Teknik Informatika");
                break;
        }
    }
}
