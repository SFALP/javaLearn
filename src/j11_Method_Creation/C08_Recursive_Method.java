package j11_Method_Creation;

import java.util.Scanner;

public class C08_Recursive_Method {
    public static void main(String[] args) {

        /*
Recursive  call edildiğinde(cagirildiginda) run time'da(ekranda) programa ekstradan yük getiren bir yapıdadır
çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
Bu yüzden recursive (özyineleme) ile yapılan hesaplamalar daha yavaş ve verimsizdir.
Peki  recursive (özyineleme)yi neden kullanıyoruz?
Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
 */

// FAKTORYEL TASK: Girilen sayidan 1'e kadar olan tamsayilarin carpimidir.
// 0!=1, 1!=2, 2!=2*1 ..... 6!=6*5*4*3*2*1

        // FAKTORYEL TASK: Girilen sayinin faktoryelini alan method create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir tamsayi tanimlayiniz: ");
        int a = sc.nextInt();
        System.out.println(+a + " sayisinin faktoryeli: "+faktoryel(a));
    }//main disi

    public static int faktoryel(int a) {
        if (a >= 1) {
            return a * faktoryel(a - 1);
        } else return 1;

    }
}