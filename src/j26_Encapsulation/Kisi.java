package j26_Encapsulation;

public class Kisi { //pojo class

    /*
    kişi pojo class için fields-> ad,soyad,password(strinh), yas
    tüm field ları kullanıcı göreilmeli ve password hariç update edebilmeli
    password encapsulated update edilmemeli. yas variable negatif deger girmeye karsı encapsulated

    runner class da obj ile field ları print eden code create ediniz

     */
    // fielads

    String ad;
    String soyad;
    private int yas;
    private String password;

    public Kisi(String ad, String soyad, int yas, String password) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.password = password;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = Math.abs(yas);//parametre gelen yas- den kurtularak ins. var atandı
    }

    public String getPassword() {
        return password;
    }


}
