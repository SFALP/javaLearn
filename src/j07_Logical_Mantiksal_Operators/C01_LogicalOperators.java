package j07_Logical_Mantiksal_Operators;

public class C01_LogicalOperators {
    public static void main(String[] args) {
        // AND (ve) &&, OR (veya) ||, Ters işlem ! bu konuda işlenecektir.
        // VE kötümser, VEYA iyimserdir. VE komutunda sorgulanan herhangi bir değer false ise tüm satır false olur.
        // VEYA komutunda ise sorgulanan değerlerden 1 tanesinin true olması sonucu da true yazdırır.
/*
===>>> VE'nin && örneği lokantada verilen sipariş üzerinden açıklanırsa;
          Çorba     Et   Müşteri Tatminliği(Sonuç)
            1       0           0
            0       1           0
            1       1           1
            0       0           0

===>>> VEYA'nın || örneğini lokantada verilen sipariş üzerinden açıklanırsa;
          Çorba     Et   Müşteri Tatminliği (Sonuç)
            1       0           1
            0       1           1
            1       1           1
            0       0           0

Veya işareti tek yazılmasıyla (&) çift yazılması arasında (&&) fark bulunur;
&, satırdaki tüm sorgulamaları kontrol eder. Hepsine bakacağı için hızı yavaşlatır.
&&, varsa tek karşılaştırmada False cevabını almışsa sonucu false olarak yazdırır.
*/
        System.out.println("1.Örnek");

        System.out.println(5*2 !=15);//True
        System.out.println(!(10==10));//False. Yazılan kodda eşit değil yargısı ortaya konmasına rağmen matematiksel sonuç eşit olduğu için sonu false çıkar.

        System.out.println("2.Örnek");
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a>b||a<c);//doğru||doğru=doğru
        System.out.println(a>b|a<c);//doğru|doğru=doğru

        System.out.println("\n2.Örnek VEYA grubu");
        System.out.println(a>b||a++<c);//doğru|doğru=doğru
        System.out.println(a);//10. Çünkü 2.koşul olmadığından kontrol edilemedi.
        System.out.println(a>b|a++<c);//doğru|doğru=doğru
        System.out.println(a);//11. Çünkü 2.koşul kontrol edildi.

        System.out.println("\n2.Örnek VE grubu");
        System.out.println(a<b&&a++<c);//false&&true=false
        System.out.println(a);//10. Çünkü 2.koşul olmadığından kontrol edilemedi.
        System.out.println(a<b&a++<c);//false&doğru=yanlış
        System.out.println(a);//11. Çünkü 2.koşul kontrol edildi.

        System.out.println(a<b&&a<c);//false&&true =false
        System.out.println(a<b&a<c);//false&true =false

        System.out.println("3.Örnek");

        boolean b1=true;
        int x=3;
        int z=7;
//VE &&
        System.out.println("\n3.Örnek VE grubu");
        System.out.println(b1&(x<z)); //true
        System.out.println(b1&&(x>z));//false
        System.out.println(b1&(x==z));//false
//VEYA ||
        System.out.println("\n3.Örnek VEYA grubu");
        System.out.println(b1||(x<z));//true
        System.out.println(b1||(x>z));//true
        System.out.println(b1||(x==z));//true
//Not->Değil !=
        System.out.println("\n3.Örnek EŞİT DEĞİL grubu");
        System.out.println(!(b1||(x<z)));//false
        System.out.println(!(b1||(x>z)));//false
        System.out.println(!(b1||(x==z)));//false
    }
}
