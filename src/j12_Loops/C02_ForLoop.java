package j12_Loops;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        // girilen sayıdan 100 e jkadar 4 ün katı olan tamsayıları print eden kod create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("bir pozitif tamsayı giriniz");
        int sayi=sc.nextInt();

        if (sayi>100){
            System.out.println("agam hani 100 den kucuk girecektin");
        }else {
            for (int i = sayi; i <100 ; i++) {
                if (i%4==0){
                    System.out.println(i+" ");
                }

            }
        }















    }
}
