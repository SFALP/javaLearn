package j19_StaticVariable;

/*
1. StaticBlock yapilari static variable'lari deger atamasi (veya update) icin kullanilir.
2.Static block Class olusturuldugunda butun method'lardan (main dahil) once calisir.
3.Birden fazla static block varsa yukaridan asagiya siralama ile calisir.

 */
public class C02_StaticBlock {
    static String isim = "sefil Haluk";//gunestir, cunku static var

    static {//ilk calisacak static block'tur.
        System.out.println("isim = " + isim);//sefil Haluk
        System.out.println("Agam 1.static block calisti :)");
        isim = "Dilek Hanim";
        System.out.println("isim = " + isim);//Dilek Hanim
    }

    public static void main(String[] args) {//main basi
        System.out.println("main method basladi :)");
        System.out.println("isim = " + isim);//Ugur JavaCAN
        isim = "Kerim Bey";
        System.out.println("isim = " + isim);//Kerim Bey
        System.out.println("main method bitti :(");

    }//main sonu

    static {//ikinci calisacak static block'tur.
        System.out.println("Agam 2.static block calisti :)");
        System.out.println("isim = " + isim);//Dilek Hanim
        isim = "Ugur JavaCAN";
        System.out.println("isim = " + isim);//Ugur JavaCAN
    }
}