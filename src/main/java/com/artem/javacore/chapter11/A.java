package com.artem.javacore.chapter11;

public class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();

        System.out.println(name + "Вошел в метод A.foo()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Класс A прерван" + e);
        }
        System.out.println(name + "Пытаестя вызвать метод B.last()");
        b.last();
    }
    synchronized void last(){
        System.out.println("В методе A.last()");

    }

}
class B{
    synchronized void bar(A a){
        String  name = Thread.currentThread().getName();
        System.out.println(name + "вошео в метод  B.bar()");

        try {
            Thread.sleep(1000);
        }catch (Exception e ){
            System.out.println("Класс B прерван ");
        }
        System.out.println(name + "пытается вызвать метод A.last()");
        a.last();
    }
    synchronized void last(){
        System.out.println("В методе A.last()");


    }
}
class DeadLock implements Runnable{
    A a = new A();
    B b = new B();

    DeadLock(){
        Thread.currentThread().setName("Главный поток ");
        Thread t = new Thread(this,"Соперничающий поток ");
        t.start();
        a.foo(b);
        System.out.println("назад в главный  поток");
    }
    public void run(){
        b.bar(a);
        System.out.println("Назад в другой поток");

    }

    public static void main(String[] args) {
        new DeadLock();
    }


}
