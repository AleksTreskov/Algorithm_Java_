package ru.geekbrains.domashnee_zadanie;

public class Node<T> {
    public Node<T> next;
    public Node<T> prev;
    public T element;

    public Node(T element) {
        this.element = element;
    }

    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}
