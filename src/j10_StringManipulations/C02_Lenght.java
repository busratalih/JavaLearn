package j10_StringManipulations;

public class C02_Lenght {
    public static void main(String[] args) {

        // lenght metodu girilen stringin uzunluğunu: içinde bulunan karakter sayısını return  / çıktı eder
        // bütün karakterleri sayıp adedini verir . (boşluk da dahil)

        String str= "madem geldin dünyaya otur çalış javaya";
        int strKrtrSayisi= str.length(); //int type bir data verir
        System.out.println(strKrtrSayisi);
        System.out.println(str);
        System.out.println(str.length());

        String str1="";
        System.out.println(str1.length()); //0

        String str2=" ";
        System.out.println(str2.length()); //1

      //  String str3=null;
      //  System.out.println(str3.length());// run time error

      // null case sensitive bir degerdir, yani Null veya NULL yazılamaz. null bir deger degildir. sadece hiçliği
        //// gösteren bir pointerdir.( giriş işaretçi)

        // TRICK



        String name;//declare edilmiiş ama atanmamış string çalışmaz cte verir
        // örnek =) name.concat(str1);































    }
}
