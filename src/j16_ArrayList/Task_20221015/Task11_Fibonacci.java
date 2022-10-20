package j16_ArrayList.Task_20221015;

import java.util.ArrayList;
import java.util.Scanner;

public class Task11_Fibonacci {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci serisinin kacinci elemanina kadar print etmek istersiniz: ");
        int x = sc.nextInt();
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);
        int toplam = 0;

        for (int i = 2; i <= x; i++) {
            toplam = fibonacci.get(i - 2) + fibonacci.get(i - 1);
            fibonacci.add(toplam);
        }
        System.out.println("fibonacci = " + fibonacci);


    }
}
