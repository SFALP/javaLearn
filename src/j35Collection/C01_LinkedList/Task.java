package j35Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
        Task--> Node degerleri "Yakup", "JavaCAN", "JavaTAR", "Tekinay" olan bir linkedList create ediniz.
        Girilen bir String degerin LinkedList'te varligini kontrol edip, varsa silip "Agam eleman silindi",
        yoksa "Agam aradiginiz kisiye ulasilamadi" print eden kod create ediniz.

         */
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("yakup", "javaCAN", "javaTAR", "tekinay"));
        System.out.println("ll1 version 0: " + ll1);

        System.out.print("Agam kimi ariyorsun: ");
        String aganinAdami = sc.nextLine().toLowerCase();

        if (ll1.contains(aganinAdami)) {
            ll1.remove(aganinAdami);
            System.out.println("Agam eleman silindi");
            System.out.println("Yeni ll1: " + ll1);
        } else {
            System.out.println("Agam aradiginiz kisiye ulasilamadi");
            System.out.println("Guncel ll1: " + ll1);
        }
    }
}