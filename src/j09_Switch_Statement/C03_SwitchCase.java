package j09_Switch_Statement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
// TASK --> Girilen ayın numarasına göre ayda toplamda kaç gün olduğunu print eden cod create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ay numarası tanımlayınız");
        int a = scan.nextInt();

        switch (a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Bu ayda 31 gün bulunmaktadır.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Bu ayda 30 gün bulunmaktadır.");
                break;
            case 2:
                System.out.println("Lütfen yıl degerini de tanimlayiniz");
                int y = scan.nextInt();
                System.out.println(y % 4 == 0 ? ("Girilen ayda 29 gün bulunmaktadır") : ("Girilen ayda 28 gün bulunmaktadır"));
                break;
            default:
                System.out.println("Girmiş olduğunuz değer tanımlanmadığından işleme devam edilememektedir. Lütfen tekrar deneyiniz");
        }
    }
}
