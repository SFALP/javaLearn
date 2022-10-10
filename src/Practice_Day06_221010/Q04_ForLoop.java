package Practice_Day06_221010;

import java.util.Scanner;

/*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
   ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
   hesaplayan kodu yazın
  Örnek Ekran Çıktısı
  Girilen sayı=4
  Kareler toplamı=14
   */
public class Q04_ForLoop {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Lutfen 1'den buyuk bir tamsayi tanimlayiniz: ");
        int a=sc.nextInt();

        int kareTop=0;
        for (int i = 1; i <a ; i++) {
            kareTop+=i*i;
        }            System.out.println("Kareler toplami: "+kareTop);
    }
}