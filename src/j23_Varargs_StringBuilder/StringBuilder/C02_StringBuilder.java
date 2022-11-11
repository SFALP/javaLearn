package j23_Varargs_StringBuilder.StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {

// StringBuilder obje create etme:
// 1.YOL:
        StringBuilder sb1 = new StringBuilder();// default capacity 16 bit olan value olmayan bos StringBuilder.
        System.out.println("sb1.length() = " + sb1.length());//0 --> length() methodu sb'deki karakter sayisini return eder

        System.out.println("sb1.capacity() = " + sb1.capacity());//sb1.capacity() = 16 --> Default Capacity'dir

        sb1.append("JAVATAR");// sb1'e JAVATAR eklendi.
        System.out.println("sb1 = " + sb1);
        //NSA'da immutable'dir ancak StringBuilder ile sanki basinda static ifade varmis gibi
        //degisiklik sabitlenmis olur.
        System.out.println("sb1.capacity() = " + sb1.capacity());//sb1.capacity() = 16 --> JAVATAR yazilince mevcuttaki 16 kapasitesi
        // asmadigi icin kapasite 16'da sabit kalmis olur.


        sb1.append(" selam").append(" olsun").append(" ").append(24).append(" ").append(true);
        System.out.println("sb1 = " + sb1);//sb1 = JAVATAR selam olsun 24 true
        System.out.println("sb1.capacity() = " + sb1.capacity());//sb1.capacity() = 34
//--> kapasite asilmissa mevcut kapasitenin 2 katinin 2 fazlasina kadar kapasite artirilmis olur.
//        Bu artis carpani sabittir.(2 katinin 2 fazlasi)

        sb1.append(" Basari gayrete asiktir :=)");
        System.out.println("sb1 = " + sb1);//sb1 = JAVATAR selam olsun 24 true Basari gayrete asiktir :=)
        System.out.println("sb1.capacity() = " + sb1.capacity());//70
// Bu kapasite sirayla; 16-34-70-142 ....... seklinde gider.(2 katinin 2 fazlasi)

        //2.YOL
        StringBuilder sb2 = new StringBuilder("Kevser hanima selamlar");// ilk deger atamasi yapilmis sb2 obj
        System.out.println("sb2 = " + sb2);//sb2 = Kevser hanima selamlar
        System.out.println("sb2.capacity() = " + sb2.capacity());//sb2.capacity() = 38
        // Default atanan 16 degerine ek olarak tanimlanan ifadenin karakter sayisi(22) eklendi. Bu nedenle sonuc 38'dir.

//*****  trim() methodu --> Fazladan ayrilan capacity silinir.

        System.out.println("sb2.length() = " + sb2.length());//sb2.length() = 22
        sb2.trimToSize();// karakter sayisindan fazla olan kisim silinmis olur
        System.out.println("sb2.capacity() = " + sb2.capacity());//sb2.capacity() = 22

// 3.YOL

        StringBuilder sb3 = new StringBuilder(11);// Hafizada 11 karakterlik yer ayiran bos sb tanimlandi.
        System.out.println("sb3.length() = " + sb3.length());//sb3.length() = 0  //bos sb2'un karakter sayisi 0'dir.
        System.out.println("sb3.capacity() = " + sb3.capacity());//sb3.capacity() = 11

        sb3.append("Ebubekir bey");
        System.out.println("sb3.capacity() = " + sb3.capacity());//sb3.capacity() = 24
        sb3.trimToSize();
        System.out.println("sb3.capacity() = " + sb3.capacity());//sb3.capacity() = 12


//***** istenen bir character index'i alma:
        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));//sb1.charAt(12) = m

//***** Belirli bir araliktaki charakterleri alma:
        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13));//sb1.subSequence(3,13) = ATAR selam
        System.out.println("sb1.substring(17) = " + sb1.substring(17));//17.karakterden sonrasini verir.
        //sb1.substring(17) = un 24 true Basari gayrete asiktir :=)
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13));//sb1.substring(3,13) = ATAR selam

//******  Belirli bir index'teki karakteri silmek:
        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3));// 3.index'te yer alan (A harfi) silindi
//sb1.deleteCharAt(3) = JAVTAR selam olsun 24 true Basari gayrete asiktir :=)
        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7));//3-4-5-6. karakterler silinir
//sb1.delete(3,7) = JAVselam olsun 24 true Basari gayrete asiktir :=)

//****** istenen charakter veya charakterleri eklemek:
        System.out.println("sb3 = " + sb3);//sb3 = Ebubekir bey
        System.out.println("sb3.insert(4,\":=)\") = " + sb3.insert(4, ":=)"));//sb3.insert(4,":=)") = Ebub:=)ekir bey

        String s = "Guzel insan";
        System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s));//sb3.insert(9,s) = Ebub:=)ekGuzel insanir bey

        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));
// Yukaridaki kod, sb3'un 1.index'inden baslayarak s String'inin 3-4-5-6.indexlerini ekle anlamina gelir.
        System.out.println("sb3 = " + sb3);//sb3 = Eel ibub:=)ekGuzel insanir bey
//el i --> ifadesi guz(EL I)nsan ifadesinden gelir. sonra de bub:=) seklinde ilerler.

        StringBuilder sb4 = new StringBuilder("Nihan hanim");
        sb4.insert(5, "QA Team Lead", 0, 2);
        System.out.println("sb4 = " + sb4);//sb4 = NihanQA hanim

//***** istenen index'teki charakteri set etmek(degistirmek)
        sb4.setCharAt(6, 'a');
        sb4.setCharAt(sb4.indexOf(" "), ':');
        System.out.println("sb4 = " + sb4);//sb4 = NihanQa:hanim
        System.out.println("sb4.insert(5,\" \") = " + sb4.insert(5, " "));//sb4.insert(5," ") = Nihan Qa:hanim

//***** istenen index charakter yerine birden cok karakter eklemek:
        System.out.println("sb4.replace(8,10,\"Hi\") = " + sb4.replace(8, 10, "Hi"));//sb4.replace(8,10,"Hi") = Nihan QaHianim

//***** Sb obj'yi String'e cevirme--> toString
        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase());
//sb3.toString().toUpperCase() = EEL İBUB:=)EKGUZEL İNSANİR BEY

        //String ile StringBuilder karsilastirmasi


/*
Compare iki sb'i esit mi diye kontrol etmek icin
ilk harften baslayarak tum karakterleri karsilastirir
Ayni olan karakterler icin bir sey return etmezken
farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
oldugunu print eder
Tamamen ayni ise bize 0 return eder

bir sb ile bir String'i compare etmek istersek Java CTE verir
 */

        StringBuilder sb5 = new StringBuilder("JavaCAN");
        StringBuilder sb6 = new StringBuilder("JavaCAN");
        String str1 = "JavaCAN";

        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));//sb5.compareTo(sb6) = 0

//        sb6.compareTo(str1) CTE verir, cunku tamamen farklidir.

        System.out.println("sb6.equals(sb5) = " + sb6.equals(sb5));//sb6.equals(sb5) = false
// SB equals == gibi calisir--> Yani hem value hem referans degere bakilir.
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6));//sb6.equals(sb6) = true

        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));//str1.equals(sb6.toString()) = true
//Bir ustteki kodda s6, string'e donusturuldu.
    }
}