package com.artem.javacore.chapter15;

interface MyFuncArray<T> {
    int func(T[] valsArr, T v);


}

public class MyArrayOps {
    static <T> int countMatching(T[] valsArr, T v) {
        int count = 0;
        for (int i = 0; i < valsArr.length; i++)
            if (valsArr[i] == v) count++;
        return count;


    }
}

class GenericMethodRefDemo {
    static <T> int myOp(MyFuncArray<T> f, T[] valsArr, T v) {
        return f.func(valsArr, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 4, 5};
        String[] strs = {"Один", "Два", "Три", "Два"};
        int count;
        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("Массив vals содержит " + count + " числа 4");
        count = myOp(MyArrayOps ::<String> countMatching,strs,"Два");
        System.out.println("Массив strs содержит 2 числа " + count +" Два");


    }
}
