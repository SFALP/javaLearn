package j11_Method_Creation.tasks;

import java.util.Scanner;

public class Task07_EnKucukSayi {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("En kucuk sayiyi bulma programina hosgeldiniz");
        System.out.println("Lutfen 1. sayiyi tanimlayiniz");
        double a = scan.nextDouble();
        System.out.println("Lutfen 2. sayiyi tanimlayiniz");
        double b = scan.nextDouble();
        System.out.println("Lutfen 3. sayiyi tanimlayiniz");
        double c = scan.nextDouble();
        islem(a, b, c);
    }

    public static void islem(double a, double b, double c) {
        if (a < b && a < c) {
            System.out.println("En kucuk sayi: " + a);
        } else if (b < a && b < c) {
            System.out.println("En kucuk sayi: " + b);
        } else
            System.out.println("En kucuk sayi: " + c);
    }
}

