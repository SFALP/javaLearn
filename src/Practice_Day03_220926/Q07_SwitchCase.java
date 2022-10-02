package Practice_Day03_220926;

import java.util.Scanner;

public class Q07_SwitchCase {
    public static void main(String[] args) {
        // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 3 basamaklı pozitif bir sayı tanımlayınız: ");
        int a=scan.nextInt();

        int y=a/100;
        int o=(a/10)%10;
        int b=a%10;

        if (a>99 && a<1000){
switch (y){
    case 0:System.out.print("");break;
    case 1:System.out.print("Yuz");break;
    case 2:System.out.print("Ikiyuz");break;
    case 3:System.out.print("Ucyuz");break;
    case 4:System.out.print("Dortyuz");break;
    case 5:System.out.print("Besyuz");break;
    case 6:System.out.print("Altiyuz");break;
    case 7:System.out.print("Yediyuz");break;
    case 8:System.out.print("Sekizyuz");break;
    case 9:System.out.print("Dokuzyuz");break;
        }switch (o){
    case 0:System.out.print("");break;
    case 1:System.out.print("On");break;
    case 2:System.out.print("Yirmi");break;
    case 3:System.out.print("Otuz");break;
    case 4:System.out.print("Kirk");break;
    case 5:System.out.print("Elli");break;
    case 6:System.out.print("Altmis");break;
    case 7:System.out.print("Yetmis");break;
    case 8:System.out.print("Seksen");break;
    case 9:System.out.print("Doksan");break;
        }switch (b){
    case 0:System.out.print("");break;
    case 1:System.out.print("Bir");break;
    case 2:System.out.print("Iki");break;
    case 3:System.out.print("Uc");break;
    case 4:System.out.print("Dort");break;
    case 5:System.out.print("Bes");break;
    case 6:System.out.print("Alti");break;
    case 7:System.out.print("Yedi");break;
    case 8:System.out.print("Sekiz");break;
    case 9:System.out.print("Dokuz");break;
        }

        } else if (a<=-99 && a>=-1000) {

            switch (y){
                case 0:System.out.print("Eksi");break;
                case 1:System.out.print("EksiYuz");break;
                case 2:System.out.print("EksiIkiyuz");break;
                case 3:System.out.print("EksiUcyuz");break;
                case 4:System.out.print("EksiDortyuz");break;
                case 5:System.out.print("EksiBesyuz");break;
                case 6:System.out.print("EksiAltiyuz");break;
                case 7:System.out.print("EksiYediyuz");break;
                case 8:System.out.print("EksiSekizyuz");break;
                case 9:System.out.print("EksiDokuzyuz");break;
            }switch (o){
                case 0:System.out.print("");break;
                case 1:System.out.print("On");break;
                case 2:System.out.print("Yirmi");break;
                case 3:System.out.print("Otuz");break;
                case 4:System.out.print("Kirk");break;
                case 5:System.out.print("Elli");break;
                case 6:System.out.print("Altmis");break;
                case 7:System.out.print("Yetmis");break;
                case 8:System.out.print("Seksen");break;
                case 9:System.out.print("Doksan");break;
            }switch (b){
                case 0:System.out.print("");break;
                case 1:System.out.print("Bir");break;
                case 2:System.out.print("Iki");break;
                case 3:System.out.print("Uc");break;
                case 4:System.out.print("Dort");break;
                case 5:System.out.print("Bes");break;
                case 6:System.out.print("Alti");break;
                case 7:System.out.print("Yedi");break;
                case 8:System.out.print("Sekiz");break;
                case 9:System.out.print("Dokuz");break;
            }
        }else
            System.out.print("Hatali bir sayi tanımladınız. Lütfen tekrar deneyiniz.");
    }
}
