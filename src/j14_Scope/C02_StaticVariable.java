package j14_Scope;

public class C02_StaticVariable {





    static String firmaName="clarusway";
    static int firmaID;
    static boolean firmaIT; //gunes





    public static void main(String[] args) {

/* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

   Static variabler ise class variable olarak tanimlanir
   ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
   eger static variable'in degeri degistirilirse herkes icin degisir


 */
        System.out.println("firmaID = " + firmaID); //0
        firmaID=1001; //statıc variable name ile call edildi -< best practıce
        System.out.println("firmaID = " + firmaID); //1001
        C02_StaticVariable.firmaIT=true; //classname ile statıc variable call < bad practıce
        staticMethod();// statıc method statıc maine call edildi

    }//main sonu

    public static void staticMethod(){//statıc method
       firmaID=2002; //statıc variable call
        System.out.println("agam yeni ıd'in hayırlı olsun" + firmaID);



    }

    public void non_staticMethod(){// non statıc method
        firmaName="javacan"; //
        System.out.println("agam yeni firman :" + firmaName);


    }



}
