package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {

    public static void main(String[] args) {

       //get() listte istenen index elemanı return eder (arr[3] arr in 3. indexteki elemanı ver

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","losAngeles","Londra","stockholm"));
        System.out.println(listSehir.get(1)); // LosAngeles
        System.out.println(listSehir.get(11)); //olmayan index elemanı rte verir


    }
}
