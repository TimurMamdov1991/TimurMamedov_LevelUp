package homework_4.Test;


import homework_4.Step.StepMail;
import org.testng.annotations.Test;

public class TestExerciseOne extends StepMail {

  @Test
  public void testOne() {
    writeEmail ();  // Написать письмо
    createMessage ("Mokoto1991@yandex.ru", "test1", "Давай пиши быстрее тест"); // Заполнение параметров письма
    save (); // Сохранить
    close (); // Закрыть сохраненное сообщение
    draft (); // Черновики
    assertDraft (); // Проверка на письмо в черновике
    openDraft (); // Выбор нашего письма
    assertEmail (); // Проверка содержмиого
    send (); // Отправить письмо
    closeEmailDraft (); //Закрыть оповещение об отправке
    assertSendEmail (); // Проверка, что письмо исчезло из черновиков
    sendEmail (); // Переход в отправленые письма
    assertDraft (); // Проверка на письмо (отправленные)
  }

}
