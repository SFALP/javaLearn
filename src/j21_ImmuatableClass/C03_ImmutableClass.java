package j21_ImmuatableClass;

import java.util.ArrayList;

/*
  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
  BigDecimal, BigInteger java'da immutable sınıflara örnek olarak gösterilebilir.
        Date, StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
 */
public class C03_ImmutableClass {
    public static void main(String[] args) {

        String name = "Merve";
        System.out.println(name);
        name.concat("Javacan");
        System.out.println("name: " + name);// Merve --> String name variable method sonrasi ayni degerde kaldi, yani immutable'dir.
        // Eger atama yapmis olsaydik degeri degisecekti.

        ArrayList<String>isimList=new ArrayList<>();//bos list
        System.out.println(isimList);
        isimList.add("Fatih");
        isimList.add("Erkan");
        isimList.add("Serhat");
        isimList.remove(1);
        isimList.set(1,"Javacan");
        System.out.println("isimList = " + isimList);//isimList = [Fatih, Javacan]
        //-> list boş iken methodlar sonrası değişti :mutable ArrayList de Mutable (değişebilir
    }
}