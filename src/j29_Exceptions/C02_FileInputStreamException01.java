package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
​
             Dosya okuma/yazma işlemi bu işlemlerde hata olasılığı yüksek olduğundan hata kontrolü zorunlu tutuluyor.
             bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surumlara karşılk gelen hatalara Checked Exception denir
             Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.
​
​
            Bir kod yazilirken olasi exception'lar ongorulup
            exception olustugunda Java'nin ne yapmasini istedigimiz
            belirtilmelidir.
​
​
                 1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
                 kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.
​
                     2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
                 FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
                 FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
                 Class'inin parent class Hz.Adem
         */

public class C02_FileInputStreamException01 {
    public static void main(String[] args) throws IOException {//Hz.Nuh IO islemleri en parent class exception
        //public static void main(String[] args) throws FileNotFoundException {//read() method import oncesi child exception
        FileInputStream fis = new FileInputStream("C:\\Users\\sevba\\IdeaProjects\\javaLearn\\src\\j29_Exceptions\\ebikGabik");
//ilgili dosyaya ulasmak icin fis objesi tanimlandi. Parametre olarak dosya yolu(path) girildi.

/*
Eger bir methodda Checked (CTE riski olan Exeption) exception varsa method signiture (method name'den sonraki bolum)
hata uyarisi alti kirmizi cizgi verir.
Komutun derlenmesine izin vermez ve kod uzerine gelindiginde Add... exception handle etme tavsiye eder,
otomatik throw exception eklenir.

Bu sekilde method call eden komutlar try-catch olmasi garanti edilmis olur.
 */

        int k;
        while ((k = fis.read())!=-1){//IOException--> evde yoksa kontrolu
            System.out.print((char)k);//k int ASCII olan file degeri, char ici casting -->typ donusumu
        }
    }
}