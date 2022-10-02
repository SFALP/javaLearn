package j06_Comparison_Karsilastirma_Operators.tasks;

public class _20_ComparisonOperators_bigger_equal {

    public static void main(String[] args) {

        /*  İki tane float oluşturun. Birinci float 14, ikinci float 17'dir.
            Birinci float'un, ikinci float'dan büyük eşit olduğunu veya  büyük olduğunu yada olmadığını doğrulayın.
            Sonucu yazdırınız. */

        //Kodu aşağıya yazınız.
float a=14f;
float b=17f;
        System.out.println("ilk sayı("+a+"), ikinci sayıdan("+b+") büyük eşit veya büyük yada büyük değil midir?.\n");
        System.out.println((a>=b) || (a>b) || !(a>b));//True
    }
}
