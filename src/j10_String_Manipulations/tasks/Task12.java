package j10_String_Manipulations.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */
Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 2 ad ve 1 soyaddan oluşan 3 kelimelik veri tanimlayiniz: ");
    String a=scan.nextLine().toUpperCase();
int x=a.indexOf(" ");
int y=a.lastIndexOf(" ");
        System.out.println("Girilen ismin kisaltmasi: "+ a.charAt(0)+"."+a.substring(x+1,x+2)+"."+a.substring(y+1,y+2));
    }
}