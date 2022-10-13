package j15_Arrays;

public class Task17 {
    public static void main(String[] args) {

    // Task sayi arraydaki en buyuk elemanı print eden kod create ediniz

    // task-> sayi arr'deki en buyk elemanı print eden code create ediniz...
        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};//24

        int maxEleman=sayi[0][2];//3
        for (int kat = 0; kat < sayi.length; kat++) {

            for (int daire = 0; daire < sayi[kat].length; daire++) {

                if (sayi[kat][daire]>maxEleman){

                    maxEleman=sayi[kat][daire];
                }
            }
        }
        System.out.println(maxEleman);//24














    }
}
