package homework_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoPage extends BasePage {


  protected AutoPage(WebDriver driver) {
   super(driver);
  }

  // Логин
  @FindBy(id = "mailbox:login")
  private WebElement login;

  // Пароль
  @FindBy(id = "mailbox:password")
  private WebElement password;

  // "Ввод"
  @FindBy (id = "mailbox:submit")
  private WebElement submitButton;



  public void login(String name, String pass){
    login.sendKeys(name);
    submitButton.click();
    password.sendKeys(pass);
    submitButton.click();
  }

  @FindBy(id = "PH_logoutLink")
  private WebElement logout;

  public void logout() {
    logout.click();
  }
}
