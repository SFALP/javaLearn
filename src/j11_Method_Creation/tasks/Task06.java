package j11_Method_Creation.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Geometrik sekillerin alan ve cevresinin bulundugu programa Hosgeldiniz!");
        System.out.println("Öncelikle asagidaki geometrik sekillerden birini yonlendirmelere uygun sekilde seciniz");
        System.out.println("Paralelkenar icin (1), dikdortgen icin (2), dikucgen icin (3) tanımlayiniz: ");
        int x = scan.nextInt();
        double a=0;
        double b=0;

        switch (x){
            case 1:
                paralelk(a, b);
                break;
        case 2:
                dikdortgen(a, b);
                break;
        case 3:
               ucgen(a, b);
                break;
            default:
                System.out.println("Hatali bir deger tanimladiniz. Lutfen tekrar deneyiniz");
        }
    }

    public static void paralelk(double x, double y) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen paralelkenarin yuksekligini tanimlayiniz: ");
        x = scan.nextDouble();
        System.out.print("Lutfen paralelkenarin 1. uzunlugunu tanimlayiniz: ");
        y = scan.nextDouble();

        double alan = x * y;
        System.out.println("Paralelkenarin alani: " + alan);
        double cevre = 2 * (x + y);
        System.out.println("Paralelkenarin cevresi: " + cevre);
    }

    public static void dikdortgen(double x, double y) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen dikdortgenin kisa kenarini tanimlayiniz: ");
        x = scan.nextDouble();
        System.out.print("Lutfen dikdortgenin uzun kenarini tanimlayiniz: ");
        y = scan.nextDouble();
        double alan = x * y;
        System.out.println("Dikdortgenin alani: " + alan);
        double cevre = 2 * (x + y);
        System.out.println("Dikdortgenin cevresi: " + cevre);
    }

    public static void ucgen(double x, double y) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen dik ucgenin hipotenus haric 1.kenarini tanimlayiniz: ");
        x = scan.nextDouble();
        System.out.print("Lutfen dik ucgenin hipotenus haric 2. kenarini tanimlayiniz: ");
        y = scan.nextDouble();
        double alan = (x * y) / 2;
        System.out.println("Ucgenin alani: " + alan);
        double cevre = x + y + Math.sqrt((x * x) + (y * y));
        System.out.println("Ucgenin cevresi: " + cevre);
    }
}
