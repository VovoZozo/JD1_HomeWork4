package by.htp.homework4.entity;

public class Triangle {

	Coordinate top1;
	Coordinate top2;
	Coordinate top3;

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		top1 = new Coordinate(x1, y1);
		top2 = new Coordinate(x2, y2);
		top3 = new Coordinate(x3, y3);
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

	public Coordinate getTop3() {
		return top3;
	}

	public void setTop3(Coordinate top3) {
		this.top3 = top3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((top1 == null) ? 0 : top1.hashCode());
		result = prime * result + ((top2 == null) ? 0 : top2.hashCode());
		result = prime * result + ((top3 == null) ? 0 : top3.hashCode());
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
		Triangle other = (Triangle) obj;
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
		if (top3 == null) {
			if (other.top3 != null)
				return false;
		} else if (!top3.equals(other.top3))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Triangle [\ntop1=" + top1 + ",\ntop2=" + top2 + ",\ntop3=" + top3 + "\n]";
	}

}
