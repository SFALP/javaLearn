package j12_Loops.L01_ForLoop.Task;

import java.util.Scanner;

public class Task09_Nest_For_Yildiz_Ucgeni {
    /*
    TASK: girilen sayıya uygun olarak asagidaki sekli elde eden code create ediniz.
    ÖR ekran ciktisi:
*
* *
* * *
* * * *

     */

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.print("Lutfen 1'den buyuk pozitif bir tamsayi tanimlayiniz: ");
int a=sc.nextInt();

if (a>1){
    for (int i = 1; i <=a ; i++) {
        for (int j = 1; j <=i ; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}else
    System.out.println("Girilen degerle belirlenen kurala uymadigi icin islem yapilamamaktadir. Lutfen daha sonra tekrar deneyiniz");
    }
}
