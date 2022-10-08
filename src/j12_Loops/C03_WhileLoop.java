package j12_Loops;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

       // task> girilen tamsayının tam bolen sayısını print eden code create ediniz

        //20 >< 1,2,4,5,10,20 :  20 nın 6 tane tam boleni vardır
        // 30> 1,2,3,5,6,10,15,30 : 30 un 8 tane tam bolenı var

        Scanner sc=new Scanner(System.in);
        System.out.println("agam nassın bir tamsayı gir :");
        int sayi=sc.nextInt();
        int bolenSayi=1;
        int tamBolenAdedi=0;
        while (bolenSayi<=sayi){
            if (sayi%bolenSayi==0){//sayi bolensayıya tam bolunme sartı
                tamBolenAdedi++;
            }
            bolenSayi++; //loop sonsuza dusmemesi icin ve diğer sayıların boldugu kontrol edilmesi için yazıldı
        }

        System.out.println("agam girdigin" +sayi+"nın" + tamBolenAdedi+ "kadar tam boleni var :)");
















    }
}
