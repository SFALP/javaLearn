package Frei_Ubungen;

import java.util.Scanner;

public class U220918_IfStruktur {
    public static void main(String[] args) {
// TASK 1: IfStruktur test; Univ notlarının harf karşılığını öğrenme çalışması (IF NESTED yani iç içe IF çalışması)

        Scanner scan= new Scanner(System.in);
        System.out.println("Not öğrenme programına Hoşgeldiniz!");
        System.out.println("\nLütfen ortalama puanınız giriniz: ");
        int sayi =scan.nextInt();
        if ( sayi >= 90 ) {
            System.out.println("Puanınız "+sayi+" ve AA ile geçtiniz ");
        }
        if ( sayi >= 80 && sayi < 90 ) {
            System.out.println("Puanınız "+sayi+" ve BB ile geçtiniz ");
        }
        if ( sayi >= 70 && sayi < 80 ) {
            System.out.println("Puanınız "+sayi+" ve CC ile geçtiniz ");
        }
        if ( sayi >= 60 && sayi < 70 ) {
            System.out.println("Puanınız "+sayi+" ve DD ile geçtiniz ");
        }
        if ( sayi < 60) {
            System.out.println("Puanınız "+sayi+" ve FF ile malesef kaldınız. ");
        }

 // TASK 2: Girilen bir değerin yazılım içinde sorgulatılarak sonuç çıkarma çalışması

        Scanner sc=new Scanner(System.in);
        System.out.println("Konuşabildiğiniz bir dilin almancasını yazınız: ");
        String d=sc.next();
        String dil= "Turkisch, Englisch, Deutsch, Französisch, Italianisch, Spanisch, Portugiesisch, Griechisch";
        if (dil.contains(d)) {
            System.out.println("Sie können " +d+" sprechen. Vielen Dank :)");
        }

//TASK 3: Askerlik hizmeti öğrenme çalışması

        Scanner s= new Scanner(System.in);
        System.out.println("TC kanunlarına göre askerlik hizmeti yükümlülük durumunuzu öğrenme programına Hoşgeldiniz!");
        System.out.println("Lütfen cinsiyetiniz Erkek ise E, Kadın ise K giriniz: ");
        String c= s.next();

        System.out.println("Lütfen yaşınızı giriniz: ");
        int y= s.nextInt();
        if (y<18 && c.equals("E")){
            System.out.println("Askerlik hizmeti yükümlülük yaşına henüz erişmediniz.");
        }
        if (y<18 && c.equals("K")){
            System.out.println("Askerlik hizmeti yükümlülüğünüz bulunmamaktadır.");}
        if (y>=18 && c.equals("E")){
            System.out.println("Askerlik hizmeti yükümlülüğünüz bulunmaktadır.");
        }
        if (y>=18 && c.equals("K")){
            System.out.println("Askerlik hizmeti yükümlülüğünüz bulunmamaktadır.");
        }
        System.out.println("Teşekkürler :)");

// TASK4: Matematiksel 4 işlem çalışması.(Kullanıcının talebine göre)


        Scanner scn= new Scanner(System.in);
        System.out.println("4 işlemle matematik işlemi uygulama programına Hoşgeldiniz! ");
        System.out.println("Lütfen yapmak istediğiniz matematiksel işlemi tanımlayınız (+ , - , * , / )");
        String islem= scn.next();
        System.out.println("1.Tamsayıyı tanımlayınız(0 hariç): ");
        int s1=scn.nextInt();
        System.out.println("2.Tamsayıyı tanımlayınız(0 hariç): ");
        int s2=scn.nextInt();
        if (islem.equals("+")) {
            int t=s1+s2;
            System.out.println("İki sayının toplamı= "+t);
        }
        if (islem.equals("-")) {
            int t=s1-s2;
            System.out.println("İki sayının mutlak değerdeki farkı= "+Math.abs(t));
            System.out.println("1.Tamsayı - 2.Tamsayı farkı= "+(s1-s2));
            System.out.println("2.Tamsayı - 1.Tamsayı farkı= "+(s2-s1));

        }if (islem.equals("*")) {
            int t=s1*s2;
            System.out.println("İki sayının çarpımı= "+s1*s2);
        }if (islem.equals("/")) {
            int t=s1+s2;
            System.out.println("1.Tamsayının 2.Tamsayıya bölümünün sonucu= "+(s1/s2)+" dir.");
            System.out.println("2.Tamsayının 1.Tamsayıya bölümünün sonucu= "+(s2/s1) +" dir.");
        }
        System.out.println("Teşekkürler :=)");


// TASK 5: IF ve ELSE IF çalışması

        int q= 40;
        if (q>= 50) {
            System.out.println("Sayı 50'ye eşit veya 50'den büyüktür.");
        }else {
            System.out.println("Sayı 50'den küçüktür.");
        }

//TASK 6: Askerlik yükümlülüğü IF ELSE çalışması


        String w1= "E";
        int i1= 17;
        if(w1.equals("E")){
            if (i1>=18){
            System.out.println("Askerlik yükümlülüğünüz bulunmaktadır, en büyük asker bizim asker.");
            }else {
            System.out.println("Askerlik yaşınıza henüz ulaşmadınız");
        }}else
            System.out.println("Kadınların askerlik yükümlülüğü bulunmamaktadır.");

// TASK 7: IF || ELSE IF ve ELSE çalışması:

String gun= "cumartesi";
        if(gun.equals("Pazar")){
            System.out.println("Bugün günlerden Pazar.");
        }else if(gun.equals("Cumartesi")){
            System.out.println("Bugün günlerde Cumartesi");
        }
        else {
            System.out.println("Bugün Haftaiçi");
        }

        }
    }
