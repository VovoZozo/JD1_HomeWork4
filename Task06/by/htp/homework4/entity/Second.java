package by.htp.homework4.entity;

public class Second extends CountTime {

	public Second() {
		this.setMinValue(0);
		this.setMaxValue(59);
	}

	@Override
	public String toString() {
		return "Second = " + getCount();
	}
}
