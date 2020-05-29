package homework_number.task_3.CalculatorFunction;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

public abstract class TestBase {

  protected Calculator calculator;

  @BeforeSuite
  public void setUpSuite(){
    System.out.println ("Before suite");
  }


  @BeforeMethod
  public void setUp(){
    System.out.println ("Before method");
    calculator = new Calculator();
  }





  @AfterMethod
  public void tearDown() {
    System.out.println ("After method");
    calculator = null;
  }


  @AfterSuite
  public void tearDownSuite(){
    System.out.println ("After suite");
  }
}
