package j37_Enum.Enum02;

public class Runner {
    public static void main(String[] args) {
        User kll1 = new User();
        kll1.name = "Prof Alex de Souza";
//    kll1.role=0;
//    kll1.status=2;
        kll1.yetki = Role.ADMIN;//kll1 objesinin yetki degeri(Status) ADMIN olarak atandi.
        kll1.durum = Status.INACTIVE;

        User kll2= new User();
        kll2.name="Diego Lugano";
        kll2.yetki=Role.CUSTOMER;
        kll2.durum=Status.LOGIN;

        if (kll1.yetki==Role.ADMIN){
            System.out.println(kll1.name+"--> Agam muhur sende, Suleyman'da sensin, sil de silelim.");
        }else System.out.println(kll1.name+"--> te Allaaam yaa, admin degil ama hava 1500 sefil customer :(");

        if (kll2.yetki==Role.ADMIN){
            System.out.println(kll2.name+"--> Agam muhur sende, Suleyman'da sensin, sil de silelim.");
        }else System.out.println(kll2.name+"--> te Allaaam yaa, admin degil ama hava 1500 sefil customer :(");
    }
}
