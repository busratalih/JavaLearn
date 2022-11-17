package j33_Collection.C01_LinkedList;

import java.util.LinkedList;
import java.util.Objects;

public class C02_LinkedList {
    public static void main(String[] args) {

        LinkedList<Object> List=new LinkedList<>();

        //Bad Practice , app çok yavaslar
        List.add("Nazim");
        List.add('$');
        List.add(1453);
        System.out.println("List = " + List);


    }
}
