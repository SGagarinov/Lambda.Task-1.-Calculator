package main;

import java.util.function.*;

public class Calculator {
    //функциональный интерфейс
    static Supplier<Calculator> instance = Calculator::new;

    //математические операции над двумя числами
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;
    //исправленная версия (возвращаем x, если деление на 0)
    BinaryOperator<Integer> devideFix = (x, y) -> (y == 0) ? x : x / y;

    //математические операции над одним числом
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    //Определение положительного числа
    Predicate<Integer> isPositive = x -> x > 0;

    //вывод в консоль
    Consumer<Integer> println = System.out::println;


}
