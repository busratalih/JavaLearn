package j29_Abstract.Abstract02;

public class Runner {

    public static void main(String[] args) {

        Isci maraba1=new Isci(); //

        maraba1.maasBilgisi(); //
        maraba1.maasHesapla();//
        maraba1.name="busra";//
        System.out.println("maraba1.name = " + maraba1.name);//
        maraba1.sigorta();//abs. parent classtaki concrete method obj. ile call

        IdariPersonel cnckCdr=new IdariPersonel();//
        cnckCdr.name="aliye";//
        cnckCdr.sigorta();//
        cnckCdr.maasHesapla();//
        cnckCdr.maasBilgisi();//

    }

}
