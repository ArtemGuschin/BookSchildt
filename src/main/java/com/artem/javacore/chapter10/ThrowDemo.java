package com.artem.javacore.chapter10;

public class ThrowDemo {
    static void demoProc(){
        try {
            throw new NullPointerException("демонстрация");
        }catch (NullPointerException e ){
            System.out.println("Исключение перехвачено в теле  метода demoProc() ");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        }catch (NullPointerException e ){
            System.out.println("Повторный перхват " + e );
        }
    }
}
