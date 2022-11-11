package j25_Encapsulation.Task03;

import java.util.Scanner;

/*
        Bmı classfields -> name, age, weight,height: encapsulated
        getBMI() method -> bmi=weight/(height*height) returb type olmalı
        getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez return type
        runner class obj ile dataları print eden code create ediniz
  */
public class Bmi {

    private String name = "";
    private int age = 0;
    private double weight = 0;
    private double height = 0;

    public Bmi(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height;
    }

    public double getBMI() {
        double bmi = weight / (height * height);
        return bmi;
    }

    public String getStatus() {//    getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez return type
        if (getBMI() < 18.5) {
            return "Zayif";
        } else if (getBMI() < 25) {
            return "Normal";
        } else if (getBMI() < 30) {
            return "Kilolu";
        } else return "Obez :(";
    }
}

class Runner {
    public static void main(String[] args) {
        Bmi obj1 = new Bmi("Alex De Souza", 45, 78, 1.78);
        System.out.println("BMI: " + obj1.getBMI() + " " + obj1.getStatus() + " " + obj1.getBMI());
    }
}