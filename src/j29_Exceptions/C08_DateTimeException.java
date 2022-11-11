package j29_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {
//DateTimeException
//        LocalDate date=LocalDate.of(2022,11,33);//RTE hatasi alinir

        try {
            LocalDate date=LocalDate.of(2022,11,33);
            System.out.println("agam bu yaziyi okuduysan exeption firlatmadi, komut sorunsuz");
        }catch (DateTimeException e){
            System.out.println("Agam ahan da hatan = " + e.getMessage());
            System.out.println("TE ALLAAAM YAA, agam kasim 33 gun olur mu hic :(");
        }
        System.out.println("agam sorun handle edildi, DEVAMKEE :)");
    }
}