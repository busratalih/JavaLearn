package j29_Abstract.Abstract01;

public class Civic extends Honda { // Honda parent abstract Class extend child concrete class

    /*
    Extend Honda yazılarak Honda class a concrete bir civic class tanımlandı. Java CTE verdi. Çözüm olarak :
    a-) Unimplemented(uyarlanmamıs) method implement edilmeli
    b-) Parent Honda classdan abstract keyword kaldırılmalı
    c-) Concrete olan child civic class abstract tanımlanmalı
     */

    // concrete classta abstract method tanımlanır mı?

    //public abstract void absMethod(); // ya class abs olmalı yada method concrete body olmalı
    // Trick-> child  concrete class parent abstract classın abs methodlarını mutlaka implement(override) etmeli




    @Override//implement Abs method
    public void motor() {
        System.out.println("1.6 eco motor az yakar cok kacar ");
    }

    @Override//implement Abs method
    void koltuk() {
        System.out.println("agam ucuz olsun diye kumas koltuk temiz kullanın");
    }

    @Override//implement Abs method
    void kapı() {
        System.out.println("5 kapı sedan ");
    }

    public int vites(){//concrete child method
        return 5;
    }


}
