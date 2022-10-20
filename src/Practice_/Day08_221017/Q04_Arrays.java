package Practice_.Day08_221017;

/*
 * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
 * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
 * istenenToplam=9;
 */
public class Q04_Arrays {
    public static void main(String[] args) {

        int arr[] = {5, 7, -6, 4, 2, 15, 3, 8, 1};
//        System.out.println("istenen toplam: " + istenenToplam(arr));
        int istenenToplam = 9;
        toplamDokuz(arr, istenenToplam);
    }

    public static void toplamDokuz(int[] arr, int istenenToplam) {
        for (int i = 0; i < arr.length; i++) {//1.toplam
            for (int j = i; j < arr.length; j++) {//1.toplam
                if (arr[i] + arr[j] == istenenToplam) {
                    System.out.println(arr[i] + " ile (" + arr[j] + ") sayilarinin toplami: " + istenenToplam);
                }
            }
        }
    }
}
    //public static int istenenToplam(int arr[]) {
    //    int sonuc = 0;
    //    for (int i = 0; i < arr.length; i++) {
    //        for (int j = 0; j < arr.length; j++) {
    //            sonuc = arr[i] + arr[j];
    //            if (sonuc == 9) {
    //                return sonuc;
    //            }
    //        }

    //    }
    //    return sonuc;