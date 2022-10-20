package j08_IfStatement_Ternary_Oper;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {
// TASK-> girilen bir tamsayı çiftse yarısını,
// değilse "girilen sayı tek oldugu için yarısı tamsayı değildir" print eden code create ediniz
Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir tamsayı tanımlayınız: ");
int a= scan.nextInt();

        System.out.println(a%2==0 ? a/2 : "Girilen sayı tek sayı oldugu icin yarısı tamsayı degildir.");
/*
int sonuc= a%2==0 a/2 : "Girilen sayı tek sayı oldugu icin yarısı tamsayı degildir." (İki nokta üst üste
ifadesinin sağı ve solunun data type'ları aynı değildir.

TRICK: Turnary 2 case (True oder False) için farklı data çıktısı veriyorsa variable atama yapmadan sout yapılmalıdır.
Yada Turnary çıktısı aynı data type'a dönüştürülmelidir.(Sterilization)
 */
    }
}
