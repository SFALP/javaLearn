package j19_StaticVariable;

public class C01_OgretmenRunner {
    public static void main(String[] args) {

        C01_Ogretmen hc1 = new C01_Ogretmen("Cuneyt", 11);
        System.out.println("hc1.tecrube = " + hc1.tecrube);//11
        System.out.println("hc1.isim = " + hc1.isim);//Cuneyt
//        hc1.okul="Kabadas";//static variable objeyle call edilmez, bunlar sadece okul olarak yazilabilir.
        System.out.println("hc1.okul = " + hc1.okul);//null

        C01_Ogretmen.okul = "KABATAS ERKEK LISESI";
        //Normalde (null) olan deger bu komutla (KABATAS ERKEK LISESI) olarak atanmis oldu.
// Eger bu atama ilk satirda yapilsaydi hc1.okul degeri icin de ayni deger atanmis olur.

        C01_Ogretmen hc2 = new C01_Ogretmen("Bekir", 7);
        System.out.println("hc2.tecrube = " + hc2.tecrube);//7
        System.out.println("hc2.isim = " + hc2.isim);//Bekir
//        hc2.okul = "Kabatas";
        System.out.println("hc2.okul = " + hc2.okul);//KABATAS ERKEK LISESI

        C01_Ogretmen hc3 = new C01_Ogretmen("Nazim", 13);
        System.out.println("hc3.tecrube = " + hc3.tecrube);//13
        System.out.println("hc3.isim = " + hc3.isim);//Nazim
//        hc3.okul = "Gabadas";
        System.out.println("hc3.okul = " + hc3.okul);//KABATAS ERKEK LISESI

        hc1.evlilikYildonumu();//obje ile non-static method call edildi
        hc1.maasHesapla();// bu static method oldugu icin bu sekilde de cagrilsa da class ismiyle cagrilmasi daha uygundur.
        C01_Ogretmen.maasHesapla();//Classname ile static method call edildi.

        hc2.maasHesapla();// obj ile static method call edilmesi bad practice'tir. Tavsiye edilmez.

    }
}