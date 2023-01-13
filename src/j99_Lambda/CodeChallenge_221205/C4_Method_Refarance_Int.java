package j99_Lambda.CodeChallenge_221205;

// lambda da method kullanimi :
//ilk olarak class adi yazilir
//sonra  :: noktalar konur
//son olarak method secilir
//String class i sayesinde length gibi touppercase gibi methodlari kullanabiliriz
//Math classi sayesinde de sum vb methodlar kullanabiliriz



// S1: tekleri aralarinda bir bosluk birakarak yazdiralim


// S2: ciftlerin carpimini bulalim

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C4_Method_Refarance_Int {
    public static void main(String[] args) {
        List<Integer> intL = Arrays.asList(-2, -8, -5, 0, 2, 5, 6, 7, 15, 6, 8);

        System.out.println("negKareToplam(intL) = " + negKareToplam(intL));//negKareToplam(intL) = Optional[93]
        System.out.println("\n  *****   ");
        System.out.println("pozKupMax(intL) = " + pozKupMax(intL));//pozKupMax(intL) = Optional[3375]
        System.out.println("\n  *****   ");
    }

    // S4: poziflerin kuplerinden max olani yazdiralim
    public static Optional<Integer> pozKupMax(List<Integer> intL) {

        return intL.stream().filter(Methods::pozitifMi).map(Methods::kupBul).reduce(Math::max);
    }

    // S3: negatiflerin kare toplamlarini  bulalim
    public static Optional<Integer> negKareToplam(List<Integer> intL) {

        return intL.stream().filter(Methods::negatifMi).map(Methods::kareBul).reduce(Methods::toplam);

    }

}
