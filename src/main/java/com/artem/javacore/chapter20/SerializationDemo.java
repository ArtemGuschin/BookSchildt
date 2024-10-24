package com.artem.javacore.chapter20;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOStrm = new ObjectOutputStream(new FileOutputStream("serial"))) {
            MyClass object1 = new MyClass("Hello", -8, 2.7e10);
              System.out.println("object1" + object1);
            objectOStrm.writeObject(object1);


        } catch (IOException e) {
            System.out.println("Исключение при сериализации " + e);
        }
        try (ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass object2 = (MyClass) objIStrm.readObject();
            System.out.println("object2" + object2);
        } catch (Exception e) {
            System.out.println("Исключение при десириализации " + e);
            System.exit(0);
        }
    }
}

class MyClass implements Serializable {
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }
}

