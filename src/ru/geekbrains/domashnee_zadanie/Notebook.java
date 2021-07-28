package ru.geekbrains.domashnee_zadanie;

import java.util.Random;

public class Notebook implements Comparable<Notebook>{
    String title;

    @Override
    public int compareTo(Notebook o) {
        if (this.title.equals("Lenuvo")&&o.title.equals("Asos")
        ||
         (this.title.equals("Lenuvo")&&o.title.equals("MacNote"))

        || (this.title.equals("Lenuvo")&&o.title.equals("Eser"))

        || (this.title.equals("Lenuvo")&&o.title.equals("Xamiou"))

        || (this.title.equals("Asos")&&o.title.equals("MacNote"))

        || (this.title.equals("Asos")&&o.title.equals("Eser"))

        || (this.title.equals("Asos")&&o.title.equals("Xamiou"))

        || (this.title.equals("MacNote")&&o.title.equals("Eser"))

        || (this.title.equals("MacNote")&&o.title.equals("Xamiou"))

        ||  (this.title.equals("Eser")&&o.title.equals("Xamiou")))
            return -1;
            if (this.title.equals("Lenuvo")&&o.title.equals("Lenuvo")
        || (this.title.equals("Asos")&&o.title.equals("Asos"))
        || (this.title.equals("Eser")&&o.title.equals("Eser"))
        || (this.title.equals("MacNote")&&o.title.equals("MacNote"))
        || (this.title.equals("Xamiou")&&o.title.equals("Xamiou")))
            return 0;

        else return 1;
    }

    int price;
    int ram;

    public Notebook(String title, int price, int ram) {
        this.title = title;
        this.price = price;
        this.ram = ram;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }
}
