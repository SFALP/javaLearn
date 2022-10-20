package Practice_.Day04_220927;

import java.util.Scanner;

public class Q02_StringManipulation {
    public static void main(String[] args) {

//Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.
//yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen ilk kelimeyi tanimlayiniz: ");
        String a=scan.nextLine();
        System.out.print("Lutfen ikinci kelimeyi tanimlayiniz: ");
    String b=scan.nextLine();

        System.out.println("1.metotla birlesim: "+a+" "+b);
        System.out.println("2. Metotla birleşim: "+a.concat(" "+b));

        String c= a.substring(1);  // 1.ifadenin ilk harfi olmadan alınması kodudur.
        String d= b.substring(1);  // 2.ifadenin ilk harfi olmadan alınması kodudur.
        System.out.println("İlk harfler olmadan kelimelerin birlesimi: "+c+" "+d);
    }
}
