package by.htp.homework4.main;

import java.util.ArrayList;
import java.util.List;
import by.htp.homework4.entity.Airline;
import by.htp.homework4.entity.AirlineList;
import by.htp.homework4.entity.Schedule;
import by.htp.homework4.logic.AirlineListLogic;
import by.htp.homework4.view.AirlineListPrinter;

public class AirlineMain {

	public static void main(String[] args) {

		List<Integer> scheduleAirlineTime1 = new ArrayList<Integer>();
		scheduleAirlineTime1.add(150);
		scheduleAirlineTime1.add(295);
		scheduleAirlineTime1.add(750);
		Schedule scheduleAirline1 = new Schedule("Sunday", scheduleAirlineTime1);
		List<Integer> scheduleAirlineTime2 = new ArrayList<Integer>();
		scheduleAirlineTime2.add(150);
		scheduleAirlineTime2.add(295);
		scheduleAirlineTime2.add(750);
		Schedule scheduleAirline2 = new Schedule("Thursday", scheduleAirlineTime2);

		List<Schedule> schedule1 = new ArrayList<Schedule>();
		schedule1.add(scheduleAirline1);
		schedule1.add(scheduleAirline2);

		List<Integer> scheduleAirlineTime3 = new ArrayList<Integer>();
		scheduleAirlineTime3.add(30);
		scheduleAirlineTime3.add(620);
		scheduleAirlineTime3.add(890);
		Schedule scheduleAirline3 = new Schedule("Tuesday", scheduleAirlineTime3);
		List<Integer> scheduleAirlineTime4 = new ArrayList<Integer>();
		scheduleAirlineTime4.add(230);
		scheduleAirlineTime4.add(740);
		scheduleAirlineTime4.add(1050);
		Schedule scheduleAirline4 = new Schedule("Friday", scheduleAirlineTime4);

		List<Schedule> schedule2 = new ArrayList<Schedule>();
		schedule2.add(scheduleAirline3);
		schedule2.add(scheduleAirline4);

		List<Integer> scheduleAirlineTime5 = new ArrayList<Integer>();
		scheduleAirlineTime5.add(85);
		scheduleAirlineTime5.add(370);
		scheduleAirlineTime5.add(950);
		Schedule scheduleAirline5 = new Schedule("Wednesday", scheduleAirlineTime5);
		List<Integer> scheduleAirlineTime6 = new ArrayList<Integer>();
		scheduleAirlineTime6.add(340);
		scheduleAirlineTime6.add(650);
		Schedule scheduleAirline6 = new Schedule("Saturday", scheduleAirlineTime6);

		List<Schedule> schedule3 = new ArrayList<Schedule>();
		schedule3.add(scheduleAirline5);
		schedule3.add(scheduleAirline6);

		Airline Airline1 = new Airline("Minsk", 153, "passenger", schedule1);
		Airline Airline2 = new Airline("Moskow", 35, "passenger", schedule2);
		Airline Airline3 = new Airline("Berlin", 142, "passenger", schedule3);

		List<Airline> airlines = new ArrayList<Airline>();
		airlines.add(Airline1);
		airlines.add(Airline2);
		airlines.add(Airline3);

		AirlineList airport = new AirlineList(airlines);

		AirlineListLogic logicAirport = new AirlineListLogic();

		AirlineList byDestination1 = logicAirport.airlineByDestination(airport, "Minsk");

		AirlineList byDay1 = logicAirport.airlineByDay(airport, "Saturday");

		AirlineList byDayUpTime = logicAirport.airlineUpperTime(airport, "Wednesday", 940);

		AirlineListPrinter print = new AirlineListPrinter();

		print.airlineListPrint(airport);
		print.airlineListPrint(byDestination1);
		print.airlineListPrint(byDay1);
		print.airlineListPrint(byDayUpTime);
	}

}
