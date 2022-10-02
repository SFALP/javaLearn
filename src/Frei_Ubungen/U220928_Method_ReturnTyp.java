package Frei_Ubungen;

public class U220928_Method_ReturnTyp {
    public static void main(String[] args) {
        bilgigoster();//aşağıdaki methodda yer alan talimatlar yapilir.
        int sonuc = toplam(20, 40);//aşağıdaki methodda yer alan talimatlar yapilir.
        System.out.println(sonuc);//asagida yapilan toplam burada yazdirildi.
    }

    public static void bilgigoster() { //VOID ile yazılırsa komut bize cevabı geri getirmezler, deger döndurmezler. Sadece calisirlar
        System.out.println("Merhabalar");
        System.out.println("Hosgeldiniz");

    }

    public static int toplam(int a, int b) { //Bu komut(array,int,String,boolean vs olabilir),
        // VOID ve digerleri olarak bu bolum ayrısır. INT yazildiginda da işlem yaptiktan sonra cevabi geri bildirir.

        int t = a + b;//ilk bolumde tanimlanan sayilar buraya yerlestirilerek islem yapilmiş olur.
        return t;//Bu kod ile elde edilen sonuc return edilir. Yani sonucu getirir

    }
}


