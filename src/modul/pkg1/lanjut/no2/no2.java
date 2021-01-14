/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg1.lanjut.no2;
import java.util.Scanner;
/**
 *
 * @author MOKLET-1
 */
public class no2 {
   public static void main(String[]args){
   Scanner masukan= new Scanner (System.in);
   int pilihan=9;
   do{
       System.out.println("/n Menu Luas Bangunan /n");
       System.out.println("1. Menghitung luas persegi");
       System.out.println("2. Menghitung luas persegi panjang");
       System.out.println("3. Keluar");
       System.out.print("Masukan pilihan anda: ");
       pilihan = masukan.nextInt();
       switch (pilihan){
           case 1 : luaspersegi ();break;
           case 2 : luaspersegipanjang ();break;
       }
   }while (pilihan !=3);
   }
   private static void luaspersegi(){
       Scanner masukan= new Scanner (System.in);
       float sisi,luas;
       System.out.println("Masukan nilai sisi: ");
       sisi = masukan.nextFloat();
       luas = sisi*sisi;
       System.out.println("Luas persegi adalah: "+luas);
   }
   private static void luaspersegipanjang (){
       Scanner masukan= new Scanner (System.in);
       float panjang,lebar,luas;
       System.out.println("Masukan nilai panjang: ");
       panjang = masukan.nextFloat();
       System.out.println("Masukan nilai lebar: ");
       lebar = masukan.nextFloat();
       luas = panjang*lebar;
       System.out.println("Luas persegi panjang adalah: "+luas);
       
   }
   
}
