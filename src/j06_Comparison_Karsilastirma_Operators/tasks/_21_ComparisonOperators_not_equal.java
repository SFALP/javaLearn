package j06_Comparison_Karsilastirma_Operators.tasks;

public class _21_ComparisonOperators_not_equal {

    public static void main(String[] args) {

        /*  2 double oluşturun.
            İlk double'ın değeri 14.23, ikinci double'ın değeri 19.52 olmalı.
            Double1'in double2'ye eşit olmadığını doğrulayın.
            Eğer eşit değilse cevap true olmalı.
            Cevabı yazdırınız.  */

        // Kodu aşağıya yazınız.
double a=14.23;
double b=19.52;

   System.out.println("ilk sayı("+a+"), ikinci sayıya("+b+")  eşit değil midir?.\n"+(a!=b));
   System.out.println("ilk sayı("+a+"), ikinci sayıya("+b+")  eşit değil midir?.\n"+!(a==b));
// Yukarıdaki 2 kodun artıdan (+) sonraki sorgulama bölümleri aynı işlemi yapmaktadır.
    }
}
