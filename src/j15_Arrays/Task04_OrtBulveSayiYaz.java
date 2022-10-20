package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task04_OrtBulveSayiYaz {
    public static void main(String[] args) {

// TASK: girilen bir intiger array elemanlarindan ortalamadan buyuk olan eleman sayisini print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Kac elemanlı bir array olusturmak istiyorsunuz: ");

        int arr[] = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Lutfen (" + i + ") indexi tanimlayiniz: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Girilen array: " + Arrays.toString(arr));

        int arrToplam = 0;
        for (int i = 0; i < arr.length; i++) {
            arrToplam += arr[i];

        }
        System.out.println("Array toplam: " + arrToplam);
// ortalama buldur ve buyuk sayilari yazdir.

        int ort = arrToplam / arr.length;
        System.out.println("Array ortalamasi: " + ort);
        int ortGecenElemanSayisi = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ort) {
                ortGecenElemanSayisi++;
            }
        }
        System.out.println("Ortalamayi gecen eleman sayisi: " + ortGecenElemanSayisi);
    }
}