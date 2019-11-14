package by.htp.homework4.view;

import by.htp.homework4.entity.Train;

public class TrainPrinter {

	public void printArrayTrain(Train[] trains) {
		
		for (int i = 0; i < trains.length; i++) {
			System.out.println((i+1) + ":");
			printTrainInformation(trains[i]);
		}
		
	}

	public void printTrainInformation(Train train) {
		System.out.println("Поезд №" + train.getTrainNumber());
		System.out.println("Пункт отправления " + train.getPointDeparture());
		System.out.println("Пункт назначения " + train.getDestination());
		System.out.println("Время отправления " + train.getDepartureHour() + " H " + train.getDepartureMinute() + " M;");
	}
	
}
