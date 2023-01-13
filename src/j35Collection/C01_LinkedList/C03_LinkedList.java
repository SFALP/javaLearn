package j35Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C03_LinkedList {
    public static void main(String[] args) {//remove calisilan class
        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("JavaCAN","Ebubekir","Gulsum","Ebubekir","Adem","Ilker","JavaCAN","Merve"));
        System.out.println("ll1 = " + ll1);
        //ll1 = [JavaCAN, Ebubekir, Gulsum, Ebubekir, Adem, Ilker, JavaCAN, Merve]

        // LinkedList remove()--->//ilk node siler ve silinen node return edilir
        System.out.println("ll1.remove() = " + ll1.remove());//JavaCAN
        System.out.println("ll1 = " + ll1);//ll1 = [Ebubekir, Gulsum, Ebubekir, Adem, Ilker, JavaCAN, Merve]

        System.out.println("ll1.remove(3) = " + ll1.remove(3));// silinen node return edilir, yani ll1.remove(3) = Adem
        System.out.println("ll1 = " + ll1);//ll1 = [Ebubekir, Gulsum, Ebubekir, Ilker, JavaCAN, Merve]

        System.out.println("ll1.remove(\"Merve\") = " + ll1.remove("Merve"));//ll1.remove("Merve") = true
        System.out.println("ll1.remove(\"JavaTAR\") = " + ll1.remove("JavaTAR"));//ll1.remove("JavaTAR") = false

        System.out.println(ll1);//[Ebubekir, Gulsum, Ebubekir, Ilker, JavaCAN]

        System.out.println("ll1.removeFirstOccurrence(\"Ebubekir\") = " + ll1.removeFirstOccurrence("Ebubekir"));//true
//ll1.removeFirstOccurrence("Ebubekir") = true
        System.out.println("ll1 = " + ll1);//ll1 = [Gulsum, Ebubekir, Ilker, JavaCAN]

        System.out.println("ll1.element() = " + ll1.element());//ilk node return eder. // ll1.element() = Gulsum

        LinkedList<String> ll2=new LinkedList<>(Arrays.asList("JavaCAN","Ebubekir","Gulsum","Ebubekir","Adem","Ilker","JavaCAN","Merve"));
        LinkedList<String> ll3=new LinkedList<>(Arrays.asList("Hasan","Harun","Haluk","Hayri"));

        ll2.addAll(ll3);
        System.out.println("ll2.removeAll(ll3) = " + ll2.removeAll(ll3));//ll2.removeAll(ll3) = true
        System.out.println("ll2 = " + ll2);//ll2 = [JavaCAN, Ebubekir, Gulsum, Ebubekir, Adem, Ilker, JavaCAN, Merve]

//LinkedList get(), getFirst(), getLast() ---> girilen index ilk ve son node return eder
        System.out.println("*** GET ***");
        System.out.println("ll2.get(2) = " + ll2.get(2));//ll2.get(2) = Gulsum
        System.out.println("ll2.getFirst() = " + ll2.getFirst());//ll2.getFirst() = JavaCAN
        System.out.println("ll3.getLast() = " + ll3.getLast());//ll3.getLast() = Hayri

        List<Integer> ll4 = new LinkedList<>(Arrays.asList(1,3,4,6,7,54,34,45));
        System.out.println("ll4 = " + ll4);
        ll4.remove(3);// remove() method'unun icine integer yazılırsa  eleman değil index olarak tanımanır .
        //Burada index'i 3 olan 6 silinir.
        //remove() method'unun icinde olmayan bir index kullanirsaniz
        //Java IndexOutOfBoundsException throw eder
        //ll1.remove(33);

    }
}