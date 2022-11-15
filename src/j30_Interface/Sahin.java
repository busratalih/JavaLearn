package j30_Interface;

public class Sahin extends Tofas implements disDonanim, icDonanim, Lastik {
    @Override
    public void ebat() {
        System.out.println("agam 16 inc lastik ebat");
    }

    @Override
    public void jant() {
        System.out.println("agam senin gibi janti adama celik jant");
    }

    @Override
    public void motor() {
        System.out.println("agam 1.6 aile motor");
    }

    @Override
    public void yakit() {
        System.out.println("agam ocagın incir agacı ");
    }

    @Override
    public void kapi() {
        System.out.println("agam 4 kapi sedan");
    }

    @Override
    public void kaporta() {
        System.out.println("agam akordion kaporta gamzesiz olmaz");
    }

    @Override
    public void koltuk() {
        System.out.println("agam deri koltuk");
    }

    @Override
    public void klima() {
        System.out.println("agam klima carpar");
    } //concrete child class -> extends Tofas, implement dıs dınanım iç donanım lastik






}
