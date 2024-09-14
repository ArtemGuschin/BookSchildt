package Artem.javacore.chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;

        }catch (ArithmeticException e ){
            System.out.println("Деление на нуль");
        }catch (Exception e){
            System.out.println("Перехват тсключений общего класса Exception  ");
        }
    }
}
