package j12_Loops;

public class C03_Nested_ForLoop {
    public static void main(String[] args) {

     // eger bir döngunun badisinde baska bir döngu bulunuyorsa bu tur döngulere nested loop denir
        // iç döngu dış dongunun her adımında tekrar calısır
        // iç içe döngulerde en içteki döngu en önce çalışır

        for (int apt = 1; apt <=10 ; apt++) { //dıs dongu
            System.out.println("apartman dongusu:" + apt);

            for (int daire = 1; daire <6 ; daire++) {//iç dongu
                System.out.println("apt" + apt+ " için daire dongu  :" +daire);

            }

        }






















    }
}
