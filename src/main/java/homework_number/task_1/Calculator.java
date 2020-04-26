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
    Degree degree = new Degree ();
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
        System.out.println (addition.fold (num.getDoubleNumOne (), num.getDoubleNumTwo ()));
        break;
      case "-":
        System.out.println ("Результат вычитания: ");
        System.out.println (subtraction.calcSubtraction (num.getIntNumOne (), num.getIntNumTwo ()));
        break;
      case "*":
        System.out.println ("Результат умножения: ");
        System.out.println (multiplication.multiplication (num.getDoubleNumOne (), num.getDoubleNumTwo ()));
        break;
      case "n":
        System.out.println ("Результат возвездение в степень: ");
        if (num.getIntNumOne () != 0 && num.getIntNumTwo () != 0) {
          System.out.println (degree.erect (num.getIntNumOne ()));
          System.out.println (degree.erectTwo (num.getIntNumTwo ()));
        } else {
          if (num.getDoubleNumOne () != 0.0 && num.getDoubleNumTwo () != 0.0) {
            System.out.println (Degree.erect (num.getDoubleNumOne ()));
            System.out.println (Degree.erectTwo (num.getDoubleNumTwo ()));
          }
        }
        break;
      case "fa":
        System.out.println ("Результат факториала числа: ");
        if (num.getIntNumOne () != 0 && num.getIntNumTwo () != 0) {
          System.out.println (factorial.compute (num.getIntNumOne ()));
          System.out.println (factorial.computeTwo (num.getIntNumTwo ()));
        }
        break;
      case "fi":
        System.out.println ("Результат Фиабонначи: ");
        if (num.getIntNumOne () != 0 && num.getIntNumTwo () != 0) {
          System.out.println (fibonacci.compute (num.getIntNumOne ()));
          System.out.println (fibonacci.computeTwo (num.getIntNumTwo ()));
        }
        break;
    }
  }
}