package homework_number.task_3.CalculatorFunction.Trigonometry;

import homework_number.task_3.CalculatorFunction.BaseDataProvider.BaseDataProvider;
import homework_number.task_3.CalculatorFunction.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTgTest extends TestBase {
  @Test(dataProviderClass = BaseDataProvider.class, dataProvider = "tgDataProvider")
  public void testTg(double a, double expected) {
    System.out.println("Test testTg: " + a  +  " = " + expected);
    assertEquals (calculator.tg(a), expected);
  }
}
