package j35Collection.C01_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
/*
linkedList---->
1- LinkedList'te elemanlar "data" ve "adres" olmak uzere 2 kisimdan olusur ve eleman yerine "node" olarak tanimlanir.
2- Linkedlist'de ilk not data barindirmayan sadece adres bulunduran head node tanimlanmistir.
3- LinkedList'de son node adres kismi null olan sadece data bulunduran tail(kuyruk) node tanimlanmistir.
4- ArrayList searching LinkedList node ekleme ve silmede daha avantajlidir. LinkedList eleman bulmada index yapisi olmadigi icin basarisizdir
5- linkedList--> tren-vagon iliskisi (baglantisi) gibi dusunulebilir.
6- Collection obje tanimlanirken constructor Class(LinkedList, ArrayList...) olmalidir. Interface(list, Queue .... ) olmamasina dikkat edilmelidir.
Ancak obje data typ olarak parent interface tanimlanabilir.
7- LinkedList class iki tane parent interface'den(List ve Queue) implement etmistir.
 */

        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("Ebubekir","Gulsum","Adem","Ilker","Merve"));
        //LinkedList--> Hem declare hem de assignment yapildi.
// LinkedList print--> sout ile yapilir, ayni normal bir arraylist yazdirir gibi.
        System.out.println("ll1 = " + ll1);//ll1 = [Ebubekir, Gulsum, Adem, Ilker, Merve]
//LinkedList add--->
        ll1.add("Ugur");
        System.out.println("ll1 = " + ll1);//ll1 = [Ebubekir, Gulsum, Adem, Ilker, Merve, Ugur]

        ll1.add(2,"Abdulaziz");
        System.out.println("ll1 = " + ll1);//ll1 = [Ebubekir, Gulsum, Abdulaziz, Adem, Ilker, Merve, Ugur]

        ll1.addFirst("javaCAN");
        System.out.println("ll1 = " + ll1);//ll1 = [javaCAN, Ebubekir, Gulsum, Abdulaziz, Adem, Ilker, Merve, Ugur]
        ll1.addLast("JavaTAR");
        System.out.println("ll1 = " + ll1);//ll1 = [javaCAN, Ebubekir, Gulsum, Abdulaziz, Adem, Ilker, Merve, Ugur, JavaTAR]
        List<String> ll2=new LinkedList<>(Arrays.asList("Fatih","Erol","Nur"));// DataType interface List olan LinkedList

        ll1.addAll(ll2);
//ll1.addAll("Agam");//CTE, parametre Col olmazsa
        System.out.println("ll1 = " + ll1);//ll1 = [javaCAN, Ebubekir, Gulsum, Abdulaziz, Adem, Ilker, Merve, Ugur, JavaTAR, Fatih, Erol, Nur]

        ll1.addAll(3,ll2);
        System.out.println("ll1 = " + ll1);//ll1 = [javaCAN, Ebubekir, Gulsum, Fatih, Erol, Nur, Abdulaziz, Adem, Ilker, Merve, Ugur, JavaTAR, Fatih, Erol, Nur]

    }
}
