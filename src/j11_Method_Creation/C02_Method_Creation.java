package j11_Method_Creation;

import java.util.Scanner;

public class C02_Method_Creation {
    public static void main(String[] args) {
// TASK: Girilen 3 notun ortalamasını hesaplayan method create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("1. notu tanimlayiniz: ");
        double n1 = scan.nextDouble();
        System.out.print("2. notu tanimlayiniz: ");
        double n2 = scan.nextDouble();
        System.out.print("3. notu tanimlayiniz: ");
        double n3 = scan.nextDouble();

        System.out.println("Ortalamaniz:" + ort(n1, n2, n3));
    }

    public static double ort(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}