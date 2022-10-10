package j12_Loops.L03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

/*
While loop: once sart kontrol edilir, eger sart sonucu true alinirsa body aksiyonu run edilir.
do-While Loop: once loop body action calisir, sonra sart kontrol edilir. Sart true ise dongu devam eder.
Sart false ise dongu kirilir ve dongu sonraki ilk satir calisir.

do-While loop; game app'de daha cok kullanilir.
-->> TRICK: While loop sart saglanmazsa hic calismayabilir ancak
do-while sarti saglayip-saglamadigina bakilmaksizin en az 1 defa calisir.
 */

        int yas = 31;
        while (yas < 33) {
            System.out.println("agam yas(" + yas + ") gayet basarili :) while body action.....");

            yas++;
        }
        do {
            System.out.println("agam yas 33 gayet basarili :) do while body action....");

            yas++;
        } while (yas < 33);

    }
}
