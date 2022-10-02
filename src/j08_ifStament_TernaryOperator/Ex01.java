package j08_ifStament_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        /*
        Task01
        girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */


        Scanner scanner=new Scanner(System.in);
        System.out.println("agam notunu gir :");
        int sayı= scanner.nextInt();





           if (sayı>0) {
               System.out.println("girilen sayı pozitif");//sayının buyuk olması şarta baglandı
//
          } else if (sayı<0) {
               System.out.println("girilen sayı negatif");// sayının sıfırdan buyuk olması halinde sıfırdan küçük olması sarta baglandı

           } else {
               System.out.println("girilen sayı sıfır");// sayının sıfırdan buyuk veya kucuk olmaması halinde kalan durum (sıfıra esit olması) sarta baglandı

           }
















    }


}




















