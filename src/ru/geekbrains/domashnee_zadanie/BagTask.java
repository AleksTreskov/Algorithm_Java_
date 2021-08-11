package ru.geekbrains.domashnee_zadanie;

import java.util.ArrayList;
import java.util.List;
// 2. Написать программу «Задача о рюкзаке» с помощью рекурсии.
public class BagTask {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("book",600, 1));
        items.add(new Item("binocular",5000, 2));
        items.add(new Item("medicine",1500, 4));
        items.add(new Item("notebook",40000, 2));
        items.add(new Item("pot",500, 1));
        Backpack backpack = new Backpack(6);
        backpack.makeAllSets(items);
        System.out.println(backpack.getBestItemsList());
    }
}
