package com.artem.javacore.chapter13;

public class NativeDemo {
    int i;

    public static void main(String[] args) {
        NativeDemo ob = new NativeDemo();
        ob.i = 10;
        System.out.println("Содержимое переменной ob.i перед вызовом платформенно оринтированного метода " + ob.i);
        ob.test();
        System.out.println("Содержимое переменной ob.i после  вызовом платформенно оринтированного метода " + ob.i);
    }
    public native void test();
    static {
        System.loadLibrary("NativeDemo");
    }
}
