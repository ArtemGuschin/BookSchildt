package Artem.javacore.chapter15;

interface StringFuncMethodRef {
    String func(String n);
}

public class MyStringOps {
    static String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}

class MethodRefDemo {
    static String stringOp(StringFuncMethodRef sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда выражения повышают эффективнось Java";
        String outStr;
        outStr = stringOp(MyStringOps::strReverse,inStr);

        System.out.println("Исходная строка " + inStr);
        System.out.println("Обращенная строка  " + outStr);

    }
}
