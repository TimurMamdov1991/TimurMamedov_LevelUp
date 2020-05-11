package homework_number.task_3.CalculatorFunction.Arithmetic;

import homework_number.task_3.CalculatorFunction.BaseDataProvider.BaseDataProvider;
import homework_number.task_3.CalculatorFunction.TestBase;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorMultiplyTest extends TestBase {


  @Test(dataProviderClass = BaseDataProvider.class, dataProvider = "multiplyProvider")
  public void testPositiveMultiply(long a, long b, long expected) {
    System.out.println ("Test testMultiply: " + a + " * " + b + " = " + expected);
    assertEquals (calculator.mult (a, b), expected);
  }


  @Test(dataProviderClass = BaseDataProvider.class, dataProvider = "multiplyDoubleProvider")
  public void testPositiveMultiplyDouble(double a, double b, double expected) {
    System.out.println ("Test testMultiplyDouble: " + a + " * " + b + " = " + expected);
    assertEquals (calculator.mult (a, b), expected);
  }

}