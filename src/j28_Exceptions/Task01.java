package j28_Exceptions;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        /*
        Task-> girilen password un 6 karakterden az 10 karakterden fazla olmamasını kontrol eden code create ediniz
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("password giriniz");
        String password=sc.next();

        try {
            if (password.length()<6 ||password.length()>10){
                throw new StringIndexOutOfBoundsException("agam 6 karakterden az ya da 10 karakterden fazla girdin ne ayak :( ");
            }
            else System.out.println("agam password geçerli :) "+password);

        } catch (StringIndexOutOfBoundsException ebikGabık) {
            System.out.println(ebikGabık);
            System.out.println("agam allah bildği gibi selametle :( ");
        }
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur



    }
}
