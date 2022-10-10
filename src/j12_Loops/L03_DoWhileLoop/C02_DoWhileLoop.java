package j12_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

// TASK: Girilen sayi 17'den kucuk ise "kazandiniz", değilse "kaybettiniz" do while loop ile print eden code create ediniz.

Scanner sc=new Scanner(System.in);

int sayi=0;

do {
    System.out.print("Bir sayi tanimlayiniz: ");
    sayi= sc.nextInt();
    System.out.println(sayi+ " icin kazandiniz... :)");
    sayi++;
}while (sayi<=17);
        System.out.println(sayi+ " icin kaybettiniz... :(");
    }
}