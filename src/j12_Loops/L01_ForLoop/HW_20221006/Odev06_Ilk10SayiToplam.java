package j12_Loops.L01_ForLoop.HW_20221006;

public class Odev06_Ilk10SayiToplam {

    public static void main(String[] args) {

        /* İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.  */

        int t = 0;//toplam ifadesi atanir.
        for (int i = 0; i < 10; i++) {
            t += i;
        }
        System.out.println("İlk 10 dogal sayinin toplamı: " + t);
    }
}