package j12_Loops;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

       /*
       while loop-> önce sart kontrol edilir, sart sonucu true alınırsa body aksiyonu çalışır
       do while loop> önce body aksiyon calısır sonra sart kontrol edilir. sart true ise dongu devam eder
       sart false ise dongu kırılır ve donguden sonraki ilk satır çalışır
       do While loop > game app de daha çok kullanılır.
       TRİCK : While loop sart saglanmazsa hic calışmayabilir ama doWhile sart saglasın saglamasın en az bir kez calısır

        */

        int yas=33;
        while (yas<33) {
            System.out.println("agam yas " +yas+" 33 gayet basarılı :)");
            System.out.println("while body action ....");
            yas++;
        }

        do {
            System.out.println("agam yas 33 gayet basarılı ");
            System.out.println("do while body action");
        }while (yas<33);


















    }
}
