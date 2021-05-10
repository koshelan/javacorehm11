package hmjc.hm11;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        calc.println.accept(a);
        int b = calc.minus.apply(1, 1);
        calc.println.accept(b);
        int c = calc.divide.apply(a, b); //ошибка деление на 0 (b получет результат на предыдущем шаге 0)
        //решения: обработка исключений или проверка делителя на 0
        calc.println.accept(c);

        int m = calc.multiply.apply(3, 5);
        calc.println.accept(m);
        int d = calc.abs.apply(m * (-2));
        calc.println.accept(d);
        int p = calc.pow.apply(a);
        calc.println.accept(p);
        boolean i = calc.isPositive.test(m * (-2));
        calc.println.accept(i);

    }

}
