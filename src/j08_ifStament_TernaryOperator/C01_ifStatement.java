package j08_ifStament_TernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {


        int krmYas = 45;
        int ismlYas = 63;
        if (krmYas == ismlYas) {
            System.out.println("aynı yastasınız guzel insanlar");
            System.out.println("yoksa siz ikiz misiniz?");
        }
        if (krmYas >= 40) {  //ilk noktalı virgüle kadar çalışır
            System.out.println("krm bey olgunluk yasindasiniz");
            System.out.println("bu yazıyı okuduysanız 12. satırdaki if den bagımsız"); //if den bağımsız
        }

        // if blokta {} kullanılmazsa ilk ; e kadar olan komut çalışır veya çalışmaz alt satırdan devam eder

        if (krmYas + ismlYas > 100) {
            System.out.println("krm bey ve ismail bey yaslari toplamı 100 den buyuk");
        }

        System.out.println("selam javacanlar"); //bağımsız komut

        //ctrl+alt+l--> code reformat java format

        /*

        Bagımsız if statement yapılarısadece kendi scop(kapsamlarını) run eder.
        Birden fazla bagımsız if statement yapıları hepsinin body çalışabileceği gibi hiçbirisini body de çalışmayabilir.

         */
































    }
}
