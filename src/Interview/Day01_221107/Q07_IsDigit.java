package Interview.Day01_221107;

import java.util.Scanner;

public class Q07_IsDigit {
      /*
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16

     Hint:
     Character.isDigit()
     Integer.valueOf()
    */
      public static void main(String[] args) {




      }

}
/*
F4994-Faruk COZUMU:
 public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("write something: ");
        String str = dat.nextLine();

        System.out.println(sumMethod(str));
    }

    private static int sumMethod(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));}
        }
        return sum;
    }

 */
/*
F4769-Fatih ATAS 1.COZUMU
String str = "J4\"/4 1$ 34#Y";
String sayilar = "";
for (int i = 0; i <= str.length() - 1; i++) {
	sayilar += (Character.isDigit(str.charAt(i))? ""+str.charAt(i) : "");
}
System.out.println("İfadedeki sayılar = " + sayilar);
int toplam=0;
for(int i = 0; i<sayilar.length();i++) {
	toplam+=Integer.valueOf(""+sayilar.charAt(i));
}
System.out.println("Toplamlar = " + toplam);

F4769-Fatih ATAS 2.COZUMU
String str = "J4\"/4 1$ 34#Y";
int sayiToplam = 0;
for(int i = 0; i<=str.length()-1;i++) {
	sayiToplam+=(Character.isDigit(str.charAt(i)) ? Integer.parseInt(String.valueOf(str.charAt(i))) : 0);}
System.out.println("ifadedeki sayıların toplamı = " + sayiToplam);

 */