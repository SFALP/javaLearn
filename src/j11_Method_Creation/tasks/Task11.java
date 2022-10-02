package j11_Method_Creation.tasks;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.
    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m
    İpucu harfleri değiştirin ve ekrana yazdırın.
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin tanimlayiniz: ");
        String a = scan.nextLine().toLowerCase();
        System.out.println("Hacker dili karsiligi: " + hackerDili(a));
    }

    public static String hackerDili(String a) {
        String b = a.replaceAll("s", "5");
        String c = b.replaceAll("a", "4");
        String d = c.replaceAll("e", "3");
        String e = d.replaceAll("i", "1");
        String f = e.replaceAll("o", "0");
        return f;
    }
}