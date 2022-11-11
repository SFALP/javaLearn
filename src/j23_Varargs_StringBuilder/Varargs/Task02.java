package j23_Varargs_StringBuilder.Varargs;

public class Task02 {
    public static void main(String[] args) {

/*
TASK: Girilen ilk sayi haric digerlerini toplayan ve toplam ile ilk sayiyi carpan Method create ediniz.
 */

        System.out.println("Toplanip carpilan sonuc: " + toplaCarp(2, 24, 23, 38, 33, 21, 59, 26, 10));//468
        int arrTop[] = {24, 23, 38, 33, 21, 59, 26, 10};
        System.out.println("toplaCarp(3,arrTop) = " + toplaCarp(3, arrTop));//702


    }//main sonu

    public static int toplaCarp(int carpilacakSayi, int... toplanacakSayilar) {
        int toplam = 0;
        for (int a : toplanacakSayilar) {
            toplam += a;
        }
        return toplam * carpilacakSayi;
    }
}