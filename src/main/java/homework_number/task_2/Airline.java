package homework_number.task_2;

import homework_number.task_2.Aircraft.Aircraft;
import homework_number.task_2.Aircraft.Cargo.CargoAirPlane;
import homework_number.task_2.Aircraft.Cargo.CargoGyrocopterPlane;
import homework_number.task_2.Aircraft.Cargo.CargoHelicopterPlan;
import homework_number.task_2.Aircraft.Cargo.CargoPlane;
import homework_number.task_2.Aircraft.Passenger.PassengerAirPlane;
import homework_number.task_2.Aircraft.Passenger.PassengerHelicopterPlane;
import homework_number.task_2.Aircraft.Passenger.PassengerPlane;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Airline {
  public static void main (String[] args) {


    CargoPlane T1 = new CargoAirPlane ("T1", 5000,4000);
    CargoPlane T2 = new CargoAirPlane("T2", 10000, 8000);

    CargoPlane Mi_171A2 = new CargoHelicopterPlan ("Mi_171A2", 2500, 2000);
    CargoPlane Mi_38 = new CargoHelicopterPlan ("Mi_38",3500, 1000);

    CargoPlane Syma_X8_Pro = new CargoGyrocopterPlane("Syma_X8_Pro", 250, 3);
    CargoPlane Syma_Z3 = new CargoGyrocopterPlane("Syma_Z3", 150, 1);


    PassengerPlane A_320 = new PassengerAirPlane ("Пассажирский самолет 1", 2500,750, 250000);
    PassengerPlane Boeing747 = new PassengerAirPlane("Пассажирский самолет 2", 6000, 800, 500000);

    PassengerPlane Ka_62 = new PassengerHelicopterPlane ("Ka_62", 1000, 6, 250);
    PassengerPlane Ka_63 = new PassengerHelicopterPlane("Ka_63", 1500, 8, 300);



    List<PassengerPlane> passengerAirPark;
    passengerAirPark = Arrays.asList(Ka_62,Ka_63,A_320,Boeing747);

    List<CargoPlane> cargoAirPark;
    cargoAirPark = Arrays.asList(T1,T2,Mi_171A2,Mi_38,Syma_X8_Pro,Syma_Z3);

    List<Aircraft> airline = new ArrayList<> ();
    airline.add(T1);
    airline.add(T2);
    airline.add(Mi_171A2);
    airline.add(Mi_38);
    airline.add(Syma_X8_Pro);
    airline.add(Syma_Z3);
    airline.add(A_320);
    airline.add(Boeing747);
    airline.add(Ka_62);
    airline.add(Ka_63);

    Scanner in = new Scanner(System.in);

    double lowRange;
    double highRange;


    System.out.println (passengerAirPark);
    System.out.println (cargoAirPark);
    System.out.println ();
    System.out.println("Общая вместительность экипажей  " + countRoominess(passengerAirPark) + " человек, и общая грузоподьемность " + countCargo(cargoAirPark) + "кг.");
    System.out.println();
    System.out.println("Введите минимальную дистанцию:");
    lowRange = in.nextDouble();
    System.out.println("Введиет максимальную дистанцию:");
    highRange = in.nextDouble();
    System.out.println(getAircraftRange (airline, lowRange, highRange));
  }

  public static double countRoominess(List<PassengerPlane> passengerAirPark) {
    double roominess = 0.0;
    for (Aircraft item : passengerAirPark) {
      roominess += item.getRoominess();
    }
    return roominess;
  }

  public static double countCargo(List<CargoPlane> cargoAirPark) {
    double cargo = 0.0;
    for (Aircraft item : cargoAirPark) {
      cargo += item.getCargo ();
    }
    return cargo;
  }

  public static List<Aircraft> getAircraftRange(List<Aircraft> input, double lowRange, double highRange) {
    List<Aircraft> results = new ArrayList<>();
    for (Aircraft item : input) {
      if (item.getRange () < highRange && item.getRange () > lowRange) {
        results.add(item);
      }
    }
    return results;
  }

}



