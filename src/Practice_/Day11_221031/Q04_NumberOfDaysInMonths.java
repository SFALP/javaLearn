package Practice_.Day11_221031;

/* bir aydaki gun sayisini hesaplayan bir Java programi create ediniz.
INPUT: Ay Numarasi:2 Yil : 2016
OUTPUT : Subat 2016 29 Gundur.
 */

import java.time.LocalDate;
import java.util.Scanner;

public class Q04_NumberOfDaysInMonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lutfen yil bilgisini tanimlayiniz: ");
        int yil = sc.nextInt();
        System.out.print("Lutfen ay verisini tanimlayiniz: ");
        int ay = sc.nextInt();
        LocalDate ld=LocalDate.of(yil,ay,1);
        System.out.println("ld.lengthOfMonth() = " + ld.lengthOfMonth());
        System.out.println(ld.getYear()+" "+ld.getMonth()+" "+ld.lengthOfMonth()+" days");
    }
}