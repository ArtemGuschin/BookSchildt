package com.artem.javacore.chapter11;

public class NewThread1 implements Runnable{
    String name;
    Thread t;
    boolean suspendFlag;


    NewThread1(String threadname){
        name = threadname;
        t = new Thread(this,name);
        System.out.println("Новый поток " +t);
        suspendFlag = false;
        t.start();


    }
    public void run(){
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " +i );
                Thread.sleep(200);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        }catch (InterruptedException e){
            System.out.println(name + "прерван");
        }
        System.out.println(name + "Завершен");
    }
    synchronized void mysuspend(){
        suspendFlag = true;
    }
    synchronized void myresume(){
        suspendFlag = false;
        notify();
    }
}
class SuspendResume{
    public static void main(String[] args) {
        NewThread1 ob1 = new NewThread1("Один");
        NewThread1 ob2 = new NewThread1("Два");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Приостановка потока один");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Возобновление потока один");
            ob2.mysuspend();
            System.out.println("Приостановка потока один");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Возобновление потока Два ");
        }catch (InterruptedException e){
            System.out.println("Главный поток преван ");
        }
        try {
            System.out.println("Ожидание завершения потоков");
            ob1.t.join();
            ob2.t.join();
        }catch (InterruptedException e ){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Гдавгый поток завершен");


    }
}
