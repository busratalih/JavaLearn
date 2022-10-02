package j08_ifStament_TernaryOperator;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        /*

        Task KULLANICININ CİNSİYETİ KADIN İSE 60 YASINDAN BUYUK VE PRİM GUNU 6000 DEN FAZLA İSE EMEKLİLİĞİNİ
        KULLANICININ CİNSİYETİ erkek İSE 65 YASINDAN BUYUK VE PRİM GUNU 7000 DEN FAZLA İSE EMEKLİLİĞİNİ kontrol
        edip kalan yıl ve prim gununu print eden code create ediniz

         */

        Scanner sc = new Scanner(System.in);

        System.out.print("cinsiyetiniz \n KADIN için-> K\n ERKEK için-> E\n giriniz : ");
        char cnsyt = sc.next().charAt(0);



        if (cnsyt == 'K') {//cinsiyetin kadın olması kontrol edildi
            System.out.println("yasınızı giriniz : ");
            int yas = sc.nextInt();
            if (yas > 60) {//yasın 60 dan buyuklugu kontrol edildi
                System.out.print("prim gununuzu giriniz :");
                int primGunu = sc.nextInt();

                if (primGunu > 6000) {//prim gunu 6000 den buyuk olması kontrol edildi
                    System.out.println("tebrikler NİNEM emekli oldunuz haydı emekli parasını torunlara yedirmeye :) ");
                } else System.out.println("emeliliğiniz için: " + (6000 - primGunu) + " gun  yatırmanız lazım");

            } else System.out.println("emekliliğinize daha : " + (60 - yas) + " yıl daha var");

        } else if (cnsyt == 'E') {
            System.out.println("yasınızı giriniz : ");
            int yas = sc.nextInt();
            if (yas > 65) {//yasın 65 dan buyuklugu kontrol edildi
                System.out.print("prim gununuzu giriniz :");
                int primGunu = sc.nextInt();

                if (primGunu > 7000) {//prim gunu 7000 den buyuk olması kontrol edildi
                    System.out.println("tebrikler DEDEM emekli oldunuz haydı emekli parasını torunlara yedirmeye :) ");
                } else System.out.println("emeliliğiniz için: " + (7000 - primGunu) + " yatırmanız lazım");

            } else System.out.println("emekliliğinize daha : " + (65 - yas) + " yıl daha var");


        } else System.out.println("agam ne oldugunu yaz ona göre emekli edeyim seni :( ");






















    }
}
