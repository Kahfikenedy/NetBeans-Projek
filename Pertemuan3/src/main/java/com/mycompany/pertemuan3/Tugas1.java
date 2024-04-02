/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan3;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Tugas1 {
 public static void main(String[]args){
  Scanner x = new Scanner(System.in);
  System.out.println("Program Konversi Nilai Ke Huruf Mahasiswa"); 
  System.out.println("Masukkan Sebuah Nilai = ");
  int a = x.nextInt();
  if (a>=80){
   System.out.println("Nilai Anda A");
  }
  else if (a>=76&&a<=79){
   System.out.println("Nilai Anda B+");
  }
  else if (a>=71&&a<=75){
   System.out.println("Nilai Anda B");
  }
  else if (a>=66&&a<=69){
   System.out.println("Nilai Anda C+");
  }
  else if (a>=61&&a<=66){
   System.out.println("Nilai Anda C");
  }
  else if (a>=51&&a<=60){
   System.out.println("Nilai Anda D+");
  }
  else if (a>=41&&a<=50){
   System.out.println("Nilai Anda D");
  }
  else {
   System.out.println("Nilai Anda E");
  }
 }
}
