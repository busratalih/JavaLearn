package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

       // Array copy.. copyOf(arr, newLenght) -> girilen array in new lenght kadar ilk elemanı kopyalar

       int sayi[]={63,21,47,27,35,12,36,31,46,24};

       int yeniArr[]= Arrays.copyOf(sayi,5); //[63, 21, 47, 27, 35]
        System.out.println("sayidan 5 eleman kopyalanan yeni arr : " + Arrays.toString(yeniArr)); //[63, 21, 47, 27, 35]

        int baskaArr[]=Arrays.copyOfRange(sayi,3,8); // 3 dahil 8 harıc index elemanlar kopyalanır ->3,4,5,6,7
        System.out.println("sayi arr'dan ozel kopyalanan baska Arr : " + Arrays.toString(baskaArr)); //[27, 35, 12, 36, 31]

        // Array i belirli bir eleman ile update(set) etme ....fill(arr,value);

        Arrays.fill(sayi,99); //
        System.out.println("sayi array i 99 ile fullenmis hali" +Arrays.toString(sayi)); //[99, 99, 99, 99, 99, 99, 99, 99, 99, 99]

        Arrays.fill(sayi,3,7,33); // 3.4.5.6. index elemanlar 33 ile update edildi
        System.out.println("sayi array i 3 ile 7 index arası 33 ile fullenmis hali" +Arrays.toString(sayi));


    }
}
