package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
//TASK:        Girilen String içindeki istenen Index'teki karakteri print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir ifade yaziniz: ");
        String a = scan.nextLine();
        System.out.println("Istedigin karakter icin index tanimlayiniz: ");
        int b=scan.nextInt();

        if (a.length()>b) {
            System.out.println(a.charAt(b));
        }else
            System.out.println("Girilen metinde olmayan bir index istediniz. Lutfen tekar deneyiniz");
    }

}
