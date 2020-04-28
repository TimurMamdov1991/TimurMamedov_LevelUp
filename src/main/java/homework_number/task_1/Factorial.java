package homework_number.task_1;

public class Factorial {
  public int compute(int num1){
    int Factor = 1;
    for (int i = 1; i <=num1; i ++){
      Factor = Factor*i;
    }
    return Factor;
  }

  public int computeTwo(int num2){
    int Factor = 1;
    for (int i = 1; i <=num2; i ++){
      Factor = Factor*i;
    }
    return Factor;
  }
}
