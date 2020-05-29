package homework_number.task_3.CalculatorFunction.Trigonometry;

import homework_number.task_3.CalculatorFunction.BaseDataProvider.BaseDataProvider;
import homework_number.task_3.CalculatorFunction.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorSinTest extends TestBase {
  @Test(dataProviderClass = BaseDataProvider.class, dataProvider = "SinDataProvider")
  public void testSin(double a, double expected)
  {
    System.out.println("Test testSin: " + a  +  " = " + expected);
    assertEquals (calculator.sin(a), expected);
  }
}
