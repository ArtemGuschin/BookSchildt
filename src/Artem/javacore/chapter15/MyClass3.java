package Artem.javacore.chapter15;

interface MyFunc3<T> {
    MyClass3<T> func(T n);
}

public class MyClass3<T> {
    private T val;

    MyClass3(T v) {
        val = v;
    }

    MyClass3() {
        val = null;
    }

    T getVal() {
        return val;
    }

}

class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc3<Integer> myClassCons = MyClass3<Integer>::new;

        MyClass3<Integer> mc = myClassCons.func(100);

        System.out.println("Значение val в обьекте равно " + mc.getVal());
    }
}
