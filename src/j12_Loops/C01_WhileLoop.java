package j12_Loops;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

       /*
       baslangic be bitis degerleri net(bilinen) olan tekrarlarda for loop ama adım sayisi  belli olmayıp bir sarta
       yada duruma baglı olan tekrarlarda while loop kullanılmalı

        */

        // task 1 > 11 den 20 ye kadar olan tamsayıları print eden kod create ediniz
        System.out.println("for cozum");
        for (int i = 11; i <21 ; i++) {
            System.out.print(i+ " ");
        }

        System.out.println("while cozum");
        int basla=11; //while baslangıc degeri
        while(basla<21) {//basla 21 den kucuk oldugu sürece body action uygula
            System.out.print(basla+" ");
            basla++;//while dongu degisim komutu
        }

        // TASK 2 > 7 kere javaCAN print eden kod create ediniz

        int b=1;
        while (b<8){
            System.out.println(b+". javaCAN");
            b++;
        }


        // TASK 3 >  2 basamaklı tek sayıları yan yana print eden kod yazınız

        System.out.println("task 3");

        b=11;
        while (b<100) {
            System.out.print(b+" ");
            b+=2; //her iki artırmada b 11,13,...99 a kadar surekli tek sayo verir
        }

        /*
        2. cozum
        while (b<100) {
         //  System.out.print(b+" ");
         //  b+=2; //her iki artırmada b 11,13,...99 a kadar surekli tek sayo verir
            if (b%2==1) System.out.print(b+" ");
            b++;

        }

         */

       // TASK > girilen metni while loop ile tersten print eden code create ediniz

        System.out.println("task4");
      Scanner sc=new Scanner(System.in);
      String metin=sc.nextLine();
      int metinUzunluk=metin.length();
      while (metinUzunluk>=1){ //metnin son karakteri 0 a esit buyuk iken
            System.out.print(metin.charAt(metinUzunluk-1));
            metinUzunluk--;
        }

        // TASK5 girilen tamsayıya kadar tamsayıların toplamını print eden kode create ediniz
        System.out.println("task5");

        System.out.println("tamsayı giriyorsun");
        int sayi=sc.nextInt();
        int toplam=0;
        while (sayi>0){// sayı 1 olana dek
            toplam+=sayi; //her dongude sayiyi toplama ekle
            sayi--; //her dongude sayıyı 1 azalt ki sürekli donmesin

        }

        System.out.println("sayilar toplamı :" +toplam);

        //task 6 girilen tamsayının faktoriyelini print eden kod create ediniz

        int faktoriyel=1;
        while (sayi>0) { //sayi 1 olana dek body de ne varsa yap
            faktoriyel*=sayi; // her dongude sayıyı toplama ekle
            sayi--;// her dongude bir azalt ki domdukce donmesin
        }
        System.out.println("girdigin sayilar faktoriyeli :" +faktoriyel);














    }//main sonu
}
