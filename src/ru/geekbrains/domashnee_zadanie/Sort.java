package ru.geekbrains.domashnee_zadanie;

public class Sort {
    public static void sort(Notebook[] arr) {
        Notebook temp;
        boolean isChange;
        do {
            isChange = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].getPrice() > arr[i + 1].getPrice()) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    isChange = true;
                } else if (arr[i].getPrice() == (arr[i + 1].getPrice())) {
                    if (arr[i].getRam() > arr[i + 1].getRam()) {
                        temp = arr[i + 1];
                        arr[i + 1] = arr[i];
                        arr[i] = temp;
                        isChange = true;
                    } else if (arr[i].getRam() == (arr[i + 1].getRam())) {
                        if (arr[i].compareTo(arr[i + 1]) > 0) {
                            temp = arr[i + 1];
                            arr[i + 1] = arr[i];
                            arr[i] = temp;
                            isChange = true;
                        }
                    }
                }
            }
        } while (isChange);
}}
