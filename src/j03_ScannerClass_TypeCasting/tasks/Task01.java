package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"
		 */
Scanner scan= new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz: ");
        int Mid= scan.nextInt();
        System.out.println("Final notunuzu giriniz: ");
        int Fin=scan.nextInt();
        System.out.println("Proje notunuzu giriniz: ");
        int Proj= scan.nextInt();

        double grade= Mid*0.3 + Fin*0.5 + Proj*0.2;
        System.out.println("Puanınız: " +grade);

    }
}
