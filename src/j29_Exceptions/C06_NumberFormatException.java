package j29_Exceptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {
// NumberFormatException --> Sayi formatinda olmayan bir datayi parseInt() method run ederek intiger'a cevrildiginde olusan RTE'dir.
//Java'da String icindeki rakam karakterler parseInt() method ile int degere atanabilir.

        String str = "1453";
        System.out.println("str += 5 = " + str + 5);//14535--> concat edilir.

        int sayi = Integer.parseInt(str);//String, integer'a donusturuldu ve int sayi'ya atandi.
        System.out.println("sayi = " + sayi);//1453
        System.out.println("sayi+=5 = " + (sayi + 5));//1458

        String id = "57l622";
        try {
            System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));
            System.out.println("Agam bu yaziyi okuduysan try block'da exeption firlatmadi, kod sorunsuzdur.");
    }catch (NumberFormatException e) {

            System.out.println("TEE ALLAAAM YAA! agam 1 yerine L(l) harfi yazmissin istersin, beni uzersin :(");
            System.out.println("agam catch block'da bu yaziyi okuduysan exception firlatildi ve code handle edildi");
        }

        try {
            System.out.println("Integer.parseInt(str) = " + Integer.parseInt(str));//1453
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        } catch (NumberFormatException e) {

            System.out.println("TEE ALLAM YAA agam l'den 1 yazmamı  istirsen :( ");
            System.out.println("agam catch block da bu yazıyı okuduysan excp fırlatıldı ve code handle edildi :) ");

        }

        System.out.println("Agam sorun handle edildi, devamkeee :)");//bu kod calismissa program sorunsuz kirilmadan run olmustur.
    }
}