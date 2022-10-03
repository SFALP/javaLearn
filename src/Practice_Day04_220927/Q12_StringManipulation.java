package Practice_Day04_220927;

import java.util.Scanner;

public class Q12_StringManipulation {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ifade tanimlayiniz: ");
        String a= scan.nextLine();

        if (a.contains(" ") && a.length()>0){
            System.out.println("Girilen ifadede bosluk bulunmaktadır ve \n Girilen karakter: "+a);
        }else System.out.println("Girilen ifadede bosluk bulunmamaktadır.");
    }
}
/* 2. ÇÖZÜM YOLU: ,isEmpty ile;

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int bosluk = str.indexOf(" ");
        if(bosluk ==-1  && !str.isEmpty())  //bosluk karakteri yoksa ve string ifadem bos degilse
            System.out.println("sartlara uygun");
        else System.out.println("sartlara uygun degildir");
    }
}
 */