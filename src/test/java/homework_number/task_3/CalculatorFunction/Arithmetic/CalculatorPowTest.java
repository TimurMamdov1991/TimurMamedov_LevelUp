package homework_number.task_3.CalculatorFunction.Arithmetic;

import homework_number.task_3.CalculatorFunction.BaseDataProvider.BaseDataProvider;
import homework_number.task_3.CalculatorFunction.TestBase;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CalculatorPowTest extends TestBase {
  @Test(dataProviderClass = BaseDataProvider.class, dataProvider = "testPowProvider")
  public void testPow(double a, double b, double expected) {
    System.out.println("Test testPow: " + a + " ^ " + b + " = " + expected);
    assertEquals(calculator.pow(a,b), expected);
  }
}
