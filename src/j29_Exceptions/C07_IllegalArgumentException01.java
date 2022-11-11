package j29_Exceptions;

import java.util.Scanner;

public class C07_IllegalArgumentException01 {
    public static void main(String[] args) {
/*
Ahan da TRICK kosesinde bugun-->
"throw" - "throws" farklari:
1-"throws"--> main method kapanis suslu paranteziyle meyhod body acilis parantezi arasinda yazilir.
  "throw"--> method body icinde tanimlanir.
2-"throws"--> keyword'den sonra birden fazla exceptions tanimlanabilir.
  "throw"--> keyword'den sonra sadece 1 tane exceptions tanimlanabilir.

3- "throws"--> keyword'den sonra sadece exception class name yazilir.
   "throw"-->keyword'den sonra exception objesi tanimlanir.

4-"throws"--> keyword method ilk satirda sadece bir kez tanimlanir.
  "throw"-->keyword istenildigi kadar method body'de tanimlanabilir.

 */

//IllegalArgumentException -- > kullanilmasini istenmeyen degerlerde program hata vermesi isteniyorsa bu exception firlatilir.
// OR: yas datasi icin negatif deger girildiginde programin kirilmadan run olmasi ama
// girilen deger icin exception firmlatmasi icin kullanilir.
        Scanner sc = new Scanner(System.in);

        System.out.print("Agam yasini giresen: ");
        int age = sc.nextInt();

 //     if (age<18){
 //         System.out.println("Yasiniz ("+age+") ehliyet icin uygun degil");
 //         throw new IllegalArgumentException();//throw komutu, try-catch block olmadan da istenen method body'de tanimlanabilir
 //     }else {
 //         System.out.println("Yasiniz ("+age+") ehliyet icin uygun");
 //     }


      try {
          if (age < 0) {
              throw new IllegalArgumentException();// throw keyword ile Exception obj olusturularak hata tanimlanir ve firlatilir
              // boylece sartimiza uymayan deger icin de catch block'a dusurerek daha pratik code yazildi.
          }else System.out.println("agam yasin hayirli olsun: "+age);

          System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
      } catch (IllegalArgumentException e) {
          System.out.println("Agam nettinnn, milattan once mi kaldin. Duzgunce bi yas gir.");
          System.out.println("agam catch block da bu yazıyı okuduysan excp fırlatıldı ve code handle edildi :) ");
      }
      try {
          if (age < 18) {
              throw new IllegalArgumentException();// throw keyword ile Exception obj olusturularak hata tanimlanir ve firlatilir
              // boylece sartimiza uymayan deger icin de catch block'a dusurerek daha pratik code yazildi.
          }else System.out.println("agam ehliyet icin basvurabilirsin, hayirli olsun: "+age);

          System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
      } catch (IllegalArgumentException e) {
          System.out.println("Agam nettinnn, bu yasta ehliyet mi alinir !!! ");
          System.out.println("agam catch block da bu yazıyı okuduysan excp fırlatıldı ve code handle edildi :) ");
      }

        System.out.println("Agam sorun handle edildi, devamkeee :)");//bu kod calismissa program sorunsuz kirilmadan run olmustur.

    }
}
