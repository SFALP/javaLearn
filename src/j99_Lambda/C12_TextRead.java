package j99_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class C12_TextRead {
    public static void main(String[] args) throws IOException {

//TASK01: Text dosyasini okuyunuz.(Consola print ediniz.)
        System.out.println("\n Task01--> Text dosyasini okuyunuz ");
        Path hlk = Path.of("C:\\Users\\sevba\\IdeaProjects\\javaLearn\\src\\j99_Lambda\\C12_Text");//erisilecek dosyanin Path'i tanimlandi.
        Stream<String> akis = Files.lines(hlk);
        //Stream<String> akis1= Files.lines("src/j99_Lambda/C12_Text");

        akis.//erisim verilen dosyadaki satirlar akisa alindi
                forEach(System.out::println);//akistaki satirlar print edildi.
/*
Task01--> Text dosyasini okuyunuz
BASARI Gayrete Asiktir!!
functional programming gayet basarili
Java bilenin sirti yere gelmez.
Javasi zayif olanin yuzu gulmez
JavaCAN'lar ayaginiza tas degmesin...
Anne sesi: Uykusu gelen dooooogru yataga... hadi bakalimm
 */

//TASK 02 --> C12_Text.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle print ediniz.)
        System.out.println("\n Task02--> ");
        Files.lines(Paths.get("C:\\Users\\sevba\\IdeaProjects\\javaLearn\\src\\j99_Lambda\\C12_Text")).//erisim verilen path'deki satirlar akisa alindi.
                map(String::toUpperCase).//akisdaki satirlarin String'leri buyuk harfe update edildi.
                forEach(System.out::println);
/*
Task02-->
BASARI GAYRETE ASİKTİR!!
FUNCTİONAL PROGRAMMİNG GAYET BASARİLİ
JAVA BİLENİN SİRTİ YERE GELMEZ.
JAVASİ ZAYİF OLANİN YUZU GULMEZ
JAVACAN'LAR AYAGİNİZA TAS DEGMESİN...
ANNE SESİ: UYKUSU GELEN DOOOOOGRU YATAGA... HADİ BAKALİMM
 */

//TASK03: C12_Text doyasindaki ilk satiri kucuk harflerle print ediniz.
        System.out.println("\nTask 03--> ");
        Files.lines(Paths.get("C:\\Users\\sevba\\IdeaProjects\\javaLearn\\src\\j99_Lambda\\C12_Text")).//erisim verilen path'deki satirlar akisa alindi.
                map(String::toLowerCase).//akisdaki satirlarin String'leri kucuk harfe update edildi.
                limit(1).//akistaki ilk eleman (satir) alindi
                forEach(System.out::println);
/*
Task 03-->
basarı gayrete asiktir!!
 */

//TASK 04 --> C12_Text dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
        System.out.println("\nTask04 --> ");
        System.out.println(Files.lines(Paths.get("C:\\Users\\sevba\\IdeaProjects\\javaLearn\\src\\j99_Lambda\\C12_Text")).//erisim verilen path'deki satirlar akisa alindi.
                map(String::toLowerCase).//akisdaki satirlarin String'leri kucuk harfe update edildi.
                filter(t -> t.contains("basari")).//akistaki elemanlarda basari ifadesi gecenler filtrelendi
                count()//akistaki elemanlar saydirildi.
        );
/*
Task04 -->
2
*/

//TASK 05 --> C12_Text dosyasindaki farkli kelimeleri  print ediniz..
        System.out.println("\nTask05 --> ");
       Files.lines(Path.of("C:\\Users\\sevba\\IdeaProjects\\javaLearn\\src\\j99_Lambda\\C12_Text")).//erisim verilen path'deki satirlar akisa alindi.
            map(t->t.split(" ")).
                flatMap(Arrays::stream).
                distinct().forEach(t-> System.out.print(t+" "));
/*
Task05 -->
Basari Gayrete Asiktir!! functional programming gayet basarili Java bilenin sirti yere gelmez.
 Javasi zayif olanin yuzu gulmez JavaCAN'lar ayaginiza tas degmesin...
 Anne sesi: Uykusu gelen dooooogru yataga... hadi bakalimm
 */

//TASK 06 --> C12_Text dosyasindaki tum kelimeleri natural order  print ediniz..
        System.out.println("\nTask06 --> ");
        Files.lines(Path.of("C:\\Users\\sevba\\IdeaProjects\\javaLearn\\src\\j99_Lambda\\C12_Text")).
      map(t->t.split(" ")).
        flatMap(Arrays::stream).
        sorted().
        forEach(t-> System.out.print(t+" "));
/*
Task06 -->
Anne Asiktir!! Basari Gayrete Java JavaCAN'lar Javasi Uykusu ayaginiza bakalimm basarili bilenin degmesin...
 dooooogru functional gayet gelen gelmez. gulmez hadi olanin programming sesi: sirti tas yataga... yere yuzu zayif
 */

//TASK 07 --> C12_Text dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        System.out.println("\nTask07 --> ");
        System.out.println(        Files.lines(Path.of("C:\\Users\\sevba\\IdeaProjects\\javaLearn\\src\\j99_Lambda\\C12_Text")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.contains("a")).
                count()
        );
/*
Task07 -->
16
 */

//TASK 08 --> C12_Text dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
        System.out.println("\nTask08 --> ");
        Files.lines(Path.of("C:\\Users\\sevba\\IdeaProjects\\javaLearn\\src\\j99_Lambda\\C12_Text")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.contains("a")).
                forEach(t-> System.out.print(t+" "));
/*
Task08 -->
Basari Gayrete functional programming gayet basarili Java Javasi zayif olanin JavaCAN'lar ayaginiza tas yataga...
 hadi bakalimm
 */
//TASK 09 --> C12_Text dosyasinda kac /farklı harf kullanildigini print ediniz.
        System.out.println("\nTask09 --> ");
        System.out.println(Files.lines(Path.of("C:\\Users\\sevba\\IdeaProjects\\javaLearn\\src\\j99_Lambda\\C12_Text")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                distinct().
                count());
/*
Task09 -->
34
 */
//TASK 10 --> C12_Text dosyasinda kac farkli kelime kullanildigini print ediniz.
        System.out.println("\nTask10 --> ");
        Files.lines(Path.of("C:\\Users\\sevba\\IdeaProjects\\javaLearn\\src\\j99_Lambda\\C12_Text")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                distinct().
                forEach(t-> System.out.print(t+" "));
/*
Task10 -->
Basari Gayrete Asiktir!! functional programming gayet basarili Java bilenin sirti yere gelmez.
Javasi zayif olanin yuzu gulmez JavaCAN'lar ayaginiza tas degmesin... Anne sesi: Uykusu gelen dooooogru yataga...
 hadi bakalimm
 */
    }
}