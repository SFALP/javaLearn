package j17_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Task99 {
    public static void main(String[] args) {
        // TASK2:girilen int array elemanlari toplamini print eden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("Array kac elemanli olmasini istersiniz? ");
        int arr[] = new int[sc.nextInt()];//array, eleman sayisiyla birlikte tanimlandi.

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Lutfen (" + i + "). indexi tanimlayiniz: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Olusturulan Array: " + Arrays.toString(arr));//array yazdirildi
        Arrays.sort(arr);//array siralandi.
        System.out.println("Kucukten buyuge siralanirsa: ");
        System.out.println(Arrays.toString(arr));

        // TOPLAMA ISLEMI için:
        int arrTopla = 0;//Local variabledir
        for (int i = 0; i < arr.length; i++) {
            arrTopla += arr[i];
        }
        System.out.println("Array elemanlarinin toplami: " + arrTopla);
    }

}
