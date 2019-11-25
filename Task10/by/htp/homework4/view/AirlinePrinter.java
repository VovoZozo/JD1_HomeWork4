package by.htp.homework4.view;

import by.htp.homework4.entity.Airline;

public class AirlinePrinter {

	public void airlinePrint(Airline airline) {

		System.out.print("Destination - " + airline.getDestination() + ", ");
		System.out.println("Flight number - " + airline.getFlightNumber() + ".");

	}
}
