package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {
        // kullanıcıdan veri almak için 3 adım takip edilir
        // 1. scanner class dan obje create edilir

        //Scanner scan = new Scanner(System.in); // scanner classından scan isminde değerini system içinden alan bir obje
        
        //2. kullanıcıdan istenen veri içi bildirimde bulunulur , sout("...");

       // System.out.print("adınızı giriniz :");
        
        // 3. kullanıcının girdiği veri data tipine göre bir variable a atanır.
        
       // String isim= scan.nextLine();  // kullanıcıdan gelen string tipinde isim verisi scan objesini nextline() metoduyla atandı.

       // System.out.println("isim = " + isim);

        // TASK kullanıcının girdiği değere göre kare alanı ve çevresini hesaplayan bir code create ediniz..

        Scanner scanner= new Scanner(System.in); //1. adım
        //System.out.println("kare kenarı giriniz"); //2.adım
        //int kenar= scanner.nextInt(); //3.adım
       // System.out.println("alan :" +(kenar*kenar)+ "çevre :" +(kenar*4));



        /*
    Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
    Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
    1 seker = 1.7 gr
    Ornek : Input : cay sayisi : 10 seker sayisi :2
         Output : Yilda 12.41 kg seker kullaniyorsunuz
        */

      //  System.out.println("günlük içtiğiniz çay sayısını giriniz"); //çay için 2.adım
      //  int caySayısı= scanner.nextInt(); // çay için 3.adım
      //  System.out.println("şeker sayinizi giriniz : "); //şeker için 2.adım
      //  int seker= scanner.nextInt(); //seker için 3. adım
      //  System.out.println("yıllık seker tüketiminiz : "+(caySayısı*seker*1.7*365)/1000+"kg");




        //1. adım
        System.out.println("isminizi giriniz");


        String isim= scanner.nextLine(); // kullanıcının girdiği tüm satırı isim e atar
       // String ad= scanner.nextLine(); // kullanıcının girdiği tüm satırı ad a atar
        Scanner sc = new Scanner(System.in);//1. adım


       System.out.println("isminiz giriniz : ");//2. adım
       // char ch = sc.nextLine().charAt(0);// kullanıcıdan gelen string ifadenin 0. index ilk  karakteririni alır
       // System.out.println("isminizin ilk karakteri :" + ch);
       // String isim=sc.nextLine();//kullanıcını girdiği tüm satırı isim'e atar
       String ad = sc.next();//kullanıcını girdiği ilk ifadeyi  ad'e atar
       System.out.println("ad = " + ad);
       // System.out.println("isim = " + isim);
























    }
}
