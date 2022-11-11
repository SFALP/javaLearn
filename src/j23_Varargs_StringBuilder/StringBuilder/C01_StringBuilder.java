package j23_Varargs_StringBuilder.StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {

/*
String = > daha yavas ,Immutable==> degisemez,
String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

1) Java pass-by-value kullanir
2) String Class'i immutable Class'dir.

 StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
 StringBuffer synchronized,thread safe.

StringBuilders = mutable==>degisebilir ,
not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
StringBuilder isimli bir class uretmistir.
2) Java'da StringBuilder ile hemen hemen ayni isi yapan bir de StringBuffer classi vardir.
"StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
"StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
"StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.

    */

    public static void main(String[] args) {
        String str = "JavaCAN";
        System.out.println("Method oncesi str = " + str);//Method oncesi str = JavaCAN

        strBirlestir(str);//str makyaja gitti ve SONUC: JavaCAN agama selam olsun :)
        System.out.println("Method sonrasi str = " + str);//Method sonrasi str = JavaCAN
        // immutable'dir(atama yapilmadan degismedi)

// TASK: 50000 tekrarli bir loop ile String ve StringBuilder obj run time surelerini karsilastirin.

        String str1 = "";
        StringBuilder sb1 = new StringBuilder("");

        LocalTime str1Basla = LocalTime.now();//Str1 dongu baslama zamani
        System.out.println("str1Basla = " + str1Basla);//str1Basla = 14:21:58.152141300
        for (int i = 0; i < 50000; i++) {
            str1 += i;
        }
        LocalTime str1Bitti = LocalTime.now();//Str1 dongu bitis zamani
        System.out.println("str1 bitis suresi = " + str1Bitti);//str1 bitis suresi = 14:21:59.653386

     LocalTime sb1Basla = LocalTime.now();//StringBuilder dongu baslama zamani
        System.out.println("sb1Basla = " + sb1Basla);//sb1Basla = 14:21:59.669009300
        for (int i = 0; i < 50000; i++) {
            sb1.append(i);
        }
        LocalTime sb1Bitti = LocalTime.now();//StringBuilder dongu bitis zamani
        System.out.println("sb1Bitti = " + sb1Bitti);//sb1Bitti = 14:21:59.722668600

// PC ve internet hizina bagli olarak StringBuilder daha hizli sonuc verir.
    }//main sonu

    public static void strBirlestir(String str) {
        System.out.println(str + " agama selam olsun :)");
    }
}