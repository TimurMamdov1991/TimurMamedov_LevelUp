package homework_number.task_2.Aircraft.Passenger;

import homework_number.task_2.Aircraft.Aircraft;

public abstract class PassengerPlane extends Aircraft {
  public PassengerPlane(String name, double range, double roominess, double cargo) {
    super (name, range, roominess, cargo);
  }
}
