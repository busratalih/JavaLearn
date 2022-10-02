package j10_StringManipulations;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {

        // string içerisinde istenen stringin varlığını ontrol eder, boolean return eder..

        String s1="Enise Hanım basarili bir Qa tester team lead";
        System.out.println(s1.contains("hanım"));
        System.out.println(s1.contains("E"));
        System.out.println(s1.contains(" "));


        String  s2="Qa";
        System.out.println(s1.contains(s2));
        System.out.println(s2.contains(s1));

        // task girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz
        //ternary kullanınız

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir cumle Giriniz");
        String cumle= scanner.nextLine();
        System.out.println("Aradiginiz kelimeyi giriniz");
        String kelime=scanner.nextLine();
        System.out.println(cumle.contains(kelime) ? "icerir" : "icermez");















    }
}
