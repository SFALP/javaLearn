package j29_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {

// NullPointerException--> null atamasi yapilan bir String'de length () method run edildiginde olusan RTE exception
        String str = "";
        System.out.println("str.length() = " + str.length());//0

//        String str1 = null;
//        System.out.println("str1.length() = " + str1.length());//NullPointerException ile kod kirilir.
        String str1 = null;
        try {
            System.out.println("str1.length() = " + str1.length());//excp try block kirilir, catch block run olur
            System.out.println("Agam try block'da bu yaziyi okuduysan exception firlatmadi, kod sorunsuzdur.");

        } catch (NullPointerException e) {
            System.out.println("Hooooop hemserim nereyeee! Ben olmasam Null pointer exceptiona yakalanacaktin");
        }
        try {
            System.out.println("str.length() = " + str.length());// execption olmadigi icin try block tamamlanir, catch block calismaz
            System.out.println("Agam try block'da bu yaziyi okuduysan exception firlatmadi, kod sorunsuzdur.");

        } catch (NullPointerException e) {
            System.out.println("Hooooop hemserim nereyeee! Ben olmasam Null pointer exceptiona yakalanacaktin");
        }
        System.out.println("Agam sorun handle edildi, devamkeee :)");//bu kod calismissa program sorunsuz kirilmadan run olmustur
    }
}