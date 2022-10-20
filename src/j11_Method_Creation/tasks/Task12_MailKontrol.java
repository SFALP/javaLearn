package j11_Method_Creation.tasks;

import java.util.Scanner;

public class Task12_MailKontrol {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gecerli bir mail adresi tanimlayiniz.");
        String m=scan.nextLine().toLowerCase();

mail(m);

    }
public static void mail(String m){
        if (m.contains("@") && m.contains(".") && m.length()>=1){
            System.out.println("true");
        }else System.out.println("false");

}


}