package j12_Loops.L01_ForLoop.Task;

import java.util.Scanner;

public class Task08_Nest_For_5inKatlari {
    /*
    TASK: Girilen boyutta kare carpim tablosu print eden kod create ediniz.
ÖR: 5 icin
1 2 3 4 5
2 4 6 8 10
3 6 9 12 15
4 8 12 16 20
5 10 15 20 25
     */
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.print("Lutfen 1'den buyuk bir tamsayi tanimlayiniz: ");
        int a=sc.nextInt();

        if (a>1){
            for (int i = 1; i <=a ; i++) {
                for (int j = 1; j <=a ; j++) {
                    System.out.print(i*j+" ");
                }
                System.out.println();
            }

        }else
            System.out.println("Girilen degerle belirlenen kurala uymadigi icin islem yapilamamaktadir. Lutfen daha sonra tekrar deneyiniz");
    }
}