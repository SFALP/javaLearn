package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task03_CarpimTablosu {

    public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir tamsayi tanimlayiniz: ");
        int s1 = sc.nextInt();
        System.out.println("Girilen (" + s1 + ") sayisinin carpim tablosu: ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(s1 + " x " + i + " = " + s1 * i);
        }
    }
}