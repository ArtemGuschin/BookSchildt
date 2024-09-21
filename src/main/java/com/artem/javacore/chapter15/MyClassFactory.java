package com.artem.javacore.chapter15;

interface MyFuncFactory<R, T> {
    R func(T n);
}

public class MyClassFactory<T> {
    private T val;

    MyClassFactory(T v) {
        val = v;
    }

    MyClassFactory() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

class MyClassF {
    String str;

    MyClassF(String s) {
        str = s;

    }

    MyClassF() {
        str = "";
    }

    String getVal() {
        return str;
    }
}

class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFuncFactory<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFuncFactory<MyClassFactory<Double>, Double> myClassCons = MyClassFactory<Double>::new;
        MyClassFactory<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("Значение val в обьекте mc равно " + mc.getVal());
    }
}
