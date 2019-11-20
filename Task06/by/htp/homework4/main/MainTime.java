package by.htp.homework4.main;

import by.htp.homework4.entity.Time;
import by.htp.homework4.logic.TimeLogic;
import by.htp.homework4.print.PrintTime;

public class MainTime {

	public static void main(String[] args) {

		Time time = new Time(10, 5, 43);

		PrintTime print = new PrintTime();
		print.printTime(time);

		TimeLogic logic = new TimeLogic();
		logic.upHour(time, 14);
		print.printTime(time);

		logic.upMinute(time, 125);
		print.printTime(time);

		logic.upSecond(time, 12500);
		print.printTime(time);
	}

}
