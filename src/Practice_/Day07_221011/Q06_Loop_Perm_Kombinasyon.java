package Practice_.Day07_221011;

/*  Problem Tanımı
  Verilen iki sayının kombinasyonunu bulan kodu yazınız.
  Hatırlatma C(n,r) = n! / (r!(n-r)!)

  Verilen iki sayının permütasyonunu bulan kodu yazınız.
  Hatırlatma P(n,r) = n! / (n-r)!

  Ekran Çıktısı
  Birinci sayıyı giriniz: 15
  Ikinci sayıyı giriniz: 4
  Kombinasyon: 1365
  permütasyon: 32760

  Birinci sayıyı giriniz: 5
  Ikinci sayıyı giriniz: 3
  Kombinasyon: 10
  permütasyon: 60
*/

import java.util.Scanner;

public class Q06_Loop_Perm_Kombinasyon {
    public static void main(String[] args) {

        System.out.println("Permutasyon ve Kombinasyon hesabi programina Hosgeldiniz!");
        Scanner sc = new Scanner(System.in);
        System.out.print("N degerini pozitif bir tamsayi olarak tanimlayiniz: ");
        long n = sc.nextLong();
        System.out.print("R degerini pozitif bir tamsayi olarak tanimlayiniz: ");
        long r = sc.nextLong();

        System.out.println("Kombinasyonu: "+kombinasyon(n, r));
        System.out.println("Permutasyon = " + permutasyon(n, r));
    }

    public static long faktoryel(long sayi) {
        long faktSonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            faktSonuc *= sayi;

        }
        return faktSonuc;

    }

    public static long permutasyon(long n, long r) {
        if (n > 0 && r > 0 && n >= r) {
            return faktoryel(n) / faktoryel(n - r);
        }
        return 0;
    }

    public static long kombinasyon(long n, long r) {
        if (n > 0 && r > 0 && n >= r) {
            return faktoryel(n) / faktoryel((n - r) * faktoryel(r));
        }
        return 0;
    }
}
/* HOCA COZUMU
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n degeri :");
        long n = scan.nextLong();
        System.out.print("r degeri :");
        long r = scan.nextLong();
        System.out.println("kombinasyon(n,r) = " + kombinasyon(n, r));
        System.out.println("permutasyon(n,r) = " + permutasyon(n, r));
    }
    public static long faktoriyel(long sayi){
        long faktSonuc = 1;
        for (int i = 1; i <=sayi; i++) {
            faktSonuc=faktSonuc*i;
        }
        return faktSonuc;
    }
    private static long permutasyon(long n, long r) {
        if(n>0 && r>0 && n>=r){
            return  faktoriyel(n) / faktoriyel(n-r);
        }else return 0;
    }
    private static long kombinasyon(long n, long r) {
        if(n>0 && r>0 && n>=r){
            return  faktoriyel(n) / (faktoriyel(n-r)*faktoriyel(r));
        }else return 0;
    }
}

 */