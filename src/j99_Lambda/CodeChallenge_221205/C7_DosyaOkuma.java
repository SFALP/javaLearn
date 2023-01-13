package j99_Lambda.CodeChallenge_221205;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

/*
dosya eklemek icin 2 yol var
1) Files.lines(Path.of("path")  buradan stream e eklemek icin
Stream <String> satir=Files.lines(Path.of(".........."));
bu bize tekrardan stream tanimlamadan kullanmayi saglar
2) //Files.lines(Paths.get("..........")).  kullanilir
==========================================================
intellj dosya eklemek icin src => new=>file=>text diyoruz ve istedigimiz metni buraya kopyaliyoruz
bu dosyanin path almak icin dosyanin uzerine gelip sag tikliyoruz(burada dosya C7_TextFile)
sonrasinda copy path seciyoruz bundan sonra iki secenek var
1) absolute path seciyoruz yada
2) path from content root seciyoruz
her ikisinde de path kopyalamis oluyoruz

cevirirken EXCEPTION OLUSMASIN DIYE => throws IOException <= EKLEMELIYIZ
buda lines altinda kirmizi uyari veriyor uzerine tiklayinca kendiliginden oluyor
*/
public class C7_DosyaOkuma {
    public static void main(String[] args) throws IOException {
        Stream<String> satir = Files.lines(Path.of("src/j99_Lambda/CodeChallenge_221205/C7_TextFile"));


        // S1: Yazdiralim

// COZUM: satir.forEach(System.out::println);

//.Terk etmek kolaysa senin icin,
//2.El sallamak zor degil benim icin!
//3.Sevmek zaman ayirmaktir.
//4.Bos zamanlari doldurmak degil...
//5.bu son satir da Lambda ya Hoscakal olsun :)


        // S2: tum harflari buyuk harf ile yazdiralim
//COZUM: satir.map(String::toUpperCase).forEach(System.out::println);
/*
1.TERK ETMEK KOLAYSA SENİN İCİN,
2.EL SALLAMAK ZOR DEGİL BENİM İCİN!
3.SEVMEK ZAMAN AYİRMAKTİR.
4.BOS ZAMANLARİ DOLDURMAK DEGİL...
5.BU SON SATİR DA LAMBDA YA HOSCAKAL OLSUN :)
 */
        // S3: son satiri buyuk harfle yazdiralim
// COZUM: satir.skip(4).map(String::toUpperCase).forEach(System.out::println);
/*
5.BU SON SATİR DA LAMBDA YA HOSCAKAL OLSUN :)
 */
        // S4: 2.ve 3. satirlari yazdiralim
//COZUM: satir.skip(1).limit(2).forEach(System.out::println);
/*
2.El sallamak zor degil benim icin!
3.Sevmek zaman ayirmaktir.

 */
        // S5: kac tane "icin" kelimesi vardir
//COZUM:System.out.println(satir.filter(t->t.contains("icin")).count());
/*
2
 */
        // S6: tum kelimeleri natural order  yazdiriniz.
//COZUM: satir.map(t->t.split(" ")).flatMap(Arrays::stream).sorted().forEach(System.out::println);
/*
1.Terk
2.El
3.Sevmek
4.Bos
5.bu
:)
Hoscakal
Lambda
ayirmaktir.
benim
da
degil
degil...
doldurmak
etmek
icin!
icin,
kolaysa
olsun
sallamak
satir
senin
son
ya
zaman
zamanlari
zor
 */
        // S7:  metinde kac tane "a"  vardir
//COZUM:System.out.println(satir.map(t->t.split("")).flatMap(Arrays::stream).filter(t->t.contains("a")).count());
    /*
    20
     */
    }

}
