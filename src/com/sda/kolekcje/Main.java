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

        customList.add("jeden");
        customList.add("dwa");
        customList.add("trzy");
        customList.add("cztery");

// printujac to wynnika z tego, ze
        // trzeci obiekt rzutuje na drugi, drugi na pierwszy, pierwszy na nulla
    }
}
