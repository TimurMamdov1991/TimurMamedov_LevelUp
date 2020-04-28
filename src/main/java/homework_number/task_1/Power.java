package homework_number.task_1;

public class Power {

  public int calcPower(int num, int power) {
    int result = 1;
    for (int i = 0; i < power; i++) {
      result *= num;
    }
    return result;
  }

  public double calcPower(double num, int power) {
    double result = 1.0;
    for (int i = 0; i < power; i++) {
      result *= num;
    }
    return result;
  }
}
