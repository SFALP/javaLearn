package Practice_.Day06_221010;

import java.util.Scanner;

/* Interview Question
 Write a Java program to reverse a string. Use for loop and create a method called
  reverseString */
public class Q06_ForLoop_KelimeyiTersYaz {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir ifade tanimlayiniz: ");
        String a= sc.nextLine();

        System.out.println(reverseString(a));

    }//main sonu
    private static String reverseString(String a) {
String tersA="";
        for (int i = a.length()-1; i >=0; i--) {
tersA+=a.charAt(i);
        }
return tersA;
    }
}