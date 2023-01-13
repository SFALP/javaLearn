package j35Collection.C03_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {

//Deque: Double Ended Queue --> Queue'larda FIFO, Deque'lerde ise hem FIFO hem LIFO gecerli

// LIFO--> LastIn First Out

        Deque<String> dq1 = new LinkedList<>(Arrays.asList("Kusleme", "On Kol", "Bobrek Yatagı", "Ezme", "Haydari"));
        System.out.println("dq1 = " + dq1);//dq1 = [Kusleme, On Kol, Bobrek Yatagı, Ezme, Haydari]
        dq1.add("Humus");
        System.out.println("dq1 = " + dq1);//dq1 = [Kusleme, On Kol, Bobrek Yatagı, Ezme, Haydari, Humus]

        System.out.println("dq1.getFirst() = " + dq1.getFirst());//dq1.getFirst() = Kusleme
        System.out.println("dq1 = " + dq1);//dq1 = [Kusleme, On Kol, Bobrek Yatagı, Ezme, Haydari, Humus]

        System.out.println("dq1.getLast() = " + dq1.getLast());//dq1.getLast() = Humus
        System.out.println("dq1 = " + dq1);//dq1 = [Kusleme, On Kol, Bobrek Yatagı, Ezme, Haydari, Humus]

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());//dq1.peekFirst() = Kusleme
        System.out.println("dq1 = " + dq1);//dq1 = [Kusleme, On Kol, Bobrek Yatagı, Ezme, Haydari, Humus]

        System.out.println("dq1.peekLast() = " + dq1.peekLast());//dq1.peekLast() = Humus
        System.out.println("dq1 = " + dq1);//dq1 = [Kusleme, On Kol, Bobrek Yatagı, Ezme, Haydari, Humus]

// TRICK
// getFirst-getLast grubuyla, peekFirst-peekLast grubu arasindaki fark;
// eger method Deque Collection'da eleman yoksa get grubu kodu (NoSuchElementExeption) kirarken, peek grubu kodu kirmaz.

        dq1.clear();
        System.out.println("dq1 = " + dq1);//dq1 = []
        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());//dq1.peekFirst() = null
//        System.out.println("dq1.getFirst() = " + dq1.getFirst());//RTE-->NoSuchElementException
        System.out.println("Agam selametle, app run oldu, Devamkeee :)");//Agam selametle, app run oldu, Devamkeee :)

        Deque<String> dq2 = new LinkedList<>(Arrays.asList("Havuc Dilimi","Gullac","Muhallebi","Trilece","Kazandibi"));

        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());//dq2.pollFirst() = HavucDilimi

        System.out.println("dq2.pollLast() = " + dq2.pollLast());//dq2.pollLast() = Kazandibi

        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());//dq2.removeFirst() = Gullac

        System.out.println("dq2.removeLast() = " + dq2.removeLast());//dq2.removeLast() = Trilece

        System.out.println("dq2 = " + dq2);//dq2 = [Muhallebi]

        dq2.clear();
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());//dq2.pollFirst() = null

        System.out.println("dq2.pollLast() = " + dq2.pollLast());//dq2.pollLast() = null

//        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());//RTE--> NoSuchElementException

//        System.out.println("dq2.removeLast() = " + dq2.removeLast());//RTE--> NoSuchElementException


        System.out.println("Agam selametle, app run oldu, Devamkeee :)");

    }
}
