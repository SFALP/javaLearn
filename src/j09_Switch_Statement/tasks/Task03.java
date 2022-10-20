package j09_Switch_Statement.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo [1-7] = ");
        int gunNo = oku.nextInt();

        if (gunNo > 0 && gunNo < 8) {
            switch (gunNo) {
                case 1:
                    System.out.println("Heute ist MONTAG");
                    break;
                case 2:
                    System.out.println("Heute ist DIENSTAG");
                    break;
                case 3:
                    System.out.println("Heute ist MITTWOCH");
                    break;
                case 4:
                    System.out.println("Heute ist DONNERSTAG");
                    break;
                case 5:
                    System.out.println("Heute ist FREITAG");
                    break;
                case 6:
                    System.out.println("Heute ist SAMSTAG");
                    break;
                case 7:
                    System.out.println("Heute ist SONNTAG");
                    break;
                default:
                    System.out.println("Es kann false oder undefinizierte Zahlen geben. Definieren Sie bitte erneut. Vielen Dank!");
            }
        } else
            System.out.println("Es kann false oder undefinizierte Zahlen geben. Definieren Sie bitte erneut. Vielen Dank!");
    }
}