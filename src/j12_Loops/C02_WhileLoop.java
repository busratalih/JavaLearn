package j12_Loops;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

        //TASK girilen tamsayının rakamları toplamını print eden metod create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("agam nassın bir tamsayı gir :");
        int sayi=sc.nextInt();
        System.out.println(rakamTopla(sayi)); //method call





    }//main sonu

    private static int rakamTopla(int sayi) {

        int rakamToplamı=0;
        while (sayi>0) { //sayı 1 olana dek body action çalış
            rakamToplamı+=sayi%10; //sayının birler basamagı rakamtoplamına eklendi
            sayi/=10; //sayı bir basamak esiltildi
        }
        return rakamToplamı;
    }

}
