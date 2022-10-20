package Practice_.Day07_221011;

import java.util.Scanner;

/*
 * Kullanicidan bir cumle ve bir harf alin,
 * Cumlede harfin kac kere
 * kullanildigini bulup, yazdirin
 *
 * ORNEK:
 *
 * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
 *
 * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
 */
public class Q10_Loop_HarfKacDefaVar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Lutfen bir ifade tanimlayiniz: ");
        String ifade= sc.nextLine().toLowerCase();
        System.out.print("Lutfen sayisini bilmek istediginiz harfi belirtiniz: ");
    char harf=sc.nextLine().toLowerCase().trim().charAt(0);

    int t=0;
        for (int i = 0; i < ifade.length(); i++) {
            if (ifade.charAt(i)==harf){
                t++;
            }
        }if (t>0) {
            System.out.println("Girdiginiz metin icinde (" + harf + ") harfi (" + t + ") defa bulunmaktadir");
        }else System.out.println("Girilen ifadede ("+harf+") harfi bulunmamaktadir.");
    }
}