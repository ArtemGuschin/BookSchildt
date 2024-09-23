package com.artem.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws IOException {
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();
        long d = hpCon.getDate();
        if (d == 0)
            System.out.println("Сведения о дате отсутсвуют ");
        else
            System.out.println("Дата " + new Date(d));

        long len = hpCon.getContentLengthLong();
        if (len == -1)
            System.out.println("Длинна содержимого не доступна ");
        else System.out.println("Длинна содержимого " + len);

        if (len != 0) {
            System.out.println("=== Содержимое ===");
            InputStream input = hpCon.getInputStream();
            while (((c = input.read()) != -1)) {
                System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("Содержимое не доступно");
        }
    }
}
