package j30_Interface;

public class Runner {
    public static void main(String[] args) {

        Sahin dgshn=new Sahin();
        dgshn.ebat();
        dgshn.jant();
        dgshn.kapi();
        dgshn.kaporta();
        dgshn.klima();
        dgshn.koltuk();
        dgshn.motor();
        dgshn.sisLamp();//default conc method obj ile call oldu
        dgshn.sunroof();
        dgshn.yakit();
        System.out.println("disDonanim.RENK = " + disDonanim.RENK);
        //icDonanim.KUMAS="deri"; CTE final variable atama yapılamaz
        System.out.println("icDonanim.RENK = " + icDonanim.RENK);
        System.out.println("Lastik.RENK = " + Lastik.RENK);
        System.out.println("icDonanim.KUMAS = " + icDonanim.KUMAS);
        System.out.println("icDonanim.MUSIC = " + icDonanim.MUSIC);
        disDonanim.anten(); //static conc method interface name ile call edildi



    }
}
