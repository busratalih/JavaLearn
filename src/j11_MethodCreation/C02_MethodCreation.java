package j11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {

        // task girilen üç notun ortalamasını hesaplayan metod create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("1. notunuzu giriniz : ");
        double not1=sc.nextDouble();

        System.out.println("2. notunuzu giriniz : ");
        double not2=sc.nextDouble();

        System.out.println("3. notunuzu giriniz :");
        double not3=sc.nextDouble();
        double ortalamanız=ortalamaHesapla(not1,not2,not3);
        System.out.println("ortalamanız :"  + ortalamanız);



    } // main sonu

    private static double ortalamaHesapla(double a, double b, double c) {
        return (a+b+c) /3;
    }




}
