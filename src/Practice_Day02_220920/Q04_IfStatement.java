package Practice_Day02_220920;

import java.util.Scanner;

public class Q04_IfStatement {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Y veya N harfinden birini seçiniz: ");
        char a = scan.next().charAt(0);
        if (a == 'Y' || a == 'y') {//charAt(0) yazıldığı için Y ile veya y ile başlayan herhangi bir kelime yazılsa da kod çalışır. Çünkü char koduyla yazılan ifadenin ilk harfi baz alınacaktır.(Ör: Yozgat)
            System.out.println("YES");
        } else if (a == 'N' || a == 'n') {//charAt(0) yazıldığı için N ile veya n ile başlayan herhangi bir kelime yazılsa da kod çalışır. Çünkü char koduyla yazılan ifadenin ilk harfi baz alınacaktır. (Nigde)
            System.out.println("NO");
        } else
            System.out.println("Hatalı bir veri tanımladınız. Lütfen tekrar deneyiniz");
    }
}