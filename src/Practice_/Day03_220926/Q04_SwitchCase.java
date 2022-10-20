package Practice_.Day03_220926;

public class Q04_SwitchCase {
    public static void main(String[] args) {
/*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
        String a = "sonntag";
        String b = a.toUpperCase();

        System.out.println(b);
        switch (b) {
            case ("MONTAG"):
            case ("DIENSTAG"):
            case ("DİENSTAG"):
                System.out.println("Der Java Unterrichten Tag");
                break;
            case ("DONNERSTAG"):
            case ("FREITAG"):
            case ("FREİTAG"):
                System.out.println("Der Selenyum Unterrichten Tag");
                break;
            case ("MITTWOCH"):
            case ("MİTTWOCH"):
            case ("SAMSTAG"):
                System.out.println("Der SQL Unterrichten Tag");
                break;
            default:
                System.out.println("Diesen Tag ist Urlaub. Juppiiieaahh");
        }

    }
}
