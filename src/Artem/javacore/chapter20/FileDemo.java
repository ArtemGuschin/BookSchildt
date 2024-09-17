package Artem.javacore.chapter20;

import java.io.File;

public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\art69\\IdeaProjects\\BookSchildt\\Test.txt");
        p("Имя файла " + f1.getName());
        p("Путь " + f1.getPath());
        p("Абсолютныйф путь " + f1.getAbsolutePath());
        p("Родительский каталог " + f1.getParent());
        p(f1.exists() ? "существует " : " не существует");
        p("размер  " + f1.length() + " байт ");
    }
}
