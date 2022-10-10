package j12_Loops.L01_ForLoop.Task;

import java.util.Scanner;

/*
TASK: girilen 5 sayinin 10 ile 20 arasi haric digerlerinin toplamini hesap eden code create ediniz.
 */
public class Task12_For_Sartli_Toplama {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

        int toplam=0;// ilk degeri 0, ve ismi toplam olan bir intiger atanir.

        for (int i = 1; i <=5 ; i++) {
            System.out.print("Lutfen "+i+". tamsayi tanimlayiniz: ");
int sayi=sc.nextInt();

if (sayi<=10 || sayi>=20){
    toplam+=sayi;
}//if sonu
        }//for sonu
        System.out.println("Girilen sayilardan sarta uygun olanlarin toplami: "+toplam);

    }
}
