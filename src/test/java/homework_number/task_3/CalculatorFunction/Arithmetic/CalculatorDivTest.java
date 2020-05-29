package homework_number.task_3.CalculatorFunction.Arithmetic;

import homework_number.task_3.CalculatorFunction.BaseDataProvider.BaseDataProvider;
import homework_number.task_3.CalculatorFunction.TestBase;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorDivTest extends TestBase {
  @Test(dataProviderClass = BaseDataProvider.class, dataProvider = "divDataProvider")
  public void testDiv(long a, long b, long expected) {
    System.out.println ("Test testDiv: " + a + " / " + b + " = " + expected);
    assertEquals (calculator.div (a, b), expected);
  }


  @Test(dataProviderClass = BaseDataProvider.class, dataProvider = "divDoubleDataProvider")
  public void testDivDouble(double a, double b, double expected) {
    System.out.println ("Test testDivDouble: " + a + " / " + b + " = " + expected);
    assertEquals (calculator.div (a, b), expected);
  }
}
