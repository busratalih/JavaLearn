package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_IndexOf {
    public static void main(String[] args) {

        // index(of) -> list icinde istenen elemanın index ddgerini return eder

        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","losAngeles","Londra","stockholm"));

        System.out.println(listSehir.indexOf("Londra")); //2
        System.out.println(listSehir.indexOf("Ankara"));//-1 listte olmayan eleman index i -1 return eder
        System.out.println(listSehir.indexOf("Manisa"));//-1 listte olmayan eleman index i -1 return eder
        System.out.println(listSehir.indexOf("manisa"));//-1 listte olmayan eleman index i -1 return eder
        listUlke.add("Amerigonya");
        System.out.println("listUlke = " + listUlke);
        System.out.println(listUlke.indexOf("Amerigonya")); //1 ->  tekrarlı elemanlarda soldan(bastan) ilk bulunan eleman index i return eder

        System.out.println(listUlke.lastIndexOf("Amergonya")); //sagdan(sagdan) ilk bulunan elemanın index i returnn eder




    }
}
