package homework_number.task_2;

import homework_number.task_2.Aircraft.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Airline {
  public static void main (String[] args) {
    List<Aircraft> airline = new ArrayList<> ();

    Scanner in = new Scanner(System.in);

    double lowRange;
    double highRange;

    airline.add(new A_320 ("a_320", 5554, 22,2200));
    airline.add(new A_330("a_330", 4444, 28,2440));
    airline.add(new Boeing747("b747", 3333, 648, 12500));
    airline.add(new Ka_62 ("Ka_62", 2222, 22,202));
    airline.add(new  Mi_38 ("Mi_38", 1111, 22,220));
    airline.add(new  Mi_171A2 ("Mi_171A2", 111, 22,292));
    airline.add(new Syma_X8_Pro("Syma_X8_Pro", 213, 68));
    airline.add(new Syma_Z3("Syma_Z3", 164, 648));


    System.out.println (airline);
    System.out.println ();
    System.out.println("Общая вместительность экипажей  " + countRoominess(airline) + " человек, и общая грузоподьемность " + countCargo(airline) + "кг.");
    System.out.println();
    System.out.println("Введите минимальную дистанцию:");
    lowRange = in.nextDouble();
    System.out.println("Введиет максимальную дистанцию:");
    highRange = in.nextDouble();
    System.out.println(getAircraftRange (airline, lowRange, highRange));
  }

  public static double countRoominess(List<Aircraft> airline) {
    double roominess = 0.0;
    for (Aircraft item : airline) {
      roominess += item.getRoominess();
    }
    return roominess;
  }

  public static double countCargo(List<Aircraft> airline) {
    double cargo = 0.0;
    for (Aircraft item : airline) {
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



