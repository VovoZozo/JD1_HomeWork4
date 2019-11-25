package by.htp.homework4.view;

import by.htp.homework4.entity.Time;

public class PrintTime {

	public void printTime(Time time) {

		long hour = time.getHour();
		long minute = time.getMinute();
		long second = time.getSecond();

		System.out.printf("%02d:", hour);
		System.out.printf("%02d:", minute);
		System.out.printf("%02d\n", second);

	}

}
