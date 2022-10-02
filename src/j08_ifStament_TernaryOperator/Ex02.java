package j08_ifStament_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        /*
    Kullanicidan 100 uzerinden notunu isteyin.
    Not'u harf sistemine cevirip yazdirin.
    50’den kucukse "D",
    =50  <60 arasi "C",
    =60  <80 arasi "B",
    =80’nin uzerinde ise "A"
        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("agam notunu gir :");
        int not= scanner.nextInt();
      //  if (not<0 || not>100) {
      //      System.out.println("agam negatif ve 100 den buyuk not olmaz/nadam gibi bişeyler gir :(\n" + "gelmiiim oraya");
      //  } else if (not<50) { // 50 den kucuk alma kontrolu
      //      System.out.println("D");
      //  }else if (not<60) { // 60 dan kucuk alma kontrolu
      //      System.out.println("C");
      //  }else if (not<80) { // 80 den kuçuk alma kontrolu
      //      System.out.println("B");
      //  }else { // 80 VE BUYUK  NOT ALMA KONTROLU
      //      System.out.println("A");
      //  }

        if (not<0 || not>100) {
            System.out.println("agam negatif  not olmaz/nadam gibi bişeyler gir :(\n" + "gelmiiim oraya");
        } else if (not<50) { // 50 den kucuk alma kontrolu
            System.out.println("D");
        }else if (not>=50 && not<60) { // 60 dan kucuk alma kontrolu
            System.out.println("C");
        }else if (not>=60 && not<80) { // 80 den kuçuk alma kontrolu
            System.out.println("B");
        }else if (not>=80 && not<=100){ // 80 VE BUYUK  NOT ALMA KONTROLU
            System.out.println("A");
        }else { //100 ve 100 den buyuk olmayı kontrol eder
            System.out.println("agam 100 den buyuk  not olmaz/nadam gibi bişeyler gir :(\n" + "gelmiiim oraya");
        }

















    }
}
