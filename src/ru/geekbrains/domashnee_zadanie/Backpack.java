package ru.geekbrains.domashnee_zadanie;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private final int maxWeight;
    private List<Item> bestItemsList;
    private int bestPrice;

    public List<Item> getBestItemsList() {
        return bestItemsList;

    }


    public int getMaxWeight() {
        return maxWeight;
    }

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int countWeight(List<Item> items) {
        int result = 0;
        for (Item item : items
        ) {
            result += item.getWeight();
        }
        return result;
    }

    public int countPrice(List<Item> items) {
        int result = 0;
        for (Item item : items
        ) {
            result += item.getPrice();
        }
        return result;
    }

    public void checkSet(List<Item> items) {
        if (this.bestItemsList == null) {
            if (this.countWeight(items) <= this.maxWeight) {
                this.bestItemsList = items;
                this.bestPrice = countPrice(items);
            }
        } else if (this.countWeight(items) <= this.maxWeight && this.countPrice(items) > this.bestPrice) {
            this.bestItemsList = items;
            this.bestPrice = countPrice(items);

        }
    }

    public void makeAllSets(List<Item> items) {
        if (items.size()>0){
            this.checkSet(items);
        }

        for (int i = 0; i < items.size(); i++) {
            List<Item> newSet = new ArrayList<>(items);
            newSet.remove(i);
            makeAllSets(newSet);
        }

    }


}
