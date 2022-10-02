package j10_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {
/*
Length methodu, girilen String ifadenin uzunluğunu: String ifadesinde yer alan karakter sayısını return(çıktı) eder.
Bütün karakterleri(boşluk, noktalama işaretleri de dahil) sayıp toplam adedini verir.
 */
        String str = "Madem geldin Dünya'ya otur çalış Java'ya";
        str.length();//intiger type bir data ile karşılaşırız.
        int strKrktrSayisi = str.length();//int typ bir data varir
        System.out.println("str = " + str);//Madem geldin Dünya'ya otur çalış Java'ya
        System.out.println("strKrktrSayisi = " + strKrktrSayisi);//40
        System.out.println(str.length());//40 ->Burada kod hafızada herhangi bir kutuya atanmadan direkt yazdırıldı.
        String str1 = "";//Tırnak ifadeleri kodun doğalında olmak zorunda olduğundan karakter olarak sayılmaz. Tırnak ifadeleri içinde herhangi bi karakter olmadığı için değeri 0'dır.
        System.out.println(str1.length());//0

        String str2 = " ";//sadece tek basımlık boşluk tanımlanmıştır. Tırnak ifadeleri kodun doğalında olmak zorunda olduğundan karakter olarak sayılmaz.
        System.out.println(str2.length());//1


        String str3 = null;
        System.out.println(str3.length());//Run Time Exception hatası verir. Null bir değer değildir. sadece str3 ifadesinin olmadığını tanımlar.
//        str3.concat(str1);// yazıldığında Run Time Error verir. Çünkü yoklukla herhangi bir ifade birleştirilemez.
// TRICK -> null atanan stringler String method çalışmaz. Cıssss. Yani ör: str2. ifadesi yazıldıktan sonra çıkan öneriler uygulanamaz.
        /*
null ifadesi, case sensitive'dir. Yani büyük NULL veya Null yazılamaz.
null bir değer değildir.(dutluktur) sadece hiçliği gösteren bir pointer'dır (Giriş işaretçi )
 */

        String name;// deklare edilmiş ama atanmamış string. String method çalışmaz CTE hatası verir. (Alt satırda olduğu gibi)
//        name.concat(str1);
    }
}