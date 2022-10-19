package j18_Constructor;

public class C01_Constructur {




    String str; // inst variable-> obj variable
    String  selam="guzel insan";
   // C01_Constructur   obj1   =   new         C01_Constructur();


    public static void main(String[] args) {

        /*
        1-) Constructor ismi calss name ile aynı olmalı, buyuk harf ile baslamalı
        2-) constructor create edildiğinde name den sonra () {} mutlaka kullanılmalı
        3-) eger p'li cons. create edildiğinde java defaut cons ezer(siler)
        4-) cons. return type olmaz method dan ayıran özelliğidir
        5-) class olustugunda java default cons. kendi create eder

         */

        // class name   obj name   new keyword  default cons.
        C01_Constructur   obj1   =   new         C01_Constructur();
        C01_Constructur   obj2   =   new         C01_Constructur();
        C01_Constructur   obj3   =   new         C01_Constructur();
        C01_Constructur   obj4   =   new         C01_Constructur();

        obj1.str="javacan"; //str inst variable obj1 ilecall edilerek obj1 degeri atandı
        obj2.str="javatar"; //str inst variable obj2 ilecall edilerek obj2 degeri atandı
        System.out.println(obj1.selam); //guzel insan

        System.out.println("obj1.str = " + obj1.str); //javacan
        System.out.println("obj2.str = " + obj2.str); //javatar
        System.out.println("obj4.str = " + obj4.str); //null

        obj3.aga(); // agama selamke
        obj2.aga(); //agama selamke



    }// main sonu

    public void aga(){
        System.out.println("agama selamkee :)");
    }









}
