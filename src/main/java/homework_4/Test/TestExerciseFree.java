package homework_4.Test;


import homework_4.Step.StepMail;
import org.testng.annotations.Test;

public class TestExerciseFree extends StepMail {

  @Test
  public void testFree(){
    writeEmail ();  // Написать письмо
    createMessage("test2020_test2020@mail.ru", "приехали", "Давай пиши быстрее тест"); // Заполнение параметров письма
    send(); // Отправить письмо
    closeEmailDraft(); // Закрыть письмо
    inbox(); // Входящие > письма себе
    assertDraftTest(); // проверка на сообщение
    openDraftTest(); // открыть письмо
    assertInEmail();// проверить письмо
    delete(); // удалить письмо
    basket(); // перейти в корзину
    assertDraftTest(); //проверить пиьсом в корзине
  }


}
