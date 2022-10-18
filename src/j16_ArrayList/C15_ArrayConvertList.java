package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {

       // Array den cevrilen list array kaynaklı oldugu icin array davranısı gösterir,boyut sabittir
       //dolayısıyla remove add method çalışmaz

       String arrJavaCan[]={"Akif", "Gamze", "Musty", "Sevde"};
        List<String> listJavaTar= Arrays.asList(arrJavaCan); //arrJavaCan list eleman olarak atandı
        System.out.println("listJavaTar = " + listJavaTar); //[Akif, Gamze, Musty, Sevde]
        System.out.println("listJavaTar.size() = " + listJavaTar.size()); //4
        //listJavaTar.add("sefilCan Haluk"); //array a eleman eklenmez
        //listJavaTar.clear();
        
        //list data type ArrayList tanımlanırsa rte vermez, kaynagı array de olsa list davranır boyut esnekliği yapar

        ArrayList<String > listJavaTar1= new ArrayList<>(Arrays.asList(arrJavaCan));
        listJavaTar1.add("sefil Haluk");
        System.out.println("listJavaTar1 = " + listJavaTar1);
        


    }
}
