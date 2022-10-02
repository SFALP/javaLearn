package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
Scanner scan= new Scanner(System.in);
        System.out.println("Hipotenüs hesaplama programına hoşgeldiniz!");
        System.out.println("Dik üçgenin bir kenarının uzunluğunu tanımlayınız: ");
        double b= scan.nextDouble();
        System.out.println("Dik üçgenin diğer kenar uzunluğunu tanımlayınız");
        double c= scan.nextDouble();
        double a= Math.sqrt(b*b+c*c);
        System.out.println("Üçgenin hipotenüs uzunluğu: "+a);

    }
}
