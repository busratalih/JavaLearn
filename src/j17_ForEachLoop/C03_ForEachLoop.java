package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        // TASK iki string array elemanlarının ortak olmasını kontrol eden kod create ediniz with foreach

        String arr1[] = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String arr2[] = {"musty", "gülsüm", "ayşe", "enise", "cüneyt", "ciğdem"};
        List<String > ortakIsim=new ArrayList<>();//ortak ısımlerin atanacagı boş list
        for (String str1:arr1){
            for (String str2:arr2){
                if (str2.equalsIgnoreCase(str1)){//her bir çekirdek eşitliği kontrol
                    ortakIsim.add(str2);
                }
            }
        }
        if (ortakIsim.isEmpty()){//ortak isim list boşluk kontrol
            System.out.println("ararylerinizde ortak isim yok "+ortakIsim);
        }else System.out.println(ortakIsim);


/* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        int arr[] = {1, 2, -3, 4, -5, -6};

        syınınTersi(arr);
    }

    private static void syınınTersi(int[] arr) {

        for (int a:arr){
            a*=-1;
            System.out.print(a+" ");
        }


















    }
}
