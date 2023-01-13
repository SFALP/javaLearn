package j34_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>(Arrays.asList("Nur", "Gamze", "Erol", "Bekir"));

        System.out.println("l1 list ilk hali = " + l1);

//l1 elemanlarini for loop kullanarak iterate ediniz.

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println("\n ******* ");

// l1 elemanlarini for-each loop'la print ediniz...
        for (String w : l1) {
            System.out.print(w + " ");
        }
        System.out.println();
// l1 her bir elemani :-) for loop ile update edip print ediniz...

        for (int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i) + " :-) ");
        }
        System.out.println("l1 :-) update sonrasi: " + l1);
        System.out.println();
        System.out.println("\t***\t");
// l1 her bir elemani :-( for-each loop ile update edip print ediniz...
        for (String w : l1) {
            w += " :-( ";
        }
        System.out.println("l1 :-( update sonrasi: " + l1);//list, set ile guncellenir.
// Dolayisiyla w+= :-( ifadesiyle list guncellenmis olmaz.

/* TRICK --> list'i guncellemek icin kullanilan set komutunda index yazilmak zorunda oldugundan,
for each'de index icermediginden bu task icin kullanilamaz.

Bu nedenle iteration kullanilir.
 */
        System.out.println();
        System.out.println("\t ITERATORS\t");

        Iterator<String> it1 = l1.iterator();// Iterator interface'den it1 variable tanimlandi. Atama olarak l1 elemanlari atandi.
        while (it1.hasNext()) {
            // hasNext() -- > it1 elemanlari icin pointer oldugu yerde eleman varsa true, yoksa false verir ve pointer bir sonraki
            // eleman onune konur.
            it1.next();//next()--> Bu method'da list'in pointer onundeki elemanini return eder.
            System.out.println(it1.next() + " ");

        }
        System.out.println();
        System.out.println("\t ITERATORS\t");

        List<String> l2 = new ArrayList<>(Arrays.asList("Baran", "Gulsum", "Akif", "Nazim"));
// l2 elemanlarini iterator ile silip print ediniz.--> OUTPUT: l2=[]
        System.out.println("Iterator oncesi l2: " + l2);//Iterator oncesi l2: [Baran, Gulsum, Akif, Nazim]
        Iterator<String> it2 = l2.iterator();
        while (it2.hasNext()) {// tekrardaki pointer onunde eleman varligini kontrol eder
            it2.next();//l2'den elemani getirir.
            it2.remove();//l2'den getirdigi elemani siler
        }//while dongusu sonu
        System.out.println("iterator sonrasi l2: " + l2);//iterator sonrasi l2: []

        System.out.println();
        System.out.println("\t List ITERATORS\t");
        List<String> l3 = new ArrayList<>(Arrays.asList("Baran", "Gulsum", "Akif", "Nazim"));
// l3 elemanlarini iterator ile :-) set edip print ediniz.--> OUTPUT: l3=[Baran :-), Gulsum :-), Akif :-), Nazim :-)]

        System.out.println("l3 iterator oncesi: " + l3);

        ListIterator<String> it3 = l3.listIterator();//tekrar iterator yapisi tanimlandi.
        while (it3.hasNext()) {

            it3.set(it3.next().toUpperCase() + " :-)");//tekrardaki next() ile gelen elemana :-) ifadesini ekleyerek(concat) revize eder.

        }
        System.out.println("iterators set sonrasi l3: " + l3);

        System.out.println();
        System.out.println("\t List ITERATORS\t");

// l3 elemanlarinin ilk harfi buyuk, kalan 3 harfi *** karakteri ve l4 listi ekleyip prnt ediniz.
        List<String> l4 = new ArrayList<>(Arrays.asList("Serhat", "Yakup", "Mustafa", "Nazli"));
        System.out.println("Listiterator oncesi l3: " + l3);

        ListIterator<String> ebikGabik = l3.listIterator();//tekrar iterator yapisi tanimlandi.

        while (ebikGabik.hasNext()) {
            ebikGabik.set(ebikGabik.next().toUpperCase().charAt(0) + "***");//next ile gelen l4 elemani ilk harf buyuk,
            // kalan 3 harfi *** ile set edildi.
ebikGabik.add(l4.toString());// tekrardaki update edilen l3'e l4 add edildi(eklendi)
        }
        System.out.println("Listiterator set ve add sonrasi l3: "+l3);
//Listiterator set ve add sonrasi l3:
// [B***, [Serhat, Yakup, Mustafa, Nazli],
// G***, [Serhat, Yakup, Mustafa, Nazli],
// A***, [Serhat, Yakup, Mustafa, Nazli],
// N***, [Serhat, Yakup, Mustafa, Nazli]]
    }
}