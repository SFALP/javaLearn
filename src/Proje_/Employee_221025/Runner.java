package Proje_.Employee_221025;

public class Runner {
    public static void main(String[] args) {

     Employee calisan=new Employee("Alex",2017,12500,52);
        System.out.println("calisan.name = " + calisan.name);//calisan.name = Alex
        System.out.println("calisan.year = " + calisan.year);//calisan.year = 2017
        System.out.println("calisan.salary = " + calisan.salary);//calisan.salary = 12500
        System.out.println("calisan.workHour = " + calisan.workHour);//calisan.workHour = 52

        System.out.println("calisan.tax() = " + calisan.tax());//calisan.tax() = 375.0
        System.out.println("calisan.bonus() = " + calisan.bonus());//calisan.bonus() = 600.0
        System.out.println("calisan.raiseSlary() = " + calisan.raiseSlary());//calisan.raiseSlary() = 2575.0
        System.out.println("calisan = " + calisan);//calisan = Employee{name='Alex', year=2017, salary=12500, workHour=52, ld=2022-10-26}

    }
}
