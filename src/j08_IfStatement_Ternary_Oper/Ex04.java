package j08_IfStatement_Ternary_Oper;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*
        TASK1 --> Girilen bir karaktesin harf olup olmadığını kontrol eden cod oluşturunuz.

        */
        Scanner scan= new Scanner(System.in);
        System.out.print("Bir karakter tanımlayınız: ");
char ch = scan.nextLine().charAt(0);
if ((ch>='A' && ch<='Z') || ch>='a' && ch<='a') {
    System.out.println("Girilen ifadenin ilk karakteri harftir :=): "+ch);
}else
    System.out.println("Girilen ifadenin ilk karakteri harf değildir. :=( ");




    }
}
