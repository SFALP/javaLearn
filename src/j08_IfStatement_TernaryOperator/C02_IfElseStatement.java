package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C02_IfElseStatement {
    public static void main(String[] args) {

//TASK 1-> girilen yaşın 18'den büyüklüğünü kontrol eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı tanımlayınız: ");
        int a = scan.nextInt();
/*        if (a>18){
            System.out.println("Girilen yaşın değeri ("+a+") 18'den büyüktür.");
        }
   */


//TASK 2-> girilen yaşın 18'den büyüklüğünü kontrol eden code create ediniz. 18'den küçükse ehliyet alamazsınız print ediniz.
        if (a >= 18) {//Girilen yaşın 18'den büyük veya eşit olmasını kontrol eder.
            System.out.println("Girilen yaşın değeri (" + a + ") 18'den büyüktür. Ehliyer alabilirsiniz.");
        } else {//IF şartı sağlamazsa bu satırdan sonra yazılan komut çalışır. Yani yaşın 18'den büyük veya eşit olmaması durumudur.
            System.out.println(+a + " yaşındasınız. 18'den küçük olduğunuz için ehliyet alamazsınız");
        }

    }
}
