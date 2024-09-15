package Artem.javacore.chapter15;

interface MyNumber {
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.45;
        System.out.println("Фиксированное значение " + myNum.getValue());

        myNum = () -> Math.random() * 100;
        System.out.println("Случайное значени  " + myNum.getValue());
        System.out.println(" Еще одно случайное значени  " + myNum.getValue());
    }
}
