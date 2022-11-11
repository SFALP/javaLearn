package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\sevba\\IdeaProjects\\javaLearn\\src\\j29_Exceptions\\ebikGabik");
            System.out.println("Agam try block'tan selamlar");
            int k;

            try {
                while ((k = fis.read()) != -1) {
                    System.out.print((char) k);
                }
                System.out.println("Agam icteki try blocktan selamlar :)");

            } catch (IOException e) {//dosyaya ulasilir ancak okunamazsa bu catch calisir
                System.out.println("Agam dosya okunamiyor");
                System.out.println("Agam icteki icteki catch block'tan selamlar :)");
            }
            System.out.println("Agam distaki try block'tan selamlar");


        } catch (FileNotFoundException e) {//dosyaya ulasilamazsa bu catch calisir
            System.out.println("Agam dedigin dosya okunamiyor...");
            System.out.println("Agam distaki catch block'tan selamlar :)");
            //            throw new RuntimeException(e);
        }
        System.out.println("Agam sorun handle edildi, devamkeee :)");
    }
}
