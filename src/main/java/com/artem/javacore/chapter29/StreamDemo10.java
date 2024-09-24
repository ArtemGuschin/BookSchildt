package com.artem.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");
        Stream<String> myStream = myList.stream();
        Spliterator<String> spliterator = myStream.spliterator();
        Spliterator<String> spliterator2 = spliterator.trySplit();

        if (spliterator2 != null) {
            System.out.println("Результат выводимый spliterator2 : ");
            spliterator2.forEachRemaining((n) -> System.out.println(n));
        }

        System.out.println("Результат выводимый spliterator : ");
        spliterator.forEachRemaining((n) -> System.out.println(n));


    }
}
