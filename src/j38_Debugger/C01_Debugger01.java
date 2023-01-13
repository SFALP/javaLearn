package j38_Debugger;

/*
Debug yapiyorsan, kodu anlamadin demektir.
Debug yaparken kodu anlamiyorsan, nasil debug yapilir, onu anlamadin demektir.
Debug yaparken kodu anladigini dusunuyorsan, aslinda debuga ihtiyacin olmadigini anladin demektir.
Debug etmek kodun mental bir modelinin eksikligine isarettir..


İki durumda debugger gerekli olabilir:
 *  Mevcut kod devralındığında.
 *  Yeni kod yazıldığında.
her iki durumda da debugger çalıştırmamaya dikkat edilmeli.
Amac sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.
 */
public class C01_Debugger01 {
    static int ebikGabik = 7;//class level statich global variable

    public static void main(String[] args) {

        method01();

    }//main sonu

    public static void method01() {
        System.out.println("    *** Method01 calisiyor  ***     ");
        int a = 0;//local variable tanimlandi
        ebikGabik++;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            a += 2 * i;
        }
        System.out.println();
        System.out.println("    *** Method02 call ediliyor  ***     ");
        method02();
        System.out.println("    *** Method03 call ediliyor  ***     ");
        method03();

        System.out.println("    *** Method01 bitti  ***     ");
    }

    public static void method02() {
        System.out.println("    *** Method02 calisiyor  ***     ");
        ebikGabik += 5;
        for (int x = 1; x <= 7; x++) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("    *** Method02 bitti  ***     ");
    }

    public static void method03() {
        System.out.println("    *** Method03 calisiyor  ***     ");
        ebikGabik -= 3;
        for (int y = 1; y <= 5; y++) {
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.println("    *** Method03 bitti  ***     ");

    }
}