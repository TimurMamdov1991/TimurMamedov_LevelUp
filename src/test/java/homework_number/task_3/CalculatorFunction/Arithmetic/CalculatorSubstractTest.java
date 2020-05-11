package homework_number.task_3.CalculatorFunction.Arithmetic;

import homework_number.task_3.CalculatorFunction.BaseDataProvider.BaseDataProvider;
import homework_number.task_3.CalculatorFunction.TestBase;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorSubstractTest extends TestBase {

  @Test(dataProviderClass = BaseDataProvider.class, dataProvider = "testSubProvider")
  public void testSub(long a, long b, long expected) {
    System.out.println ("Test testSub: " + a + " - " + b + " = " + expected);
    assertEquals (calculator.sub (a, b), expected);
  }

 @Test(dataProviderClass = BaseDataProvider.class, dataProvider = "testSubDoubleProvider")
  public void testSubDouble(double a, double b, double expected) {
   System.out.println ("Test testSubDouble: " + a + " - " + b + " = " + expected);
   assertEquals(calculator.sub (a, b), expected);
  }

}
