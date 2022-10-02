import java.util.Scanner;

public class Q16_NestedTernary {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {

            /* TASK :
                Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve
                en kucuk olanlarini konsola yazdiriniz
                int num1
                int num2
                int num3
            */
                Scanner dat = new Scanner(System.in);
                System.out.println("enter I= ");
                int num1 = dat.nextInt();
                System.out.println("enter II= ");
                int num2 = dat.nextInt();
                System.out.println("enter III= ");
                int num3 = dat.nextInt();
                System.out.println( num1 > num2 && num1 > num3 ? "biggest= " + num1 :
                        num2 > num3 ? "smallest= " + num3 :
                                num3 > num2 ? "smallest= " + num2 :
                                        num2 > num3 && num2 > num1 ? "biggest= " + num2 :
                                                num1 > num3 ? "smallest= " + num3 :
                                                        num3 > num1 ? "smallest= " + num1 :
                                                                num3 > num2 && num3 > num1 ? "biggest= " + num3 :
                                                                        num1 > num2 ? "smallest= " + num2 : "smallest= " + num1);
            }
        }

        /* ALTERNATİF ÇÖZÜM 1. BENİM ÇÖZÜMÜM ANCAK BİR YERDE MANTIK HATASI VAR, BU HATA BULUNAMADI :)
        System.out.println(i1 < i2 && i1 < i3?("Die 1.Zahl ist die kleinste: " + i1):(i3 > i2?("Die 3.Zahl ist die größte: " + i3):(i2 > i3?("Die 2.Zahl ist die größte: " + i2):("Die 2. und 3. Zahl sind gleich und größter: "+i2))));
        System.out.println(i2 < i1 && i2 < i3?("Die 2.Zahl ist die kleinste: " + i2):(i3 > i1?("Die 3.Zahl ist die größte: " + i3):(i1 > i3?("Die 1.Zahl ist die größte: " + i1):("Die 1. und 3. Zahl sind gleich und größter: "+i1))));
        System.out.println(i3 < i1 && i3 < i2?("Die 3.Zahl ist die kleinste: " + i3):(i2 > i1?("Die 2.Zahl ist die größte: " + i2):(i1 > i2?("Die 2.Zahl ist die größte: " + i1):("Die 1. und 2. Zahl sind gleich und größter: "+i2))));
*/
/*  2.ALTERNATİF ÇÖZÜM:
     Scanner scan = new Scanner(System.in);
        System.out.print("Önce yaş, ardından yaşınız uygunsa kilo bilgisi giriniz : ");
        int yas = scan.nextInt();
        int kilo;
        System.out.println((yas < 18 ? "Yaşın küçük Kan bağışı yapamazsın" : (((kilo = scan.nextInt()) > 50) ? kilo + "Kan Bağışı yapabilirsin" : "Kilon çok düşük" + kilo + " Kan bağışı yapamazsın")));

 */