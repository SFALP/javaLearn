package Practice_Day04_220927;

public class Q10_stringManipulation {
    public static void main(String[] args) {

// soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.
//1.ÇÖZÜM

        String a="   Java ogrenmek123 Cok guzel@      ";
        String b=a.trim().toLowerCase().replaceAll("\\d",""); //java ogrenmek cok guzel@
 String c=b.replace('j','J');
 String d=c.replaceAll("@","");
        System.out.println(d);
    // 2.ÇÖZÜM


    }
}