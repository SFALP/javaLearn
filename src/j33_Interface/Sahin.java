package j33_Interface;

public class Sahin extends Tofas implements DisDonanim, IcDonanim, Lastik {
    // concrete child class extends -->Tofas, implements-->disDonanim,icDonanim, Lastik
    @Override
    public void motor() {
        System.out.println("Agam 1.6 aile motor");
    }

    @Override
    public void yakit() {
        System.out.println("agam TUPitak yoksa ocaga incir agaci ekiersi :(");
    }

    @Override
    public void kapi() {
        System.out.println("Agam 4 kapi sedan");
    }

    @Override
    public void kaporta() {
        System.out.println("Agam akordion kaporta gamzesiz olmaz :) ");
    }

    @Override
    public void koltuk() {
        System.out.println("Agam deri koltuk yazin pisik yapar, ici saman olmasin kafi :)");
    }

    @Override
    public void klima() {
        System.out.println("Agam ac cami serinle, klima senin neyine");
    }

    @Override
    public void ebat() {
        System.out.println("agam 16 inc lastik ebat :)");
        System.out.println("Dr bu ne? insan yiyecek bunu :)");

    }

    @Override
    public void jant() {
        System.out.println("Agam senin gibi janti adama celik 5 kollu jant yakisir");
    }



}
