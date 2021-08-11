package ru.geekbrains.domashnee_zadanie;
// 1.Написать программу по возведению числа в степень с помощью рекурсии.
public class Recursion {
    static boolean isInitialized = false;
    static int startValue;



    public static int doRecursion(int value, int power) {
        if (!isInitialized) {
            startValue = value;
            isInitialized = true;
        }
        System.out.println(value);
        if (power == 1)
            return value;
        return doRecursion(startValue * value, power - 1);


    }
}
