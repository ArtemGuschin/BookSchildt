package com.artem.javacore.chapter21;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        if (args.length != 1) {
            System.out.println("Примение : ShowFile test.txt");
            try (InputStream fin = Files.newInputStream(Paths.get(args[0]))) {
                do {
                    i = fin.read();
                    if (i != -1) System.out.print((char) i);
                } while (i != -1);

            } catch (InvalidPathException e) {
                System.out.println("Ошибка указания пути " + e);
            } catch (IOException e) {
                System.out.println("Ошибка ввода вывода " + e);
            }
        }
    }
}
