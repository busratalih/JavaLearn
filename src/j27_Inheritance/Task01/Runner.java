package j27_Inheritance.Task01;

public class Runner {
    public static void main(String[] args) {

        A a=new A();

        System.out.println("a.mesaj = " + a.mesaj);// agama a class dan hurmetler

        B b=new B();

        System.out.println("b.mesaj = " + b.mesaj);//static variable inheritance da ClassName olmadan call edilir

    }
}
