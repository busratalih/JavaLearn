package j12_Loops;

import java.util.Scanner;

public class Task12_For {
    public static void main(String[] args) {

      /*

      Girilen bes sayinin 10 ile 20 arası haric digerlerinin toplamini hesap eden kod create ediniz

       */

        Scanner sc = new Scanner(System.in);
        int toplam=0;// ik değeri 0 olan toplama etki etmeyecek bir variable ...

        for (int i = 1; i <=5 ; i++) {
            System.out.print(i+". sayıyı giriniz : ");
            int sayı=sc.nextInt();
            if (sayı<=10 || sayı>=20){
                toplam+=sayı;
            }//if sonu
        }//for sonu
        System.out.println("girdiğiniz sayıların istenen şartta toplamı : "+toplam);













    }
}
