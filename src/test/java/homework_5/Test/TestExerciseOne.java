package homework_5.Test;

import homework_5.TestBase;
import org.testng.annotations.Test;

public class TestExerciseOne extends TestBase {


  @Test
  public void testCreateMessageOne() {
    // Авторизация
    autoPage.login (MAIL_LOGIN, MAIL_PASSWORD);
    baseMailPage.assertWriteEmail (); //Проверка на авторизацию
    // Удалить все письма
    baseMailPage.deleteAll ();
    // Написать письмо
    baseMailPage.writeEmail();
    // Заполнение сообщения
    messagePage.createMessage(MAIL_LOGIN, MAIL_TOPIC, MAIL_BODY);
    // Сохранить
    messagePage.save();
    //Закрыть сообщение
    messagePage.close();
    // Открыть черновик
    baseMailPage.draft();
    baseMailPage.assertMail();// Проверка на письмо в черновике
    // Открыть письмо в черновик
    baseMailPage.openDraft();
    messagePage.assertEmail(); // Проверка содержимого письма
    // Отправить письмо
    messagePage.send();
    // Закрыть оповещение
    messagePage.closeMessage();
    baseMailPage.assertSendEmail();// Проверка, что письмо исчезло из черновиков
    // Отправленные сообщения
    baseMailPage.sendEmail();
    baseMailPage.assertMail();// Проверка на письмо в отправленых
    autoPage.logout ();
  }
}