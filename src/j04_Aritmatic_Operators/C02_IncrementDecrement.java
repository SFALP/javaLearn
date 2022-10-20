package j04_Aritmatic_Operators;

public class C02_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("  *********Artırma*******    ");

        int a=7;
        System.out.println(++a);//8 a'nın kayıttaki yeni değeri de 8'dir. Bu artırıp yazdırır
        System.out.println(a++);//8 a'nın kayıttaki yeni değeri de 9'dir. Bu kod yazdırıp artırır.
        System.out.println(a);//9
        System.out.println(a++ + ++a);//20  a'yı önce 9 olarak işleme alır ve 1 artırıp 10 yaparak ortadaki + nın sağına taşır.
                                        // Sonra önce değeri 11'e artırır ve 11 olarak işleme alır.
// TASK ->
        int k = 5;

        int sonuc = ++k + k++ + k++ + --k + k-- + k;//39
        System.out.println("sonuc = " + sonuc);//6
        System.out.println("k = " + k);

    }
}
