package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {
// TASK 1: Girilen bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.
Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir tamsayı tanımlayınız: ");
        int a=scan.nextInt();
        System.out.println(a>9 || a<-9 ?"sayı 2 veya daha fazla basamaklıdır":"sayı tek basamaklıdır");
    }
}