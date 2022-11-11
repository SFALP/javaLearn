package j18_Constructor.Task_221023;
/*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */
public class ElektrikHesapRunner {
    public static void main(String[] args) {

        ElektrikHesap bill1 = new ElektrikHesap();
        bill1.tuketimEkle(300);
        System.out.println("Toplam tuketim = " +bill1.toplamTuketim);
        bill1.tuketimEkle(450);
        System.out.println("Toplam tuketim ="+bill1.toplamTuketim);

        System.out.println("Odeme tutari(tl): "+bill1.odenecekTutar());
    }
}