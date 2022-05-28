package com.sl;
import java.time.LocalDate;

public class Human {
    int age;
    String firstName;
    String  lastName;
    LocalDate birthDate;
    int weight;

    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age=age;
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;
        this.weight=weight;
    }

    public  int GetWeight() {
        return weight;
    }

    public String toString() {
        return "Имя: "+firstName+" | Фамилия: "+lastName+" | Дата рождения: "+birthDate+" | Возраст: "+age+" | Вес: "+weight;
    }

    public String getFullName() {
        return firstName+" "+lastName;
    }
}