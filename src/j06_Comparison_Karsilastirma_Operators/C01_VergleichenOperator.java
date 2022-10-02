package j06_Comparison_Karsilastirma_Operators;

public class C01_VergleichenOperator {
    public static void main(String[] args) {
        /*

==     Esit               x == y
!=     Esit degil         x != y
>      buyuk              x > y
<      kucuk              x < y
>=     buyuk esit         x >= y
<=     kücük esit         x <= y

 */
int yas1=33;
int yas2=41;

        System.out.println("Yas2("+yas2+") ve Yas1("+yas1+")eşit midir? "+(yas2==yas1)); //false. Bu sorgulamaların sonucu sadece boolean tipinde görülür. Yani true veya false sonucu alınır.
        System.out.println("Yas2("+yas2+") ve Yas1("+yas1+") eşit değil midir? "+(yas2!=yas1)); //true. Bu sorgulamaların sonucu sadece boolean tipinde görülür. Yani true veya false sonucu alınır.
        System.out.println("Yas2("+yas2+"), Yas1("+yas1+")'den küçük müdür? "+(yas2<yas1)); //false. Bu sorgulamaların sonucu sadece boolean tipinde görülür. Yani true veya false sonucu alınır.
        System.out.println("Yas2("+yas2+"), Yas1("+yas1+")'den büyük müdür? "+(yas2>yas1)); //true. Bu sorgulamaların sonucu sadece boolean tipinde görülür. Yani true veya false sonucu alınır.
        System.out.println("Yas2("+yas2+"), Yas1("+yas1+")'den büyük veya eşit midir? "+(yas2>=yas1)); //true. Bu sorgulamaların sonucu sadece boolean tipinde görülür. Yani true veya false sonucu alınır.
        System.out.println("Yas2("+yas2+"), Yas1("+yas1+")'den küçük veya eşit midir? "+(yas2<=yas1)); //false. Bu sorgulamaların sonucu sadece boolean tipinde görülür. Yani true veya false sonucu alınır.

/* s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir.
s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır ve  String constant pool üzerinde aynı adresi gösterirler.
        Böylece ekrana TRUE yazdırır. */
System.out.println("String iki değerin birbirine eşitliğinin kontrol edilmesi örneği:");
        String s1 = "kerem bey";
        String s2 ="kerem bey";
        System.out.println(s2==s1);// true. Örneğin kerem yazısının herhangi bir karakteri farklı yazılmış olsaydı (İlk harfi büyük olması gibi...) Bu eşitliğin cevabı false olacaktı.



    }
}
