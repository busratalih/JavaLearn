package j14_Scope;

public class C03_Scope {
    public static void main(String[] args) {

        C01_InstanceVariable kus=new C01_InstanceVariable(); //istedıgım classtan kus obje create ettim
        kus.name="ebabil";
        kus.developerMı=false;
        System.out.println("kus.name = " + kus.name);//ebabil
        C01_InstanceVariable.staticMethod(); //class name ile statıc method call ettik
        kus.non_staticMethod(); //obje ile non statıc method call



    }
}
