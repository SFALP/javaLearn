package Practice_.Day06_221010;

/*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
*/

import java.util.Scanner;

public class Q05_ForLoop_YildizDikdortg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Lutfen satir sayisini tanimlayiniz: ");
        int a = sc.nextInt();
        System.out.print("Lutfen sutun sayisini tanimlayiniz: ");
        int b = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}