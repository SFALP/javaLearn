import java.util.Scanner;

public class Q03_NestedTernary {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Herzlich Willkommen! Das ist die Program der Body Mass Index");
        System.out.print("Bitte beschreiben Sie Ihre Körpergröße(als cm): ");
        double g=scan.nextDouble();
        System.out.print("Bitte beschreiben Sie Ihr Körpergewicht(als kg): ");
        double k=scan.nextDouble();
        double x=(k/(g*g/10000));

        System.out.println(x>0 ?(x<=20 ?("Sie sind sehr schwach"):(x>20 && x<=25 ?("Ihr Gewicht liegt im Bereich des normalen Body-Mass Index. Vielen Dank :=)"):(x>25 && x<=30?("Sie sind in der Kategorie Fett"):("Leider, Sie haben eine Obesität.")))):("Sie können keinen gesunden Wert erhalten, weil andere als die definierten Werte eingegeben wurden. Versuchen Sie bitte erneut"));
    }
}
