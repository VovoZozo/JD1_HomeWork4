package by.htp.homework4.entity;

import by.htp.homework4.entity.Coordinate;

public class Segment {

	private Coordinate top1;
	private Coordinate top2;

	public Segment(int x1, int y1, int x2, int y2) {
		top1 = new Coordinate(x1, y1);
		top2 = new Coordinate(x2, y2);
	}

	public Segment(Coordinate top1, Coordinate top2) {
		this.top1 = top1;
		this.top2 = top2;
	}

	public Coordinate getTop1() {
		return top1;
	}

	public void setTop1(Coordinate top1) {
		this.top1 = top1;
	}

	public Coordinate getTop2() {
		return top2;
	}

	public void setTop2(Coordinate top2) {
		this.top2 = top2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((top1 == null) ? 0 : top1.hashCode());
		result = prime * result + ((top2 == null) ? 0 : top2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Segment other = (Segment) obj;
		if (top1 == null) {
			if (other.top1 != null)
				return false;
		} else if (!top1.equals(other.top1))
			return false;
		if (top2 == null) {
			if (other.top2 != null)
				return false;
		} else if (!top2.equals(other.top2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Segment [\ntop1=" + top1 + ",\ntop2=" + top2 + "\n]";
	}

}
