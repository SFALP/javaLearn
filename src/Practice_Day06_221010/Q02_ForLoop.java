package Practice_Day06_221010;

public class Q02_ForLoop {
    public static void main(String[] args) {

        //Interview Question
// 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        System.out.println("***** FOR COZUMU ******");
        for (int i = 0; i <=255 ; i++) {
            if (i>='A'&&i<='Z' || i>='a'&&i<='z')
            System.out.println((char) i + " = "+ +i );
        }
        System.out.println("***** WHILE COZUMU ******");
int i=0;
    while (i<=255){
        if (i>='A'&&i<='Z' || i>='a'&&i<='z')
            System.out.println((char) i +":"+i);
            i++;
    }
        System.out.println("***** DO-WHILE COZUMU *****");
    int x=0;
    do {
        char k =(char) x;
        System.out.println(x+" -> "+k);
        x++;
    }while (x<=255);
    }
}