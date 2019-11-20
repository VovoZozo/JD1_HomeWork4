package by.htp.homework4.logic;

import by.htp.homework4.entity.Coordinate;
import by.htp.homework4.entity.Segment;
import by.htp.homework4.entity.Triangle;

public class TriangleLogic {

	public double area(Triangle triangle) {

		double x1 = triangle.getTop1().getX();
		double x2 = triangle.getTop2().getX();
		double x3 = triangle.getTop3().getX();
		double y1 = triangle.getTop1().getY();
		double y2 = triangle.getTop2().getY();
		double y3 = triangle.getTop3().getY();

		double area = (Math.abs(((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)))) / 2;

		return area;
	}

	public double perimetr(Triangle triangle) {

		Coordinate top1 = triangle.getTop1();
		Coordinate top2 = triangle.getTop2();
		Coordinate top3 = triangle.getTop3();

		Segment segment1 = new Segment(top1, top2);
		Segment segment2 = new Segment(top1, top3);
		Segment segment3 = new Segment(top2, top3);

		SegmentLogic logic = new SegmentLogic();

		double perimetr = logic.length(segment1) + logic.length(segment2) + logic.length(segment3);

		return perimetr;
	}

	public Coordinate medianIntersection(Triangle triangle) {

		double x1 = triangle.getTop1().getX();
		double x2 = triangle.getTop2().getX();
		double x3 = triangle.getTop3().getX();
		double y1 = triangle.getTop1().getY();
		double y2 = triangle.getTop2().getY();
		double y3 = triangle.getTop3().getY();

		double medianX = (x1 + x2 + x3) / 3;
		double medianY = (y1 + y2 + y3) / 3;

		Coordinate median = new Coordinate(medianX, medianY);

		return median;
	}

}
