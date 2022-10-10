package j12_Loops.L01_ForLoop.Task;

import java.util.Scanner;

public class Task07_Nest_For_0ve1 {
    /*
    TASK= Girilen boyutta bir kare icin
    Ekran ciktisi:
ÖR; 2 icin;
1 0
0 1
    ÖR;5 icin
1 0 0 0 0
0 1 0 0 0
0 0 1 0 0
0 0 0 1 0
0 0 0 0 1
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tamsayi tanimlayiniz: ");
        int a = sc.nextInt();

        if (a > 1) {
            for (int i = 1; i <= a; i++) {//dis dongu

                for (int j = 1; j <= a; j++) {//ic dongu
                    if (i == j) {
                        System.out.print("1 ");
                    } else System.out.print("0 ");
                }
                System.out.println();
            }
        } else System.out.println("Hatali bir sayi girdiniz. Lutfen tekrar deneyiniz");

    }
}