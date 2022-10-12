package j15_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        /*
        Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
        Array olusturulurken 2 seyi declare etmeliyiz:
        1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
        2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
        array= tepsiye benzer..
        Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
         isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
         */

        // array tanımlama
        int a; // declare edilen ama atnmayan prmitive data
        int sayiArr[]; // declare tanımlanan edilen ama atanmayan int type array
        //tanımlanan array atama yapılmadan kullanılamaz...


        String isimArr[]= {"muharrem", "enise", "cebrail", "nazım", "ozge"} ; // hem tanımlama hem atama yapılan string array
        //String [] isimArr1= {"muharrem", "enise", "cebrail", "nazım", "ozge"} ; // hem tanımlama hem atama yapılan string array

        int sayıArr[]=new int[5]; //java heap memory de 5 default-> olan int array create edildi
        //[0,0,0,0,0]


        // Array a eleman ekleme.....
        sayıArr[2]=34;
        sayıArr[0]=35;
        sayıArr[1]=34;
        sayıArr[3]=61;

        sayıArr[0]=34; //0 index array elemanı 34 degeri ile update edildi
        //array elemanları unique olmak zorunda degildir tekrarlı array elemanı olabilir

        //array eleman sayısı boyut degeri...

        System.out.println("sayıArr.length = " + sayıArr.length); //5


        // Array son elemanı.....

        System.out.println("array son eleman " + isimArr[isimArr.length - 1]); //ozge

        isimArr[isimArr.length-1]="qa ozge hanim"; //array son eleman update edildi

        // Array de olmayan eleman....

       // sayıArr[11]=23; //cte vermez ama olmayan eleman rte verir>> array run time da olusur

        //Array elemanları print etme......

        for (int i = 0; i < isimArr.length ; i++) {
            System.out.print(isimArr[i]+ " ");
        }
        System.out.println("isimArr = " + isimArr); // [Ljava.lang.String;@614c5515> isimArr referans degeridir

        Arrays.toString(isimArr); //isim array stringe cevrildi
        System.out.println(Arrays.toString(isimArr)); //isim array stringe cevrildi

        //task-> sayıArr elemanlarından degeri tek olanları print eden code create ediniz

        for (int i = 0; i < sayıArr.length; i++) {
            if (sayıArr[i] % 2 == 1) {
                System.out.println(sayıArr[i] + " ");
            }
        }
        // task-> sayıArr cift index  elemanları  print eden code create ediniz.
        for (int i = 0; i < sayıArr.length; i+=2) {
            System.out.print(sayıArr[i] + " ");//34 34
        }
        // task-> isimArr 5 harfli elemanlarında oluşan arrayın  elemanlarını  print eden code create ediniz.
        String yeniArr[]= new String[isimArr.length];//isimArr elemanı kadar boş yeni arr
        int koltukSayısı=0;
        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length()==5){
                koltukSayısı++;//yeniArr[i]=isimArr[i];
            }
        }
        System.out.println(koltukSayısı);//2
        //  System.out.println(Arrays.toString(yeniArr));//

        // array elemanlarını naturel (k->b: ascending b->:descending, alfabetik) sıralama
        System.out.println(Arrays.toString(isimArr)); // sıralama öncesi  [muharrem, enise, cebrail, nazım, QA Özge hanım]
        Arrays.sort(isimArr);// isim array elemanları naturel sıralama yapıldı
        System.out.println(Arrays.toString(isimArr)); //sıralama sonrası [QA Özge hanım, cebrail, enise, muharrem, nazım]

        System.out.println(Arrays.toString(sayıArr));//sıralama öncesi sayıArr->[34, 43, 34, 99, 0]
        Arrays.sort(sayıArr);// sayıArr k-> b sıralandı
        System.out.println(Arrays.toString(sayıArr));//sıralama sonrası sayıArr-> [0, 34, 34, 43, 99]















    }
}
