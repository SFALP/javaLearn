package j11_Method_Creation.tasks;

import java.util.Scanner;

public class Task14_FazlaMesai {

    public static void main(String[] args) {

    /* Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */
        System.out.println("Normal ve fazla mesai calisma icin maas hesaplama programina Hosgeldiniz");
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        System.out.println("Yevmiyeniz: " + ucretHesapla(a, b, c, d));
        System.out.println("Hayirli kazanclar");
    }

    public static double ucretHesapla(double a, double b, double c, double d) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen mesai baslangic saatinizi giriniz: ");
        double x = scan.nextDouble();
        System.out.print("Lutfen mesai bitis saatinizi giriniz: ");
        double y = scan.nextDouble();
        System.out.print("Lutfen saatlik ucretinizi tanimlayiniz: ");
        double z = scan.nextDouble();
        System.out.print("Lutfen fazla mesai icin maas carpaninizi tanimlayiniz: ");
        double t = scan.nextDouble();

        if ((y - x) > 8) {
            return (8 * z) + ((y - x - 8) * z * t);
        } else {
            return (y - x) * z;
        }
    }
}