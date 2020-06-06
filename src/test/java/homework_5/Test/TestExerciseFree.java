package homework_5.Test;

import homework_5.TestBase;
import org.testng.annotations.Test;

public class TestExerciseFree extends TestBase {

  @Test
  public void testCreateMessageFree(){
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
    // Открыть входящие
    baseMailPage.inBoxEmail();
    //открыть Письма себе
    baseMailPage.openInboxMail();
    baseMailPage.assertInBoxMail();//    проверка письма
    //Перейти "Письма себе"
    baseMailPage.openDraftTest();
    messagePage.assertEmailTest(); // Проверка содержимого письма
    //Удалить сообщение
    messagePage.deleteMessage();
    //Переход в папку корзина
    baseMailPage.basket();
    baseMailPage.assertInBoxMail();// Проверка на письма*/
    //Выход
    autoPage.logout ();
  }
}
