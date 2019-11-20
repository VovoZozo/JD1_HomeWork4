package by.htp.homework4.entity;

public class Minute extends CountTime {

	public Minute() {
		this.setMinValue(0);
		this.setMaxValue(59);
	}

	@Override
	public String toString() {
		return "Minute = " + getCount();
	}
	
	
}
	

