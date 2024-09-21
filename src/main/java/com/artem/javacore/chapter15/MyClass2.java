package com.artem.javacore.chapter15;

interface MyFunc2 {
    MyClass2 func(int n);

}

public class MyClass2 {
    private int val;

    MyClass2(int v) {
        val = v;
    }

    MyClass2() {
        val = 0;
    }

    int getVal() {
        return val;
    }

}

class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc2 myClassCons = MyClass2::new;
        MyClass2 mc = myClassCons.func(100);

        System.out.println("Значение val в обьекте mc равно " + mc.getVal());
    }
}
