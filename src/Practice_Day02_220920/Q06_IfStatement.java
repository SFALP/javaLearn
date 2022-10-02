package Practice_Day02_220920;

import java.util.Scanner;

public class Q06_IfStatement {
    public static void main(String[] args) {
/*   TASK 1: Not hesaplayici
              A => 90 ~100
              B => 80 ~ 89
              C => 70 ~ 79
              D => 60 ~ 69
              F =>  0 ~ 59
              sartlari aralik belirterek yaziniz
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Puan hesaplama programına hpşgeldiniz!");
        System.out.print("\n100 üzerinden almış olduğunuz notu tanımlayınız: ");
        double x = scan.nextInt();
        if (x >= 0 && x <= 100) {
            if (x < 60) {
                System.out.println("Notunuz F");
            } else if (x < 70) {
                System.out.println("Notunuz D, Tebrikler :=)");
            } else if (x < 80) {
                System.out.println("Notunuz C, Tebrikler :=)");
            } else if (x < 90) {
                System.out.println("Notunuz B, Tebrikler :=)");
            } else
                System.out.println("Notunuz A, Tebrikler :=)");
        } else
            System.out.println("Beklenen değerlerin dışında bir veri tanımlandığı için ilerleyememkteyiz. Lütfen tekrar deneyin.");

 /* TASK 2:
     write a program that:
        1. 0 ~12 ==> good morning
        2. 12 ~ 15 ==> good afternoon
        3. 15 ~ 23 ==> good night
        4. 12 ==> good noon
    */
        System.out.print("Lütfen saati 0-24 arasında tanımlayınız: ");
        int h = scan.nextInt();
        if (h >= 0 && h < 24) {
            if (h < 12) {
                System.out.println("Good morning");
            } else if (h < 15) {
                System.out.println("Good afternoon");
            } else if (h < 23) {
                System.out.println("Good night");
            } else {
                System.out.println("Good noon");
            }
        } else
            System.out.println("Tanımlanan değerlerin dışında bir veri tanımlandığı için işlem yapılamamaktadır. Lütfen tekrar deneyiniz.");

    }
}
