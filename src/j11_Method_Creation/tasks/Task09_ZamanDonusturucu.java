package j11_Method_Creation.tasks;

import java.util.Scanner;

public class Task09_ZamanDonusturucu {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
Scanner scan=new Scanner(System.in);
        System.out.println("Saati saniyeye ceviren programa hosgeldiniz");
System.out.print("Lutfen saat verisini tanimlayiniz: ");
        int s=scan.nextInt();
saniye(s);
    }
public static void saniye(int s){
    System.out.println("Tanimlanan saatin saniye karsiligi: "+s*60*60);
}
}