package j18_Constructor;

public class C02_Arac {




    String marka;
    String model;
    int km;
    double motorHcm;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yil;





    public static void main(String[] args) {

        C02_Arac arac1=new C02_Arac(); //default cons. ile arac1 create edildi
        arac1.ikinciEl=true;
        arac1.marka="volvo";
        arac1.km=50000;
        arac1.model="xc60";
        arac1.motorHcm=2.4;
        //                  volvo              xc60             50000           default 0     true                  2.4
        System.out.println(arac1.marka+ " " + arac1.model+" "+ arac1.km + " "+ arac1.yil+" "+ arac1.ikinciEl+ " "+ arac1.motorHcm );

        // Task 2. bir aracın tum field larını atayarak print edinşz

        C02_Arac myCar=new C02_Arac(); //default cons. ile arac1 create edildi
        myCar.ikinciEl=false;
        myCar.marka="honda";
        myCar.km=11;
        myCar.model="accord";
        myCar.motorHcm=2.0;
        myCar.vitesAuto=true;
        myCar.yil=2022;
        System.out.println(myCar.marka+" "+myCar.model+" "+myCar.km+" km "+myCar.yil+" "+myCar.ikinciEl+" "+myCar.motorHcm+" cc "+myCar.vitesAuto);//





















    }
}
