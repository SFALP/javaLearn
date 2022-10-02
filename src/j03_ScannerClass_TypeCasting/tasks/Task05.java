package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
	Scanner scan= new Scanner(System.in);
		System.out.println("1. Tamsayıyı belirleyiniz (Sıfır hariç)");
		double x= scan.nextDouble();
		System.out.println("2. Tamsayıyı belirleyiniz(Sıfır hariç)");
		double y= scan.nextDouble();
		double a= x/y;
		double b= y/x;
		System.out.println("Bu sayıların toplamı: "+(x+y)+"\n(1.sayı - 2.Sayı): "+(x-y)+"\n(2.sayı - 1.Sayı): "+(y-x));
		System.out.println("Bu sayıların çarpımı: "+(x*y)+"\n 1.sayı / 2.Sayı: "+a+"\n 2.sayı / 1.Sayı: "+b);
		System.out.println("Tesekkürler");

	}

}
