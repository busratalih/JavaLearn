package j15_Arrays;

import java.util.Arrays;

public class C06_MultiDArray {
    public static void main(String[] args) {

        /*
        Çok Boyutlu Diziler
        Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
         Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
         formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
         matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
         satır ve sütun sayısını girmemiz yeterli olacaktır.
        * TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
        Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

       * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer array-> kat bilgisi
       *  icerdeki  array'lere  inner array denir ->daire
       * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
       *  Array'i ancak tum elemenlari atanarak declare edilmeli
       * 3- Multi dimensional array'de bir elemanin indexi icin
       *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
       */

        // Md tanımlama.
        int arr1[][]=new int[3][5]; //3 katlı her kakatta 5 dairesi olan bos apt -> 3 satır 5 sutun bir tablo

        // bir sitede her birinde 10 dairelik 6 katlı apt var . nasıl array olarak tanımlanır ->uc boyutlu array
        // trıck array i uzunlukları ile tanımlamak ıcın inner(daire) uzunlugu aynı olmalı

        int site[][][]=new int[6][8][10];

        // 24 kisilik 3 sınıf ve 21 kısılık 5 sınıfı olan okul nasıl array olarak tanımlanır
        int sınıf24[][]=new int[3][24]; //24 kısılık 3 bos sınıf
        int sınıf21[][]=new int[5][21]; // 21 kısılık 5 bos sınıf

        //MdArray eleman ekleme.....
        arr1[2][4]=35; //2.kat 4.daire degeri 35 atandı
        arr1[0][3]=34; //0.kat 3. daire degeri 34 atandı
        System.out.println(arr1[0][3]); //34

        //elemanları girilerek Array tanımlama

        int arr[][]={{1,2,3},{10,20},{101}}; // 3 katlı apt
        // 101-> eleman index i -> arr[2][0]

        // MdArray elemanları print etme.....

        System.out.println(arr[1]); // I@19dfb72a arr[1] biir array oldugu ıcın dogrudan somut komutu arr[1] in referansını verir

        System.out.println(Arrays.toString(arr[1])); // [10,20]
        System.out.println(arr[1][0]); //10
        // Multidimensional array'leri yazdirmak icin toString methodu kullanilamz
        //  toString methodu outer methodu Stringe cevirir
        // outer arrayin icinde inner arrayler oldugundan toString methodunda inner array'lerin
        // referans degerlerini yazdirilir

        //MultiDimensional Array'lerde istenen bir eleman nasil yazdirilir.

        System.out.println(Arrays.toString(arr)); //referans
        System.out.println(Arrays.deepToString(arr)); //[[1, 2, 3], [10, 20], [101]]




    }
}
