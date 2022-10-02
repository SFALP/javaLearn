package j02_DataTypes_WrapperClass;

public class C04WrapperClass {
    public static void main(String[] args) {
        String name= "Alex";
        int age=45;

        name.toLowerCase();
        System.out.println(name.toUpperCase()); //HALUK

    // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
    // ancak primitive data turlerinin boyle bir ozelligi yoktur
    // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
    //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
    // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
    // ara çözüm imkanı sunmuştur.

//TASK id ve tc String değerlerinin toplamını print eden code yazınız.
    String tc="1234455";
    String id="98765";
        System.out.println(tc+id);//Concat(birleştirme yaptı) 123445598765

    int yeniTc= Integer.valueOf(tc);//TC String değerini Integer'a çevirdi. Value of bu işi yapar. ve yeniTc'ye atadı.
        System.out.println("yeniTc = " + yeniTc); // Soutv çağırılarak otomatik yazdırıldı.

        int yeniid= Integer.valueOf(id); //Bu satırda String verilen değer intigera çevrildi ve artık sayı formatı aldı.
        System.out.println("yeniid = " + yeniid);

        System.out.println(yeniid+yeniTc); // 1333220
        String okulNo= "234543A";//en sondaki harf olan (A) Adana. Bu nedenle kod bu satırda kırılacaktır.
        // int yeniokulNo= Integer.valueOf(okulNo);  //Runtime Exception-> Çalışma zamanı hatası
        //System.out.println("yeniokulNo = " + yeniokulNo);

        System.out.println("Maden geldin Dünyaya otur calış Javaya");

        // TASK: Primitiv(ilkel) datalardan byte short int için max ve min değerlerini print eden codu yazdırınız.
    // Bizden aksiyon istenmektedir. Aksiyon da Büyük harf Wrapper Class ile çalıştırılır.

    byte maxByteDegeri= Byte.MAX_VALUE; //Byte Wrapper Class'tır. MAX VALUE'de Metottur.
    byte minByteDegeri= Byte.MIN_VALUE;
        System.out.println("maxByteDegeri= " + maxByteDegeri);
        System.out.println("minByteDegeri = " + minByteDegeri);

        System.out.println("Intiger.MAX_VALUE: "+Integer.MAX_VALUE); // Burada ise INTEGER Wrapper Classtır. Buradan bir metot getirilir.
        System.out.println("Intiger.MIN_VALUE: "+Integer.MIN_VALUE); //

        int a=5;
        System.out.println(a);//Burada a değerine atanan sayı yazılır.
        System.out.println(5); //Burada sadece 5 yazılır. a'dan bağımsızdır.

    }
}
