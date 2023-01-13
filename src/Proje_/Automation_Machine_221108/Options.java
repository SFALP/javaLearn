package Proje_.Automation_Machine_221108;

import java.util.Scanner;

/*
Urun urun = new Urun();

1) Kullanıcı ürünleri göstermeliyiz. ----> Urun clasın da bir obj. toString()
2) Scanner --> Scanner clasından bir obj create ediniz. [productNum'a set edilmelidir. setProductNum() ]
3) Loop --> Do-While Loop --> kullanıcı 1-7 rakamları arasında bir seçim yapmalı ve eğer girmiş olduğu rakam
1 den küçük ve ya 7 den büyük ise döngü devam etmeli ve kullanıcı 1-7 arasında bir seçim yapmaya force edilmeli.
4) 0 a basarak ta menuden cıkabilmeli. --> Yine Bekleriz... Yazısını konsola yazdıralım....
5) Kullanıcıdan productNum (1-7 arasında rakam {Kullanıcı 1 rakamı seçerse, Kraker, 2 rakamını seçerse cips etc.... }) --> switch-case yapısı kurmalıyım...
6) switch benden ProductNum ve alınan bu productNum a göre ilgili ürünün price ı alınmalı. urun.getKraker(), urun.getCips(), urun.getCay(), getCocaCola() etc....
(price set edebilmek için ben price ın setPrice() metodunu kullanmalıyım...)
7) return olarak bana price dönmeli. return getPrice() (double)

 */
public class Options {
    public double select(Urun urun) {
        System.out.println(urun.toString());
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Lutfen [1 - 7] arasinda bir rakam tanimlayarak, almak istediginiz urunu seciniz: ");
            System.out.println("(Cikis icin 0'i seçiniz.): ");
            urun.setProductNum(sc.nextInt());
            if (urun.getProductNum() < 0 || urun.getProductNum() > 7) {
                System.out.print("Lutfen belirtilen aralikta bir rakam tanimlayiniz: ");
            }

        } while (urun.getProductNum() < 0 || urun.getProductNum() > 7);

        switch (urun.getProductNum()) {
            case 0:
                System.out.println("Yine Bekleriz...");
System.exit(0);
                break;
            case 1:
                urun.setPrice(urun.getKraker());
                break;
            case 2:
                urun.setPrice(urun.getCips());
                break;
            case 3:
                urun.setPrice(urun.getCocaCola());
                break;
            case 4:
                urun.setPrice(urun.getFanta());
                break;
            case 5:
                urun.setPrice(urun.getSu());
                break;
            case 6:
                urun.setPrice(urun.getCay());
                break;
            case 7:
                urun.setPrice(urun.getFiltreKahve());
                break;
            default:

                break;
        }
        return urun.getPrice();
    }

    public double balance(double price, double accountBalance, Urun urun) {
        double fonlama;
/*
        try {
            System.out.println("Halloooooo.....");
        }
        // handle
        catch (Exception e){
            System.out.println("Catch.......");
        }
*/
        while (accountBalance < price) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Yeterli bakiyeniz maalesef bulunmamaktadir... Ekleme yapmak istiyor musunuz? (Y/N): ");
            char confirm = sc.next().toLowerCase().charAt(0);
            if (confirm == 'N') {
                System.out.println("Mevcut bakiyeniz: " + accountBalance);
                System.out.println("Yine bekleriz...");
                break;
            } else {
                System.out.print("Ne kadar para daha ekleyeceginizi tanimlayiniz: ");
                fonlama = sc.nextDouble();
                accountBalance += fonlama;
                System.out.println("Yeni bakiyeniz: " + accountBalance);
                price = select(urun);
            }

        }
        return accountBalance;
    }
    public void purchase(double price, double accountBalance, Urun urun){
        while (accountBalance>=price){
accountBalance=accountBalance-price;
            System.out.println("Kalan Bakiye: "+accountBalance);

            Scanner sc=new Scanner(System.in);
            System.out.println("Baska bir urun almak ister misiniz (Y/N)?");
            char confirm=sc.next().toLowerCase().charAt(0);


            if (confirm=='n'){
                System.out.println("Yine bekleriz ...");
                break;
            }else {
                urun.setPrice(select(urun));
                balance(urun.getPrice(), accountBalance,urun);
            }
        }
    }


}
