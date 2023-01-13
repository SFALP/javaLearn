package InterviewQuestions.Day02_221114;

import java.util.Arrays;
import java.util.Scanner;

/*
Create a function that takes an array and the difference between the largest
and the smallest numbers.
Ask user to enter array elements.
   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/
public class Q05_DifferanceBetweenArray_LargestandSmallestElements {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Arrayin uzunlugunu tanimlayiniz: ");
int uzunluk=sc.nextInt();
int arr[]=new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {

            System.out.println("Array'in (" + (i + 1)+") elemani: ");
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Kucukten buyuge sirali array: "+arr.toString());
        System.out.println("Mın - Max arasindaki fark: "+(arr[uzunluk-1]-arr[0]));
    }

}
