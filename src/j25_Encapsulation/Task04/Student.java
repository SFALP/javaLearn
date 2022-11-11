package j25_Encapsulation.Task04;

public class Student {

    private String name="";
    private int age=0;


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age ;
    }

    public Student(String name, int age) {//full parametreli constructor
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
