package j13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {

// girilen bir ifade'deki c karakterine kadar a karakter sayisini print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir ifade giriniz: ");
String birSeyler=sc.nextLine();
int aSayisi=0;
        for (int i = 0; i <birSeyler.length() ; i++) {
            if (birSeyler.charAt(i)=='a'){
                aSayisi++;
            } else if (birSeyler.charAt(i)=='c') {
                break;
            }
            System.out.println("Dongude isleme giren karakterler: "+birSeyler.charAt(i));
        }
        System.out.println("Yazilan ifadede a karakteri: "+aSayisi);
    }
}