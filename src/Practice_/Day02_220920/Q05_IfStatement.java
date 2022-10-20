package Practice_.Day02_220920;

import java.util.Scanner;

public class Q05_IfStatement {
    public static void main(String[] args) {
       /*
   Print "Lutfen is unvaninizi girin
   jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
   Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
   Eger jobTitle  qa ise print is unvaniniz Quality Analyst
   test data: qa ise print Quality Analyst
   dev ise print Developer
   ba ise print Business Analyst
   pm ise print Project Manager
  */

    Scanner scan = new Scanner(System.in);
      System.out.print("Lütfen is unvaniniza karşılık gelen değeri giriniz.\n(QA:1 \tDEV:2 \t BA:3\t PM:4): ");
      int jobTitle=scan.nextInt();

      if(jobTitle>=1 && jobTitle<=4){
          if (jobTitle==1){
              System.out.println("Is unvanınız: Quality Analyst");
          } else if (jobTitle==2) {
              System.out.println("Is unvaniniz: Developer");
          } else if (jobTitle==3) {
              System.out.println("Is unvaniniz: Business Analyst");
          }else
              System.out.println("Is unvaniniz: Project Manager");
      }else
          System.out.println("Geçersiz bir değer tanımladınız. Lütfen tekrar deneyiniz.");


    }
}
