package j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {


        // // String'i  array'a cevirme...split()-> girilen parametre değere göre String ifade parçalanır

        String str="javaCAN'lara selam olsun. en kısa zamanda bolca offer, sonrası TUZLABALIK :)";
        //TASK String ifadeyi kelime sayısını print eden kod create ediniz

        String strArr[]=str.split(" ");  //string her " " karaktere gore parcalarnır. her bir parca str elemanı olarak atandı

        System.out.println(Arrays.toString(strArr)); //
        System.out.println(strArr.length); //11
        // task string ifadedeki harf sayısını print eden kod create ediniz
        String  harfArr[] = str.split("");//string harf harf ""hiçlik e göre parçalandı
        System.out.println(Arrays.toString(harfArr));//
        System.out.println(harfArr.length);//77














    }
}
