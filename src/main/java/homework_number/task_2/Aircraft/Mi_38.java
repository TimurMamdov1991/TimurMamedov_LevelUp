package homework_number.task_2.Aircraft;

public class Mi_38 extends Aircraft {
  public Mi_38(String name, double range, double roominess, double cargo) {
    super(name, range, roominess, cargo);
  }

  @Override
  public String toString() {
    return "Mi_38{" +
            "name='" + name + '\'' +
            ", range=" + range +
            ", roominess=" + roominess +
            ", cargo=" + cargo +
            '}';
  }
}
