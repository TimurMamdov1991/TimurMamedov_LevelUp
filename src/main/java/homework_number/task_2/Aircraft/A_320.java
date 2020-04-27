package homework_number.task_2.Aircraft;

public class A_320 extends Aircraft {

  public A_320(String name, double range, double roominess, double cargo) {
    super(name, range, roominess, cargo);
  }

  @Override
  public String toString() {
    return "A_320{" +
            "name='" + name + '\'' +
            ", range=" + range +
            ", roominess=" + roominess +
            ", cargo=" + cargo +
            '}';
  }
}
