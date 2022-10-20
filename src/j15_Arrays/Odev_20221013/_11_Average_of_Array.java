package j15_Arrays.Odev_20221013;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */
        int sayi[] = {12, 14, 21, 23, 10, 4};
        int toplam = 0;
        int ort = 0;
        for (int i = 0; i < sayi.length; i++) {
            toplam += sayi[i];
            ort = (toplam) / sayi.length;
        }
        System.out.println("Array elemanlarinin toplami (" + toplam + "), ortalamasi ise: " + ort);
    }
}