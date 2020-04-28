package homework_number.task_1;

public class Fibonacci {
  public int compute(int num1) {
    int n0 = 1;
    int n1 = 1;
    int n2 = 0;
    System.out.print(n0+" "+n1+" ");

    for(int i = 3; i <= num1; i++){
      n2=n0+n1;
      System.out.print(n2+" ");
      n0=n1;
      n1=n2;
    }
    System.out.println();
    return n2;
  }


  public int computeTwo(int num2) {
    int n0 = 1;
    int n1 = 1;
    int n2 = 0;
    System.out.print(n0+" "+n1+" ");

    for(int i = 3; i <= num2; i++){
      n2=n0+n1;
      System.out.print(n2+" ");
      n0=n1;
      n1=n2;
    }
    System.out.println();
    return n2;
  }
}