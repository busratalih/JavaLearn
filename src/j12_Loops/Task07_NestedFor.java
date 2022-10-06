package j12_Loops;

import java.util.Scanner;

public class Task07_NestedFor {
    public static void main(String[] args) {


        /*

        Task ->
    girilen boyuttta bir kare için
    Ekran Çıktısı
    Bir sayı giriniz: 7
    1 0 0 0 0 0 0
    0 1 0 0 0 0 0
    0 0 1 0 0 0 0
    0 0 0 1 0 0 0
    0 0 0 0 1 0 0
    0 0 0 0 0 1 0
    0 0 0 0 0 0 1


    Bir sayi giriniz: 5
    1 0 0 0 0
    0 1 0 0 0
    0 0 1 0 0
    0 0 0 1 0
    0 0 0 0 1

    şekli print eden code create ediniz



         */

        Scanner sc=new Scanner(System.in);
        System.out.println("kare icin boyut giriniz");

        int boyut=sc.nextInt();
        for (int i = 1; i <=boyut ; i++) { //apt
            for (int j = 1; j <=boyut ; j++) { //daire

                if (i==j){
                    System.out.print("1  ");
                }else System.out.print("0  ");


            }
            System.out.println();
        }















    }
}
