package j09_Switch_Statement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
// TASK --> girilen ayın hangi mevsimde olduğunu print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ay numarası tanımlayınız");
        int a = scan.nextInt();

/* Bu ay değerleri; örneğin 4 yerine nisan olarak girilmesi şeklinde kurgulanırsa,
String m=scan.nextLine(); yazılır, sonrasında da örneğin case 4 ifadelerinin
case nisan olarak güncellenmesi gerekmektedir.
 */
        switch (a) {
            case 12:
            case 1:
            case 2:
                System.out.println("Diese Jahreszeit ist WINTER.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Diese Jahreszeit ist FRÜHLING.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Diese Jahreszeit ist SOMMER.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("\"Diese Jahreszeit ist HERBST");
                break;
            default:
                System.out.println("Girilen deger tanimsizdir, lutfen tekrar deneyiniz");
                break;
        }
    }
}