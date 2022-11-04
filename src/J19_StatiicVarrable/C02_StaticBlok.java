package J19_StatiicVarrable;

        /*

       1-) static blok yapıları statıc variable'rı deger ataması update için kullanılır
       2-) statıc blok class olusturuldugunda butun methodlardan (main method hariç) önce calısır
       3-) birden fazla static blok varsa yukarıdan asagıya sıralama ile calışşır

        */

public class C02_StaticBlok {

    static  String isim="sefil haluk"; //gns gibi static var

    static  { //ilk calısacak statıc blok
        System.out.println("1.static blok calisti");
        isim="dilek";
        System.out.println("isim = " + isim);
    }


    static  { //2.calısacak blok
        System.out.println("2.static blok calisti");
        isim="ugur";
        System.out.println("isim = " + isim);
    }


    public static void main(String[] args) { //main basi

        System.out.println("main method basladi");

        isim="kerim";
        System.out.println("isim = " + isim);
        System.out.println("main method bitti");

    } //main sonu


}
