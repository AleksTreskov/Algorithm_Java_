package ru.geekbrains.domashnee_zadanie;

public interface DequeueList<T> {
    T get(int i);
    void put(T e);
    void put(int i, T e);
    void remove(int i);
    void remove(T e);
    int length();
}
