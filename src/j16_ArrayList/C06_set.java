package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {
    public static void main(String[] args) {

        // set -> listin istenen elemanı update eder

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","losAngeles","Londra","stockholm"));

        System.out.println(listSehir.set(3, "Angara")); // set edilen deger print edilir
        System.out.println(listSehir); //list set edilmiş hali print edildi

        System.out.println(listSehir.set(11, "pataGONYA")); //olmayan ndex set edilirse rte verir
        System.out.println("listSehir = " + listSehir);








    }
}
