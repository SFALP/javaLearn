package j16_ArrayList.Task_20221015;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task01_Market {
    /* TASK :
     * Bir marketin 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */
    static ArrayList<String> tag = new ArrayList<>(List.of("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
    static ArrayList<Integer> kazanc = new ArrayList<>();////Kazanc isimli array olusturuldu.
    static double ort = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bakkal programina Hosgeldiniz!");
        System.out.println("Gunler = " + tag);// Gun arraylist yazdirildi.

        int gun = 0;
        while (gun <= tag.size() - 1) {//Gun bazinda kazanclarin sirayla atanacagi while dongusu olusturldu
            System.out.print("Lutfen (" + tag.get(gun) + ") gunu icin bir kazanc degeri tanimlayiniz: ");
            kazanc.add(sc.nextInt());//kazanc isimli arraylist'in elemanlari olarak kullanicidan alinacak degerler atandi.
            gun++;
        }
        System.out.println("Gune gore kazanc(sirasiyla) = " + kazanc);//Kazanc isimli array yazdirildi.

        System.out.println("Ortalama Kazanc: " + getOrtalamaKazanc(kazanc));
        System.out.println("Ortalama Ustunde Kazanilan Gunler: " + getOrtalamaninUstundeKazancGunleri());
        System.out.println("Ortalama Altinda Kazanilan Gunler: " + getOrtalamaninAltindaKazancGunleri());
        System.out.println("Tesekkur Ederiz :=)");
    }//main disi
    public static List getOrtalamaninAltindaKazancGunleri() {
        ArrayList<String> ortAlt = new ArrayList<>();//ortAlt isminde ArrayList olusturuldu
        for (int i = 0; i < tag.size(); i++) {//kazanc eleman sayisi kadar loop yapildi
            if (kazanc.get(i) < ort) {//gun bazinda kazancin ort altinda olma kontrolu yapildi
                ortAlt.add(tag.get(i));//ortala alti olan gun, ortAlt isimli ArrayList'e atandi.
            }
        }
        return ortAlt;//ort alti olan gunlerin oldugu ArrayList main Class'a gonderildi.
    }
    public static List getOrtalamaninUstundeKazancGunleri() {
        ArrayList<String> ortUstu = new ArrayList<>();//ortUstu isminde ArrayList olusturuldu
        for (int i = 0; i < kazanc.size(); i++) {//kazanc eleman sayisi kadar loop yapildi
            if (kazanc.get(i) > ort) {//gun bazinda kazancin ort uzerinde olma kontrolu yapildi
                ortUstu.add(tag.get(i));//ortala ustu olan gun, ortUst isimli ArrayList'e atandi.
            }
        }
        return ortUstu;//ort ustu olan gunlerin oldugu ArrayList main Class'a gonderildi.
    }
    public static double getOrtalamaKazanc(ArrayList<Integer> kazanc) {
        int toplam = 0;
        for (int i = 0; i < kazanc.size(); i++) {
            toplam += kazanc.get(i);//kazanclarin toplami bulundu
            ort = toplam / kazanc.size();//ortalama hesaplandi
        }
        return ort;
    }
}