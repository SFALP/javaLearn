package j06_Comparison_Karsilastirma_Operators.tasks;

import java.util.Scanner;

public class _18_ComparisonOperators_equal_equal2 {

    public static void main(String[] args) {

    /*    Oluşturulan double'lar hakkında (num1, num2)
          birbirine eşit olup olmadıklarını doğrulayın.
          Eğer eşitlerse konsolda true yazacaktır.  */

        Scanner dp = new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı tanımlayınız: ");
        double num1 = dp.nextDouble();
        System.out.println("Lütfen ikinci sayıyı tanımlayınız: ");
        double num2 = dp.nextDouble();

        // Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        System.out.println("Girilen iki sayı ("+num1+" ve "+num2+")  birbirine eşit midir?\n "+(num1==num2));
    }
}
