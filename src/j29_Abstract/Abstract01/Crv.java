package j29_Abstract.Abstract01;

public class Crv extends Honda {


    @Override
    public void motor() {
        System.out.println("agam 2.4 super turbo motor arazi seni bekler");
    }

    @Override
    void koltuk() {
        System.out.println("agam deri koltuk dikkat et");
    }

    @Override
    void kapı() {
        System.out.println("agam kapılar vakumlu");
    }
}
