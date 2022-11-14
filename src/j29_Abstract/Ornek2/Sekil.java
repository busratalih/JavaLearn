package j29_Abstract.Ornek2;

public abstract class Sekil {

    private String name;

    public Sekil() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alanHesapla();

    public abstract double cevreHesapla();

    public void ciz() {
        System.out.println(this.name + " cizildi ");
    }

    @Override
    public String toString() {//obj value'leri print eder
        return
                "sekil isim ='" + this.name + '\'' +
                        "\n sekil alanı : " + this.alanHesapla() +
                        "\n sekil cevre : " + this.cevreHesapla();
    }
}