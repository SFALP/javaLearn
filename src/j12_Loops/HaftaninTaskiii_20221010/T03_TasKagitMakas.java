package j12_Loops.HaftaninTaskiii_20221010;

import java.util.Random;
import java.util.Scanner;


public class T03_TasKagitMakas {
    static char com;
    static int i = 1;
    static int numberOfFirstWin = 0;
    //	static int numberOfSecondWin = 0;
    static int numberOfComWin = 0;
//	static int gameOver = 3;

    public static void main(String[] args) {
        // tas >makas
        // makas >kagit
        //kagit >tas


        Scanner scan = new Scanner(System.in);
        System.out.println("TAS - KAGIT - MAKAS oyununa Hosgeldiniz!\n Oyunda 3 puanı alan kazanir.");


        while (numberOfFirstWin == 3 || numberOfComWin == 3) {
            System.out.println("Lutfen 3 secenekten birini seciniz: \n(T)as\n(K)agit\n(M)akas");
            char secim = scan.next().toLowerCase().trim().charAt(0);
            Random r = new Random();
            int randomSecim = r.nextInt(3);
            oyun(secim, randomSecim);
        }
        //if (numberOfFirstWin==3) System.out.println("Oyuncu, bilgisayari yendi :=)");
//else System.out.println("Bilgisayar, oyuncuyu yendi");
        System.out.println("Yine bekleriz");
    }

    public static void oyun(char secim, int randomSecim) {
        switch (secim) {
            case ('k'):
                if (secim == com(randomSecim)) {
                    System.out.println(i + ". oyun berabere");
                    i++;

                    System.out.println("Oyuncu puani: " + numberOfFirstWin + "\n Bilgisayar puani: " + numberOfComWin);
                } else if (com(randomSecim) == 't') {
                    System.out.println(i + ". oyunu oyuncu kazandı");
                    i++;
                    numberOfFirstWin++;

                } else {
                    System.out.println(i + ". oyunu bilgisayar kazandı");
                    i++;
                    numberOfComWin++;

                }
                break;
            case ('t'):
                if (secim == com(randomSecim)) {
                    System.out.println(i + ". oyun berabere");
                    i++;

                } else if (com(randomSecim) == 'm') {
                    System.out.println(i + ". oyunu oyuncu kazandı");
                    i++;
                    numberOfFirstWin++;

                } else {
                    System.out.println(i + ". oyunu bilgisayar kazandı");
                    i++;
                    numberOfComWin++;

                }
                break;
            case ('m'):
                if (secim == com(randomSecim)) {
                    System.out.println(i + ". oyun berabere");
                    i++;

                } else if (com(randomSecim) == 'k') {
                    System.out.println(i + ". oyunu oyuncu kazandı");
                    i++;
                    numberOfFirstWin++;

                    System.out.println("Oyuncu puani: " + numberOfFirstWin + "\n Bilgisayar puani: " + numberOfComWin);
                } else {
                    System.out.println(i + ". oyunu bilgisayar kazandı");
                    i++;
                    numberOfComWin++;

                }
                break;
            default: {
                System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz");

            }

        }


    }

    private static char com(int randomSecim) {
        switch (randomSecim) {
            case 0:
                com = 't';
                break;
            case 1:
                com = 'k';
                break;
            case 2:
                com = 'm';
                break;
        }
        return com;
    }
}