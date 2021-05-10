package hmjc.hm11;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Ошибка деление на 0");
            return 0;
        }
    };
    Predicate<Integer> isPositive = x -> x > 0;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> isPositive.test(x) ? x : x * -1;
    //нехватало скобок на условном операторе или заменить на  isPositive.test(x)


    Consumer<Object> println = System.out::println;

}
