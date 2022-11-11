package Proje_.Employee_221025;

import java.time.LocalDate;

/*
Java da fabrika çalışanlarını temsil eden bir class oluşturunuz.
Class Name: Employee
Nitelikleri:
name: İşçi Adı
salary: İşçi Maaşı
workHours: Haftalık Çalışma Saati
year: Çalışmaya Başladığı Yıl
Metotları:
Parametreli Constructor create edilmelidir. Sınıfın nitelikleri aynı zamanda constructor ın parametresi olmalıdır.
vergi() → Maaşa uygulanan vergiyi hesaplamayabilen bir metot oluşturunuz.
salary < 10000 $
vergi = 0
salary >= 10000 $
vergi = (salary *3 /100)
bonus() → Haftalık Çalışma Saatine göre bonus verilebilen bir metot oluşturunuz.
workHours > 40
Her bir saate 50$
maasArtis() → İşçinin işe başlangıç yılına göre maaş artışına etki edebilecek oranı hesaplayan bir metot oluşturunuz.
5 yıldan az çalışıyor ise
artis = ((salary + tax) *5)/100
** Maaş Artışlarına uygulanan vergiyi de dahil ediniz.
[5-15) arası
artis = ((salary + tax)  * 10)/100
[+15-Now]
artis = ((salary + tax)  * 20)/100
toString() → Çalışanın bilgilerini konsola yazdıracak bir metot oluşturunuz (İşçi Adı, Maaş , Uygulanan Vergi, Toplam Maaş (Maaş + Bonus), Maaş Artışı)

 */
public class Employee {
    String name;
    int year;
    int salary;
    int workHour;
    LocalDate ld = LocalDate.now();

    public Employee(String name, int year, int salary, int workHour) {
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.workHour = workHour;
    }

    public double tax() {
        double taxRate = 0.03;
        double tax = 0;
        if (salary > 10000) {
            tax = salary * taxRate;
        } else tax = 0;
        return tax;
    }

    public double bonus() {
        int bonusPaid = 50;
        double bonus = 0;
        if (workHour > 40) {
            bonus = bonusPaid * (workHour - 40);
        } else bonus = 0;
        return bonus;
    }

    public double raiseSlary() {
        int nowYear = ld.getDayOfYear();
        double maasArtis = 0;
        if (year - nowYear < 5) {
            maasArtis = (tax() + salary) * 0.05;
        } else if (year - nowYear < 15) {
            maasArtis = (tax() + salary) * 0.1;
        } else maasArtis = (tax() + salary) * 0.2;
        return maasArtis;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", salary=" + salary +
                ", workHour=" + workHour +
                ", ld=" + ld +
                '}';
    }

}