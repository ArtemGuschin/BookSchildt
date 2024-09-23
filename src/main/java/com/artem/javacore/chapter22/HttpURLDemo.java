package com.artem.javacore.chapter22;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http//www.yandex.ru");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        System.out.println("Метод запроса " + hpCon.getRequestMethod());
        System.out.println("Код ответа  " + hpCon.getResponseCode());
        System.out.println("Ответное сообщение " + hpCon.getResponseMessage());

        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nДалее следует заголовок ");

        for (String k : hdrField) {
            System.out.println("Ключ " + k + "Значение " + hdrMap.get(k));

        }
    }
}
