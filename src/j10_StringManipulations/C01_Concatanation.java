package j10_StringManipulations;

public class C01_Concatanation {
    public static void main(String[] args) {


        // concat metodu içine (parametee) aldığı srting variable i çalıştığı stringin sonuna ekler
         //java da + işlemi yapılırkeneğer en az bir string variable varsa java toplama değil concat yapar

         String  name= "Nur";
         String  meslek=" Qa tester ";
        System.out.println(name.concat(meslek)); //
        System.out.println(name); //

        // TRICK  String metodları variable da geçici değişikli yapar. ama değişken atama yapılırsa kalıcı değişir


        name=meslek.concat(name);
        System.out.println("name =" +name);

        System.out.println( name.concat(true + " :) "));// Qa tester  Nurtrue :)
        System.out.println( name.concat(100+ " :) "));// Qa tester  Nur 100 :)



        //Trıck CONCAT METODU PARAMETRE OLARAK STRİNG TYPE HARİCİ TÜM DATALARI STRİNGE ÇEVİRİP CONCAT EDER
































    }
}
