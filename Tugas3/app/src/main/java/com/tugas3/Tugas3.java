package com.tugas3;

import com.tugas.ruang.Balok;
import com.tugas.ruang.Kerucut;
import com.tugas.ruang.MenghitungRuang;
import com.tugas3.bidang.Lingkaran;
import com.tugas3.bidang.MenghitungBidang;
import com.tugas3.bidang.PersegiPanjang;
import java.util.Scanner;

public class Tugas3 {

  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   char pilih;int p,l,t;float j,t1;
   MenghitungRuang mr;
   MenghitungBidang mb;
   do{
     System.out.println("INPUT");
     System.out.println("1. BALOK");
     System.out.println("2. KERUCUT");
     System.out.println("3. EXIT");
     System.out.print("PILIH : ");
     pilih=sc.next().charAt(0);
     switch (pilih){
       case '1':System.out.print("PANJANG = ");p=sc.nextInt();
                System.out.print("LEBAR   = ");l=sc.nextInt();
                System.out.print("TINGGI  = ");t=sc.nextInt();
                PersegiPanjang persegi=new PersegiPanjang(p,l);
                Balok balok=new Balok(p,l,t);
                mb=persegi;
                mr=balok;
                System.out.println("__________OUTPUT__________");
                System.out.println("LUAS PERSEGI         : "+mb.Getluas());
                System.out.println("KELILING PERSEGI     : "+mb.Getkeliling());
                System.out.println("VOLUME BALOK         : "+mr.Getvolume());
                System.out.println("LUAS PERMUKAAN BALOK : "+mr.Getpermukaan());
                break;
       case '2':System.out.print("JARI-JARI = ");j=sc.nextFloat();
                System.out.print("TINGGI    = ");t1=sc.nextFloat();
                Lingkaran lingk=new Lingkaran(j);
                Kerucut kerucut=new Kerucut(j,t1);
                mb=lingk;
                mr=kerucut;
                System.out.println("__________OUTPUT__________");
                System.out.println("LUAS LINGKARAN         : "+mb.Getluas());
                System.out.println("KELILING LINGKARAN     : "+mb.Getkeliling());
                System.out.println("VOLUME KERUCUT         : "+mr.Getvolume());
                System.out.println("LUAS PERMUKAAN KERUCUT : "+mr.Getpermukaan());
                
                break;
       case '3':System.out.print("Bye bye...");
                break;
       default:System.out.println("!!ERROR INPUT!!");
     }
     if(pilih=='1'||pilih=='2'){
      System.out.print("Kembali ke menu ?(y/n) ");
      pilih=sc.next().charAt(0); 
     }else if(pilih!='3')System.out.print("Bye bye...");
   }while(pilih=='y'||pilih=='Y');
  }
}

