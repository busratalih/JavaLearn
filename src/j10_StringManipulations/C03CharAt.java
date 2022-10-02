package j10_StringManipulations;

import java.util.Scanner;

public class C03CharAt {
    public static void main(String[] args) {

      // charAt metodu parametre int olarak girilen index teki char degerini return eder
      // index değeri 0 dan baslar

      String sehir="Istanbul";

      char besinciİndexKrkt=sehir.charAt(5);
      System.out.println(besinciİndexKrkt);

      // son index karakteri , lennght -1

        System.out.println(sehir.charAt(sehir.length() - 1));

        // ilk index karakter charAt 0

        System.out.println(sehir.charAt(0));

       // System.out.println(sehir.charAt(18));

        // Trıck charAt index boyutunu geçerse CTE verir

        //Task İstanbul izmir girilen kelimenin ortadaki karakteri print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("kelimeyi gir");
        String kelime=sc.nextLine();
        if (kelime.length()%2!=0) {
            System.out.println("kelime.charAt(kelime.length()-1) / 2");
        }else System.out.println("girilen kelimenin orta karakteri yoktur");















    }
}
