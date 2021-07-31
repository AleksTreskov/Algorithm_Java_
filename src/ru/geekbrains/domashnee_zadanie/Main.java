package ru.geekbrains.domashnee_zadanie;

import java.util.Random;

public class Main {
    /**
     * 1. Дан массив из n элементов, начиная с 1. Каждый следующий элемент равен (предыдущий + 1).
     * Но в массиве гарантированно 1 число пропущено. Необходимо вывести на экран пропущенное число.
     **/
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10 + Math.random() * 10);
        int[] arr = new int[a];

        fillArr(arr);
        removeRandomElem(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) != 1) {
                System.out.println("Missing number is: "+(arr[i] + 1));
                break;
            }
        }
    }

    public static void removeRandomElem(int[] arr) {
        Random random = new Random();

        int rnext = random.nextInt(arr.length-2)+1;

        for (int i = rnext; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void fillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

        }
    }}