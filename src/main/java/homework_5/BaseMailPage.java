package homework_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class BaseMailPage extends BasePage {

  protected BaseMailPage(WebDriver driver) {
    super (driver);
  }

  @FindBy(xpath = "//a[@href='/inbox/']")
  private WebElement inBox;

  @FindBy(xpath = "//div[@class='nav__folder-name__txt'][text()='Входящие']")
  private WebElement inMail;

  @FindBy(className = "mb-checkbox__input")
  private WebElement checkBox;

  @FindBy(xpath = "//span[@title='Удалить']")
  private WebElement delete;

  @FindBy(xpath = "//div[@class='layer__submit-button']//span[@class='button2__txt'][text()='Очистить']")
  private WebElement clean;

  @FindBy(xpath = "//span[@title='Выделить все']")
  private WebElement selectAll;

  @FindBy(xpath = "//a[@href='/1/']")
  private WebElement testBox;

  @FindBy(xpath = "//div[@class='nav__folder-name__txt'][text()='Тест']")
  private WebElement testMail;


  @FindBy(xpath = "//a[@href='/sent/']")
  private WebElement sendBox;

  @FindBy(xpath = "//div[@class='nav__folder-name__txt'][text()='Отправленные']")
  private WebElement sendMail;

  @FindBy(xpath = "//a[@href='/drafts/']")
  private WebElement draftBox;

  @FindBy(xpath = "//div[@class='nav__folder-name__txt'][text()='Черновики']")
  private WebElement draftMail;

  @FindBy(xpath = "//a[@href='/trash/']")
  private WebElement trashBox;

  @FindBy(xpath = "//div[@class='nav__folder-name__txt'][text()='Корзина']")
  private WebElement trashMail;

  @FindBy(xpath = "//span[text()='Написать письмо']")
  private WebElement writeEmail;

  @FindBy(xpath = "//span[@class='ll-crpt']")
  private WebElement openDraft;

  @FindBy(xpath = "//div[@class='nav__folder-name']//*[text()='Корзина']")
  private WebElement basket;

  public void openDraftTest() {
    driver.findElement (By.xpath ("//span[@title='Test2020 Test2020 <test2020_test2020@mail.ru>']")).click ();
    System.out.print ("Выбрать наше письмо ");
  }

  public void assertWriteEmail() {
    assertEquals (writeEmail.getText (), "Написать письмо");
  }

  public void deleteAll() {
    deleteInBox ();
    deleteTestBox ();
    deleteSendBox ();
    deleteDraftBox ();
    deleteTrashBox ();
  }


  // Удалить входящие
  public void deleteInBox() {
    if (!inBox.getAttribute ("title").equals ("Входящие, нет писем")) {
      inMail.click ();
      checkBox.click ();
      delete.click ();
      clean.click ();
    }
  }

  // Удаление из "Тест"
  public void deleteTestBox() {
    if (!testBox.getAttribute ("title").equals ("Тест, нет писем")) {
      testMail.click ();
      selectAll.click ();
      delete.click ();
    }
  }

  // Удаление из "Отправленные"
  public void deleteSendBox() {
    if (!sendBox.getAttribute ("title").equals ("Отправленные, нет писем")) {
      sendMail.click ();
      selectAll.click ();
      delete.click ();

    }
  }

  // Удаление из "Черновики"
  public void deleteDraftBox() {
    if (!draftBox.getAttribute ("title").equals ("Черновики, нет писем")) {
      draftMail.click ();
      selectAll.click ();
      delete.click ();
    }
  }

  // Удаление из "Корзина"
  public void deleteTrashBox() {
    if (!trashBox.getAttribute ("title").equals ("Корзина, нет писем")) {
      trashMail.click ();
      selectAll.click ();
      delete.click ();
    }
  }

  public void writeEmail() {
    writeEmail.click ();
    System.out.println ("Клик на кнопку: Написать письмо");
  }

  public void draft() {
    draftMail.click ();
    System.out.print ("Открыть черновики. ");
  }

  public void openDraft() {
    openDraft.click ();
    System.out.print ("Выбрать наше письмо ");
  }

  public void sendEmail() {
    sendMail.click ();
    System.out.print ("Отправить письмо");
  }

  public void assertMail() {
    assertEquals (driver.findElement (By.xpath ("//span[@class='ll-crpt']")).getText (), "Test2020 Test2020");
    System.out.println ("Проверка на письмо");
  }

  public void assertInBoxMail() {
    assertEquals(driver.findElement(By.xpath("//*[text()='приехали']")).getText(), "приехали");
      System.out.println ("Проверка на письмо");
  }

  public void assertSendEmail() {
    assertEquals (driver.findElement (By.xpath ("//span[@class='octopus__title']")).getText (), "У вас нет незаконченных\n" +
        "или неотправленных писем");
  }

 public void openInboxMail() {
  driver.findElement(By.xpath("//*[text()='приехали']")).click ();
   System.out.println ("Проверка на письмо");
  }

  public void testEmail() {
    testBox.click ();
    System.out.println ("Открыть папку тест");
  }

  public void inBoxEmail() {
    inBox.click ();
    System.out.println ("Открыть папку тест");
  }

  public void basket(){
    basket.click ();
  }

}
