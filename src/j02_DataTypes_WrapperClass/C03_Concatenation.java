package j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        //Concatenation=Birleştirme anlamına gelir.

        String Vorname="F4992-S.", Nachname="Faruk";
        int a=7;
        int b=11;
        /* Birden cok String variable ile farklı data type'lar + ile işleme alınırsa
         java birleştirme yapılarak yeni bir string oluşturulur. Birleştirme toplamına anlamına gelmez.
         Birleştirme işine Concat anlamına gelir.

         Concat, stringle beraber başlar. Eğer ifade intiger ile başlıyorsa intiger ile ilgili işlem ne ise o yapılır.
         3.satırdaki ve 4.Satırdaki kodlardan farkı anlayabiliriz.
         Parantezller özel yapıdır bu nedenle işlem yapılır. (Ör:5)
         Önce özel yapı çalışır yani parantez de bir çeşit özel yapıdır.(Ör:8) 8.örnekte önce -8 işlemi yapılır sonra isim ve işlem birleştirilerek print edilir.
*/
        //1.
        System.out.println(Vorname+Nachname+a+b);//F4992-S.Faruk711
        //2.
        System.out.println(a+Vorname+Nachname+b);//7F4992-S.Faruk11
        //3.
        System.out.println(a+b+Vorname+Nachname);//18F4992-S.Faruk
        //4.
        System.out.println(""+a+b);//711
        //5.
        System.out.println(Vorname+Nachname+(a+b));//F4992-S.Faruk18
        //6.
        System.out.println((a+b)+Vorname+Nachname);//18F4992-S.Faruk
        //7.
        System.out.println(Vorname+(a-b)+(a-b));//F4992-S.-4-4
        //8.
        System.out.println(Vorname+((a-b)+(a-b)));//F4992-S.-8

        char ch='1';//
        System.out.println(Vorname+ch); //F4992-S.1

        System.out.println(a+ch+Vorname);//56F4992-S. (ch'ın karakter değeri 1'dir, tamsayı değeri ise evrensel ASCI tablosunda 49 olarak belirlenmiştir.)

        System.out.println(Vorname+(ch+b));//F4992-S.60 (Önce parantezden işlem yapılır ve b=11, ch'ın ASCI tabllosundaki değeri de (49) getirilerek toplanır, sonrasında önüne isim olarak tanımlanan değer eklenir ve print edilir.)

        System.out.println(a+Vorname+ch);//7F4992-S.1 (intiger ile başlasa da sonrasında string devam ettiğinden tüm satır birleştirilerek yazılı. String olarak devam eden satırda da ch için tanımlanan 1 değeri eklenir)

        /* TRICK -> char data türü işleme girdiği variables'in türüne göre farklı işlem yapar.
        eğer işleme girdiği variables aritmatik bir işleme ASCII ile işlem yapar.
         */
        /* TRICK -> Bir aritmatik işlem içinde Strng kullanırsa, aritmatik işlem önceliğine göre
        işlem yapılıp String variable'a Birleştirme (Concaratation) yapılır.
         */

    }

}
