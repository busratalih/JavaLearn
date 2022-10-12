package j15_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

       //Array elemanı varlıgını kontrol etme.....
       int arr[]={67, 97, 20, 63, 43, 34,54,24,16,7,55,17};

       int sayi=33;

       boolean flag=false; // bayrak

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==sayi){
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println("aradıgınız sayi arrayde var");
        }else {
            System.out.println("aradıgınız sayi arrayda yok");
        }

        Arrays.sort(arr); //array elemanları sıralandı
        System.out.println(Arrays.toString(arr)); // [7,16,17,20,24,34,43,54,55,63,67,97]
        System.out.println(Arrays.binarySearch(arr, 34)); //method aranan elemanı array da arayıp İNDEX RETURN EDER
        System.out.println(Arrays.binarySearch(arr, 16)); //method aranan elemanı array da arayıp İNDEX RETURN EDER
        System.out.println(Arrays.binarySearch(arr, 21)); //method aranan elemanı array da arayıp İNDEX RETURN EDER
        System.out.println(Arrays.binarySearch(arr, 99)); //method aranan elemanı array da arayıp İNDEX RETURN EDER

        // trıck binarySearch metodu arrayde olmayan elemanı çalışırsa sonuc olarak :eger bu eleman
        //arrayda olsaydı kacıncı sırada olurdu cevabını verirdi




















    }
}
