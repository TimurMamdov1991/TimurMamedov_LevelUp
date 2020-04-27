package homework_number.task_2.Aircraft;

public class Mi_171A2 extends Aircraft {
  public Mi_171A2(String name, double range, double roominess, double cargo) {
    super(name, range, roominess, cargo);
  }

  @Override
  public String toString() {
    return "Mi_171A2{" +
            "name='" + name + '\'' +
            ", range=" + range +
            ", roominess=" + roominess +
            ", cargo=" + cargo +
            '}';
  }
}
