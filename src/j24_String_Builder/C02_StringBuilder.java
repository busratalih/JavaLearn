package j24_String_Builder;

public class C02_StringBuilder {
    public static void main(String[] args) {

        // StringBuilder obj create etme...
        // 1. yol
        StringBuilder sb1=new StringBuilder();// default capacity 16 bit olan value'su olmayan  bos sb

        System.out.println("sb1.length() = " + sb1.length());//0 -> length(): sb 'deki karakter sayısı return eder

        System.out.println("sb1.capacity() = " + sb1.capacity());//16

        sb1.append("jAVATAR");//javatar sb1' eklendi
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//16

        sb1.append(" selam ").append("olsun").append(" ").append(24).append(" ").append(true);
        System.out.println("sb1 = " + sb1);// jAVATAR selam olsun24true
        System.out.println("sb1.capacity() = " + sb1.capacity());//34

        sb1.append(" basarı gayrete asıktır :)");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//70


        // 2. YOL

        StringBuilder sb2=new StringBuilder("fatih beye selamlar"); //ilk deger ataması yapılmış sb1 string builder objesi
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());


        // trim() -> fazladan ayrılan capacity silinir

        System.out.println("sb2.length() = " + sb2.length());
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity());

        // 3.YOL

        StringBuilder sb3=new StringBuilder(11); //hafızada 11 karakterlk yer ayıran bos sb tanımlandı
        System.out.println("sb3.length() = " + sb3.length()); //bos sb3 karakter sayısı=0
        System.out.println("sb3.capacity() = " + sb3.capacity());// 11
        sb3.append("ebubekir bey");
        System.out.println("sb3.capacity() = " + sb3.capacity()); //24


        // istenen bir karakter index i alma

        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));

        // belirli bir aralıktaki karakterleri alma

        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13)); //3. 4. 5. ......12 index karakterleri

        System.out.println("sb1.substring(17) = " + sb1.substring(17)); //17 ve sona kadar tum karakterler
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13)); // 3. 4. 5. ......12 index karakterleri

        // belirli bir index teki karakteri silme

        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3)); //3. index a karakter silindi
        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7)); //3.4.5.6.  index karakterler silindi

        // istenen karakter veya karakterleri eklemek
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(4,\":)\") = " + sb3.insert(4, ":)"));
        String s="guzel insan";
        System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s));
        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));

        StringBuilder sb4=new StringBuilder("nihan hanim");
        System.out.println("sb4.insert(5, \"qa team lead\", 0,2) = " + sb4.insert(5, "qa team lead", 0, 2));//nihanqa hanim

        // istenen index deki karakteri değiştirme
        sb4.setCharAt(6,'A');
        System.out.println("sb4 = " + sb4);//nihaqA hanim
        System.out.println("sb4.insert(6,\" \") = " + sb4.insert(5, " "));

        //istenen index'e karakter yerine birden cok karakter eklemek

        System.out.println("sb4.replace(8,10,\"hi\") = " + sb4.replace(8, 10, "hi"));

        //Sb obj String'e çevirme-> toString()

        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase());//EEL İBUB:)EKİR BEY->sb3 SB stringe cevirelerek toUppercase meth calıştı


        //String ile StringBuilder karsilastirmasi


        /*
        Compare iki sb'i esit mi diye kontrol etmek icin
        ilk harften baslayarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey return etmezken
        farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
        oldugunu print eder
        Tamamen ayni ise bize 0 return eder

        bir sb ile bir String'i compare etmek istersek Java CTE verir
         */

        StringBuilder sb5=new StringBuilder("javaCan");
        StringBuilder sb6=new StringBuilder("javaCan");
        String str1="javaCan";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6)); //0
        System.out.println("sb6.compareTo(new StringBuilder(str1)) = " + sb6.compareTo(new StringBuilder(str1)));//0
        // sb6.compareTo((str1)//CTE-> elam armut kıyası olamazzz


        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb5));// false
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6)); //true
        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString())); //true


    }
}
