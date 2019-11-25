package by.htp.homework4.main;

import by.htp.homework4.entity.Coordinate;
import by.htp.homework4.entity.Triangle;
import by.htp.homework4.logic.TriangleLogic;
import by.htp.homework4.view.TrianglePrinter;

public class TriangleMain {

	public static void main(String[] args) {
		
		Coordinate top1 = new Coordinate(0, 0);
		Coordinate top2 = new Coordinate(0, 2);
		Coordinate top3 = new Coordinate(2, 0);
		
		Triangle triangle1 = new Triangle(top1, top2, top3);

		TriangleLogic logic = new TriangleLogic();
		
		double area = logic.area(triangle1);
		double perimetr = logic.perimetr(triangle1);
		Coordinate median = logic.medianIntersection(triangle1);
		
		TrianglePrinter printer = new TrianglePrinter();

		printer.areaPrinter(area);
		printer.perimetrPrinter(perimetr);
		printer.medianPrinter(median);

	}

}
