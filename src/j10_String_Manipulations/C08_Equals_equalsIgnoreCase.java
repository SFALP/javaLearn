package j10_String_Manipulations;

public class C08_Equals_equalsIgnoreCase {
    public static void main(String[] args) {
        /* equals()
         2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.

         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */
/*
 * str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
 * str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir
 */
        System.out.println("1.Bölüm");
        String str1="Merhaba";
        String str2="merhaba ";//merhaba ifadesinden sonra 1 boşluk bulunmaktadır.
        System.out.println(str1.equals(str2));//false
        System.out.println(str2.equals(str1));//false
        System.out.println(str1.equalsIgnoreCase(str2));//false. Boşluk karakteri olduğu için IgnoreCase'e rağmen eşit değildir.


        System.out.println("2.Bölüm");
        str2="merHaba";
        System.out.println(str1.equals(str2));//false
        System.out.println(str2.equals(str1));//false
        System.out.println(str1.equalsIgnoreCase(str2));
        //true. Bir üst satırda boşluk vs olmadığından karakterin büyük-küçük olmasını önemsemeden ifadelerin eşitliğine bakıldı.

        System.out.println("3.Bölüm");
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str2.equalsIgnoreCase(str1));//true

        System.out.println("4.Bölüm");
   String s1="songul hanım";//String pool. gömlek cebi--> kolay çıkan para
   String s2="songul hanım";//String pool. gömlek cebi--> kolay çıkan para
   String s3=new String("songul hanım");//objedir. Non-primitiv'dir-->heap memory->Cüzdan
   String s4=new String("songul hanım");//objedir. Non-primitiv'dir-->heap memory->Cüzdan

   System.out.println(s1 == s2);//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s3==s4);//false. Her türlü bilgi kontrol ediliyor. Referans değerleri eşit değildir.
        System.out.println(s3.equals(s4));//true. Çıktı olarak yansıyan değerler kontrol ediliyor, bu nedenle true olur.
    }
    }
