package homework_4.Test;

import homework_4.Step.StepMail;
import org.testng.annotations.Test;

public class TestExerciseTwo extends StepMail {

  @Test
  public void testTwo(){
    writeEmail ();  // Написать письмо
    createMessage("test2020_test2020@mail.ru", "Тест", "Давай пиши быстрее тест"); // Заполнение параметров письма
    send(); // Отправить письмо
    closeEmailDraft();
    sendEmail(); // Переход в отправленые письма
    assertDraftTest();// Проверка на письмо (отправленные)
    testEmail(); // переход в папку тест
    assertDraftTest();  // проверка письма в папке тест
    openDraftTest(); //переход в письмо
    assertEmailTest(); // проверка содержимого письма
  }
}
