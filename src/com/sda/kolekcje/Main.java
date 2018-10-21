package com.sda.kolekcje;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // linkedList - implementacja listy, ktora bazuje na obiektach
        // kazdy element listy wskazuje na element poprzedni i nastepny

        // ArrayList jest implementacja tablicowa- szybsza
        // LinkedList jest implementacja wiazana- kiedy duzo usuwamy danych

        List<String> list = new LinkedList<>();
        list.add("Jan");
        list.add("Pawel");
        list.add("Gawel");
        for (String lista : list) {
            System.out.println(lista);
        }


        CustomList<String> customList = new CustomLinkedList<>();

        customList.add("1");
        customList.add("2");
        customList.add("3");
        customList.add("4");
        customList.add("5");
        customList.add("6");
        customList.add("7");
        customList.add("8");

        customList.addTail("1");
        customList.addTail("2");
        customList.addTail("3");
        customList.addTail("4");
        customList.addTail("5");
        customList.addTail("6");
        customList.addTail("7");
        customList.addTail("8");

       customList.printList();
       customList.find(8);


// printujac to wynnika z tego, ze
        // trzeci obiekt wskazuje na drugi, drugi na pierwszy, pierwszy na nulla
    }
}
