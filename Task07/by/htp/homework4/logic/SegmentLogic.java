package by.htp.homework4.logic;

import by.htp.homework4.entity.Segment;

public class SegmentLogic {

	public double length(Segment segment) {

		double x1 = segment.getTop1().getX();
		double x2 = segment.getTop2().getX();
		double y1 = segment.getTop1().getY();
		double y2 = segment.getTop2().getY();

		double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		return length;
	}

}
