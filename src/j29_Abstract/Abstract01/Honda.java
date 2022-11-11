package j29_Abstract.Abstract01;

public abstract class Honda {//parent abstract class

    public abstract void motor();

    void sunrooff(){
        System.out.println("agam keyfini bilirsin  am sunroof extra ucret");
    }


    //abs parent classta variable tanımlanabilir mi?

    String name="Gulsum Hanim";

    // variable lar abstract tanımlanır mı?  kesinlikle hayır
   // public abstract int yas=48; olamazzz



    abstract void koltuk();

    abstract void kapı();

   // final void finalMethod(); //concrete method body siz olamaz
   // final abstract void finalMethod(); //abstract method final olamaz

   // private void privateMethod(); // concrete method body siz olamaz
   // private abstract void privateMethod(); // abs method private olamaz

   // static void gunesMethod(); //concrete method body siz olamaz
   // static abstract void gunesMethod();//abs method private olamaz

    //Honda obj=new Honda(); //abs class obj uretmez
}
