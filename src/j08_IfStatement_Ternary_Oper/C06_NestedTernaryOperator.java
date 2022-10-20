package j08_IfStatement_Ternary_Oper;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
 TASK :
Kullanicidan bir sayi aliniz
Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı tanımlayınız: ");
        double s=scan.nextDouble();
        System.out.println(s>=0 ? (s<10 ? "Girilen sayı rakamdır":"Girilen sayı pozitif sayıdır"):("Negatif Sayı"));//Negatif sayı ifadesinin sağı ve soludaki parantezlerin yazılması şart değildir, olmasa da olur.
// Soru işareti kadar iki nokta yazılmalıdır. Soru işareti "eğer", iki nokta ise "değilse" anlamı taşır.
    }
}
