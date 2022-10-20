package j08_IfStatement_Ternary_Oper;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        /* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code

 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.
 */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.
        Scanner scan= new Scanner(System.in);
        System.out.println("Sayının tek - çift olması durumu programına Hoşgeldiniz!");
        System.out.print("Lütfen bir tamsayı belirleyiniz:  ");
        int x= scan.nextInt();


        System.out.println("*****IF ELSE Çözümü********");
        if (x%2==0){
            System.out.println("Sayı çifttir");
        }else
            System.out.println("Sayı tektir.");

        System.out.println("*********Ternary Çözümü*******");
        System.out.println(x%2==0 ? "Sayı Çifttir" : "Sayı Tektir");


 /*
TRICK--> Ternary operator işlem sonucunda TRUE veya FALSE sonucuna göre bir çıktı verir. Eğer bu çıktı type'a göre
bir variable'a atanmazsa sout ile doğrudan print edilmelidir.
 */
// TASK 2: Girilen tamsayının negatif olması durumunu kontrol edip print ediniz.
        System.out.println("*********TASK 2 ÇÖZÜMÜ*****");
        System.out.println(x<0 ? "Sayı negatiftir" : "Sayı pozitiftir");


    }
}
