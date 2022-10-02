package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

    /*    kullanıcının
          Doğum gününü print eden code create ediniz */
Scanner scan= new Scanner(System.in);
        System.out.println("Wann sind Sie geboren?");
        String Geboren= scan.nextLine();
        System.out.println("Sie wurden am " + Geboren + " geboren");


    }
}
