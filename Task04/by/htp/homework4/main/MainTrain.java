package by.htp.homework4.main;

import java.util.Arrays;
import by.htp.homework4.entity.Train;
import by.htp.homework4.logic.TrainsComparator;
import by.htp.homework4.view.TrainPrinter;

public class MainTrain {

	public static void main(String[] args) {
		
		Train[] trains = new Train[6];
		
		for (int i = 0; i < trains.length; i++) {
			trains[i] = new Train();
		}
		
		trains[0].setDestination("Moscow");		trains[1].setDestination("Amsterdam");
		trains[0].setPointDeparture("Brest");	trains[1].setPointDeparture("Minsk");
		trains[0].setTrainNumber(1065);			trains[1].setTrainNumber(1590);
		trains[0].setDepartureHour(13);			trains[1].setDepartureHour(18);
		trains[0].setDepartureMinute(35);		trains[1].setDepartureMinute(10);
		
		trains[2].setDestination("Berlin");		trains[3].setDestination("Moscow");
		trains[2].setPointDeparture("Gomel");	trains[3].setPointDeparture("Borisov");
		trains[2].setTrainNumber(1032);			trains[3].setTrainNumber(1024);
		trains[2].setDepartureHour(8);			trains[3].setDepartureHour(13);
		trains[2].setDepartureMinute(45);		trains[3].setDepartureMinute(20);
		
		trains[4].setDestination("Amsterdam");	trains[5].setDestination("Berlin");
		trains[4].setPointDeparture("Minsk");	trains[5].setPointDeparture("Minsk");
		trains[4].setTrainNumber(1075);			trains[5].setTrainNumber(1043);
		trains[4].setDepartureHour(18);			trains[5].setDepartureHour(5);
		trains[4].setDepartureMinute(45);		trains[5].setDepartureMinute(23);
		
		Arrays.sort(trains, TrainsComparator.trainNumberComparator);
        System.out.println("Стандартная сортировка по номеру поезда:");
        System.out.println(Arrays.toString(trains));
        
        Arrays.sort(trains, TrainsComparator.destinationComparator);
        System.out.println("Стандартная сортировка по пункту назначения:");
        System.out.println(Arrays.toString(trains));
        
        Arrays.sort(trains, TrainsComparator.pointDepartureComparator);
        System.out.println("Стандартная сортировка по пункту отправления:");
        System.out.println(Arrays.toString(trains));
        
        Arrays.sort(trains, TrainsComparator.departureHourAndMinuteComparator);
        System.out.println("Стандартная сортировка по времени отправления:");
        System.out.println(Arrays.toString(trains));
        
        Arrays.sort(trains, new TrainsComparator());
        System.out.println("Сортируем по пункту назначения и по времени отправления:");
        System.out.println(Arrays.toString(trains));
        
        TrainPrinter print = new TrainPrinter();
		print.printArrayTrain(trains);
        
	}

}
