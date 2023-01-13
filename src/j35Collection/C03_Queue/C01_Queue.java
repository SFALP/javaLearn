package j35Collection.C03_Queue;

import java.util.*;

public class C01_Queue {
    public static void main(String[] args) {

        /*
 Queue collection interface oldugu icin child class olan LinkedList ve PriorityQueue ile obje uretilir.
 Eczane, yemekhane vs belirli bir sart ile aksiyon alan elemanlar icin kulla
 Constructor(LinkedList ve PriorityQueue) secimine gore queue objesi ozellikleri belir
 FIFO --> First in First out: Collection'a ilk gelen eleman ilk cikar. Eleman en sona eklenir ve en bastan silinir.
         */
        Queue<String> q1=new LinkedList<>(Arrays.asList("Cebrail","Sumeyra","Yakup","Muharrem"));
        System.out.println("q1 = " + q1);//q1 = [Cebrail, Sumeyra, Yakup, Muharrem]--> Insertion Order
        q1.add("Erol");
        System.out.println("q1 = " + q1);//q1 = [Cebrail, Sumeyra, Yakup, Muharrem, Erol]

        Queue<String> q2=new PriorityQueue<>(Arrays.asList("JavaCAN","JavaSU","JavaNAZ","JavIYE"));
        System.out.println("q2 = " + q2);//q2 = [JavIYE, JavaCAN, JavaNAZ, JavaSU]
        q2.add("Java");
        System.out.println("q2 = " + q2);//q2 = [JavIYE, Java, JavaNAZ, JavaSU, JavaCAN]

// element()--> Ilk elemani verir.(Copy ve paste yapar) ilk elemani silmeden return eder
        System.out.println("q1.element() = " + q1.element());//q1.element() = Cebrail

//peek()--> copy-paste gibidir, ilk elemani return eder ve siler.
        System.out.println("q1.peek() = " + q1.peek());//q1.peek() = Cebrail

//remove()--> eleman yoksa Exception firlatir. Ilk elemani siler ve return eder.
        System.out.println("q1.remove() = " + q1.remove());//q1.remove() = Cebrail

        System.out.println("q1 = " + q1);//q1 = [Sumeyra, Yakup, Muharrem, Erol]
//poll()--> eleman yoksa Exception yerine null verir. Cut-paste gibidir. Ilk elemani return eder ve siler
        System.out.println("q1.poll() = " + q1.poll());//q1.poll() = Sumeyra
        System.out.println("q1 = " + q1);//q1 = [Yakup, Muharrem, Erol]

//Ahan da TRICK--> poll ve remove farki: eger queue collection bos ise remove NoSuchElementExeptions hatasi alinir.

        q1.clear();//queue collection elemanlari silindi
        System.out.println("q1 = " + q1);//q1 = []
        System.out.println("q1.size() = " + q1.size());//q1.size() = 0
        System.out.println("q1.poll() = " + q1.poll());//q1.poll() = null
//        System.out.println("q1.remove() = " + q1.remove());//NoSuchElementException

  //offer()--->queue collection'a eleman eklemek icin kullanilir.
        System.out.println("q2.offer(\"Kusleme\") = " + q2.offer("Kusleme"));//q2.offer("Kusleme") = true
        System.out.println("q2 = " + q2);//q2 = [JavIYE, Java, JavaNAZ, JavaSU, JavaCAN, Kusleme]

// offer() ile add() arasindaki fark= add istenmeyen durumda exception firlatir ancak offer firlatmaz.
//OR: 10 kisilik bi kuyrukta 11.kisiyi eklemek istendiginde add hata verir, offer vermez

    }
}
