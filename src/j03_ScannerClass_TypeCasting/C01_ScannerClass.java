package j03_ScannerClass_TypeCasting;
import java.util.Scanner;
public class C01_ScannerClass {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için şu 3 adın takip edilir.
        // 1.Adım -> ScannerClass'tan Obje Creat edilir.

        Scanner scan= new Scanner(System.in); //Scanner classtan kendi isminde değerini System içinden alan bir obje
// 2.Adım-> Kulllanıcıda istenen veri için bildirimde bulunulur. sout(...)

        System.out.println("Adınızı giriniz: "); //Burada print ile yazılırsa girilen ifade alt satıra inmeden yazılmış olur.
// 3. Adım-> Kullanıcının girdiği veri, data tipine göre bir variable'a atanır.
        String isim= scan.nextLine(); //Kullanıcıdan gelen String tipindeki isim verisi scan objesinin nextLine metoduyla atandı.
        System.out.println("isim = " + isim);

//TASK: Kullanıcıdan girdiği değere göre kare alanı ve çevresini hesaplayan bir code oluşturun.


        Scanner scanner = new Scanner(System.in); //1.Adım
        System.out.println("Karenin  kenar uzunluğunu tanımlayınız= ");//2.Adım
        int kenar= scanner.nextInt(); //3.Adım
        System.out.println("Alan= "+kenar*kenar+"\n Çevre: "+(kenar*4));
/* TASK: Kullanıcıdan günde içtiği çay ve kullandığı şeker sayısına göre
1 Yılda kaç kg seker kullandığını hesaplayan bir kod creat ediniz...
1 Seker = 1.7gr
Ör: Input: cay sayısı: 10 şeker sayısı:2
Output: Yılda 12.41 kg şeker kullanıyorsunuz.
*/


        System.out.println("Günlük içtiğiniz çay sayısını giriniz: ");//Çay için 2.adım
        int cay= scanner.nextInt(); //Çay için 3.adım

        System.out.println("Şeker sayınızı giriniz: ");//şeker için 2.adım
        int seker= scanner.nextInt(); //şeker için 3.adım

        System.out.println("Yıllık şeker tüketiminiz (kg):"+(cay*seker*1.7*365)/1000+"kg");

       System.out.println("İsminizi giriniz:");
       char ch=scan.nextLine().charAt(0);//Kullanıcıdan gelen string ifadennin 0.index ilk karakterini alır.
       System.out.println("İsminizin ilk karakteri: "+ch);

// ALT tuşuna basarak satırlar çoklu olarak seçilerek işlem yapılabilir.
//         String isim=scan.next(); // Kullanıcı girdiği ilk ifadeyi ad'a atar.
    }
}
