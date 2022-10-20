package j15_Arrays;

import java.util.Arrays;

public class Task11_DovizToplam {
    public static void main(String[] args) {

// TASK: $ ve £ isareti olanlarin toplamlarini ayri ayri bulup yazdiran java code creat ediniz.
        // String str="$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        int toplamDolar = 0;
        int toplamSterlin = 0;

        String para[] = str.split(" ");
        System.out.println("Para array: " + Arrays.toString(para));//[$1, $23, $134, $2, $7, $24, £32, £40, £2, £65, £4]
// simdi de sterlin ve dolar isretlerini kaldirmaliyiz, sonra da bu birimler ozelinde olan sayilar toplanmalidir.

        for (int i = 0; i < para.length; i++) {
            if (para[i].contains("$")) {
                para[i].replace("$", "");// dolar isaretleri silinir. Suan bu alan string durumunda, bu intigera cevrilmelidir.
                toplamDolar += Integer.parseInt(para[i].replace("$", ""));// String, intigera cevrildi. ve toplandi.

            } else {
                para[i].replace("£", "");// sterlin isaretleri silinir. Suan bu alan string durumunda, bu intigera cevrilmelidir.
                toplamSterlin += Integer.parseInt(para[i].replace("£", ""));// String, intigera cevrildi ve toplandi.

            }
        }
        System.out.println("Toplam USD miktari: " + toplamDolar);//Toplam USD miktari: 191
        System.out.println("Toplam Sterlin miktari: " + toplamSterlin);//Toplam Sterlin miktari: 143
    }
}