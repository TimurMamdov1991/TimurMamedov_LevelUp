package homework_number.task_2.Aircraft;

public class Syma_Z3 extends Aircraft {
  public Syma_Z3(String name, double range, double cargo) {
    super (name, range, cargo);
  }

  @Override
  public String toString() {
    return "Syma_Z3{" +
            "name='" + name + '\'' +
            ", range=" + range +
            ", roominess=" + roominess +
            ", cargo=" + cargo +
            '}';
  }
}
