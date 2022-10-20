package j15_Arrays;

import java.util.Scanner;

/* Task-> girilen değere göre  salyangoz matris  create eden code create ediniz
        input :3
        output:
                1       2       3
                8       9       4
                7       6       5

         input :4
         output :
                1       2       3       4
                12      13      14      5
                11      16      15      6
                10      9       8       7
         */
public class Task19_Salyangoz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Salyangoz matrisi icin 2'dan buyuk bir deger tanimlayiniz: ");
        int sayi = sc.nextInt();
        int matris[][] = new int[sayi][sayi];
        int eksenX = 0;
        int eksenY = 0;
        int toplam = 1;
        boolean arttir = true;

        for (int i = 0; i < sayi; i++) {
            matris[eksenX][eksenY] = toplam;//eksenX ve eksenY gezginlerinin arttırılma veya azaltmadan önceki değerleri atıyoruz.
            if (arttir) {//Bu alanda hem eksenX hem eksenY gezginlerinin değerleri max alabilecekleri kadar arttırılıyor.
                while (eksenX + 1 < sayi && matris[eksenX + 1][eksenY] == 0)//Arttırma işlemi yapmak için bir sonraki koordinatın dolu olup olmadığına bakıyoruz.
                    //eksenX gezginimizi ve toplam değişkenimizi 1 arttırıp gerekli atamayı yapıyoruz.
                    matris[++eksenX][eksenY] = ++toplam;

                //Bir üstteki işlemin aynısı eksenY gezgini için yapılıyor.
                while (eksenY + 1 < sayi && matris[eksenX][eksenY + 1] == 0)
                    matris[eksenX][++eksenY] = ++toplam;
            } else {///Bu alanda hem X hem Y gezginlerinin değerleri minimum alabilecekleri kadar azaltıyoruz.

                //Azaltma işlemi yapmak için bir önceki koordinatın dolu olup olmadığına bakıyoruz.
                while (eksenX > 0 && matris[eksenX - 1][eksenY] == 0)
//ensenX gezginimizi azaltırken, toplam değişkenimizi 1 arttırıp gerekli atamayı yapıyoruz.
                    matris[--eksenX][eksenY] = ++toplam;
//Bir üstteki işlemin aynısı eksenY gezgini için yapılıyor.
                while (eksenY > 0 && matris[eksenX][eksenY - 1] == 0)
                    matris[eksenX][--eksenY] = ++toplam;
            }
            arttir = !arttir; //arttir değişkeninin tersini alıyoruz ki üstteki if yapısının blokları sırasıyla işlesin.
        }
//Oluşturduğumuz salyangoz matrisini ekrana yazdırıyoruz.
        for (int satir = 0; satir < sayi; satir++) {
            for (int sutun = 0; sutun < sayi; sutun++)
                System.out.print(matris[sutun][satir] + "\t"); //Burada ekrana yazılan her değerin yanına düzenli görünmesi için tab boşluğu ekleniyor.
            System.out.println(); //Alt satıra geçiyoruz.
        }
    }
}