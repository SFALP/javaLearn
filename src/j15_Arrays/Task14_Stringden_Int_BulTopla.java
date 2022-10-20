package j15_Arrays;

public class Task14_Stringden_Int_BulTopla {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        System.out.println("\nGirilen String'deki sayilarin toplami: " + sumDigit(str));
    }
    private static int sumDigit(String str) {
        int toplam = 0;
        System.out.println("Rakamlar: ");
        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                String str2 = str.substring(i, i + 1);
                System.out.print(str2+", ");
                toplam += Integer.parseInt(str2);
            }
        }
        return toplam;
    }
}