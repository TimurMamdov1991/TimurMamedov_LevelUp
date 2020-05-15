package homework_number.task_2.Aircraft;

public abstract class Aircraft {

  protected String name;
  protected double range;
  protected double roominess;
  protected double cargo;



  public Aircraft(String name, double range, double roominess, double cargo) {
    this.name = name;
    this.range = range;
    this.roominess = roominess;
    this.cargo = cargo;
  }

  public Aircraft(String name, double range, double cargo) {
    this.name = name;
    this.range = range;
    this.cargo = cargo;
  }

  public double getRange() {
    return range;
  }
  public double getCargo() {
    return cargo;
  }
  public double getRoominess() {
    return roominess;
  }
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Aircraft{" +
            "name='" + name + '\'' +
            ", range=" + range +
            ", roominess=" + roominess +
            ", cargo=" + cargo +
            '}';
  }
}
