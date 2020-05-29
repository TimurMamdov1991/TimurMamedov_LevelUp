package homework_number.task_3.CalculatorFunction.Trigonometry;

import homework_number.task_3.CalculatorFunction.BaseDataProvider.BaseDataProvider;
import homework_number.task_3.CalculatorFunction.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorCtgTest extends TestBase {
  @Test(dataProviderClass = BaseDataProvider.class, dataProvider = "ctgDataProvider")
  public void testCtg(double a, double expected)
  {
    System.out.println("Test testCtg: " + a  +  " = " + expected);
    assertEquals (calculator.ctg(a), expected);
  }
}
