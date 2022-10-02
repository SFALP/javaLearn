package j04_AritmaticOperators.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 3 Basamaklı bir sayı tanımlayınız: ");
		int s= scan.nextInt();
		int basamak1= s/100;
		int basamak3= s%10;
		System.out.println("Sayının ilk rakamı: "+basamak1+"\n Sayının son rakamı: "+basamak3+"\n Bu iki sayının toplamı da: "+(basamak3+basamak1));

	}

}
