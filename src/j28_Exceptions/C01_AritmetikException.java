package j28_Exceptions;

import java.util.Scanner;

public class C01_AritmetikException {

    public static void main(String[] args) {

    //   // Aritmetik Exception : matematiksel işlemlerde oluşan rte exceptiondur

    //   String str="";
    //  // str.charAt(2);//RTE verir
    //   Scanner sc=new Scanner(System.in);
    //   System.out.println("agam 1. sayi gir :");
    //   int sayi1=sc.nextInt();
    //   System.out.println("agam 2. sayi gir :");
    //   int sayi2=sc.nextInt();

    //   int oran=sayi1/sayi2;// rte aritmetik exception by zero
    //   System.out.println(oran);

    //   try{// dene-> hatanın olma ihtimali oldugu block
    //       /*
    //       1-)try-catch kullanıldıgında try block hatasız çalışırsa catch blok asla çalışmaz, catch blok try blok
    //       exception hata yakalarsa çalışır.
    //       2-) try blok catch veya finally blok olmadan CTE verir.try blok'tan sonra fazla catch blok tanımlanabilir
    //       Aynı anda sadece bir catch blok çalışabilir. Hiçbir catch blok çalışmaya da bilir.
    //       3-) parent-child ilşkisi olan catchlerde child önce yazılmalı aksi halde CTE.
    //        */

    //      oran=sayi1/sayi2;// try blok da hata yakalandığı satırdan sonr try diğer satırlar değil ilgili catch blok çalışır
    //       System.out.println(oran);
    //       System.out.println("agam try bloktan selamlae");

    //


    //   }catch (Exception ebikGabık) {//exception class tum exceptionlarınız parent class ->bad practis
    //       // hata yakalandıgında yapılacak aksıyonların oldugu bloktur
    //   }

    //   // Exception->olusan hata Data type
    //   //ebikGabık -> javanın olusan

    //   System.out.println("agam nişledingg 0 hiç böler mi :( ");
    //   System.out.println("agam catck block'tan selamlar :) ");


    // // catch (AritmeticException falanFilan){ //child exception parent exception(Exception ebikGabık) den sonra tanımlandığı için CTE

    // // }

    //   System.out.println("agam selametle");

        //  ArithmeticException -> Matematiksei işlemlerde oluşan RTE Exception'dur
        String str = "";
        // str.charAt(2);//RTE->StringIndexOutOfBoundsException
        Scanner sc = new Scanner(System.in);

        System.out.print("agam 1. sayı giresen : ");
        int sayi1 = sc.nextInt();

        System.out.print("agam 2. sayı giresen : ");
        int sayi2 = sc.nextInt();

        int oran;//RTE -> ArithmeticException/ by zero

        try {//dene-> hatanın olma ihitmali oldugu code block
            /*
            1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmazçcatch block try block exception hat yakalarsa calışır
            2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanımlanabilir.
               aynıa anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
            3- parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE



             */
            oran = sayi1 / sayi2;//try block'da hata yakalandığı saturdan sonra try diğer satırlar değil ilgili catch block çalışır

            System.out.println(oran);
            System.out.println("agam try block'tan selamlar :) ");

        }
        catch (ArithmeticException falanFilan){//child exception parent exception(Exception ebikGabık)
            System.out.println("agam bolmede bolen 0 olamaz :( "+falanFilan.getMessage());/// by zero->Exception olustugunda sadece hata mesajı print etmek için getMesage() kullanılır
            falanFilan.printStackTrace();//olusan Exception tum detay bilgisi print etmek için kullanılır
            System.out.println("agam cırak catch'den selamlar :) ");
        }
        catch (ArrayIndexOutOfBoundsException arrayExc){
            System.out.println("Agam arrayda olmayan eleman istirsen :) ");
        }

       catch (Exception ebikGabık) {//Exception Class tum exceptionların Hz Ademi parent class->bad practice
            // hata yakalndıgında yapılacak aksiyonların oldugu block

            //Exception-> olusan hata Data type
            //ebikGabık-> java'nın olusan exception'a atayacagı obj name best parctice:e
            System.out.println("agam nişledingg 0 hiç böler mi :( ");
            System.out.println("agam usta catch block'tan selamlar :) ");
        }
        finally {//catch block'lardan sonra istenirse finally block kullanılabilir
            /*
            try - catch içinde yapılna işlemlerden sonra mutlaka çalışması gerekn block vatsa finally tanımlanır.
            hata d nlanır.ama finaly tanımlanırsa catch çalışmasa bile
            pr akışı devam eder.finally block hsts olsa da olmasa da calışır.
            Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
            başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
             */
            System.out.println("Agam finally block'tan selamlar :)");
        }
        //catch (
        //        ArithmeticException falanFilan) {//child exception parent exception(Exception ebikGabık) den sonra tanımlandığı için CTE
        //}
        System.out.println("Agam sorun handle  DEWAMKEEE :) ");//pr sonuna kadar çalıştı mesaj





    }
}
