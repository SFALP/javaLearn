package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    kullanıcının  10 sene önceki yaşadığın şehri print eden code create ediniz.   */
Scanner tara= new Scanner(System.in);
        System.out.println("Wo haben Sie vor zehn Jahren gelebt? ");
        String Ort= tara.nextLine();
        System.out.println("Sie haben in " + Ort + " gelebt");


    }
}
