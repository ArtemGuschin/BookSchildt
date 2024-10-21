package com.artem.javacore.chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток исполнения " + t);

        t.setName("My thread ");
        System.out.println("После измения имени потока " + t);


        try {
            for (int n = 5; n > 0 ; n--) {
                System.out.println(n);
                Thread.sleep(1000);

            }
        }catch (InterruptedException e ){
            System.out.println("Главный поток испонения прерван ");
        }

    }

}
