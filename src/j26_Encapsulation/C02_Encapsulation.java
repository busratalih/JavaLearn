package j26_Encapsulation;

public class C02_Encapsulation {


   private  String name="Gamze Hanim";
  private  int id=1001;
        //int id=1001;

    public C02_Encapsulation() {

    }


    public C02_Encapsulation(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String isimVer(){ //getter method
        return name;
    }

    public int idVer(){ //getter method
        return id;
    }

   public  void isimDegis(String isim){ //setter method
       this.name=isim;
   }



    @Override
    public String toString() {
        return "C02_Encapsulation{" +
                "name='" + name + '\'' + ", id=" + id + '}';
    }
}
