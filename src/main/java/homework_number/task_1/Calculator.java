package homework_number.task_1;

import java.util.Locale;
import java.util.Scanner;


public class Calculator {

  public static Scanner sc = new Scanner (System.in).useLocale(Locale.US);

  public static void main(String[] args) {

    Calculator calc = new Calculator ();
    calc.calculate ();
  }

  public void calculate() {

    Number num = new Number ();
    Addition addition = new Addition ();
    Subtraction subtraction = new Subtraction ();
    Multiplication multiplication = new Multiplication ();
    Exponentiation exponentiation = new Exponentiation ();
    Factorial factorial = new Factorial ();
    Fibonacci fibonacci = new Fibonacci ();

    System.out.println ("Введите первое число:");
    if (sc.hasNextInt ()) {
      num.setNumOne (sc.nextInt ());
    } else {
      num.setNumOne (sc.nextDouble ());
    }

    System.out.println ("Введите второе число:");
    if (sc.hasNextInt ()) {
      num.setNumTwo (sc.nextInt ());
    } else {
      num.setNumTwo (sc.nextDouble ());
    }

    System.out.println ("+\n-\n*\nn Возведение в степень\nfa Факториал\nfi Фибаначи");



    switch (sc.next()) {
      case "+":
        System.out.println ("Результат сложения: ");
        System.out.println (addition.calcAddition (num.getDoubleNumOne (), num.getDoubleNumTwo ()));
        break;
      case "-":
        System.out.println ("Результат вычитания: ");
        System.out.println (subtraction.calcSubtraction (num.getIntNumOne (), num.getIntNumTwo ()));
        break;
      case "*":
        System.out.println ("Результат умножения: ");
        System.out.println (multiplication.calcMultiplication (num.getDoubleNumOne (), num.getDoubleNumTwo ()));
        break;
      case "n":
        System.out.println ("Результат возвездение в степень: ");
        if (num.getIntNumOne () != 0 && num.getIntNumTwo () != 0) {
          System.out.println (exponentiation.calcExponentiation (num.getIntNumOne ()));
          System.out.println (exponentiation.calcExponentiation (num.getIntNumTwo ()));
        } else {
          System.out.println (exponentiation.calcExponentiation (num.getDoubleNumOne ()));
          System.out.println (exponentiation.calcExponentiation (num.getDoubleNumTwo ()));
        }
        break;
      case "fa":
        System.out.println ("Результат факториала числа: ");
        if (num.getIntNumOne () != 0 && num.getIntNumTwo () != 0) {
          System.out.println (factorial.calcFactorial (num.getIntNumOne ()));
          System.out.println (factorial.calcFactorialTwo (num.getIntNumTwo ()));
        }
        break;
      case "fi":
        System.out.println ("Результат Фиабонначи: ");
        if (num.getIntNumOne () != 0 && num.getIntNumTwo () != 0) {
          System.out.println (fibonacci.calcFibonacci (num.getIntNumOne ()));
          System.out.println (fibonacci.calcFibonacciTwo (num.getIntNumTwo ()));
        }
        break;
    }
  }
}