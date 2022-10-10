package j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

/*
Baslangic ve bitis degerleri net(bilinen) olan tekrarlarda for loop
ama adim belli olmayip bir sarta (duruma) vagli olan tekrarlarda while loop kullanilmali,
 */

//TASK1= 11'den 20'ye kadar olan tamsayilari print eden code create ediniz.

        System.out.println("******FOR Loop*******");
        for (int i = 11; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n   *** WHILE Loop ***   ");

        int basla = 11;//while başlangıc degeri
        while (basla < 21) {//basla 21 den kucuk oldugu surece (iken) body action uygula
            System.out.print(basla + " ");
            basla++;//while dongü değişim komutu basla+=1;
        }
        //System.out.println("\n****** WHILE Loop********");
        //int basla = 11;
        //while (basla <= 20) ;{
        //    System.out.print(basla + " ");
        //    basla++;
        //}

        // TASK2: 7 kere JavaCAN print eden code create ediniz.
        System.out.println("\n\n*** TASK 2 ***");
        int b = 1;
        while (b < 8) {
            System.out.println(b + ". JavaCAN");
            b++;
        }
// TASK 3: İki basamakli tek sayilari yan yana print eden cod create ediniz.
        System.out.println("\n *** TASK 3(Iki basamakli tek sayilarin yazdirilmasi) *** ");
        int x = 11;
        while (x < 100) {
            System.out.print(x + " ");
            x += 2;
        }
// TASK4: Girilen metni while loop ile tersten print eden code create ediniz.
        System.out.println("\nTASK 4 Metnin tersten yazdirilmasi ornegidir");
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir metin tanimlayiniz: ");
        String a4 = sc.nextLine().toLowerCase().trim();
        int metinUzunluk = a4.length();

        while (metinUzunluk >= 1) {//metnin son karakteri 0a esit olana kadar bu kodu calis.
            System.out.print(a4.charAt(metinUzunluk - 1));
            metinUzunluk--;
        }
// TASK5: Girilen tamsayiya kadar tamsayilarin toplamini print eden code create ediniz.
        System.out.println("\n *** TASK 5 *** ");
        System.out.print("Bir tamsayi giriniz: ");
        int x5 = sc.nextInt();
        int topl = 0;
        while (x5 > 0) {//sayi 1 olana dek
            topl += x5;//her dongude sayiyi toplama ekle
            x5--;//her dongude sayiyi " azalt ki sonsuz donguye girmesin
        }
        System.out.println("Girilen sayiya kadar olan tamsayilarin toplamı: " + topl);

// TASK6: Girilen tamsayinın faktoryelini while ile print eden code create ediniz.
        System.out.println("\n *** TASK 6 *** ");
        System.out.print("Faktoryel hesabi icin bir sayi tanimlayiniz: ");
int a6=sc.nextInt();
        int faktor=1;
while(a6>=1){
faktor*=a6;
a6--;
}
        System.out.println("Tanimlanan sayinin faktoryeli: "+faktor);

    }//main sonu
}