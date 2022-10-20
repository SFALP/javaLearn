package j08_IfStatement_Ternary_Oper;

public class C01_IfStatement {
    public static void main(String[] args) {
        int y1 = 45;
        int y2 = 63;

        if (y1 == y2) {
            System.out.println("Aynı yastasınız guzel insanlar");
            System.out.println("Yoksa siz ikiz misiniz?");

        }
        if (y1 >= 40)
            System.out.println("İlk kişi olgunluk yasindadir."); //Satırda parantez yoksa ilk noktalı virgüle kadar çalışır sonrası kapsam dışındadır.
        // Eğer y1 40'tan büyük olsaydı "İlk kişi olgunluk yasindadir." yazdırılacaktır.
        // IF blokta {} kullanılmazsa ilk noktalı virgül çalışır, kullanılmazsa çalışmaz ve alt satırdan çalışma devam eder.
        System.out.println("Bu yazıyı okuduysaniz bir ustteki (14.satır) IF yapisindan bagımısızdır");//If yapısında parantez bulunmuyorsa bir üstteki if yapısı burayı kapsamaz.
        // Bu nedenle IF'ten sonraki ilk noktalı virgüle kadar olan komut çalışır.
        if (y1 + y2 > 100) {
            System.out.println("Y1 ve Y2 degerlerinde tanımlanan yaşların toplamı 100\'den buyuktur.");
        }
        System.out.println("Selam JavaCAN'lar");
// (Ctrl+Alt+L) harflerine basılırsa kodda reformat yapılır. Java formata döner.
/*
 Bağımsız if statement yapıları sadece kendi sop(kapsamlarını) run eder.
 Birden fazla bağımsız if statement yapıları hepsinin body calışabileceği gibi hiçbirisini body de çalışmayabilir.
*/
    }
}
