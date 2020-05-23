package homework_4.Step;


import homework_4.TestBase;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertEquals;

public class StepMail extends TestBase {

  public void writeEmail() {
    driver.findElement (xpath ("//span[text()='Написать письмо']")).click ();
    System.out.println ("Клик на кнопку: Письмо");
  }

  public void createMessage(String email, String topic, String content) {
    driver.findElement (xpath ("//div[@data-name='to']//input[@type='text']")).sendKeys(email);
    driver.findElement (By.name ("Subject")).sendKeys(topic);
    driver.findElement (xpath ("//div[@aria-multiline='true']")).sendKeys(content);
    System.out.println ("Заполнить адресат, тему письма и тело)");
  }

  public void save() {
    driver.findElement (By.xpath("//div[@class='compose-app__footer']//span[text()='Сохранить']")).click ();
    System.out.println ("Сохранене письма(добавление в черновик)");
  }

  public void close() {
    driver.findElement(By.xpath("//button[@title='Закрыть']")).click();
    System.out.println ("Закрыть сообщение)");
  }

  public void draft() {
    driver.findElement (By.linkText ("Черновики")).click ();
    System.out.print ("Открыть черновики. ");
  }

  public void assertDraft() {
    String assertEmail = driver.findElement (By.xpath ("//*[text()='Mokoto1991@yandex.ru']")).getText ();
    assertEquals (assertEmail, "Mokoto1991@yandex.ru");
    System.out.println ("Проверка на письмо в черновке");
  }

  public void openDraft() {
    driver.findElement(By.xpath("//*[text()='Mokoto1991@yandex.ru']")).click();
    System.out.print ("Выбрать наше письмо ");
  }
  public void openDraftTest() {
    driver.findElement(By.xpath("//span[@title='Test2020 Test2020 <test2020_test2020@mail.ru>']")).click();
    System.out.print ("Выбрать наше письмо ");
  }


  public void assertEmail() {
    String assertEmail = driver.findElement (By.xpath ("//*[text()='Mokoto1991@yandex.ru']")).getText ();
    String assertTitle = driver.findElement(By.xpath("//*[text()='test1']")).getText();
    String assertBody = driver.findElement(By.xpath("//*[text()='Давай пиши быстрее тест']")).getText();
    assertEquals (assertEmail, "Mokoto1991@yandex.ru");
    assertEquals(assertTitle, "test1");
    assertEquals(assertBody, "Давай пиши быстрее тест");
    System.out.println ("Проверка содержимого в письме");
  }

  public void send() {
    driver.findElement(By.xpath("//*[text()='Отправить']")).click();
    System.out.println ("Отправить письмо");
  }

  public void closeEmailDraft(){
    driver.findElement (By.xpath ("//span[@title='Закрыть']")).click();
    System.out.println ("Закрыть оповещение)");
  }

  public void sendEmail() {
    driver.findElement (By.xpath ("//div[text()='Отправленные']")).click ();
    System.out.println ("Открыть Отправленные");
  }

  public void inbox() {
    driver.findElement (By.xpath ("//div[text()='Входящие']")).click ();
    driver.findElement (By.xpath("//div[@class='nav__folder-name__txt'][text()='Письма себе']")).click();
    System.out.println ("Открыть Входящие > Письма себе");
  }

  public void assertSendEmail() {
    assertEquals(driver.findElement(By.xpath("//span[@class='octopus__title']")).getText(), "У вас нет незаконченных\n" +
        "или неотправленных писем");
  }

  public void testEmail() {
    driver.findElement (By.xpath ("//div[text()='Тест']")).click ();
    System.out.println ("Открыть папку тест");
  }

  public void assertDraftTest() {
    String assertEmailTest = driver.findElement (By.xpath ("//*[text()='Давай пиши быстрее тест -- Test2020 Test2020']")).getText ();
    assertEquals (assertEmailTest, "Давай пиши быстрее тест -- Test2020 Test2020");

  }


  public void assertEmailTest() {
    assertEquals(driver.findElement (By.xpath ("//div[@class='letter__author']//*[text()='Test2020 Test2020']")).getText (), "Test2020 Test2020");
    assertEquals(driver.findElement(By.xpath("//h2[@class='thread__subject']")).getText(), "Тест");
    assertEquals(driver.findElement(By.xpath("//*[text()='Давай пиши быстрее тест']")).getText(), "Давай пиши быстрее тест");
    System.out.println ("Проверка содержимого в письме");
  }

  public void assertInEmail() {
    assertEquals(driver.findElement (By.xpath ("//div[@class='letter__author']//*[text()='Test2020 Test2020']")).getText (), "Test2020 Test2020");
    assertEquals(driver.findElement(By.xpath("//h2[@class='thread__subject']")).getText(), "приехали");
    assertEquals(driver.findElement(By.xpath("//*[text()='Давай пиши быстрее тест']")).getText(), "Давай пиши быстрее тест");
    System.out.println ("Проверка содержимого в письме");
  }

  protected void delete() {
    driver.findElement (By.xpath ("//*[text()='Удалить']")).click ();
  }

  public void basket(){
    driver.findElement (By.xpath ("//div[@class='nav__folder-name']//*[text()='Корзина']")).click ();
  }
}
