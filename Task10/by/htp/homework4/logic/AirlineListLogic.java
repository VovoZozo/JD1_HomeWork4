package by.htp.homework4.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.homework4.entity.Airline;
import by.htp.homework4.entity.AirlineList;

public class AirlineListLogic {

	public AirlineList airlineByDestination(AirlineList airport, String destination) {

		AirlineLogic checkDestination = new AirlineLogic();
		List<Airline> byDestination = new ArrayList<Airline>();

		int count = airport.getAirlines().size();
		boolean check;

		for (int i = 0; i < count; i++) {

			check = checkDestination.checkDestination(airport.getAirlines().get(i), destination);

			if (check) {
				byDestination.add(airport.getAirlines().get(i));
			}

		}

		AirlineList airportByDestination = new AirlineList(byDestination);

		return airportByDestination;

	}

	public AirlineList airlineByDay(AirlineList airport, String day) {

		AirlineLogic checkDay = new AirlineLogic();
		List<Airline> byDay = new ArrayList<Airline>();

		int count = airport.getAirlines().size();
		boolean check;

		for (int i = 0; i < count; i++) {

			check = checkDay.checkDay(airport.getAirlines().get(i), day);

			if (check) {
				byDay.add(airport.getAirlines().get(i));
			}

		}

		AirlineList airportByDay = new AirlineList(byDay);

		return airportByDay;

	}

	public AirlineList airlineUpperTime(AirlineList airport, String day, int time) {

		AirlineList airportByDay = airlineByDay(airport, day);
		List<Airline> byDayAndUpperTime = new ArrayList<Airline>();

		int countAirline = airportByDay.getAirlines().size();

		int i;
		int j;

		for (i = 0; i < countAirline; i++) {

			int countSchedule = airportByDay.getAirlines().get(i).getSchedule().size();

			for (j = 0; j < countSchedule; j++) {

				String checkDay = airportByDay.getAirlines().get(i).getSchedule().get(j).getDay();

				if (checkDay.equals(day)) {

					AirlineLogic checkTime = new AirlineLogic();

					boolean check = checkTime
							.checkDayUpperTime(airportByDay.getAirlines().get(i).getSchedule().get(j).getTime(), time);

					if (check) {
						byDayAndUpperTime.add(airportByDay.getAirlines().get(i));
					}
				}
			}
		}

		AirlineList airportByDayAndUpperTime = new AirlineList(byDayAndUpperTime);

		return airportByDayAndUpperTime;

	}

}
