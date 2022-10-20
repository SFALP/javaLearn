package j10_String_Manipulations.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ad-Soyad bilgilerinizi tek seferde tanımlayiniz: ");
        String a = scan.nextLine();
        int x = a.indexOf(" ");
        int y = a.lastIndexOf(" ");
        System.out.println("AD: " + a.substring(0, x));
        System.out.println("SOYAD: " + a.substring(y));
    }
}