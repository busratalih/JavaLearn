package j08_ifStament_TernaryOperator;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        /*

    Task girilen bir karakterin harf olup olmadığını kontrol eden bir code create ediniz
     */


        Scanner sc = new Scanner(System.in);

        System.out.print("bir karakter  giriniz : ");

        char krktr = sc.nextLine().charAt(0);

        if ((krktr>='A'&&krktr<='Z')||(krktr>='a'&&krktr<='z')){
            System.out.println("giridiginiz karakter harfdir :)");
        }else System.out.println("girdiğiniz  karakter harf değildir :(");





















    }
}
