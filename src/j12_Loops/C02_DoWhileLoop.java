package j12_Loops;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        //TASK< girilen sayı 17 den kucuk ise " kazandınız " buyuk ise "kaybettiniz" print eden kodcreate ediniz

        //do while lopp ile print eden code create ediiniz

        Scanner sc=new Scanner(System.in);
        int sayi = 0;
        do {
            System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");

            sayi= sc.nextInt();



            sayi++;
        }while (sayi>=17);
        System.out.println(sayi+" için kazandınız... :) ");


















    }
}
