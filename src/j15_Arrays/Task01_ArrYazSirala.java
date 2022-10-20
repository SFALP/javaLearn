package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01_ArrYazSirala {
    public static void main(String[] args) {
// Kullanicidan alinan degerlerle bir intiger array elemanlarini buyukten kucuge print eden cod create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen arrayin eleman sayisini belirtiniz: ");
        int arrBoyut = sc.nextInt();
        int arr[] = new int[arrBoyut];

        for (int i = 0; i < arrBoyut; i++) {
            System.out.print("Lutfen (" + i + "). index elemani tanimlayiniz: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Olusturulan array: " + Arrays.toString(arr));
        Arrays.sort(arr);//Arrayin kucukten buyuge siralanmasidir.
        System.out.println("Arrayin kucukten buyuge siralanmis halinin yazdirilmasi: " + Arrays.toString(arr));
        System.out.println();

        System.out.println("Buyukten kucuge yazdirilirsa: ");
        for (int i = arr.length - 1; i >= 0; i--) {//en buyuk sondaki elemandan baslar
            System.out.print(arr[i] + " ");
        }


    }
}
