package Practice_.Day09_221018;

import java.util.Scanner;

// Kullanicidan bir cumle isteyin ve kelime sayisini yazdiriniz.
public class Q03_Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir cumle tanimlayiniz");
        String a = sc.nextLine();
        String arr[] = a.split(" ");
        System.out.println(arr.length);
    }
}