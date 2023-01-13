package j29_Exceptions;

import java.util.Scanner;

/*
Task -> Girilen password'un 6 karakterden az 10 karakterden fazla olmamasını kontrol eden code create ediniz
 */
public class Task01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Agam password giresen: ");
        String password = sc.nextLine();

        try {
            if (password.length() < 6) {
                throw new IllegalArgumentException("Agam 6 karakterden kisa sifre girdin :(.");
            } else if (password.length() > 10) {
                throw new IllegalArgumentException("Agam 10 karakterden fazla sifre girdin :(.");
            }else System.out.println("Agam sifren gecerli :) "+password);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("Agam Allah seni bildigi gibi yapsin, selametle :=( ");
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        System.out.println("Agam sorun handle edildi, devamkeee :)");//bu kod calismissa program sorunsuz kirilmadan run olmustur.
    }
}
