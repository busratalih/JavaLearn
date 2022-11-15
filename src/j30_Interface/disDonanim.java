package j30_Interface;

public interface disDonanim {

    public void kapi();//abs method

    void kaporta(); //abs method

    String RENK="opak kirmizi"; //public static final variable

    public default String sisLamp(){
        return "sisli havada dikkat";
    }

    static void anten(){//static conc. method
        System.out.println("agam sensiz olmaz");
    }

   // public static default void sorunMethod(); //CTE-> static default keyword aynı anda kullanılamaz


 //  //disDonanim obj=new disDonanim(); //obje olamazzz

 //  public static void main(String[] args) {

 //      System.out.println("renk = " + renk);
 //      aga(); //static method call ettik



 //  }


}
