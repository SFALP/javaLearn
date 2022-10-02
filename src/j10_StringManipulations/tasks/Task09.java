package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */
        Scanner scan = new Scanner(System.in);
        System.out.print("Tippen Sie bitte ein Wort oder eine Satze: ");
        String a = scan.nextLine();
        int x = a.length() / 2;
        System.out.println("Der erster Teil des Satzes: " + a.substring(0, +x));
    }
}