package j28_Exceptions;

public class C03_ClassCastException {
    public static void main(String[] args) {


    //ClassCastException -> Birbirin dönüştürülemeyen data type lar birbirine donusturuldugunde olusan RTE
        // Exception dur

        Object obj="javacanlara selam olsun";
        String str= (String) obj; //object data type String data type casting yapılarak atandı
        System.out.println("str = " + str);//javacanlara selam olsun

        Object sayi1=10;
       // String str2= (String) sayi1;// object classcastexception data type String data type casting yapılarak atandı
       // System.out.println("str2 = " + str2); classcastexception

        try {
            String str2= (String) sayi1;
        }catch (ClassCastException e){
            System.out.println("agam int object hiç stringe cevrilir mi");
        }


        try {
            String str3= (String) obj;
            System.out.println("agam try blok da bu yazıyı okuduysan exc fırlatmadı komut sorunsuz");
        }catch (ClassCastException e){
            System.out.println("agam int object hiç stringe cevrilir mi");
        }

        System.out.println("agam sorun yok dewamke");//bu kod calısmıssa program sorunsuz kırılmadan run olmuştur




    }
}
