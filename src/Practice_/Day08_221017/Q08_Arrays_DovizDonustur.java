package Practice_.Day08_221017;
/// AVRO HESABINDA HATA VAR
import java.util.Arrays;

/*
 *  String 2D array olustur
 *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
 *  String de $ varsa 3.2 ile carp
 *  String de € varsa 4.2 ile carp
 *  elemanlarin toplamini double olarak yazdir
 */
public class Q08_Arrays_DovizDonustur {
    public static void main(String[] args) {
        String str = "$12 $22 0$ €9 €40 $1 €12 $2 $0";
        int toplamUsd = 0;
        double curUsd = 3.2;
        int toplamAvro = 0;
        double curAvro = 4.2;

        String arr[] = str.split(" ");
        System.out.println("arr = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")) {
                //arr[i].replace("$", "");
                toplamUsd += Integer.parseInt(arr[i].replace("$", ""));
            } else if (arr[i].contains("€")) {
                for (int j = 0; j < arr.length; j++) {
                 //   arr[i].replace("€", "");
                    toplamAvro += Integer.parseInt(arr[i].replace("€", ""));
                }
            }
        }
        System.out.println("toplamAvro = " + toplamAvro);
        System.out.println("toplamUsd = " + toplamUsd);
        System.out.println("Dolarin donusturulmus hali: " + toplamUsd * curUsd);
        System.out.println("Avronun donusturulmus hali: " + toplamAvro * curAvro);
    }
}