package j32_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {

       List<String> l1=new ArrayList<>(Arrays.asList("nur","gamze","erol","bekir"));
        System.out.println("l1 list ilk hali = " + l1); //nur, gamze, erol, bekir

        //l1 elemanları for loop ile print ediniz

        for (int i = 0; i <l1.size() ; i++) {
            System.out.println(l1.get(i) + " ");
        }
        System.out.println("    ***   ");

        //l1 elamanları foe-each ile print ediniz
        for (String w:l1) {
            System.out.println(w+" ");//nur gamze erol bekir
        }
        System.out.println();
        System.out.println("   ***   ");


        //l1 elemanı :) for loop ile update print ediniz

        for (int i = 0; i <l1.size() ; i++) {
            l1.set(i, l1.get(i)+ ":)");
        }

        System.out.println("l1 :) update sonrası : " + l1);//[nur:), gamze:), erol:), bekir:)]

        System.out.println();
        System.out.println("    ****    ");

        //l1 herbir elemanı :( for-each loop ile update edip print ediniz

        for (String w:l1) {
            w+=":(";
        }
        System.out.println("l1 :( update sonrsı :" +l1);

        /*
        index desteklemeyen yapılarda tekrarlayan aksiyon için for-each loop update yapamayabilir, yukarıdaki task de oldugu gibi
        Bu durumda java iterator interfacesinden tanımlanacak variable ile bu tekrarlayan aksiyonlar index olmadan yapılır
         */

        System.out.println();
        System.out.println("    **** iterators ****   ");

        Iterator<String> it1=l1.iterator(); //iterator intefaceden it1 variable tanımlandı. Atama olarak l1 elemanları atandı
        while (it1.hasNext()){//it1 elemanları için pointer oldugu yerde eleman varsa true yoksa false verir ve pointer bir sonrakieleman önune koyulur, hasnext() bunu yapar
            //next methodu listin pointer onundeki elemanını return eder
            System.out.print(it1.next() + " ");//nur:) gamze:) erol:) bekir:)
        }
        System.out.println();
        System.out.println("    **** iterators ****   ");


        List<String> l2=new ArrayList<>(Arrays.asList("baran","gulsum","akif","nazim"));

        // l2 elemanlarını iterator ile silip print ediniz -> l2=[]

        System.out.println("iterator oncesi l2 : "+ l2); // [baran, gulsum,akif,nazım]
        Iterator<String> it2=l2.iterator();
        while (it2.hasNext()){
            it2.next();// tekrardaki pointer onundeki elemanı verir
            it2.remove();//next() ile gelen elemanı siler


        }

        System.out.println("iterator remove sonrasi : "+ l2); //[]

        List<String> l3=new ArrayList<>(Arrays.asList("baran","gulsum","akif","nazim"));
        //l3 elemanlarını iterator ile :) set edip prrint ediniz [baran :), gulsum :), akif :), nazim:)]
        System.out.println("iterator oncesi l3 : "+ l3); //
        ListIterator<String> it3=l3.listIterator(); // tekrar iterator yapisi tanımlandı

        while (it3.hasNext()){

            it3.set(it3.next()+ ":) "); //tekrardaki next ile gelen elemanı :) concat ederek update edildi
        }


        System.out.println("iterator set sonrasi l3 :" +l3);


        List<String> l4=new ArrayList<>(Arrays.asList("serhat","yakup","mustafa","nazli"));
        System.out.println("iterator oncesi l4 : "+ l4); //

        // l3 elemanlarının ilk harfi buyuk kln 3 harfi *** karakteri ve l4 listi ekleyip print ediniz

        ListIterator<String> it4=l3.listIterator(); //ekrar iterator yapisi tanımlandı

        while (it4.hasNext()){
            it4.set(it4.next().toUpperCase().charAt(0)+"***"); //next() ile gelen l4 elemanı ilk harfi byk kalan 3 harf ** ile set edildi
            it4.add(l4.toString());// tekrardaki update edilebilen l3 ve l4 add edildi
        }

        System.out.println("list literator set ve add sonrasi l3 :" +l3); //[baran :), gulsum :), akif:), nazim :)]




    }
}
