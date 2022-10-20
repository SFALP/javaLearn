package j11_Method_Creation.tasks;

import java.util.Scanner;

public class Task08_ArtikYilKontrol {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Artik yil tespit etme programina Hosgeldiniz");
        System.out.println("Lutfen bir yil tanimlayiniz: ");
        int y=scan.nextInt();
        aYil(y);
    }
public static void aYil(int y){
        if (y%4==0 && y%100==0 && y%400==0){
            System.out.println("Girilen yil, artik yildir");
        }else System.out.println("Girilen yil, artik yil degildir");
}
}