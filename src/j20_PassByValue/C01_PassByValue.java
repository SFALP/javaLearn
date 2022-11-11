package j20_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {

        /*
        Java, Pass By Value olan bir programlama dilidir. (bağımsızdır)
        Bir primitive variable argument/parametre olarak bir methoda call edildiginde(cagirildiginda) variable degil
        bir copy clone (Vesikalik) (pointer)degeri gonderilir.
         */
// TASK: Verilen fiyat icin %24 artirilmis fiyat print eden method create ediniz.

        double fiyat = 100;
        System.out.println("Method call oncesi fiyat degeri = " + fiyat);//100
        fiyatArtir(fiyat);//124 yazdirir. Fiyat, variable method'a parametre call edildi.
        System.out.println("method call sonrasi fiyat degeri: " + fiyat);//100
// bu calismada fiyat degerinin sabit olarak degismedigi vurgulanmistir.
// Bu nedenle pass by value olarak isimlendirilir. Primitiv'de deger anlik degisir.

    }//main sonu
    public static void fiyatArtir(double birsey) {
        birsey *= 1.24;
        System.out.println("Guncellenmis fiyat: " + birsey);
    }
}