package com.sda.kolekcje;

public interface CustomList <E> {
    // towrzymy metode get, add , size
    public E get (int index);
    public void add (E e);
    public int size();
    public void printList();
    public void addTail(E e); // dodanie na poczatek
    public void find(int index);
}
