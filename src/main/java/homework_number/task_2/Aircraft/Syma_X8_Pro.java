package homework_number.task_2.Aircraft;

public class Syma_X8_Pro extends Aircraft {
  public Syma_X8_Pro(String name, double range, double cargo) {
    super (name, range, cargo);
  }

  @Override
  public String toString() {
    return "Syma_X8_Pro{" +
            "name='" + name + '\'' +
            ", range=" + range +
            ", roominess=" + roominess +
            ", cargo=" + cargo +
            '}';
  }
}
