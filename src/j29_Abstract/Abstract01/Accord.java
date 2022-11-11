package j29_Abstract.Abstract01;

public class Accord extends Honda {


    @Override
    public void motor() {//implement Abs method
        System.out.println("agam 2.0 turbo atesle hız felakettir");
    }

    @Override
    void sunrooff() {//override edilen method
        System.out.println("agam cigarayı yakınca sunroof acmayı unutma");
    }

    @Override
    void koltuk() {//implement Abs method
        System.out.println("deri koltuk ter yapar");
    }

    @Override
    void kapı() {//implement Abs method
        System.out.println("agam vakumlu kapı carpılma");
    }
}
