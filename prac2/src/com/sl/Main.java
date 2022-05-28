package com.sl;

import java.util.ArrayList;
import java.util.stream.Stream;
import java.time.LocalDate;

public class Main {
    public static void main(String[]args) {
        ArrayList<Human> list = new ArrayList<Human>(10);
        Human human1 = new Human(31, "Иван", "Ерёмин", LocalDate.of(1991, 6, 30), 163);
        Human human2 = new Human(27, "Борис", "Дорн", LocalDate.of(1995,4,20), 180);
        Human human3 = new Human(22, "Валерий", "Гришин", LocalDate.of(2000, 2, 10), 165);
        Human human4 = new Human(20, "Герасим", "Власов", LocalDate.of(2002, 1, 5), 159);
        Human human5 = new Human(25, "Демид", "Безруков", LocalDate.of(1997, 3, 15), 175);
        Human human6 = new Human(29, "Егор", "Антонов", LocalDate.of(1993, 5, 25), 155);

        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(human4);
        list.add(human5);
        list.add(human6);

        System.out.print("\nCортировка по дате рождения:\n");
        Stream<Human> stream = list.stream();
        stream.sorted((a, b) -> (a.birthDate.isBefore(b.birthDate)) ? -1 : ((a.birthDate == b.birthDate) ? 0 : 1)).limit(5).forEach(System.out::println);

        System.out.print("\nВес меньше 160:\n");
        Stream<Human> stream2 = list.stream();
        stream2.filter(a -> a.GetWeight() < 160).limit(5).forEach(e -> System.out.println(e.getFullName()));
    }
}