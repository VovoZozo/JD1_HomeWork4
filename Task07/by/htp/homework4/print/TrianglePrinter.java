package by.htp.homework4.print;

import by.htp.homework4.entity.Coordinate;

public class TrianglePrinter {

	public void areaPrinter(double area) {
		System.out.print("Triangle area = ");
		System.out.printf("%.3f\n", area);
	}

	public void perimetrPrinter(double perimetr) {
		System.out.print("Triangle perimetr = ");
		System.out.printf("%.3f\n", perimetr);
	}

	public void medianPrinter(Coordinate median) {
		CoordinatePrinter print = new CoordinatePrinter();
		System.out.println("Triangle Median Intersection Coordinate: ");
		print.printAll(median);
	}

}
