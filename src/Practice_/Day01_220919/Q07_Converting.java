package Practice_.Day01_220919;

public class Q07_Converting {
    public static void main(String[] args) {
        /*
   galonu litreye ceviren bir java programi yaziniz
       1 gallon = 3.785 litre
   litreyi galona ceviren bir java programi yaziniz
       1 litre = 1/3.785 gallon

   //  Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın. (Scanner class)
   // formül
   // c = (f-32)*5/9
*/
        //TASK 1:
double g = 1000;
double l= 3.785*g;
        System.out.println(+g+"'galonun litre değeri: "+l);
        // 2.Versiyon
String result=g+" Galonun değeri" +l+"litredir";
        System.out.println("result1 = "+result);
// TASK 2:   litreyi galona ceviren bir java programi yaziniz
//       1 litre = 1/3.785 gallon
        double l1 =100;
        double g1= l1/3.785;
        System.out.println(+l1+"Litrenin galon değeri:"+g1+"dir.");
// TASK 3:Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın. (Scanner class)
//   // formül: c = (f-32)*5/9
        int f=50;
        int c=(f-32)*5/9;
        System.out.println(+f+"değerinin santigrad karşılığı = " + c);
    }
}
