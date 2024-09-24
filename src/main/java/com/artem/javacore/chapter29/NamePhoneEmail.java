package com.artem.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

    public NamePhoneEmail(String name, String phonenum, String email) {
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
    }
}

class NomePhone {
    String name;
    String phonenum;

    public NomePhone(String name, String phonenum) {
        this.name = name;
        this.phonenum = phonenum;
    }
}

class StreamDemo5 {
    public static void main(String[] args) {
        List<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Ларри", "555-5555", "Larry@herbSchild.com"));
        myList.add(new NamePhoneEmail("Джеймс", "555-4444", "James@herbSchild.com"));
        myList.add(new NamePhoneEmail("Мерри", "555-3333", "Marry@herbSchild.com"));

        System.out.println("Исходные элементы списка myList : ");
        myList.stream().forEach((a) -> {
            System.out.println(a.name + " " + a.phonenum + " " + a.email);
        });
        System.out.println();
        Stream<NomePhone> nameAndPhone = myList.stream().map(
                (a) -> new NomePhone(a.name, a.phonenum)
        );
        System.out.println("Список имен и телефонов : ");
        nameAndPhone.forEach((a) -> {
            System.out.println(a.name + " " + a.phonenum);
        });
    }
}
