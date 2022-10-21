package main;

public class Main {
    public static void main(String[] args) {
        //создаём объект
        Calculator calc = Calculator.instance.get();

        //Мат. операции
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        //int c = calc.devide.apply(a, b);
        //Ответ к задаче: проблема возникает из-за того, что b = 0 и соответственно получаем деление на 0
        int c = calc.devideFix.apply(a, b);
        //Вывод в консоль
        calc.println.accept(c);
    }
}
