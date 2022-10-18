package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C14_ListConvertArray {
    public static void main(String[] args) {


        //list i array e cevirme-> toArray();
        //1. yontem-> toArray();parametre olarak String[0] olarak yapılır

        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));
        String arrUlke[]=listUlke.toArray(new String[0]); //ulkeList i elemanları artık arrUlke olark atandı

        System.out.println("listUlke = " + listUlke); //[Alamanya, Amerigonya, ingiltere, isvec]
        System.out.println("Arrays.toString(arrUlke) = " + Arrays.toString(arrUlke)); //[Alamanya, Amerigonya, ingiltere, isvec]

        // 2. Yontem ; olusturulan Array in data type ı object olarak atanır
        //Trick -> object class javada tum class ların parent (atası)
        //object class javada parent i olmayan tek class tır. (tum vgonları çeken ama çeklmez lokomotif
        //String Integer Class lar object class child i oldugu için istenen durumlarda data type olarak object class kullanılabilir

        Object arrUlkeler[]=listUlke.toArray();
        System.out.println("Arrays.toString(arrUlkeler) = " + Arrays.toString(arrUlkeler));//[Alamanya, Amerigonya, ingiltere, isvec]


    }
}
