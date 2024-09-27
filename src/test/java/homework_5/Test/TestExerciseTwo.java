package homework_5.Test;

import homework_5.TestBase;
import org.testng.annotations.Test;

public class TestExerciseTwo extends TestBase {

  @Test
  public void testCreateMessageTwo(){
    // Авторизация
    autoPage.login (MAIL_LOGIN, MAIL_PASSWORD);
    baseMailPage.assertWriteEmail (); //Проверка на авторизацию
    // Удалить все письма
    baseMailPage.deleteAll ();
    // Написать письмо
    baseMailPage.writeEmail();
    // Заполнение сообщения
    messagePage.createMessage(MAIL_LOGIN, MAIL_TOPIC_TEST, MAIL_BODY);
    // Отправить письмо
    messagePage.send();
    // Закрыть оповещение
    messagePage.closeMessage();
    // Переход в отправлениые письма
    baseMailPage.sendEmail();
    baseMailPage.assertMail(); // Проверка на содержание письма
    // Переход в папку тест
    baseMailPage.testEmail();
    baseMailPage.assertMail(); // Проверка на содержание письма
    //открыть письмо
    baseMailPage.openDraftTest();
    messagePage.assertEmailTest(); // Проверка содержимого письма
    // Выйти из аккаунта
    autoPage.logout ();
  }
}
