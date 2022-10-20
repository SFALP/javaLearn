package j10_String_Manipulations;

public class C09_Replace {
    public static void main(String[] args) {
/** replace()
 * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini (update -set) saglar. Sonuc String'dir..
 */
 String str="JavaCANlara selam olsun java ile bolcana offer";
        System.out.println(str.replace('a', '@'));//J@v@CANl@r@ sel@m olsun j@v@ ile bolc@n@ offer
        //Büyük-küçük harf hassasiyeti olduğu büyük harfle yaılmış olan A'yı değiştirmeyecektir.
        System.out.println(str.replace("can", "kan"));//JavaCANlara selam olsun java ile bolkana offer
//Büyük-küçük harf hassasiyeti olduğu büyük harfle yazılmış olan CAN'ı değiştirmeyecektir. bolcana bölümü güncellenir.
        /* ReplaceFirst
         * Replace ile aynı sadece ilk bulunanı değiştirir
         */
        System.out.println(str.replaceFirst("a", "@"));//İlk bulduğu a harfini @ ile değiştirir. Diğerleri değişmeyecektir.
// replaceAll() method u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
/*
replace() method’uile benzer olarak verilen String’dekiistenen karakterleri istenen yeni karakterler ile değiştirir.
Aralarındaki farklar:
-replace() method’undachar kullanılabılır, replaceAll()’da char kullanılamaz.
-replaceAll() method’undaRegular Expressions kullanılabilir.
*** REGEX TABLOSU*** (Kullanım örnekleri aşağıdadır)
\\s: Boşluk (space)
\\S: Boşluk dışındaki tüm karakterler
\\w: Harfler ve rakamlar (a-z, A-Z, 0-9)
\\W: Harfler ve rakamlar dışındaki tüm karakterler
\\d: Rakamlar (0-9)
\\D: Rakamlar dışındaki tüm karakterlerString
 */
        String xyz="        JavaCANlara selam olsun  :)  java ile 1234567890 offer ******";
        System.out.println(xyz.replaceAll("\\s", "€"));// Boşluk yerine € ifadesi yazar. €€€€€€€€JavaCANlara€selam€olsun€€:)€€java€ile€1234567890€offer€******
        System.out.println(xyz.replaceAll("\\S", "€"));// Space-boşluk dışındakilere € ifadesi yazar.         €€€€€€€€€€€ €€€€€ €€€€€  €€  €€€€ €€€ €€€€€€€€€€ €€€€€ €€€€€€
        System.out.println(xyz.replaceAll("\\w", "€"));// Harf ve rakam yerine € ifadesi yazar.         €€€€€€€€€€€ €€€€€ €€€€€  :)  €€€€ €€€ €€€€€€€€€€ €€€€€ ******
        System.out.println(xyz.replaceAll("\\W", "€"));// Harf ve rakam haricindeki yerlere € ifadesi yazar. €€€€€€€€JavaCANlara€selam€olsun€€€€€€java€ile€1234567890€offer€€€€€€€
        System.out.println(xyz.replaceAll("\\d", "€"));// Rakamlar yerine € ifadesi yazar.         JavaCANlara selam olsun  :)  java ile €€€€€€€€€€ offer ******
        System.out.println(xyz.replaceAll("\\D", "€"));// Rakam hariç her şeye € ifadesi yazar. €€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€1234567890€€€€€€€€€€€€€

        //TASK:
//Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
// isim-soyisim : M***** B*******
// kart no : **** **** **** 1234

        String ad= "Çigdem";
        String soyad= "Şen";
        String kartNo="1234567890123456";

        String yeniad= ad.charAt(0)+ad.substring(1).replaceAll("\\w","*");
        String yenisoyad= soyad.charAt(0)+soyad.substring(1).replaceAll("\\w","*");
String yenikart= "**** **** **** ****"+kartNo.substring(12);

           System.out.println("yeniad = " + yeniad + " yenisoyad = " + yenisoyad + " yenikart = " + yenikart);
//Üstteki kodun return'ü---> yeniad = Ç***** yenisoyad = Ş** yenikart = **** **** **** ****3456

// TASK: 2 isimli bir giriş yapılması durumunda aynı örneğin çalışması da ödevdir.

    }
}
