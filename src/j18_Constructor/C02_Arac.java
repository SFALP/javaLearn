package j18_Constructor;

public class C02_Arac {
    //Fields
    String marka;
    String model;
    int km = 10;
    int yil;
    double motorHacim;
    boolean vitesAuto = false;
    boolean ikinciEl;

    public static void main(String[] args) {
        C02_Arac arac1 = new C02_Arac();// default contructor ile arac1 objesi create edildi.
        arac1.ikinciEl = true;
        arac1.marka = "Mercedes";
        arac1.km = 50000;
        arac1.model = "E220";
        arac1.motorHacim = 2.4;
//                              Mercedes            E220            50000           default=0               true                  2.4
        System.out.println(arac1.marka + " " + arac1.model + " " + arac1.km + " " + arac1.yil + " " + arac1.ikinciEl + " " + arac1.motorHacim);
//Yukaridaki kodun ekran ciktisi: Mercedes E220 50000 0 true 2.4

// TASK2. Yeni bir aracin tum field'larini atayarak print ediniz.
    C02_Arac arac2=new C02_Arac();

    arac2.marka="Audi";
    arac2.model="A4";
    arac2.km=60000;
    arac2.yil=2017;
    arac2.motorHacim=1.6;
    arac2.vitesAuto=true;
    arac2.ikinciEl=true;

        System.out.println(arac2.marka+" "+arac2.model+" "+arac2.km+"km "+arac2.yil+" "+arac2.motorHacim+"cc "+arac2.vitesAuto+" "+arac2.ikinciEl);
// Yukaridaki kodun ektran ciktsi: Audi A4 60000km 2017 1.6cc true true

        System.out.println("arac2 = " + arac2);//Mouse'da sag tusa tiklandiktan sonra GENERATE--> ToString'den once:
        // arac2 = j18_Constructor.C02_Arac@5c7fa833 yazdirir

// CLASS'ta sag click "Generate -> to String" seceneklerinden sonra yukaridaki satirin ciktisini tanimlanan sekliyle ekrana yazdirir
//arac2 = C02_Arac{marka='Audi', model='A4', km=60000, yil=2017, motorHacim=1.6, vitesAuto=true, ikinciEl=true}

    }
//GENERATE-> To STRING seceneklerinde yazdirilmak istenen icerikler secilir.
    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", yil=" + yil +
                ", motorHacim=" + motorHacim +
                '}';
    }
}