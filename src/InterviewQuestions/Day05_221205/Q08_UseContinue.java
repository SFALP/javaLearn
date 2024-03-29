package InterviewQuestions.Day05_221205;

import java.util.Scanner;

// Girilen bir stringin harflerini teker teker ekrana alt alta olacak
// sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
public class Q08_UseContinue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir string giriniz :");
        String ifade = scan.nextLine();

        for (int i = 0; i < ifade.length(); i++) {//ifadenin karakterlerine bakar
            if (ifade.charAt(i) == 'a' || ifade.charAt(i) == ' ') //ifade de a yada bosluk icerirse
                continue;   // bu satir calistiginda dongunun basina gider,
            // cunku a veya bosluk var iken herhangi bir ciktisini istemiyor
            // break akliniza gelebilir.. ancak break kodu tamamen kirar ve devam etmez..
            System.out.println(ifade.charAt(i));
        }
    }
}
