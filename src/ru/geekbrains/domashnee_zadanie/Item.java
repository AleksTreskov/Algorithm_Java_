package ru.geekbrains.domashnee_zadanie;

public class Item {
    private final String name;
    private final int price;
    private final int weight;

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Item(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Item{" +
                "name = '" + name + '\'' +
                ", weight = " + weight +
                ", price = " + price +
                '}';
    }

}
