package j29_Abstract.Abstract02;

public abstract class Personel {

    String name="nur hanim";


    public abstract void maasHesapla(); //abs. method
    public abstract void maasBilgisi(); //abs. method

    public void sigorta(){
        System.out.println("agam özel sigorta kapsamindasin "); //conc. method
    }



}
