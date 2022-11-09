package j28_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {


        /*
        NullPointerException -> null ataması yapılan bir String de lenght() method run edildiğinde olusan
        RTE exception
         */

        String str="";
        System.out.println("str.length() = " + str.length());
        String str1=null;
        System.out.println("str1.length() = " + str1.length());// NullPointerExcetion kod kırılır

        try {
            System.out.println("str1.length() = " + str1.length());//excp try block kırılır catch block run olur
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        } catch (NullPointerException e) {
            System.out.println("agam hele dutlukdaki String boyutu mu hesaplanır TEE ALLAM YAAA :( ");
        }
        try {
            System.out.println("str.length() = " + str.length());//excp olmadıgı için try block tamalanır catch block çalışmaz
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        } catch (NullPointerException e) {
            System.out.println("agam hele dutlukdaki String boyutu mu hesaplanır TEE ALLAM YAAA :( ");
        }

        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur




    }
}
