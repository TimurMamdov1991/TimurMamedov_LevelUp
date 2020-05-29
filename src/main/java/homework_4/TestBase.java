package homework_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.xpath;

public class TestBase {

  public WebDriver driver;
  public WebDriverWait wait;

  @BeforeMethod
  public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    wait = new WebDriverWait(driver, 10);
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://mail.ru/");
    login("test2020_test2020@mail.ru", "rtewty23467");


    // Удаление из "Входящие"
    if (!driver.findElement(xpath("//a[@href='/inbox/']")).getAttribute("title").equals("Входящие, нет писем")){
      wait.until(ExpectedConditions.elementToBeClickable(xpath("//div[@class='nav__folder-name__txt'][text()='Входящие']"))).click();
      wait.until(ExpectedConditions.elementToBeClickable(className("button2__explanation"))).click();
      wait.until(ExpectedConditions.elementToBeClickable(xpath("//span[@title='Удалить']"))).click();
      wait.until(ExpectedConditions.elementToBeClickable(xpath("//div[@class='layer__submit-button']//span[@class='button2__txt'][text()='Очистить']"))).click();
    }
    // Удаление из "Тест"
    if (!driver.findElement(xpath("//a[@href='/1/']")).getAttribute("title").equals("Тест, нет писем")){
      wait.until(ExpectedConditions.elementToBeClickable(xpath("//div[@class='nav__folder-name__txt'][text()='Тест']"))).click();
      wait.until(ExpectedConditions.elementToBeClickable(className("button2__explanation"))).click();
      wait.until(ExpectedConditions.elementToBeClickable(xpath("//span[@title='Удалить']"))).click();
    }
    // Удаление из "Отправленные"
    if (!driver.findElement(xpath("//a[@href='/sent/']")).getAttribute("title").equals("Отправленные, нет писем")){
      wait.until(ExpectedConditions.elementToBeClickable(xpath("//div[@class='nav__folder-name__txt'][text()='Отправленные']"))).click();
      wait.until(ExpectedConditions.elementToBeClickable(className("button2__explanation"))).click();
      wait.until(ExpectedConditions.elementToBeClickable(xpath("//span[@title='Удалить']"))).click();
    }
    // Удаление из "Черновики"
    if (!driver.findElement(xpath("//a[@href='/drafts/']")).getAttribute("title").equals("Черновики, нет писем")){
      wait.until(ExpectedConditions.elementToBeClickable(xpath("//div[@class='nav__folder-name__txt'][text()='Черновики']"))).click();
      wait.until(ExpectedConditions.elementToBeClickable(className("button2__explanation"))).click();
      wait.until(ExpectedConditions.elementToBeClickable(xpath("//span[@title='Удалить']"))).click();
    }
    // Удаление из "Корзина"
    if (!driver.findElement(xpath("//a[@href='/drafts/']")).getAttribute("title").equals("Корзина, нет писем")){
      wait.until(ExpectedConditions.elementToBeClickable(xpath("//div[@class='nav__folder-name__txt'][text()='Корзина']"))).click();
      wait.until(ExpectedConditions.elementToBeClickable(className("button2__explanation"))).click();
      wait.until(ExpectedConditions.elementToBeClickable(xpath("//span[@title='Удалить']"))).click();
    }


  }

  @AfterMethod
  public void tearDown() {
    logout();
    driver.quit();
  }

  private void login(String name, String pass){
    driver.get("https://mail.ru/");
    driver.findElement (By.id ("mailbox:login")).click ();
    driver.findElement (By.id ("mailbox:login")).sendKeys (name);
    driver.findElement (By.id ("mailbox:submit")).click ();
    driver.findElement (By.id ("mailbox:password")).clear ();
    driver.findElement (By.id ("mailbox:password")).sendKeys (pass);
    driver.findElement (By.id ("mailbox:submit")).click ();
  }

  private void logout() {
    driver.findElement (By.id ("PH_logoutLink")).click ();
  }
}
