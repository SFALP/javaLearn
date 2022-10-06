package j12_Loops.L01_ForLoop.Task;

import java.util.Scanner;

public class Task02_Polindrome {
    public static void main(String[] args) {
/*
Girilen ifadenin polindrome olmasini kontrol eden method create ediniz.
 Polindrome= Her iki yonde okundugunda esit olan ifadelerdir.
 Ör: "Ey edip Adana'da pide ye"
 */
        Scanner sc=new Scanner(System.in);
        System.out.print("Lutfen bir ifade tanimlayiniz: ");
        String str=sc.nextLine().toLowerCase().trim();

        polindrome(str);// String parametreli method create call



    }//main disi
public static void polindrome(String str) {
String tersStr="";//tersStr isminde bos bir kutu tanimlandi. Buraya ifade tanimlanacagi anlamina gelir.
    for (int i = str.length()-1; i >=0 ; i--) {
tersStr+=str.charAt(i);//str'nin i. karakterini tersStr'ye ekler(concat)
    }
    System.out.println("Girilen ifadenin tersi: "+tersStr);
if (str.equals(tersStr)){// ifade esitligi kontrol edildi.
    System.out.println("Bu iki ifade esit oldugundan POLINDROM'dur.");
}else System.out.println("Girilen ifade Polindrom degildir.");
}
}
