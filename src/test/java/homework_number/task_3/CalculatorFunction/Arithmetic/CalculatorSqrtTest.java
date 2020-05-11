package homework_number.task_3.CalculatorFunction.Arithmetic;

import homework_number.task_3.CalculatorFunction.BaseDataProvider.BaseDataProvider;
import homework_number.task_3.CalculatorFunction.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorSqrtTest extends TestBase {

  @Test(dataProviderClass = BaseDataProvider.class, dataProvider = "sqrtProvider")
  public void testSqrt(double a, double expected) {
    System.out.println("Test testSqrt: " + a +  " = " + expected);
    assertEquals(calculator.sqrt (a), expected);
  }
}
