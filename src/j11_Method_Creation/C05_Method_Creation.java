package j11_Method_Creation;

import java.util.Scanner;

public class C05_Method_Creation {
    public static void main(String[] args) {
// TASK: Girilen 2 sayiyi sacilen 4 isleme gore hesaplayan method create ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int sayı1 = sc.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        int sayı2 = sc.nextInt();
        System.out.print("Matematiksel isleminizi giriniz(+, -, *, /) : ");
        char islem = sc.next().charAt(0);
islemMenu(islem,sayı1, sayı2);

    }//main sonu
public static void islemMenu(char ch, int x, int y){

        switch (ch){
            case '+':
                topla(x,y);
                break;
        case '-':
            cikar(x,y);
                break;
        case '*':
            carp(x,y);
                break;
        case '/':
            bol(x,y);
                break;
            default:
                System.out.println("Hatali islem yapildi. Tekrar deneyiniz: ");
        }
}


    public static void topla(int a, int b){
        System.out.println("a+b: "+(a+b));}
    public static void carp(int a, int b){
        System.out.println("a*b: "+(a*b));}
    public static void cikar(int a, int b){
        System.out.println("a-b: "+(a-b));}
    public static void bol(int a, int b){
        System.out.println("a/b: "+(a/b));
    }
}