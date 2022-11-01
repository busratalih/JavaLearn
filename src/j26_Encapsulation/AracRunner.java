package j26_Encapsulation;

public class AracRunner { //3.step
    public static void main(String[] args) {

    //4.step

        Arac honda=new Arac("accord","siyah",-200,2012);
        Arac volvo=new Arac("s80","beyaz",2000,-2015);

        Arac haciMurat=new Arac();
        haciMurat.setModel("serce");
        haciMurat.setMotor(1300);
        haciMurat.setYil(1974);
        haciMurat.setRenk("cucuk sari");
        System.out.println("honda ne ararsan var onda " + honda);
        System.out.println("haci murat" + haciMurat);
        System.out.println("isvec tankı:"+ volvo);










    }
}
