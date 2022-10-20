package j08_IfStatement_Ternary_Oper;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
TASK :
 Girilrn birpozitif tamsayı 4 basamaklı ise  "4 Basamaklı" print eden
 4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "4 basamaklı olmayan tek sayı yazdırın."
 */
Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen pozitif bir tamsayı tanımlayınız: ");
int a= scan.nextInt();
if (a>=0) {
    System.out.println(a > 999 && a < 10000 ? ("Sayı 4 basamaklıdır") : a % 2 == 0 ? ("4 basamaklı olmayan çift sayı") : ("4 basamaklı olmayan tek sayı"));
}else
    System.out.println("Girilen değer negatif olduğu için tanımlanmamış olup bu şartlarda işleme devam edilememektedir. Lütfen tekrar deneyiniz.");
}
}
