package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task09_ArrTersYaz {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Lutfen arrayin ("+(i+1)+"). elemanini tanimlayiniz: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Tanimladiginiz array: "+ Arrays.toString(arr));
        System.out.println();
        System.out.println("Girilen arrayin tersten yazdirilisi: ");

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}