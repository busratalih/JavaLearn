package j20_PassByValue;

public class C01_PassByValue {

    public static void main(String[] args) {


       /*
       java pass by value bir programlama dilidir.
       Bir primitive variable argument olarak bir metoda call edildiğinde variable değil bir copy yanı clon
       (pointer) degeri gonderilir.
        */

        // task -> verilen fiyat icin %24 artırılmıs fiyatı print eden method create ediniz


        double fiyat=100; //primitive double type variable
        System.out.println("method call öncesi fiyat degeri = " + fiyat); //100
        fiyatArttır(fiyat); //fiyat variable method a parametre call edildi
        System.out.println("method call sonrasi fiyat degeri = " + fiyat); //100




    }//main sonu

    public static void fiyatArttır(double bisey){
        bisey*=1.24;
        System.out.println("arttırılmıs fiyat : " + bisey);
    }



}
