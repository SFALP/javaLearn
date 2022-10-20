package j14_Scope;

public class C03_Scope  {

    public static void main(String[] args) {

C01_Instance_Variable kus=new C01_Instance_Variable();// istenen class'tan kus objesi create edildi.
        kus.name="Huma";
        kus.developerMi=false;

        System.out.println("kus.name = " + kus.name);//Huma
        C01_Instance_Variable.staticMethod();//Static günes methodusun agam devamkeeee
        // Baska bir classta yer alan method buraya da cagirilmis olur.
kus.non_StaticMethod();//Static olmayan methoddan agama selam :)
//static olmayan methodlar da obje ile call edilir.



    }
}
