package Proje_.RandomMail_221101;

import java.util.Scanner;

/*
İşe yeni başlayan arkadaşlarımızın kullanımı için arkadaşlara şirket maili ve şifresi create edilip verilmelidir.
--> ** Bir sonraki sprintte create edilen bu mail otomatik olarak IT Manager, HR Manager, Team Lead e mail atılacaktır. Bunu göz önünde bulundurarak proglama yapınız.
Nitelikler:
firtsName: Çalışan İsmi
lastName: Çalışan soyadı
passWord: Çalışan şifresi
department: Çalışılacak Departman
email: Çalışan Email
emailSuffix: Şirket Domaini (clarusway.com)
mailBoxCapasity : 1000
defaultpassWordLenght : 12
Metotlar:
Çalışanın adı ve soyadı alacak şekilde parametreli bir construcor create ediniz (firtsName,lastName)
setDepartment fonks. creat ediniz. Bu fonk çalışanın departmanını setlemek için kullanılmalıdır.
Şirket departmanları aşağıdaki tabloda belirtilmiştir. Çalışanın istihdam edileceği departman emailine eklenecektir.
testautomation.
fullstackdeveloper.
salesforce.
hiçbiri (Eğer çalışan yukarıda ki departmanlardan birinde istihdam edilmiyorsa mailine departman setlenmemelidir.)
setRandomPassWord() password ün uzunluğunu alarak random bir şekilde password create edebilen bir fonk. olmalıdır.
Kullanıcının passwordun de aşağıda belirtilmiş numeric, alphabetic ve speacil karakterler bulunabilir.
ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi
showInfo() çalışanın adı, soyadı, email, password unu konsolda gösterecek bir metot oluşturunuz.
 */
public class EMailApp {
    String firstName;
    String lastName;
    String passWord;
    String department;
    String email;
    String emailSuffix = "clarusway.com";//sirket Domaini abc@clarusway.com
    int mailBoxCapacity = 1000;
    int defaultPasswordLength = 12;

    public EMailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartman();
        //System.out.println("Department: " + department);
        this.passWord = setRandomPassWord(defaultPasswordLength);
        //System.out.println("Password = " + passWord);
        this.email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + emailSuffix+" "+department;
        System.out.println("Sirket E-Mail = " + email);
    }

    public String setDepartman() {
        System.out.print("\n (1)--> Test Automation \n (2)--> Full Stack Developer \n (3)--> Salesforce \n (0)--> Hicbiri" +
                "\nLutfen asagidaki departmanlardan herhangi birini seciniz: ");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {
            return "Testautomation";
        } else if (option == 2) {
            return "Fullstackdeveloper";
        } else if (option == 3) {
            return "Salesforce";
        } else return "";
    }

    //ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi
    public String setRandomPassWord(int length) {
        String passWordSet = "ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghijklmnoprstuvyz";
        char password[] = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passWordSet.length());
            password[i] = passWordSet.charAt(random);
        }
        return new String(password);
    }

    public String showInfo() {

        return "Ad-Soyad: " + firstName + " " + lastName + "\n" +
                "Sirket Email= " + email + "\n" +
                "Capacity: "+mailBoxCapacity +
                "Password: " + passWord;
    }
}