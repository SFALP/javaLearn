package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */
Scanner scan=new Scanner(System.in);
        System.out.println("Kg cinsinden bir ağırlık yazınız: ");
        byte kg= scan.nextByte();
        System.out.println("Kilo: "+kg);
// ANLAŞILAMADI!!!
    }
}
