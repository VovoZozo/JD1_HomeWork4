package by.htp.homework4.print;

import by.htp.homework4.entity.Coordinate;

public class CoordinatePrinter {

	public void printAll(Coordinate top) {
		System.out.print("X = ");
		System.out.printf("%.3f\n", top.getX());
		System.out.print("Y = ");
		System.out.printf("%.3f\n", top.getY());
	}

}
