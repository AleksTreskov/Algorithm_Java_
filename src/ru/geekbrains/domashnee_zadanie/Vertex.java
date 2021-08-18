package ru.geekbrains.domashnee_zadanie;



public class Vertex<T> {
    private T payload;
    private boolean visited;
    private int weight;

    public Vertex(T payload) {
        this.payload = payload;
        this.visited = false;
        this.weight = -1;
    }

    public T getPayload() {
        return payload;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isVisited() {
        return visited;
    }

    public int getWeight() {
        return weight;
    }
}
