package j33_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("javaCan","Ebubekir", "Gulsum", "Ebubekir","Adem", "Ilker", "javaCan", "Merve"));

        //LinkedList Remove();
        System.out.println("ll1.remove() = " + ll1.remove());//javaCan
        System.out.println("ll1 = " + ll1);//[Ebubekir, Gulsum, Ebubekir, Adem, Ilker, javaCan, Merve]

        System.out.println("ll1.remove(3) = " + ll1.remove(3));//Adem
        System.out.println("ll1 = " + ll1);//[Ebubekir, Gulsum, Ebubekir, Ilker, javaCan, Merve]


        System.out.println("ll1.remove(\"Merve\") = " + ll1.remove("Merve"));//true , olan node true return eder
        System.out.println("ll1.remove(\"javaTar\") = " + ll1.remove("javaTar"));//false ->olmayan node false return eder
        System.out.println("ll1 = " + ll1);//[Ebubekir, Gulsum, Ebubekir, Ilker, javaCan]

        System.out.println("ll1.removeFirstOccurrence(\"Ebubekir\") = " + ll1.removeFirstOccurrence("Ebubekir"));//true
        System.out.println("ll1 = " + ll1);//Gulsum, Ebubekir, Ilker, javaCan]

        System.out.println("ll1.element() = " + ll1.element());//Gulsum , ilk node return eder

        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("javaCAN", "Ebubekir", "Gülsüm", "Ebubekir", "Adem", "İlker", "javaCAN", "Merve"));
        LinkedList<String> ll3 = new LinkedList<>(Arrays.asList("Hasan", "Harun", "Haluk", "Hasmayan"));

        ll2.addAll(ll3);
        System.out.println("ll2 = " + ll2);//[javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve, Hasan, Harun, Haluk, Hasmayan]
        System.out.println("ll2.remove(ll3) = " + ll2.removeAll(ll3));//
        System.out.println("ll2 = " + ll2);//[javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve]
        //LinkedList get() getFirst() getLast()....girilen index ve ilk son node return eder..
        System.out.println("ll2.get(2) = " + ll2.get(2));//Gülsüm
        System.out.println("ll2.getFirst() = " + ll2.getFirst());//javaCAN
        System.out.println("ll3.getLast() = " + ll3.getLast());//Hasmayan





    }
}
