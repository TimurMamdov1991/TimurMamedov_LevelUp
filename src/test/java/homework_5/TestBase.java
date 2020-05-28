package homework_5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public abstract class TestBase {
  WebDriver driver;
  protected static final String BASE_URL = "https://mail.ru/";
  protected static final String MAIL_LOGIN = "test2020_test2020@mail.ru";
  protected static final String MAIL_PASSWORD = "rtewty23467";
  protected static final String MAIL_TOPIC = "приехали";
  protected static final String MAIL_BODY = "Давай пиши быстрее тест";
  protected static final String MAIL_TOPIC_TEST = "Тест";


  protected AutoPage autoPage;
  protected BaseMailPage baseMailPage;
  protected MessagePage messagePage;

  @BeforeClass
  public void beforeClass(){
    WebDriverManager.chromedriver().setup();

  }

  @BeforeMethod
  public void setUp(){
    driver = new ChromeDriver ();
    autoPage = new AutoPage (driver);
    baseMailPage = new BaseMailPage (driver);
    messagePage = new MessagePage (driver);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get(BASE_URL);
  }

  @AfterMethod
  public void tearDown() {
    driver.quit();
  }

}
