package j08_ifStament_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {

     /*
     Task-> girilen yasın 18 den buyukluğunu kontrol eden code create ediniz

      */

        Scanner sc=new Scanner(System.in);
        System.out.println("yasınızı giriniz :");
        int yas=sc.nextInt();
     //  if (yas<18) {
     //      System.out.println("yasiniz 18 den buyuk");
     //  }

    /*
    TASK-> girilen  yasın 18 den buyuklugunu kontrol eden code create ediniz 18 den kücük ise ehliyet alamazsınız print ediniz

     */

        if (yas>=18) { //girilen yasın 18 den buyuk ve esit olmasını kontrol eder
            System.out.println("yasınız 18 den kucuk değil");
        } else {
            System.out.println("ehliyet alamazsınız"); //if şartı sağlamazsa ->yas 18  den buyuk ve eşit değil
        }






















    }
}
