package j29_Abstract.Abstract02;

public class IdariPersonel extends Personel {
    @Override//mecbur implement edilmeli
    public void maasHesapla() {//personel parent classtan override edilen abs. method
        System.out.println("agam idarecimize saati 120$");
    }

    @Override//mecbur implement edilmeli
    public void maasBilgisi() {//personel parent classtan override edilen abs. method
        System.out.println("agam cincik kod yazan idari personele exstradan bir ay ikramiye");
    }

    @Override //tercihen override ettik
    public void sigorta() { //personel classtan override edilen conc. method
        System.out.println("agam cincik coder personel full sigorta");
    }



}
