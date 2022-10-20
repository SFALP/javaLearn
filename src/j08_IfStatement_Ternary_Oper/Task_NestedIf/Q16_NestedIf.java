import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q16_NestedIf {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Willkommen zum Programm mit den größten und kleinsten von 3 ganzen Zahlen.");
    System.out.print("Definieren Sie bitte erste ganzen Zahl: ");
    int i1 = scan.nextInt();
    System.out.print("Definieren Sie bitte zweiten ganzen Zahl: ");
    int i2 = scan.nextInt();
    System.out.print("Definieren Sie bitte erste dritten Zahl: ");
    int i3 = scan.nextInt();

    if (i1 < i2 && i1 < i3) {
        System.out.println("Die 1.Zahl ist die kleinste: " + i1);
        if (i3 > i2) {
            System.out.println("Die 3.Zahl ist die größte: " + i3);
        } else if (i2 > i3) {
            System.out.println("Die 2.Zahl ist die größte: " + i2);
        } else // i2 ve i3'ün eşit olması durumudur
            System.out.println("Die 2. und 3. Zahl sind gleich und größter: "+i2);
    }
    if (i2 < i1 && i2 < i3) {
        System.out.println("Die 2.Zahl ist die kleinste: " + i2);
        if (i3 > i1) {
            System.out.println("Die 3.Zahl ist die größte: " + i3);
        } else if (i1 > i3) {
            System.out.println("Die 1.Zahl ist die größte: " + i1);
        } else  // i3 ile i1'in eşit olması durumudur.
            System.out.println("Die 1. und 3. Zahl sind gleich und größter: "+i1);
    }
    if (i3 < i1 && i3 < i2) {
        System.out.println("Die 3.Zahl ist die kleinste: " + i3);
        if (i2 > i1) {
            System.out.println("Die 2.Zahl ist die größte: " + i2);
        } else if (i1 > i2) {
            System.out.println("Die 2.Zahl ist die größte: " + i1);
        } else   // i1 ve i2'nin eşit olması durumudur.
            System.out.println("Die 1. und 2. Zahl sind gleich und größter: "+i2);
    }
}
}



