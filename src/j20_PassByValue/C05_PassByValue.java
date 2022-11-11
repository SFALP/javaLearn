package j20_PassByValue;

public class C05_PassByValue {

    public static void main(String[] args) {
        /*
eger bir method2Da yapılan değişiklik kalıcı olsun istenirse
2.değişklik  yapılan variable'lar static olarak tanımlanır.
 */
        double etiketFiyati=100;// primitive
        double indirimOrani=0.1;//primitive

        System.out.println("Indirim oncesi etiketFiyati = " + etiketFiyati);//100

        etiketFiyati=indirim(etiketFiyati,indirimOrani);//90

// yukaridaki satirda atama yaptigimiz icin asagida indirimli fiyat yazdirildi.

        System.out.println("Indirim sonrasi etiketFiyati = " + etiketFiyati);//90

    }//main sonu
    public static double indirim(double fiyat, double oran){
        fiyat*=(1-oran);
        System.out.println("Indirimli fiyat: "+fiyat);
        return fiyat;
    }
}