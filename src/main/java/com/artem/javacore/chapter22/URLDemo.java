package com.artem.javacore.chapter22;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://www.HerbSchildt.com/Articles");

        System.out.println("Протокол :" + hp.getProtocol());
        System.out.println("Порт :" + hp.getPort());

        System.out.println("Хост : " + hp.getHost());
        System.out.println("Файл : " + hp.getFile());
        System.out.println("Поолная форма " + hp.toExternalForm());
    }
}
