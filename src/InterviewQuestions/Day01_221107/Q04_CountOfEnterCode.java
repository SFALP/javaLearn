package InterviewQuestions.Day01_221107;

import java.util.Scanner;

// STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
public class Q04_CountOfEnterCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Javacell PIN Kodu kontrol programina Hosgeldiniz!");
        System.out.print("Lutfen PIN kodunuzu belirleyiniz: ");
        String p1 = sc.nextLine();
        int girisHakki = 3;

        System.out.println(girisHakki+" defa deneme hakkiniz bulunmaktadir.");
        for (int i = girisHakki; i > 0; i--) {
            System.out.println("Lutfen PIN kodunuzu tekrar giriniz: ");
            System.out.print("");
            String p2 = sc.nextLine();

            if (p1.equals(p2)) {
                System.out.println("\nTebrikler! Girilen PIN kodlari eslesmistir :=)");
                break;
            }else {
                girisHakki--;
                System.out.println("\nGirilen sifre ile PIN kodu eslesmemistir. Kalan deneme adediniz: "+girisHakki);
            if (girisHakki==0)System.out.println("\n SIM kartiniz guvenlik onlemi nedeniyle bloke oldu." +
                    "\n Telefonunuza ulasmak icin en yakin hizmet yetkilisiyle telefonda gorusmeniz gerekmektedir." +
                    "\n Javacell saglikli gunler diler.");
            }
        }
    }
}
/*
COZUM (Elly Hoca)

 public static void main(String[] args) {
        String pin = "sumeyra12345";
        int girisHakki = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("****Hosgeldiniz****");
        while(true) {
            System.out.println("pin kodu giriniz :");
            String girilenPin = scanner.nextLine();
            if(pin.equals(girilenPin)){
                System.out.println("basarili giris yaptiniz..");
                break;
            }else{
                System.out.println("yanlis giris yaptiniz...");
                girisHakki--;
                System.out.println("kalan giris hakkiniz : " + girisHakki);
            }if(girisHakki == 0){
                System.out.println("giris hakkiniz kalmadi...sim kartiniz bloke oldu..");
                break;
            }
 */