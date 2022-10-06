package j11_Method_Creation.tasks;

import java.util.Scanner;

public class Task15_JavajetAirlines {
    /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Java Airlines'e hosgeldin AGAM :) \n B - C - D rotasından birini tanimlayiniz");
        String rota = scan.nextLine().toUpperCase();
        System.out.println("Agam ucus yonu icin \\n tek yon --> 0 \\n gidis donus -->1\\ seciniz");
        int ucusYonu = scan.nextInt();//ucus yone tek-cift alindi.

        System.out.println("Agam yasini gir: ");
        int yas = scan.nextInt();//yas verisi alindi.

        double fiyatB = 500 * 0.1;//A'dan B'ye tek yon gidis ucreti
        double fiyatC = 700 * 0.1;//A'dan C'ye tek yon gidis ucreti
        double fiyatD = 900 * 0.1;//A'dan D'ye tek yon gidis ucreti

        if (rota.equals("B") || rota.equals("C") || rota.equals("D")) {
            if (yas > 65) {//yas kontrolu
                if (rota.equals("B")) {//rota B ucma sartidir.
                    if (ucusYonu == 1) {//cift yon ucus kontrolu
                        System.out.println("    ****     ");
                        System.out.println("65 Yas ustu gidis-donus bilete demeniz gereken tutar: " + (fiyatB * 0.7 * 0.8 * 2) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim ve cift yonden dolayı yuzde 20 indirim daha yapildi. Dönüs bileti icin de 2 ile carpildi.

                    } else if (ucusYonu == 0) {//tek yone gidis bilet secimidir.
                        System.out.println("    ****     ");
                        System.out.println("65 Yas ustu tek yon bilete demeniz gereken tutar: " + (fiyatB * 0.7) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim daha yapildi.

                    } else System.out.println("Agam hala yonun belirsiz");

                } else if (rota.equals("C")) {//rota C olursa
                    if (ucusYonu == 1) {//cift yon ucus kontrolu
                        System.out.println("    ****     ");
                        System.out.println("65 Yas ustu gidis-donus bilete demeniz gereken tutar: " + (fiyatC * 0.7 * 0.8 * 2) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim ve cift yonden dolayı yuzde 20 indirim daha yapildi.

                    } else if (ucusYonu == 0) {//tek yone gidis bilet secimidir.
                        System.out.println("    ****     ");
                        System.out.println("65 Yas ustu tek yon bilete demeniz gereken tutar: " + (fiyatC * 0.7) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim daha yapildi.

                    } else System.out.println("Agam hala yonun belirsiz");

                } else if (rota.equals("D")) {
                    if (ucusYonu == 1) {//cift yon ucus kontrolu
                        System.out.println("    ****     ");
                        System.out.println("65 Yas ustu gidis-donus bilete demeniz gereken tutar: " + (fiyatD * 0.7 * 0.8 * 2) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim ve cift yonden dolayı yuzde 20 indirim daha yapildi.

                    } else if (ucusYonu == 0) {//tek yone gidis bilet secimidir.
                        System.out.println("    ****     ");
                        System.out.println("65 Yas ustu tek yon bilete demeniz gereken tutar: " + (fiyatD * 0.7) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim daha yapildi.

                    } else System.out.println("Agam hala yonun belirsiz");


                } else System.out.println("Hatali giris yaptiniz. Lutfen tekrar deneyiniz");
            } else if (yas < 24 && yas >= 12) {//12-24 yas kontrolu
                if (rota.equals("B")) {//rota B ucma sartidir.
                    if (ucusYonu == 1) {//cift yon ucus kontrolu
                        System.out.println("    ****     ");
                        System.out.println("12-24 yas arasi gidis-donus bilete demeniz gereken tutar: " + (fiyatB * 0.9 * 0.8 * 2) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim ve cift yonden dolayı yuzde 20 indirim daha yapildi. Dönüs bileti icin de 2 ile carpildi.

                    } else if (ucusYonu == 0) {//tek yone gidis bilet secimidir.
                        System.out.println("    ****     ");
                        System.out.println("12-24 yas arasi tek yon bilete demeniz gereken tutar: " + (fiyatB * 0.9) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim daha yapildi.

                    } else System.out.println("Agam hala yonun belirsiz");

                } else if (rota.equals("C")) {//rota C olursa
                    if (ucusYonu == 1) {//cift yon ucus kontrolu
                        System.out.println("    ****     ");
                        System.out.println("12-24 yas arasi gidis-donus bilete demeniz gereken tutar: " + (fiyatC * 0.9 * 0.8 * 2) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim ve cift yonden dolayı yuzde 20 indirim daha yapildi.

                    } else if (ucusYonu == 0) {//tek yone gidis bilet secimidir.
                        System.out.println("    ****     ");
                        System.out.println("12-24 yas arasi tek yon bilete demeniz gereken tutar: " + (fiyatC * 0.9) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim daha yapildi.

                    } else System.out.println("Agam hala yonun belirsiz");

                } else if (rota.equals("D")) {
                    if (ucusYonu == 1) {//cift yon ucus kontrolu
                        System.out.println("    ****     ");
                        System.out.println("12-24 yas arasi gidis-donus bilete demeniz gereken tutar: " + (fiyatD * 0.9 * 0.8 * 2) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim ve cift yonden dolayı yuzde 20 indirim daha yapildi.

                    } else if (ucusYonu == 0) {//tek yone gidis bilet secimidir.
                        System.out.println("    ****     ");
                        System.out.println("12-24 yas arasi tek yon bilete demeniz gereken tutar: " + (fiyatD * 0.9) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim daha yapildi.

                    } else System.out.println("Agam hala yonun belirsiz");


                } else System.out.println("Hatali giris yaptiniz. Lutfen tekrar deneyiniz");

            } else if (yas < 12) {//12'den kucuk yas sartidir
                if (rota.equals("B")) {//rota B ucma sartidir.
                    if (ucusYonu == 1) {//cift yon ucus kontrolu
                        System.out.println("    ****     ");
                        System.out.println("12 yasindan kucuk gidis-donus bilete demeniz gereken tutar: " + (fiyatB * 0.5 * 0.8 * 2) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim ve cift yonden dolayı yuzde 20 indirim daha yapildi. Dönüs bileti icin de 2 ile carpildi.

                    } else if (ucusYonu == 0) {//tek yone gidis bilet secimidir.
                        System.out.println("    ****     ");
                        System.out.println("12-24 yas arasi tek yon bilete demeniz gereken tutar: " + (fiyatB * 0.5) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim daha yapildi.

                    } else System.out.println("Agam hala yonun belirsiz");

                } else if (rota.equals("C")) {//rota C olursa
                    if (ucusYonu == 1) {//cift yon ucus kontrolu
                        System.out.println("    ****     ");
                        System.out.println("12-24 yas arasi gidis-donus bilete demeniz gereken tutar: " + (fiyatC * 0.5 * 0.8 * 2) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim ve cift yonden dolayı yuzde 20 indirim daha yapildi.

                    } else if (ucusYonu == 0) {//tek yone gidis bilet secimidir.
                        System.out.println("    ****     ");
                        System.out.println("12-24 yas arasi tek yon bilete demeniz gereken tutar: " + (fiyatC * 0.5) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim daha yapildi.

                    } else System.out.println("Agam hala yonun belirsiz");

                } else if (rota.equals("D")) {
                    if (ucusYonu == 1) {//cift yon ucus kontrolu
                        System.out.println("    ****     ");
                        System.out.println("12-24 yas arasi gidis-donus bilete demeniz gereken tutar: " + (fiyatD * 0.5 * 0.8 * 2) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim ve cift yonden dolayı yuzde 20 indirim daha yapildi.

                    } else if (ucusYonu == 0) {//tek yone gidis bilet secimidir.
                        System.out.println("    ****     ");
                        System.out.println("12-24 yas arasi tek yon bilete demeniz gereken tutar: " + (fiyatD * 0.5) + "$");
                        //FiyatB'yi yastan dolayı yuzde 30 indirim daha yapildi.

                    } else System.out.println("Agam hala yonun belirsiz");


                } else System.out.println("Hatali giris yaptiniz. Lutfen tekrar deneyiniz");

            } else System.out.println("Agam yasin sana malesef indirim kazandirmadi :(");//24-65 yas arası

            if (rota.equals("B")) {//rota B ucma sartidir.
                if (ucusYonu == 1) {//cift yon ucus kontrolu
                    System.out.println("    ****     ");
                    System.out.println("24-65 yas arasi gidis-donus bilete demeniz gereken tutar: " + (fiyatB * 0.8 * 2) + "$");
                    //FiyatB'yi yastan dolayı yuzde 30 indirim ve cift yonden dolayı yuzde 20 indirim daha yapildi. Dönüs bileti icin de 2 ile carpildi.

                } else if (ucusYonu == 0) {//tek yone gidis bilet secimidir.
                    System.out.println("    ****     ");
                    System.out.println("24-65 yas arasi tek yon bilete demeniz gereken tutar: " + (fiyatB) + "$");
                    //FiyatB'yi yastan dolayı yuzde 30 indirim daha yapildi.

                } else System.out.println("Agam hala yonun belirsiz");

            } else if (rota.equals("C")) {//rota C olursa
                if (ucusYonu == 1) {//cift yon ucus kontrolu
                    System.out.println("    ****     ");
                    System.out.println("24-65 yas arasi gidis-donus bilete demeniz gereken tutar: " + (fiyatC * 0.8 * 2) + "$");
                    //FiyatB'yi yastan dolayı yuzde 30 indirim ve cift yonden dolayı yuzde 20 indirim daha yapildi.

                } else if (ucusYonu == 0) {//tek yone gidis bilet secimidir.
                    System.out.println("    ****     ");
                    System.out.println("24-65 yas arasi tek yon bilete demeniz gereken tutar: " + (fiyatC) + "$");
                    //FiyatB'yi yastan dolayı yuzde 30 indirim daha yapildi.

                } else System.out.println("Agam hala yonun belirsiz");

            } else if (rota.equals("D")) {
                if (ucusYonu == 1) {//cift yon ucus kontrolu
                    System.out.println("    ****     ");
                    System.out.println("24-65 yas arasi gidis-donus bilete demeniz gereken tutar: " + (fiyatD * 0.8 * 2) + "$");
                    //FiyatB'yi yastan dolayı yuzde 30 indirim ve cift yonden dolayı yuzde 20 indirim daha yapildi.

                } else if (ucusYonu == 0) {//tek yone gidis bilet secimidir.
                    System.out.println("    ****     ");
                    System.out.println("24-65 yas arasi tek yon bilete demeniz gereken tutar: " + (fiyatD) + "$");
                    //FiyatB'yi yastan dolayı yuzde 30 indirim daha yapildi.

                } else System.out.println("Agam hala yonun belirsiz");


            } else System.out.println("Hatali giris yaptiniz. Lutfen tekrar deneyiniz");


        } else System.out.println("Agam o gezegene ucuslarimiz henuz baslamadi :(");// rota kontrol disi durum
    }

}