package homework_number.task_1;

public class Factorial {
  public int calcFactorial(int numOne){
    int Factor = 1;
    for (int i = 1; i <=numOne; i ++){
      Factor = Factor*i;
    }
    return Factor;
  }

  public int calcFactorialTwo(int numTwo){
    int Factor = 1;
    for (int i = 1; i <=numTwo; i ++){
      Factor = Factor*i;
    }
    return Factor;
  }
}
