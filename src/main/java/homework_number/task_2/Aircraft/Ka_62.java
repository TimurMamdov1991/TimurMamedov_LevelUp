package homework_number.task_2.Aircraft;

public class Ka_62 extends Aircraft {
        public Ka_62(String name, double range, double roominess, double cargo) {
          super(name, range, roominess, cargo);
        }

  @Override
  public String toString() {
    return "Ka_62{" +
            "name='" + name + '\'' +
            ", range=" + range +
            ", roominess=" + roominess +
            ", cargo=" + cargo +
            '}';
  }
}
