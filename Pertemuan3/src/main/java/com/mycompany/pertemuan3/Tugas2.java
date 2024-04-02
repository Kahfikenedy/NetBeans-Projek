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

public class Tugas2{
public static void main(String[]args){

 Scanner input = new Scanner(System.in);

 System.out.print("Masukkan Nilai =");
 int angka = input.nextInt();
  if(angka < 0)
  {
   System.out.println("" + angka + " Adalah bilangan negatif");
  }
  else if (angka >= 0)
  {
   System.out.println("" + angka + " Adalah bilangan positif");
  }
  else if (angka == 0)
  {
   System.out.println("" + angka + " Adalah bilangan nol");
  }

}
}

   

