package Practice_.Day04_220927;

public class Q08_StringManipulation {
    public static void main(String[] args) {


    /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/

        String a = "Mehmet";
        String b = "Ahmet";

        if (a.length() % 2 == 0) {
            System.out.println(a.substring(0, a.length() / 2) + b + a.substring(a.length() / 2));
        } else
            System.out.println(a + "cift sayili olmadigi icin ortasina yerlestiremedik");
    }

}
