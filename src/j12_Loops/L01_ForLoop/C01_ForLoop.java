package j12_Loops.L01_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        //41 kere Masallah creat ediniz
       // System.out.println("Masallah");
       // System.out.println("Masallah");
       // System.out.println("Masallah");
       // System.out.println("Masallah");
       // System.out.println("Masallah");
       // System.out.println("Masallah");
       // System.out.println("Masallah");
       // System.out.println("Masallah");
       // System.out.println("Masallah");
       // System.out.println("Masallah");

        /*
        Loop-> döngü tekrarlanan aksiyonlar için kullanilan code bloklaridir.
         */
     //     başl.    bitis   degs.
        for (int i = 1; i <=41 ; i++) {//dongu boyunca tekrarlanacak
            System.out.println(+i +". Masallah");//1.masallah .......... 41.masallah

        }
        System.out.println("selam javacanlara bolcana offer");// dongu disinda oldugu icin sadece 1 defa yazacaktir.
    // Task2 basamakli tek sayilari yan yana print eden code create ediniz: 114,13,15,17,....99
        for (int i = 11; i <100 ; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println("\n *******");

        for (int i = 10; i <100 ; i++) {
            if (i%2==1){
                System.out.print(i+" ");
            }
        }

        for (int i = 0; i >10 ; i++) {//bu loop calismaz. Şart, true olmadigi icin cod run olmayacaktir.
            System.out.println("selam ruhsuz javacan");
        }
        System.out.println("agaö bu metni okuduysan yukaridaki for dongüsü calismadi.");

        //sonsuz loop ornegi asagidadir: Return sayfasinin manipule olmamasi icin satirlar yoruma alinmistir.
        //for (int i = 0; i>0  ; i++) {
        //    System.out.println(i);
            
        }
    }

