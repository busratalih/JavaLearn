package j08_ifStament_TernaryOperator;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        /*
    girilen bir yılın artık (leap year) olmasını kontrol eden code create ediniz..
    artık yıl:
    Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
    Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
    Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("agam yılını gir :");
        int yıl= scanner.nextInt();
        // 4 ün katı      100 ün katı olmaması   400 ün katı olması
        if ((yıl%4==0) && (yıl %100!=0) || (yıl%400==0)) {
            System.out.println("girdiginiz yıl artık yıl");
        }else {
            System.out.println("girdiginiz yıl artık yıl degildir");
        }




























    }
}
