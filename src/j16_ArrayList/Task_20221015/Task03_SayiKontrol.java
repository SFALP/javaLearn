package j16_ArrayList.Task_20221015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03_SayiKontrol {
    public static void main(String[] args) {

// bir listte istenen sayinin varligini kontrol eden code create ediniz.

        ArrayList<Integer> listSayi = new ArrayList<>(Arrays.asList(1, 24, 23, 14, 19, 60, 1, 55, 27, 1, 38));

        Scanner sc = new Scanner(System.in);
        boolean varMi = false;
        System.out.println("Lutfen aramak istediginiz sayiyi tanimlayiniz: ");
        int ara = sc.nextInt();

        for (int i = 0; i < listSayi.size(); i++) {
            if (ara == listSayi.get(i)) {
                varMi = true;
                System.out.println("Aradiginiz (" + ara + ") sayisi array'de tabiki de bulunmaktadir.");
                break;
            }
        }
        if (!varMi) {
            System.out.println("Aradiginiz sayi bulunmamaktadir.");
        }
    }
}