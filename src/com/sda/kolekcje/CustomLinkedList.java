package com.sda.kolekcje;

public class CustomLinkedList<E> implements CustomList<E> {
    // towrzymy 2 pola
    private int size;
    // head- poczatek listy
    private Node head;

    public CustomLinkedList() {
        head = new Node(null);
    }


    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void add(E e) {

        // kopiujemy liste ktora istnieje dotychczas

        Node copy = head;
        System.out.println("wartosc copy: " + copy);
        head = new Node(e);
        System.out.println("wartosc head: " + head);
        head.next = copy;
        System.out.println("wartosc next: " + head.next);
        size++;
    }

    @Override
    public int size() {
        return 0;
    }

    // tworzymy metode ktora bedzie iterowala po wszystkich elementach listy
    public void printList() {
        // ustawiamy zmienna ktora
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    @Override
    public void addTail(E e) {
        // odwrocenie kolejnosci wyswietlania elementow- teraz jest 8-7-6-5-4-3-2-1
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = new Node(e);
    }

    @Override
    public void find(int index) {
// znajdujemy element o danym indeksie
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        System.out.println(tmp);
    }

    // kazdy obiekt listy musi byc nowym obiektem to robimy nowa klase Node
    // ona ma 2 referencje- data i wskaznik
    // bedzie odpowiedzialna za przechowanie

    class Node {
        private Object data;
        private Node next;

        // konstruktor
        public Node(Object data) {
            this.data = data;
        }

        // getter
        public Object getData() {
            return data;
        }

        // metoda toString - zwraca nam aktualne wartosci
        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}
