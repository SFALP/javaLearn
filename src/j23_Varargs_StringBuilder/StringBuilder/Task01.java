package j23_Varargs_StringBuilder.StringBuilder;

/*
Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
       olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir method yazın.
    (without case sensitivity)
    Eg : input : I love Java
    Output: "Reversed sentence : avaJ evol I
       It is not a palindrome"

 */
public class Task01 {
    public static void main(String[] args) {
        String str1 = "Ece";
        String str2 = "Serhat";


        System.out.println("tersString(str1) = " + tersString(str1));//tersString(str1) = ecE
        System.out.println("tersString(str2) = " + tersString(str2));//tersString(str2) = tahreS

        StringBuilder sb1 = new StringBuilder("Ali");
        tersSb(sb1);//ilA
        tersSb(new StringBuilder("Ali"));//ilA
        System.out.println("Ey edip .... pide ye Polindrom mu?: "+isAPolindrom("ey edip adanada pide ye"));//Polindrom mu?: true
        System.out.println("Nazim polindrom mu?: "+isAPolindrom("Nazim"));//false

    }//main sonu

    public static String tersString(String str) {//ali-->ila
        String stringTersi = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            stringTersi += str.charAt(i);
        }
        return stringTersi;
    }

    public static void tersSb(StringBuilder sb) {//klas cod
        System.out.println("sb.reverse() = " + sb.reverse());//sb ters cevirir
    }

    public static boolean isAPolindrom(String str) {
        if (str == null) {
            return false;
        }

        return new StringBuilder(str).reverse().toString().equals(str);

    }
}
