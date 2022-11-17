package j33_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        /*
        LinkedList....
        1-) LinkedList'te elemanlar "data" ve"adres" olmak üzere iki kısımdan olusur ve elaman yerine node olarak
        tanımlanır.
        2-) LinkesList'te ilk not data barındırmayan sadece adres bulunduran head node tanımlanmıştır.
        3-) LinkedList'te son node adres kısmı null olan sadece data bulunduran tail node tanımlanmıştır.
        4-) ArrayList searching LinkedList node ekleme ve silmede daha avantajlıdır.LinkedList eleman bulmada index yapısı
        olmadıgı için basarısızdır.
        5-) LinkedList -> tren vagon ilişkisi baglantısı gibi düşünülebilir.
        6-) Collection obje tanımlanırken constracter Class(LinkedList, ArrayList,...) olmalı, interface (List, Queue...)
        olmamasına dikkat edilmeli ancak obje DataType olarak parent interface tanımlanabilir.
        7-) LinkedList class iki tane parent interface(List, Queue) implement etmiştir.
         */

        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("Ebubekir", "Gulsum", "Adem", "Ilker", "Merve")); //LinkedList->declare+assaigment
        //LinkedList print...
        System.out.println("ll1 = " + ll1);

        //LinkedList add();

        ll1.add("Ugur");
        System.out.println("ll1 = " + ll1);

        ll1.add(2,"Busra");
        System.out.println("ll1 = " + ll1);

        ll1.addFirst("jAVACAN");
        System.out.println("ll1 = " + ll1);

        ll1.addLast("JAVATAR");
        System.out.println("ll1 = " + ll1);

        List<String> ll2=new LinkedList<>(Arrays.asList("Fatih", "Erol","Nur"));//DataType interface list olan LinkedList
        ll1.addAll(ll2);
        System.out.println("ll1 = " + ll1);//[jAVACAN, Ebubekir, Gulsum, Busra, Adem, Ilker, Merve, Ugur, JAVATAR, Fatih, Erol, Nur]
        ll1.addAll(3,ll2);
        System.out.println("ll1 = " + ll1);//[jAVACAN, Ebubekir, Gulsum, Fatih, Erol, Nur, Busra, Adem, Ilker, Merve, Ugur, JAVATAR, Fatih, Erol, Nur]


    }
}
