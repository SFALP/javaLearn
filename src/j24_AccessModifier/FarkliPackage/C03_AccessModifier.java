package j24_AccessModifier.FarkliPackage;

import j24_AccessModifier.C01_AccessModifier;

public class C03_AccessModifier {

    private String privateTeamLead = "Hakan Aydin";
    String defaultName = "Cebrail Bey";
    protected String protectedName = "Dilek Hanim";
    public String publicName = "Gamze Hanim";

    public static void main(String[] args) {

        C01_AccessModifier obj9=new C01_AccessModifier(23,63);//public constructor
        //agama PUBLIC constructor'dan selam

        System.out.println("obj9.publicYas = " + obj9.publicYas);//public variable//obj9.publicYas = 48

        //Farkli package'da oldugu icin sadece public olanlara ulasilabilir. Digerlerine ulasilamaz
        //obj9.defaultyas// default belirlenenlere farkli package'dan eerisilemez.

// obj9.protectedMethod//CTE hatasi. protected method, package disindan erisilemez.



    }

}
