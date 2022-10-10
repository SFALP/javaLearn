package Practice_Day06_221010;

public class Q03_ForLoop {
    //Convert "Java" to "J*a*v*a*"

    /* ForLoop
       print even numbers from 100 to 0 but do not use decrement(i--).

            INPUT      :
            OUTPUT  : 100 98 96 94 92 ....2 0
         */
    public static void main(String[] args) {

        String a="java";
        for (int i = 0; i <=a.length()-1 ; i++) {
            System.out.print(a.charAt(i)+"*");
        }
        System.out.println();

        for (int i = -100; i <=0 ; i+=2) {
            System.out.print(i*-1+" ");
        }
        System.out.println("\n*** 2.YOL ***");
        for (int i = 100; i >=0 ; i=i-2) {
            System.out.print(i+" ");
        }
    }
}