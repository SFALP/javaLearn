package Practice_.Day11_221031;

import java.time.LocalDateTime;

/*
Q01_LocalDate
// Bugunun tarihi aliniz, yazdiriniz...
// Daha Sonra 1 gun, 1 Ay ve 1 yil ekleyerek degisen tarihi yazdiriniz..
// Degisen tarih uzerinden 3 gun, 2 ay ve 5 yil eksilterek son tarihi yaziniz..
 */
public class Q01_LocalDate {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Anlik  = " + ldt);//Anlik  = 2022-10-31T16:09:50.183562100
        LocalDateTime plusLdt;
        plusLdt = ldt.plusDays(1).plusMonths(1).plusYears(1);
        System.out.println("Artirilan tarih: " + plusLdt);//Artirilan tarih: 2023-12-01T16:09:50.183562100

        System.out.println("Artirilip eksiltildikten sonraki tarih = " + plusLdt.minusDays(3).minusMonths(2).minusYears(5));
//Artirilip eksiltildikten sonraki tarih = 2018-09-28T16:09:50.183562100
    }
}