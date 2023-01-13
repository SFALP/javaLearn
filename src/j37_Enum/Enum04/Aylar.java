package j37_Enum.Enum04;

public enum Aylar {
//    OCAK(31, "Kis", "Gulsum hanima hayirli seneler"),
    OCAK(31),
    SUBAT(28/29),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31),
    AGUSTOS(31),
    EYLUL(30),
    EKIM(31),
    KASIM(30),
    ARALIK(31);

    int gunler;

//    Aylar(int gunSayisi, String mevsim, String birthDay) {//parametreli constructor, parametresizi ezer
    Aylar(int gunSayisi) {//parametreli constructor, parametresizi ezer
        gunler=gunSayisi;
    }
 void gunMiktari(){
     System.out.println("gunler = " + gunler);
 }
}
