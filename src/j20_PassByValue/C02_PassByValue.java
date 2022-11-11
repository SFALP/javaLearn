package j20_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {
// TASK: Verilen fiyat icin %11, %22 ve %33 indirimli fiyat print eden method create ediniz.

        double fiyat = 100;// primitive double type variable

        System.out.println("Method oncesi fiyat degeri: " + fiyat);//100.0

        System.out.println("Yuzde 11 indirimli fiyat: " + indir11(fiyat));//89.0
        System.out.println("Yuzde 22 indirimli fiyat: " + indir22(fiyat));//78.0
        System.out.println("Yuzde 33 indirimli fiyat: " + indir33(fiyat));//67.0
// Burada asil nokta: atanan deger(100) her bir method icin kopyalanarak makyajlanir(89-78-67 gibi).

        System.out.println("Method sonrasi fiyat degeri: " + fiyat);//100.0
    }//main sonu

    public static double indir11(double fiyat) {
        return fiyat *= 0.89;
    }

    public static double indir22(double fiyat) {
        return fiyat *= 0.78;
    }

    public static double indir33(double fiyat) {
        return fiyat *= 0.67;
    }
}