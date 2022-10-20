package j16_ArrayList.Task_20221015;

import java.util.Scanner;

public class Task08_OrtBuyukYaz {
    public static void main(String[] args) {

// TASK: Girilen sayilarin icinde ortalamadan buyuk olanlari print eden code create ediniz.

        Scanner sc = new Scanner(System.in);

        System.out.print("Lutfen arrayin boyutunu tanimlayiniz: ");
        int arrSayi[] = new int[sc.nextInt()];
        double ort = 0;
        int toplam = 0;
        for (int i = 0; i < arrSayi.length; i++) {

            System.out.print("Lutfen arrayin (" + (i + 1) + "). elemanini tanimlayiniz: ");
            arrSayi[i] = sc.nextInt();

            toplam += arrSayi[i];
            ort = toplam / arrSayi.length;
        }
        System.out.println("ort = " + ort);
        System.out.println("Ortalama ustu olan elemanlar: ");
        for (int i = 0; i < arrSayi.length; i++) {
            if (arrSayi[i] > ort) {
                System.out.println(arrSayi[i]);

            }
        }
    }
}