package Practice_.Day01_220919;

import java.util.Scanner;

public class Q09_Scanner2 {
    public static void main(String[] args) {
//  Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin (pi =3.14)
//  Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
//  Isim – soyisim : Elly Dainty
//  Kullanicidan ismini alip isminin bas harfini yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen çemberin yaricapini tanimlayınız: ");
        double r = scan.nextDouble();
        double a = 2 * 3.14 * r;
        double b = 3.14 * r * r;
        System.out.println("Çemberin çevresinin ölçüsü: " + a);
        System.out.println("Çemberin alanının ölçüsü: " + b);
// TASK 2:  Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin.
//  Isim – soyisim : Elly Dainty
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen isminizi yazınız");
        String x = sc.nextLine();
        System.out.println("Lütfen soyisminizi yazınız");
        String y = sc.nextLine();
        System.out.println("İsim - Soyisim : " + x + " " + y);
//TASK 3:Kullanicidan ismini alip isminin bas harfini yazdirin.
        Scanner s = new Scanner(System.in);
        System.out.println("Lütfen isminizi yazınız");
        String q = s.nextLine();
        System.out.println(q.charAt(0));


    }
}
