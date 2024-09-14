package Artem.javacore.chapter10;

public class ChainExcDemo {
    static void demoProc() {
        NullPointerException e = new NullPointerException("верхний уровень ");

        e.initCause(new ArithmeticException("причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        }catch (NullPointerException e ){
            System.out.println("Вывести исключение верхнего уровня " + e);

            System.out.println("Вывести исключение первопричину " +e.getCause());
        }
    }
}
