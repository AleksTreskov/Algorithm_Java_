package ru.geekbrains.domashnee_zadanie;

public class DequeueListImpl<T extends Node<T>> implements DequeueList<T> {


    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public T get(int index) {
        if (index < 0 || index >= length()) {
            return null;
        }
        Node<T> singly = head;
        for (int i = 0; i < index; i++) {
            singly = singly.getNext();
        }
        return singly.getElement();
    }

    @Override
    public void put(T element) {
        Node<T> singlyAdd = new Node<>(element);
        if (tail == null) {
            head = singlyAdd;
            tail = singlyAdd;
        } else {
            tail.setNext(singlyAdd);
            tail = singlyAdd;
        }
        size++;
    }

    @Override
    public void put(int index, T e) {
        if (index < 0 || index > length()) {
            return;
        }
        Node<T> newNode = new Node<>(e);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else if (index == length()) {
            tail.setNext(newNode);
            tail = newNode;
        } else {
            Node<T> prev = get(index - 1);
            Node<T> singly = prev.getNext();
            prev.setNext(newNode);
            newNode.setNext(singly);
        }
        ++size;
    }

    public void display() {
        System.out.print("[");
        int i = 0;
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.toString() + (i < size - 1 ? ", " : ""));
            current = current.getNext();
            ++i;
        }
        System.out.println("]");
    }

    @Override
    public void remove(int index) {
        T hold = get(index);
        if (index < 0 || index >= length()) {
            return;
        } else if (index == 0) {
            remove(get(index));
        } else {
            Node<T> current = (Node<T>) get(index);
            current.setNext(current.getNext().getNext());
            size--;
        }
    }

    @Override
    public void remove(T e) {
        if (head == null) {
            System.out.println("We cant delete an empty list");
        }
        Node<T> singly = head;
        head = head.getNext();
        singly.setNext(null);
        size--;

    }

    @Override
    public int length() {
        return size;
    }
}
