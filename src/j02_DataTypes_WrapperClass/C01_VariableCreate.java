package j02_DataTypes_WrapperClass;

public class C01_VariableCreate {
    public static void main(String[] args) {
        // 1.Yol -> best practice(Recomended) tavsiye edilen
        int yas=30;
        int maas=5000;
        System.out.println("yas");//yas yazdırılacak
        System.out.println(yas);//30 yazdırılacak
        System.out.println(maas);//5000 yazdırılacak
        System.out.println("Sfalp erstes Gehalt: "+maas);//5000
        // 2. Yol
        int boy; // değeri olmadan sadece boy ifadesi atandı
        /* System.out.println(boy);//değeri atanmamış variable (değişkeni) hiçbir aksiyonda kullanılamaz. CTE hatası verir

         */
        boy=180;
        System.out.println("Boyunuz: "+boy); //180
        //3.Yol
        int yevmiye, age, kilo; // birden çok qaynı tipte değişken tanımlandı
        age = 30;
        yevmiye = 200;
        kilo = 84; // tanımlama değişkenlerine değer ataması yapıldı.

        int gunluk=200, yil=2022, agirlik=80;
            //TRICK: Bir variable sadece 1 kez tanımlanabilir, birden çok değer atanabilir.
        System.out.println(gunluk);//200 yazdırılır.
        gunluk=250; //gunluk değerinin yeni değeri 250 olarak atandı.
        System.out.println("Günlük güncel değeri:" +gunluk);//günlük değer update edilerek son atanan değer(200) yazdırılır.
    }
}
