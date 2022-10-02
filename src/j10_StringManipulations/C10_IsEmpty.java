package j10_StringManipulations;

public class C10_IsEmpty {
    public static void main(String[] args) {
        /*
  StringIsEmpty
   String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
  isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
  Yani o String'in length() 0 demektir.
 */
String str= "Hallo";
        System.out.println("Str boş mu? "+str.isEmpty());//false
        System.out.println(str.replaceAll("\\w", "").isEmpty());//true
    }
}
