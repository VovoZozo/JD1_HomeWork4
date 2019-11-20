package by.htp.homework4.logic;

import by.htp.homework4.entity.Time;

public class TimeLogic {

	public void upHour(Time time, int hour) {

		upSecond(time, hour * 3600);

	}

	public void upMinute(Time time, int minute) {

		upSecond(time, minute * 60);

	}

	public void upSecond(Time time, int second) {

		int minute = second / 60;
		int hour = minute / 60;

		int hourNow = time.getHour();
		int hourNew = (hourNow + hour) % 24;
		time.setHour(hourNew);

		int minuteNow = time.getMinute();
		int minuteNew = (minuteNow + minute) % 60;
		time.setMinute(minuteNew);

		int secondNow = time.getSecond();
		int secondNew = (secondNow + second) % 60;
		time.setSecond(secondNew);
	}
}
