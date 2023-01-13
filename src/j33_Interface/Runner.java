package j33_Interface;

public class Runner {
    public static void main(String[] args) {
        Sahin dgshn = new Sahin();
        dgshn.ebat();//agam 16 inc lastik ebat :) Dr bu ne? insan yiyecek bunu :)
        dgshn.jant();//Agam senin gibi janti adama celik 5 kollu jant yakisir
        dgshn.kapi();//Agam 4 kapi sedan
        dgshn.kaporta();//Agam akordion kaporta gamzesiz olmaz :)
        dgshn.klima();//Agam ac cami serinle, klima senin neyine
        dgshn.koltuk();//Agam deri koltuk yazin pisik yapar, ici saman olmasin kafi :)
        dgshn.motor();//Agam 1.6 aile motor
        dgshn.sisLamp();// default concrete method--> obje ile call edildi.
        // agam gunesli havada sunroof acarsan bagrinda maasallah yazar :)
        dgshn.sunroof();
        dgshn.yakit();//agam TUPitak yoksa ocaga incir agaci ekiersi :(
        System.out.println();
        System.out.println("disDonanim.RENK = " + DisDonanim.RENK);//disDonanim.RENK = opak kirmizi
        System.out.println("icDonanim.RENK = " + IcDonanim.RENK);//icDonanim.RENK = Ahsap
        System.out.println("lastik.RENK = " + Lastik.RENK);//lastik.RENK = siyah beyaz yanakli
//        icDonanim.KUMAS="Deri"; --> CTE, cunku final variable'a atama ya-pi-la-maaaaz.
        System.out.println("icDonanim.KUMAS = " + IcDonanim.KUMAS);//icDonanim.KUMAS = Kumas
        System.out.println("icDonanim.MUSIC = " + IcDonanim.MUSIC);//icDonanim.MUSIC = Arizona kertenkele styleeaa :), underground music
        DisDonanim.anten();// static concrete method interface name ile call edildi.
//Agam yine antin kuntin islerdesin :)
    }
}
