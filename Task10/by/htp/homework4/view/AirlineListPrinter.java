package by.htp.homework4.view;

import by.htp.homework4.entity.AirlineList;
import by.htp.homework4.view.AirlinePrinter;

public class AirlineListPrinter {

	public void airlineListPrint(AirlineList airlines) {

		AirlinePrinter print = new AirlinePrinter();

		for (int i = 0; i < airlines.getAirlines().size(); i++) {
			
			System.out.print((i + 1) + ": ");
			print.airlinePrint(airlines.getAirlines().get(i));
			
		}

	}

}
