package Practice_.Day11_221031.Printf;

//https://www.digitalocean.com/community/tutorials/java-printf-method
public class C01_TemelBilgiler {
    public static void main(String[] args) {
        int sayi = 753;
        String str = "Bootcamp Clarusway";
        double db = 3.89563056;

        System.out.println(sayi + "-" + str + "-" + db);//753-Bootcamp Clarusway-3.89563056
        System.out.printf("sayi : %d,str :%s, db :%f\n", sayi, str, db);//sayi : 753,str :Bootcamp Clarusway, db :3,895631

        System.out.printf("sayi: %d, str: %S, db: %f\n", sayi, str, db);//sayi: 753, str: BOOTCAMP CLARUSWAY, db: 3,895631

// ÖR: sayi hanesine 10 birimlik, str icin sola yaslayarak (eksi isareti)10 birimlik yer vermek icin:
        System.out.printf("sayi: %10d, str:%-20.10S, db: %-5.3f\n", sayi, str, db);
//sayi:        753  (ACIKLAMA: 10 karakter yer ayirdi ve saga dayali yazdi)
//str:BOOTCAMP C          (ACIKLAMA: Sirasiyla; yazinin yaslanma(sola-saga) yonu, karakter sayisi belirt ve string ifadeyi buyuk harfla 10 karakter yazdir )
// db: 3,896       (ACIKLAMA: Sola yaslanmis halde, 5 birimlik yer ayir ve virgul sonrasi 3 birim al. )

//%10d -> 10 hanelik yer ayir, kapasite
//%-20.10S -> sola yaslayarak(eksi ile) 20 birimlik kapasite ayir, String ifadenin buyuk harf ile 10 karakterini yazdir
//%-5.3f ->sola yaslayarak 5 birimlik kapasite ver, virgulden sonra 3 hane yazdir

//%x.y  --> x, kapasiteyi ve y'de karakter sayisini verir.
// - ifadesi de sola yaslamak anlamindadir.
//%S --> Buyuk harfle yazdir.
//%s --> kucuk harfle yazdir.

        System.out.printf("sayi:%-10d, str:%-8.8s, db:%09.4f",sayi,str,db);
//sayi:753       ,
//str:Bootcamp,
//db:0003,8956. souf satirinde sifir yazilirsa atanmamis karakterler yerine otomatik sifir atanmis olur.



    }
}
/*
Format Specifiers
Let’s look at the available format specifiers available for printf:

%c character
%d decimal (integer) number (base 10)
%e exponential floating-point number
%f floating-point number
%i integer (base 10)
%o octal number (base 8)
%s String
%u unsigned decimal (integer) number
%x number in hexadecimal (base 16)
%t formats date/time
%% print a percent sign
\% print a percent sign
Note: %n or \n are used as line separators in printf().

Escape Characters
Following are the escape characters available in printf():

\b backspace
\f next line first character starts to the right of current line last character
\n newline
\r carriage return
\t tab
\\ backslash
 */