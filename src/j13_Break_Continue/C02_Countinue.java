package j13_Break_Continue;
/*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.

 */


import java.util.Scanner;

public class C02_Countinue {
    // Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("AGAm meyıl hesabını giresen :");

        String meyıl = sc.nextLine();// egik Gabık @ cimey ıl. k om

        for (int i = 0; i < meyıl.length(); i++) {

            char ch = meyıl.charAt(i);

            if (ch == ' ') {
                continue;
            }
            System.out.print(ch);
        }
    }
}