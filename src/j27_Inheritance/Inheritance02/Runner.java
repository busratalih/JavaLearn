package j27_Inheritance.Inheritance02;

import j27_Inheritance.Inheritance02.Kedi;


public class Runner {

    public static void main(String[] args) {
        Kedi k1 = new Kedi();
        System.out.println("k1.a = " + k1.a);
        System.out.println("k1.c = " + k1.c);
        System.out.println("k1.d = " + k1.d);
        System.out.println("k1.m = " + k1.m);


        k1.mA();
        k1.mC();
        k1.mM();

        Mammal k2 = new Kedi("a");
        k2.mA();
        k2.mC();
        k2.mM();

        Mammal k3 = new Kedi();
        Hayvancık k4 = new Kedi();
        Mammal m1=new Mammal();


    }


        /*
         Method cagirilirken ayni isimli methodlardan
         hangisinin kullanilacagina Constructor karar verir.
         Methodlari arastirmaya Consctuctor ismini tasiyan
         class'dan baslayin ve parentlarda arastirmaya devam edin.
         */

        /*
         Ayni isimli variable'lardan hangisinin kullanildi
        olusturulan object'in data type'ina göre bilinir
         Variable'i arastirmaya data type'i classindan baslanır.
        */















}
