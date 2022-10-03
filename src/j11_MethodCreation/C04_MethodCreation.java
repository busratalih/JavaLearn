package j11_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

        String name=" haluk";
        System.out.println("car car" + name);
        C04_MethodDepo.gecmeNotu(24); //depo classtan class name ile metod call ettik
        C04_MethodDepo.topla(3,5); //8 diğer class

        //farklı classtan metod call etmek için
        // 1. method static>gökteki gunes gibi
        //2. className.methodName() seklinde aynı classtaki metot dogrudan call edilir

        selamVer(); //aynı classtan metotName ile call edildi


    }//main sonu

    public static void selamVer(){
        System.out.println("agam selamlar devamke");
    }

}
