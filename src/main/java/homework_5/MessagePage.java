package homework_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class MessagePage extends BasePage {

  protected MessagePage(WebDriver driver) {
    super (driver);
  }


  //Имя отправления
  @FindBy(xpath = "//div[@data-name='to']//input[@type='text']")
  private WebElement nameEmail;

  //Тема сообщения
  @FindBy(name = "Subject")
  private WebElement nameSubject;

  //Тело сообщения
  @FindBy(xpath = "//div[@aria-multiline='true']")
  private WebElement nameBody;

  // Сохранить сообщение
  @FindBy(xpath = "//div[@class='compose-app__footer']//span[text()='Сохранить']")
  private WebElement save;

  //Закрыть сообщение
  @FindBy(xpath = "//button[@title='Закрыть']")
  private WebElement close;

  //Отправить сообщение
  @FindBy(xpath = "//*[text()='Отправить']")
  private WebElement send;

  //Закрыть сообщение после отправки
  @FindBy(xpath = "//span[@title='Закрыть']")
  private WebElement closeMessage;

  //Удалить сообщение
  @FindBy(xpath = "//*[text()='Удалить']")
  private WebElement deleteMessage;

  public void createMessage(String email, String topic, String content) {
    nameEmail.sendKeys (email);
    nameSubject.sendKeys (topic);
    nameBody.sendKeys (content);
    System.out.println ("Заполнить адресат, тему письма и тело)");
  }

  public void send() {
    send.click ();
    System.out.println ("Отправить письмо");
  }

  public void closeMessage() {
    driver.findElement (By.xpath ("//span[@title='Закрыть']")).click ();
    System.out.println ("Закрыть оповещение)");
  }

  public void save() {
    save.click ();
    System.out.println ("Сохранене письма(добавление в черновик)");
  }

  public void close() {
      close.click ();
    System.out.println ("Закрыть сообщение)");
  }

  public void assertEmail() {
    assertEquals(driver.findElement (By.xpath ("//span[@class='text--1tHKB']")).getText (),"test2020_test2020@mail.ru");
    assertEquals(driver.findElement(By.xpath("//*[text()='приехали']")).getText(), "приехали");
    assertEquals(driver.findElement(By.xpath("//*[text()='Давай пиши быстрее тест']")).getText(), "Давай пиши быстрее тест");
    System.out.println ("Проверка содержимого в письме");
  }

  public void assertEmailTest() {
    assertEquals(driver.findElement (By.xpath ("//*[text()='Test2020 Test2020']")).getText (),"Test2020 Test2020");
    assertEquals(driver.findElement (By.xpath ("//*[text()='Тест']")).getText (),"Тест");
    assertEquals(driver.findElement(By.xpath("//*[text()='Давай пиши быстрее тест']")).getText(), "Давай пиши быстрее тест");
    System.out.println ("Проверка содержимого в письме");
  }

  public void deleteMessage() {
    deleteMessage.click ();
  }
}
