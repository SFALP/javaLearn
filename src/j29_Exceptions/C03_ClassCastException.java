package j29_Exceptions;

public class C03_ClassCastException {
    public static void main(String[] args) {
/*
 ClassCastException--> Birbirine donusturulemeyen data type'lar(Ör: String to int),
 birbirine donusturuldugunde olusan RTE Exception'dur.

 */
        Object obj = "JavaCAN'lara selam olsun";
        String str = (String) obj;//object data type, String data type casting yapilarak atandi.
        System.out.println("str = " + str);//JavaCAN'lara selam olsun
        Object sayi1 = 10;
//        String str2= (String) sayi1;//object data type, String data type casting yapilarak atandi.
//        System.out.println("str2 = " + str2);//ClassCastException

        try {
            String str2 = (String) sayi1;
        } catch (ClassCastException e) {
            System.out.println("Agam intiger object, hic String'e cevirilebilir mi.. :(");
        }
        try {
            String str3 = (String) obj;
            System.out.println("Agam try block'ta bu yaziyi okuduysan, exception firlatmadi. Komut sorunsuzdur.");
        } catch (ClassCastException e) {
            System.out.println("Agam intiger object, hic String'e cevirilebilir mi.. :(");
        }
        System.out.println("Agam sorun handle edildi, devamkeee :)");//bu kod calismissa program sorunsuz kirilmadan run olmustur
    }
}