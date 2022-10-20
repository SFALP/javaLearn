package Practice_.Day08_221017;

import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int arr[]=new int[8];

        int count = 0; //3 e bolunebilen eleman sayisi
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " .indexteki elemani giriniz :");
            arr[i] =sc.nextInt();
            if(arr[i]%3 ==0 && arr[i]!=0){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}