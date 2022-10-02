package j01_Variables;

public class HelloWorld {


    public static void main(String[] args) {
        System.out.println("Hello World");// bu komut konsola yazılan metni print eder.
        //'dan sonra yazılan ifadeler komut veya kod satırı olarak değil yorum olarak tanımlanır. Tekli satırdan oluşur.
        /*
        Bu araya yazılan her ifade yorum satırıdır, Java kod olarak belirlemez. Bu alana çoklu satırda yazılır.
         Çalışması istenmeyen kodların başına // ifadesi eklenebilir.
          Böylelikle kod silinmeden satırlarda bırakılabilir.
          Imlecin olduğu satır, Ctrl+D tuşlarıyla bir alt satıra klonlanabilir.
         */
        /*
        TRICK: Java'da code satırı cümle (statement) sonuna mutlaka noktalı virgül koyulmalıdır (;)
        Kod satırında kırmızı alt çizgi uyarısı "compile time error" CTE hatası uyarısı demektir.
         CTE düzeltilmeden code yazılmaz, yazılan code çalışmaz.
         */


        System.out.println("Sag Hallo für Javaschülerchen");
        // TASK: as soyad yas memleket ve meslek print ediniz//

        System.out.print("Vorname-Nachname: F4992-S.Faruk");
        System.out.println(" Jahre: 30");
        System.out.println("Herkunft: Istanbul");
        System.out.println("Beruf: Ogrenci");

        /* TRICK(Print-Println farkı):
        print-> yazdırma işleminden sonraki komutu AYNI satırda devam ettirir.
        println-> yazdırma işleminden sonraki komutu ALT satırda devam ettirir
        javada boşluk bir karakter olarak sayılır.
        j a v a ->7 karakter
         */
    }
}