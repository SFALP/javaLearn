package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task08_ArrTekElemanYaz {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        System.out.println("Array elemanlarindan tek sayilari goruntuleme programina Hosgeldiniz!");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Lutfen arrayin (" + (i + 1) + ") elemanini tanimlayiniz: ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Olusturulan array: " + Arrays.toString(arr));

        System.out.print("\nTanimlanan arrayin tek elemanlari: ");
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}