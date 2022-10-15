package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty_Clear {
    public static void main(String[] args) {

        //isEmpty listin bos olmasını kontrol eder true/false return eder

        // clear listin butun elemanlarını siler

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "Londra", "stockholm"));
        System.out.println("listSehir = " + listSehir);// [Münih, losAngeles, Londra, stockholm]

        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty());//list boşlugu kontrol edildi-> false

        listSehir.clear();// list temizlendi

        System.out.println("listSehir = " + listSehir);// []

        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty());//true









    }
}
