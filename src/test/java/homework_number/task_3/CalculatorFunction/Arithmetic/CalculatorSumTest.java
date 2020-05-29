package homework_number.task_3.CalculatorFunction.Arithmetic;

import homework_number.task_3.CalculatorFunction.BaseDataProvider.BaseDataProvider;
import homework_number.task_3.CalculatorFunction.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorSumTest extends TestBase {

  @Test (dataProviderClass = BaseDataProvider.class,dataProvider = "sumDataProvider")
  public void testPositiveSum(long a, long b, long expected) {
    System.out.println ("Test testPositiveSum: " + a + " + " + b + " = " + expected);
    assertEquals (calculator.sum(a, b), expected);
  }

  @Test (dataProviderClass = BaseDataProvider.class,dataProvider = "sumDoubleDataProvider")
  public void testPositiveSumDouble(double a, double b, double expected) {
    System.out.println ("Test testPositiveSumDouble: " + a + " + " + b + " = " + expected);
    assertEquals (calculator.sum(a, b), expected);
  }


}
