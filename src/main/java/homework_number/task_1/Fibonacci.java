package homework_number.task_1;

public class Fibonacci {
  public int compute(int numOne) {
    int n0 = 1;
    int n1 = 1;
    int n2 = 0;
    System.out.print(n0+" "+n1+" ");

    for(int i = 3; i <= numOne; i++){
      n2=n0+n1;
      System.out.print(n2+" ");
      n0=n1;
      n1=n2;
    }
    System.out.println();
    return n2;
  }


  public int computeTwo(int numTwo) {
    int n0 = 1;
    int n1 = 1;
    int n2 = 0;
    System.out.print(n0+" "+n1+" ");

    for(int i = 3; i <= numTwo; i++){
      n2=n0+n1;
      System.out.print(n2+" ");
      n0=n1;
      n1=n2;
    }
    System.out.println();
    return n2;
  }
}