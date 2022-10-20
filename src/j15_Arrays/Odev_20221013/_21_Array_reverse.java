package j15_Arrays.Odev_20221013;

import java.util.Arrays;
import java.util.Scanner;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Arrayin eleman sayisini belirtiniz: ");
        int x = sc.nextInt();
        int sayi[] = new int[x];

        for (int i = 0; i < sayi.length; i++) {
            System.out.print("Lutfen arrayin (" + (i + 1) + "). elemanini tanimlayiniz: ");
            sayi[i] = sc.nextInt();
        }
        System.out.println("Olusturulan Array: " + Arrays.toString(sayi));
        int yeniArr[] = new int[sayi.length];
        for (int i = sayi.length - 1; i >= 0; i--) {
            System.out.print(sayi[i] + " ");
        }
    }
}