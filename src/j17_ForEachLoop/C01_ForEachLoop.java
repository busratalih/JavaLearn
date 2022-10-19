package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {


        /*
        for each loop for loop un gelişmiş halidir
        1. clean code -yazım kolaylığı
        2. code okuma kolaylığı
        3. hata yapma riskini azaltır

         */

        List<Integer> sayiList=new ArrayList<>(List.of(16,5,2,33,22,27,41,24));
        // task list elemanlarını aralarını ayrı satırlara pr,nt ediniz

        for (int i = 0; i <sayiList.size() ; i++) {
            System.out.println(sayiList.get(i) + " ");
        }

        for (Integer a : sayiList){
            System.out.println(a+ " ");
        }

        System.out.println("******TASK2*****");
        // task list elemanlarının ilk uc eleman hariç tek olanları print ediniz

        for (Integer a : sayiList.subList(3, sayiList.size())){
            if (a%2==1){
                System.out.println(a+" ");
            }
        }


        System.out.println("******TASK3*****");

        // task list elemanlarının 2 İLE 5 index arasındaki (2,3,4,5) elemanların  toplamını  print ediniz

        int toplam=0;
        for (int a:sayiList.subList(2,6)){
            toplam+=a;
        }
        System.out.println("toplam = " + toplam);









    }
}
