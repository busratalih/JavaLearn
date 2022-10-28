package j23_Varargs_String_Buider;

public class C01_Varargs {
    public static void main(String[] args) {

        /*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        meyhod budy....
        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

          Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli
         */

        // Task -> verilen iki toplamını print eden METHOD create ediniz


        int sayi1=24;
        int sayi2=27;
        int sayi3=46;
        int sayi4=10;
        topla(sayi1, sayi2);
        topla(sayi3, sayi2);
        topla(sayi1, sayi4);

        // Task -> verilen üç sayi toplamını print eden METHOD create ediniz

        topla(sayi1,sayi4,sayi3);
        System.out.println("***** varargs method *****");
        toplaVarargs(sayi1, 23,sayi2);//4p
        toplaVarargs(44,23,62,sayi1,sayi3);// 5 p
        toplaVarargs(sayi2,sayi3);// 2 p


        // Task-> verilen String lerin en fazla karakter sayısını print eden method create ediniz >>parametre sayısı belirli degil
        enUzuuunKelime("aga","fatih","zeyyid");
        enUzuuunKelime("sümeyra","cebrail","ali");





    }//main sonu

    public static void topla(int a, int b){ //iki parametreli
        System.out.println("sayilar toplami :" + (a+b));
    }
    public static void topla(int a, int b, int c){ //iki parametreli overload method
        System.out.println("sayilar toplami :" + (a+b+c));
    }

    public static void toplaVarargs(int ... a){
        int toplam=0;
        for (int w:a){
            toplam+=w; //varargs parametre arr içinde tanımlandığı için parmetreler loop aksiyon alır
        }
        System.out.println("sayilarin toplami :" + (toplam));
    }

    public static void enUzuuunKelime(String ... str){
        String enUzun="";
        for (String w:str){
            if (w.length()>enUzun.length()){
                enUzun=w;
            }
        }
        System.out.println("en uzun kelime :"+enUzun);

    }





}
