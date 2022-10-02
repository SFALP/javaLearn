package j10_StringManipulations;

public class C04_Contains {
    public static void main(String[] args) {
/*
Contains, String içinde istenen Stringin varlığını kontrol eder. Boolean return eder.
 */
        String s1 = "Enise Hanım başarılı bir Qa Tester Team Lead";
        System.out.println(s1.contains("hanım"));//false. Çünkü büyük-küçük harf duyarlıdır. hanım ifadesi aransaydı sonuç true olacaktı.
        System.out.println(s1.contains("E"));//true
        System.out.println(s1.contains(" "));//true

        String s2 = "Qa";
        System.out.println(s1.contains(s2));//true. Soru yöntemi şöyle olmalıdır: s1, içerir mi s2'yi? Yani s1, s2'yi kapsar.
        System.out.println(s2.contains(s1));//false. s2, s1'i kapsamaz.

//TASK: Girilen bir cümlede aranan kelimenin olup olmadığını kontrol eden bir code create ediniz. (Ternary kullanıız)

//Ex99 isimli class altında bu task ödev olarak yazılmıştır.
    }
}
