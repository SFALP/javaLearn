package j15_Arrays;

import java.util.Scanner;

public class Task13_3eBolunenSayi {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];
        System.out.println("Array elemanlari icin 8 adet sayi girmeniz gerekmektedir");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Lutfen " + arr.length + " elemanli arrayin (" + (i + 1) + "). elemanini tanimlayiniz: ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        bolunmeKontrol(arr);
        System.out.println("Tesekkur ederiz :)");
    }
    public static void bolunmeKontrol(int arr[]) {
        int sayiAdet = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i]+", ");
                sayiAdet++;
            }
        }
        System.out.println("\nTanimlanan arrayde sadece (" + sayiAdet + ") sayi 3'e tam bolunmektedir");
    }
}