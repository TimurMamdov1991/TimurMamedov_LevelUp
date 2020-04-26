package homework_number.task_1;

public class Factorial {
  public int compute(int numOne){
    int Factor = 1;
    for (int i = 1; i <=numOne; i ++){
      Factor = Factor*i;
    }
    return Factor;
  }

  public int computeTwo(int numTwo){
    int Factor = 1;
    for (int i = 1; i <=numTwo; i ++){
      Factor = Factor*i;
    }
    return Factor;
  }
}
