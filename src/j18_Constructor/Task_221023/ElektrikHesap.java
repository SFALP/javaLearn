package j18_Constructor.Task_221023;

/*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */
public class ElektrikHesap {


    int toplamTuketim;
    double oran = 0.7;
    double fatura;

    public int tuketimEkle(int tuketim) {
        return toplamTuketim += tuketim;
    }

    public double odenecekTutar() {
        return fatura += toplamTuketim * oran;
    }
}
