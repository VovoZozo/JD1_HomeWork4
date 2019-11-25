package by.htp.homework4.logic;

import java.util.List;

import by.htp.homework4.entity.Airline;

public class AirlineLogic {

	public boolean checkDestination(Airline airline, String destination) {

		return airline.getDestination().equals(destination);

	}

	public boolean checkDay(Airline airline, String day) {

		int count = airline.getSchedule().size();
		boolean check = false;

		for (int i = 0; i < count; i++) {

			String checkDay = airline.getSchedule().get(i).getDay();

			check = checkDay.equals(day);

			if (check) {
				return check;
			}

		}

		return false;
	}

	public boolean checkDayUpperTime(List<Integer> timeList, int time) {

		boolean check = false;
		for (int i = 0; i < timeList.size(); i++) {
			if (timeList.get(i) > time) {
				check = true;
				return check;
			}
		}

		return false;
	}

}
