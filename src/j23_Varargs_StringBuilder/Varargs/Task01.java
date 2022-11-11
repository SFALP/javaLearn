package j23_Varargs_StringBuilder.Varargs;

/*
Task ->
verilen Stringleri birlestiren concat isimli METHOD create ediniz.
input : "m", "e", "r", "v", "e";
output : merve
input : "a", "l", "i";
output : ali
 */
public class Task01 {
    public static void main(String[] args) {

        String arr1[] = {"m", "e", "r", "v", "e"};
        String arr2[] = {"a", "l", "i"};

        strBirlestir(arr1);//merve
        strBirlestir(arr2);//ali
        strBirlestir("JavaCAN", " Enise", " Hanim");//JavaCAN Enise Hanim

    }//main disi

    public static void strBirlestir(String... str) {
        String birlesenStr = "";
        for (String w : str) {
            birlesenStr = birlesenStr.concat(w);
        }
        System.out.println("birlesenStr = " + birlesenStr);
    }
}