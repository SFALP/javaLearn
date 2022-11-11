package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C11_OCA03 {
    public static void main(String[] args) {
        /*
 What is the output of the following code?
Asagidaki code'un  ciktisi  nedir?
*/
        LocalDate date = LocalDate.of(2018, Month.APRIL, 29);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
//  LocalDate date = LocalDate.of(2018, Month.FEBRUARY, 29); 2018 yili artik yil olmadigi icin bu kod RTE hatasi verir

        /*
            A. 2018 APRIL 29
            B. 2018 APRIL 30
            C. 2018 MAY 10
            D. Another date.
            E. The code does not compile.
            F. A runtime exception is thrown.
CEVAP A SIKKIDIR            */
    }
}
