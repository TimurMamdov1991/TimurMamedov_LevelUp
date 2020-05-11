package homework_number.task_3.CalculatorFunction.Negative_Positive;

import homework_number.task_3.CalculatorFunction.BaseDataProvider.BaseDataProvider;
import homework_number.task_3.CalculatorFunction.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTest extends TestBase {
  @Test(dataProviderClass = BaseDataProvider.class, dataProvider = "PositiveDataProvider")
  public void testPositiveData(long a, Boolean expectedResult)
  {
    System.out.println("Данное число положительное? " + a  +  " = " + expectedResult);
    Assert.assertTrue(calculator.isPositive(a), "Число отрицательное или равно 0");
  }
}
