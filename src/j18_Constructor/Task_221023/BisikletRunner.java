package j18_Constructor.Task_221023;

import java.util.Scanner;

/*
    Task 04->
     Bisiklet Class :Properties(fields) : hiz, vites
     method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
     vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
     vites 5 den büyük ve 1 den küçük olamaz.
     yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
     */
public class BisikletRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bisiklet bisiklet = Bisiklet.bisikletUret();
        int secim;
        System.out.println("Bisiklet programina Hosgeldiniz!");

        do {
            bisiklet.menu();
            secim = sc.nextInt();
            bisiklet.secim(secim);
        } while (secim >= 1 && secim <= 4);
    }
}
