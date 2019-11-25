package by.htp.homework4.main;

import by.htp.homework4.entity.Count;
import by.htp.homework4.logic.CountLogic;
import by.htp.homework4.print.CountPrinter;

public class MainCount {

	public static void main(String[] args) {

		Count count = new Count();
		Count count1 = new Count(2, -50, 150);

		CountPrinter print = new CountPrinter();
		print.printCount(count);
		print.printRange(count);

		print.printCount(count1);
		print.printRange(count1);

		CountLogic countLogic = new CountLogic();

		countLogic.upCount(count);
		print.printCount(count);
		countLogic.downCount(count);
		print.printCount(count);

		countLogic.upCount(count1, 1500);
		print.printCount(count1);
		countLogic.downCount(count1, 5);
		print.printCount(count1);

		System.out.println(count.toString());
		System.out.println(count1.toString());
	}

}
