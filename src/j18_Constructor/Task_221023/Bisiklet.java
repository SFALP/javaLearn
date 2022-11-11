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
public class Bisiklet {
    Bisiklet bisiklet1 = new Bisiklet();
    int hiz = 0;
    int vites = 1;
    Scanner sc = new Scanner(System.in);


    public void vitesArtir() {
        vites++;
        if (vites > 5) {
            System.out.println("Vites 5'ten buyuk olamaz");
            vites = 5;
        }
    }

    public void vitesAzalt() {
        vites--;
        if (vites < 1) {
            System.out.println("Vites 1'den kucuk olamaz");
            vites = 1;
        }
    }

    public void hizDegistir() {
        System.out.print("Lutfen hizinizi giriniz: ");
        hiz = sc.nextInt();
    }

    public void durumGoster() {
        System.out.println("Hiz: " + hiz);
        System.out.println("Vites: " + vites);
    }

    public static Bisiklet bisikletUret() {
        Bisiklet bisiklet1 = new Bisiklet();
        bisiklet1.hiz = 0;
        bisiklet1.vites = 1;
        return bisiklet1;

    }

    public void menu() {
        System.out.println("Vites artirmak icin (1) " +
                "\n Vites dusurmek icin (2)" +
                "\n Hiz ve Vitesi gormek icin (3)" +
                "\nYeni hiz girmek icin (4)" +
                "\n Cikis icin (5)");
    }

    public void secim(int secim) {
        switch (secim) {
            case 1:
                vitesArtir();
                break;
            case 2:
                vitesAzalt();
                break;
            case 3:
                durumGoster();
                break;
            case 4:
                hizDegistir();
                break;
            default:
                System.out.println("Cikis yapildi");
        }
    }
}
