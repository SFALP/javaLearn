package j12_Loops.L01_ForLoop.Task;

import java.util.Scanner;

public class Task01 {
    /*        Interview Question
                Girilen  100’den kucuk bir tamsayi için
                1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
               - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
               - Sayi 5’in kati ise sayi yerine "CAN'dır" yazdirin.
               - Sayi hem 3’un hem 5’in kati ise sayi yerine "JavaCAN" prnt eden code create ediniz
 */
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.print("Lutfen 100'den kucuk pozitif bir tamsayi tanimlayiniz: ");
        int a=sc.nextInt();

        if (a>0 && a<=100){
            for (int i = 1; i <=a ; i++) {
                if (i%3==0 && i%5==0){//girilen sayinin 3'e ve 5'e bolunme sarti
                    System.out.println(i+" ??? JavaCAN ??? ");
                } else if (i%5==0) {//sadece 5'e bolunme sarti
                    System.out.println(i+" !!! CAN'dir !!!");
                }else if (i%3==0){// sadece 3'e bolunma sarti
                    System.out.println(i+" ### Java ###");
                }else System.out.println(i+" Hicbir sarti saglamamaktadir");
            }
        }else
            System.out.println("Istenen kriterlerin disinda sayi tanimlandigi icin islem yapamiyorum. Lutfen yeniden tanimlayiniz.");
    }
}