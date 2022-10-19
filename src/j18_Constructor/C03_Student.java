package j18_Constructor;

public class C03_Student { //main olmayan sadece student obj create etmek için pojo->  plan object java old:
    //obj için standart class kalıphane

    // fields
    String ad;
    String soyad;
    int sınıf;
    double ortalama;
    int okulNo;
    boolean takdir;


    public void mezuniyet(){ //method
        if (ortalama>=50){
            System.out.println("agam diploman hayırlı olsun");
        }else System.out.println("agam seneye de bekleriz devamkee");
    }

    @Override
    public String toString() {//obj referans degeri print etmemesi için obj datalarını stringe ceviren method
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';




    }
}

