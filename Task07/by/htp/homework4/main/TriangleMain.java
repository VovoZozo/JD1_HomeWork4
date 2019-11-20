package by.htp.homework4.main;

import by.htp.homework4.entity.Triangle;
import by.htp.homework4.logic.TriangleLogic;
import by.htp.homework4.print.TrianglePrinter;

public class TriangleMain {

	public static void main(String[] args) {

		Triangle triangle1 = new Triangle(5.4, 2.6, 15.3, 2.2, -15.2, 18.4);
		
		System.out.println(triangle1.toString());

		TriangleLogic logic = new TriangleLogic();
		
		TrianglePrinter printer = new TrianglePrinter();
		
		
		printer.areaPrinter(logic.area(triangle1));
		printer.perimetrPrinter(logic.perimetr(triangle1));
		printer.medianPrinter(logic.medianIntersection(triangle1));

	}

}
