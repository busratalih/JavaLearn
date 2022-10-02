package j10_StringManipulations;

public class C_11_ValueOf_Parse {
    public static void main(String[] args) {


        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.


        // task string type verilen iki adet bagıs miktarını toplayan kod create ediniz

        String bagis1="1500";
        String bagis2="2500";
        int bagisDegeri1=Integer.valueOf(bagis1); //bagis1 string içindeki sayı degerini int e cevirdi bagis1 e atadı
        int bagisDegeri2=Integer.valueOf(bagis2);  //bagis2 string içindeki sayı degerini int e cevirdi bagis2 e atadı

        System.out.println("toplam bagis miktarı :" + (bagisDegeri1+ bagisDegeri2));

        int fetih=Integer.valueOf("1453");
        System.out.println(fetih);

        System.out.println("toplam bagis : " + (Integer.parseInt(bagis1) + Integer.parseInt(bagis2)));

        int tc=1234567;
        String strTc=String.valueOf(tc);
        System.out.println("strTc = " + strTc);
        System.out.println("strTc+ tc = " + strTc + tc);

        String  fiyat="$150";
        int yeniFiyat=Integer.valueOf(fiyat);
        System.out.println("yeniFiyat = " + yeniFiyat);


    }
}
