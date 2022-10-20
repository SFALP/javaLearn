package j10_String_Manipulations;

import java.util.Scanner;

public class Ex98_endsWith {
    public static void main(String[] args) {
// TASK: girilen e-mail hesabının @gmail.com içermiyorsa "Lütfen gmail hesabı giriniz"
        // @gmail.com ile bitiyorsa ""hesabınız onaylandı" aksi durumda geçerli hesap giriniz print eden code creat ediniz
        // SCANNER - IF mutlak kullanılmalı. CONTAINS veya ENDWITH'den herhangi biri kullanılmalıdır.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte identifizieren Sie Ihre ganze google E-Mail(mit Teil @xyz...): ");
        String x = scan.nextLine().toLowerCase();

        if (!x.endsWith("@gmail.com")) {//Burada endsWith yerine contains'de kullanılabilirdi
            System.out.println("Definieren Sie bitte gültüge E-mail. E-mail Adresse soll Google mail(gmail)!");
        } else
            System.out.println("Glückwunsch! Deine E-mail Adresse wurde akzeptiert.");
        System.out.println("Vielen Dank für Ihre Verständnis.");
    }
}