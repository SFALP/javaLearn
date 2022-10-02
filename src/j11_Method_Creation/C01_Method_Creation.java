package j11_Method_Creation;

public class C01_Method_Creation {//class acilisi

    public static void main(String[] args) {//Main method acilisi

         /*
 code okunabilirliği ve sadeliği için sürekli kullanılan aksiynlar için method create edip
    main method'a call(cagirmak) edip run etmek uygulamanın test edilmesi mantanance ve reusable açısından tracih edilir
    1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
    parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

    str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                          bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                          bana rapor olarak ne getirdigini bilmem lazim (true/false)

    2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

    3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
       de oldugu gibi
       disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
       deklare edilmeli

       method call edildiğinde  Parametre olarak
       declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
*/
        System.out.println("Javacanlara selam");//Kodda ilk burası calisir. (1.sira)
        topla();//parametresiz return type olmayan void bir method call edildi (2.sira)

        System.out.println("Bu yaziyi okuyabiliyorsaniz, yukaridaki method'da sorunsuz calismistir."); //(3.sira)
        topla2(34,43);//77 Method call yapildi. Parametreli oldugu icin intigerlar bu seviyede tanimlanmalidir.(4.sira)
        System.out.println("Kodun sonuna geldiniz, Tschüss :)");

        int maas=topla3();
        System.out.println(maas);//135
        System.out.println("Bu durumda topla3 calisir. Sonuc: "+topla3());

        System.out.println(topla4(35, 48));//166
        System.out.println(topla4(10, 20));//60
        System.out.println(topla4(5, 8));//26

        /* EKRAN CIKTISI ASAGIDADIR. Main icinde once topla() methodunu calistirir ve call(cagirir) eder.
Sonrasında yukarıdaki sout kodunda yazılan icerik ekranda gorunur. Boylece asagidaki ekran ortaya cikar.
******** OUTPUT **********
Javacanlara selam
56
topla methodundan selamlar :)
Bu yaziyi okuyabiliyorsaniz, yukaridaki method'da sorunsuz calismistir.
77
 */


        //Bir methodu main methodun call etmek icin mutlaka static keyword kullanılmalı.
//Method parantezinin icinde olusturulan variable'lara "parametre" denir.
//Methodu call edilirken method parantezinin icine yazilan degerlere "Argument" denir.
//Parametrenin data type'i ile Argumentin data type'i 1'e 1 eslesmeli

    }//Main method kapanisi

    public static int topla4(int b, int a) {//String ve int parametreli int return eden method
        System.out.println(b);
return 2*(a + b);

    }

    public static int topla3() {//parametresiz ancak intiger return type methoddur.
int a=72;
int b=63;

        return a+b;//135
    }

    // bir method Class'in icinde ama  main method'un disinda  cereate edilir
// Best practice-> method'lar main method'dan sonra create edilir.
    public static void topla() {//parametresiz return type olmayan void bir method creat edildi.
        int a = 33;
        int b = 23;

        System.out.println(a + b);
        System.out.println("topla methodu bitti, herkese selamlar :) ");
    }

    public static void topla2(int a, int b){// 2'li ntiger parametreli void method baslangicidir.
        System.out.println("Bu method parametrelidir");
        System.out.println(a+b);
        System.out.println("topla2 calisti");
    }// 2'li ntiger parametreli void method kapanisidir.

}// class kapanisi