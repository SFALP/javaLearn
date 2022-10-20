package j13_Break_Continue;

import java.util.Scanner;

public class C03_Asal_Kontrol {
    public static void main(String[] args) {

// Girilen sayinin asal olmasini kontrol eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("1 den buyuk bir sayi tanimlayiniz: ");
int sayi=sc.nextInt();

boolean asalMi=true;
        for (int i = 2; i <sayi ; i++) {
if ((sayi&i)==0){//eger sayi kendisine kadar olan sayilara tam bolunuyorsa
asalMi=false;
break;// Girilen sayiyi bolen ilk sayi bulundugunda dongunun devam etmesinin mantigi yoktur,
// cunku sayinin asal olmadigi kesinlesmis olur.
}
        }if (asalMi) {
            System.out.println("Girilens ayi ASAL");
        }else System.out.println("Sayi asal degildir.");
    }
}