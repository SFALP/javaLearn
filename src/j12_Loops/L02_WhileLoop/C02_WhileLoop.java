package j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

//TASK 1: Girilen sayinin rakamlari toplamini print eden METHOD create ediniz.
        System.out.println("\n*** TASK1 ***");
        System.out.print("Lutfen bir tamsayi tanimlayiniz: ");
int a1=sc.nextInt();

        System.out.println("Girilen sayinin rakamlari toplami: "+rakamTopla(a1));

    }// main sonu

    public static int rakamTopla(int a1) {
        int rakamToplami=0;
    while (a1>0){//sayi 1 olana kadar body action calis.

        rakamToplami+=a1%10;//sayinin her zaman 1'ler basamaginda olan rakam eklenmis olur
a1/=10;//sayi bir basamak eksiltildi.

        }
        return rakamToplami;
    }

    }

