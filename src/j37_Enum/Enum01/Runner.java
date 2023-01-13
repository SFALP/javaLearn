package j37_Enum.Enum01;

public class Runner {
    public static void main(String[] args) {
//TASK: Verilen bir ay numarasina gore kac gun cektigini print eden code create ediniz.
        //int ay=3;
        Aylar ay = Aylar.HAZIRAN;//Aylar enum'indan ay field value MART olarak atandi.

        System.out.println("ay = " + ay);//ay = HAZIRAN
        System.out.println("ay.name() = " + ay.name());//ay.name() = HAZIRAN
        System.out.println("ay.ordinal() = " + ay.ordinal());//ay.ordinal() = 5
// ordinal degeri, index degerine karsilik gelir.

        switch (ay) {
            case OCAK:
                System.out.println(ay + " ayi 31 gundur");
                break;
            case SUBAT:
                System.out.println(ay + " ayi 28/29 gundur");
                break;
            case MART:
                System.out.println(ay + " ayi 31 gundur");
                break;
            case NISAN:
                System.out.println(ay + " ayi 30 gundur");
                break;
            case MAYIS:
                System.out.println(ay + " ayi 31 gundur");
                break;
            case HAZIRAN:
                System.out.println(ay + " ayi 30 gundur");
                break;
            case TEMMUZ:
                System.out.println(ay + " ayi 31 gundur");
                break;
            case AGUSTOS:
                System.out.println(ay + " ayi 31 gundur");
                break;
            case EYLUL:
                System.out.println(ay + " ayi 30 gundur");
                break;
            case EKIM:
                System.out.println(ay + " ayi 31 gundur");
                break;
            case KASIM:
                System.out.println(ay + " ayi 30 gundur");
                break;
            case ARALIK:
                System.out.println(ay + " ayi 31 gundur");
                break;
            default:
                System.out.println("Hatali bir deger tanimlandigi icin isleme devam edilememektedir.");
                break;
        }
        System.out.println("Agam devamkeee ..... ");
    }
}
