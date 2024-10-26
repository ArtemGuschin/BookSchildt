package com.artem.javacore.chapter28;

import java.util.concurrent.Semaphore;

public class Q {
    int n;

    static Semaphore semCom = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);

    void get() {
        try {
            semCom.acquire();
        } catch (InterruptedException e) {
            System.out.println("Перехвачено исключение типа InterruptedException");
        }
        System.out.println("Получено " + n);
        semProd.release();


    }

    void put(int n) {
        try {
            semProd.acquire();
        } catch (InterruptedException e) {
            System.out.println("Перехвачено исключение типа InterruptedException");
        }
        this.n = n;
        System.out.println("Отправлено " + n);
        semCom.release();

    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Постовщик ").start();
    }

    public void run() {
        for (int i = 0; i < 20; i++) q.put(i);
    }
}


class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }

    public void run() {
        for (int i = 0; i < 20; i++) q.get();


    }
}

class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Для остановки нажмите CTRL - C");
    }


}
