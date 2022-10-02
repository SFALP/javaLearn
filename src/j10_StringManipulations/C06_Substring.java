package j10_StringManipulations;

import java.util.Scanner;

public class C06_Substring {
    /*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */
    public static void main(String[] args) {
        String a = "Java bilen sırtı yere gelmez :) ";
        System.out.println(a.substring(10));// sırtı yere gelmez :)
        //a datasının son 10 karakterini yazdırınız.
        System.out.println(a.substring(a.length() / 2));// yere gelmez :)
//Son 10 karakteri yazınız.
        System.out.println(a.substring(a.length() - 10));// gelmez :)
// ilk 10 karakteri yazınız.
        System.out.println(a.substring(0, 10));//Java bilen
// ilk karakteri yazdırınız.
        System.out.println(a.substring(0, 1)); //J yazdırır.
// TASK: girilen 4 harfli kelimeyi tersten print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 4 harfli bir kelime tanımlayınız: ");
        String z = scan.nextLine();
        if (z.length() != 4) {
            System.out.println("Lutfen 4 harfli kelime girerek tekrar deneyiniz: ");
        } else { //Kelime Kale tanımlanırsa;
            System.out.println(z.substring(z.length() - 1));//e System.out.println(z.substring(3,4));//kodu da yazılabilir.
            System.out.println(z.substring(2, 3));//l
            System.out.println(z.substring(1, 2));//a
            System.out.println(z.substring(0, 1));//K
        }
    }
}
