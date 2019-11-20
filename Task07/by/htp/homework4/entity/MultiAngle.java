package by.htp.homework4.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiAngle {

	ArrayList<Coordinate> multiAngle = new ArrayList<Coordinate>();

	public MultiAngle(Coordinate... top) {

		this.multiAngle.addAll(Arrays.asList(top));

	}

	public ArrayList<Coordinate> getMultiAngle() {
		return multiAngle;
	}

	public void setMultiAngle(ArrayList<Coordinate> multiAngle) {
		this.multiAngle = multiAngle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((multiAngle == null) ? 0 : multiAngle.hashCode());
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
		MultiAngle other = (MultiAngle) obj;
		if (multiAngle == null) {
			if (other.multiAngle != null)
				return false;
		} else if (!multiAngle.equals(other.multiAngle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MultiAngle [multiAngle=" + multiAngle + "]";
	}

}
