package homework_number.task_2.Aircraft;

public class Boeing747 extends Aircraft {

  public Boeing747(String name, double range, double roominess, double cargo) {
    super(name, range, roominess, cargo);
  }

  @Override
  public String toString() {
    return "Boeing747{" +
            "name='" + name + '\'' +
            ", range=" + range +
            ", roominess=" + roominess +
            ", cargo=" + cargo +
            '}';
  }
}