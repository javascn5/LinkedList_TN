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

        Node copy= head;
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
