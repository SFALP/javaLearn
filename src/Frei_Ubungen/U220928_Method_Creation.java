package Frei_Ubungen;

public class U220928_Method_Creation {
    public static void main(String[] args) {
        toplama();
        toplama(15,14);

    }
public static void toplama(){//parametresiz method
        System.out.println("Sampiyon FENER!");
    }
    public static void toplama(int a, int b){//Parametreli method
        System.out.println("29.sampiyonlugunuzu kutlariz!: "+(a+b));
    }
}
