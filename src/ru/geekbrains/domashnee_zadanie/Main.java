package ru.geekbrains.domashnee_zadanie;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Notebook[] notebookArr = createArr();
        Sort.sort(notebookArr);
        print(notebookArr);

    }

    public static int priceGenerator() {
        Random random = new Random();
        return random.nextInt(6) * 100 + 500;

    }

    public static int ramGenerator() {
        Random random = new Random();
        return random.nextInt(3) * 4 + 4;
    }


    public static String titleGenerator() {
        String[] myString = new String[]{"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};
        int n = (int) Math.floor(Math.random() * myString.length);
        return myString[n];
    }

    public static Notebook[] createArr() {
        Notebook[] noteArr = new Notebook[4000];

        for (int i = 0; i < noteArr.length; i++) {

            noteArr[i] = new Notebook(titleGenerator(), priceGenerator(), ramGenerator());
        }
        return noteArr;
    }

public static void print(Notebook[] arr){
        for (Notebook notebook : arr) {
            System.out.printf("Модель : %s. Цена : %d. Оперативная память : %d\n", notebook.getTitle(), notebook.getPrice(), notebook.getRam());

        }

    }
}