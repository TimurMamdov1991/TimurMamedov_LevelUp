package homework_number.task_3.CalculatorFunction.Trigonometry;

import homework_number.task_3.CalculatorFunction.BaseDataProvider.BaseDataProvider;
import homework_number.task_3.CalculatorFunction.TestBase;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorCosTest extends TestBase {
  @Test(dataProviderClass = BaseDataProvider.class, dataProvider = "cosDataProvider")
  public void testCos(double a, double expected) {
    System.out.println("Test testCos: " + a  +  " = " + expected);
    assertEquals(calculator.cos(a), expected);
  }
}
