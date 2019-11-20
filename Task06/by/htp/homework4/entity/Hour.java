package by.htp.homework4.entity;

public class Hour extends CountTime {

	public Hour() {
		this.setMinValue(0);
		this.setMaxValue(23);
	}

	@Override
	public String toString() {
		return "Hour = " + getCount();
	}
}