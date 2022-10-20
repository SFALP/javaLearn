package j09_Switch_Statement.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int kacıncıGun = scan.nextInt();
        int a = 100 % 7; //2 -> Yani 100 gün sonrası = seçilen günden 2 gün sonrasıdır.
        int b = (a + kacıncıGun) % 7; // Bu işlem de haftalık düzenle birliktelik kurmak için yazıldı.

        if (kacıncıGun > 0 && kacıncıGun < 8) {
            switch (b) {
                case 1:
                    System.out.println("Nach 100 Tagen wird es heute MONTAG");
                    break;
                case 2:
                    System.out.println("Nach 100 Tagen wird es heute DIENSTAG");
                    break;
                case 3:
                    System.out.println("Nach 100 Tagen wird es heute MITTWOCH");
                    break;
                case 4:
                    System.out.println("Nach 100 Tagen wird es heute DONNERSTAG");
                    break;
                case 5:
                    System.out.println("Nach 100 Tagen wird es heute FREITAG");
                    break;
                case 6:
                    System.out.println("Nach 100 Tagen wird es heute SAMSTAG");
                    break;
                case 7:
                    System.out.println("Nach 100 Tagen wird es heute SONNTAG");
                    break;
                default:
                    System.out.println("Es kann false oder undefinizierte Zahlen geben. Definieren Sie bitte erneut. Vielen Dank!");
            }
        } else
            System.out.println("Es kann false oder undefinizierte Zahlen geben. Definieren Sie bitte erneut. Vielen Dank!");
    }
}