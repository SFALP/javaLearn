package j18_Constructor;

public class C07_OgretmenRunner {
    public static void main(String[] args) {

        C07_Ogretmen hocam = new C07_Ogretmen("Sevdenur Hocam", 11);
        System.out.println("hocam.isim = " + hocam.isim);
        System.out.println("hocam.kidem = " + hocam.kidem);
        hocam.kidemHesap(13);
/*EKRAN CIKTISI:
hocam.isim = Sevdenur Hocam
hocam.kidem = 5
Agam kidemin: 26
Agam kidemin: 10

 */




    }
}
