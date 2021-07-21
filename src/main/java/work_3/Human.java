package work_3;

import java.util.Objects;

public class Human {
/*
* 3. Создать вложенный класс Person, у которого внутри объявить 4 переменные String name, int age, double salary, String surName,
создать конструктор с этими полями и объявить сет и гет методы,
далее необходимо переопределить метод equals так, что бы он обязательно сверял все 4 переменные в объекте и вызвать его в методе main*/


    public static void main(String[] args) {

        Person person_1 = new Person("Aleks",20,4.4,"Nick");
        Person person_2 = new Person("Elsa",19,2.1,"Grunt");

        System.out.println(person_1.equals(person_2));

    }

}
class Person{
    String name;
    int age;
    double salary;
    String surName;

    public Person(String name, int age, double salary, String surName) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.surName = surName;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.salary, salary) == 0 && Objects.equals(name,
                person.name) && Objects.equals(surName, person.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, surName);
    }
}