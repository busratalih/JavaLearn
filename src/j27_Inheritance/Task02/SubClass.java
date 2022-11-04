package j27_Inheritance.Task02;

public class SubClass extends SuperClass {


    public static void main(String[] args) {
        SubClass obj=new SubClass();
        obj.my_method();
    }

    int num=10;

    public void my_method(){
        goster();//SubClass call
        super.goster();//superclass call
        System.out.println("subClass num :" + num);
        System.out.println("superclass num :" + super.num);
    }

    @Override
    public void goster() {
        System.out.println("bu method subclass ın goruntulenme metodudur");
    }
}
