package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_ReplaceAll_Full {
    public static void main(String[] args) {


        //replaceAll() liste belirli birelemanı belirli bir deger ile update eder

        ArrayList<Integer> listSayi=new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));
        System.out.println("listSayi = " + listSayi); //replace öncesi
        Collections.replaceAll(listSayi, 1,20); //sayilistinde 1 yerine 20 atandı
        System.out.println("listSayi = " + listSayi); //replace sonrası


        // fill() listte tum elemanları  belirli bir degere update eder
        Collections.fill(listSayi, 33);
        System.out.println("listSayi = " + listSayi); //fill sonrası [33,33,....33]





    }
}
