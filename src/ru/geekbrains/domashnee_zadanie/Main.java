package ru.geekbrains.domashnee_zadanie;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
/**1. Реализовать цикл forEach для простого связанного списка*/

    public static void main(String[] args) {
        List<Integer> myArr = new LinkedList<>();
        myArr.add(5);
        myArr.add(6);
        myArr.add(7);
        myArr.add(8);
        myArr.add(9);

        for(Iterator<Integer> i = myArr.listIterator(); i.hasNext();){
            Integer temp = i.next();
            System.out.println(myArr.indexOf(temp)+1+" number is: "+temp );

        }



        DequeueList<Integer> list=  new DequeueListImpl<Integer>();
        list.put(1);
        list.put(12);
        list.put(1,2);
        for (int i = 0; i < list.length(); i++) {
            System.out.println(list.get(i));

        }
    }



    }

