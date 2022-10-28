package j23_Varargs_String_Buider;

public class C02_Varargs {
    public static void main(String[] args) {

        /*
        arr ve varargs method :
         */

        int arr[]={24,42,33,19,34,45,58,38};
        System.out.println("arrTopla(arr) = " + arrTopla(arr)); //293
        System.out.println("varargs int deger toplam = " + varargsTopla(24, 42, 33, 19, 34, 45, 58, 38));//293
        System.out.println("varargs array değer toplam : "+varargsTopla(arr));//293

        // trick: varargs method parametreleri array gibi tanımladığı için varargs metoda parametre olarak array
        // de verilebilir

        // task1 -> array elemanları toplamını print eden method create ediniz
        // task2 -> tas1 varargs ile çalışınız

    }//main sonu

    public static int arrTopla(int [] a){
        int toplam=0;
        for (int w:a){
            toplam+=w;
        }
        return toplam;
    }

    public static int varargsTopla(int...b){ //task2
        int toplam=0;
        for (int s:b){
            toplam+=s;
        }


        return toplam;
    }







}
