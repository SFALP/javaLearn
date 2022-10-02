package Frei_Ubungen;

public class U220918_SwitchStatement {
    public static void main(String[] args) {
// İç içe IF çalışması (IF NESTED)

        int gun = 1;
        if (gun == 1) {
            System.out.println("Bugün günlerden Pazartesi");
        } else if (gun == 2) {
            System.out.println("Bugün günlerden Salı");
        } else if (gun == 3) {
            System.out.println("Bugün günlerden Çarşamba");
        } else if (gun == 4) {
            System.out.println("Bugün günlerden Perşembe");
        } else if (gun == 5) {
            System.out.println("Bugün günlerden Cuma");
        } else if (gun == 6) {
            System.out.println("Bugün günlerden Cumartesi");
        } else if (gun == 7) {
            System.out.println("Bugün günlerden Pazar");
        } else {
            System.out.println("Yanlış sayı");
        }

// Yukarıdaki IF codunun Switch Case ile yazılan hali aşağıdadır. Genel olarak her ikisinde de aynı işler yapılmasına rağmen
// Switch Case'de olasılıklar belirlidir.(Gün örneğinde olduğu gibi) Switch case dah okunaklıdır. If, daha dallı budaklıdır.
// Switch case de koşullar belli olduğundan yöndendirme söz konusu değildir. Verilen koşul varsa çalış, yoksa çalışma mantığı vardır.
// Genellikle IF Else'in daha pratik olduğu değerlendirilmektedir.
// Break ifadesi switch case'den çıkılmasını sağlar. Breake olmazsa tüm case'ler (koşul/olasılık) ekranda görülür.
// Case, kurgulanan akıştan çıkılmasını sağlar. Bu nedenle her case'den sonra yazılmalıdır.
// IF yapısında birçok olasılığı koda yazdırılabilirken(Ör: araba varsa, hava yağmurluysa, acelemiz varsa vs.), Switch'de bu durum olmaz.

        int gun1 = 1;
        switch (gun1) {
            case 1:
                System.out.println("Bugün günlerden Pazartesi");
                break;
            case 2:
                System.out.println("Bugün günlerden Salı");
                break;
            case 3:
                System.out.println("Bugün günlerden Çarşamba");
                break;
            case 4:
                System.out.println("Bugün günlerden Perşembe");
                break;
            case 5:
                System.out.println("Bugün günlerden Cuma");
                break;
            case 6:
                System.out.println("Bugün günlerden Ctesi");
                break;
            case 7:
                System.out.println("Bugün günlerden Pazar");
                break;
            default:
                System.out.println("Yanlış sayı");
                break;
        }
    }
}
