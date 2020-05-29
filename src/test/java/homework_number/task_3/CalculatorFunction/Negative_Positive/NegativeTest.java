package homework_number.task_3.CalculatorFunction.Negative_Positive;

import homework_number.task_3.CalculatorFunction.BaseDataProvider.BaseDataProvider;
import homework_number.task_3.CalculatorFunction.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest extends TestBase {
  @Test(dataProviderClass = BaseDataProvider.class, dataProvider = "NegativeDataProvider")
  public void testNegativeData(long a, Boolean expectedResult)
  {
    System.out.println("Данное число отрицательное? " + a  +  " = " + expectedResult);
    Assert.assertTrue(calculator.isNegative(a), "Число положительное или равно 0");
  }
}
