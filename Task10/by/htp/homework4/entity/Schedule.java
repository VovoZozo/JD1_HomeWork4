package by.htp.homework4.entity;

import java.util.List;
import java.util.Objects;

public class Schedule {

	private String day;
	private List<Integer> time;

	public Schedule() {

	}

	public Schedule(String day, List<Integer> time) {
		this.day = day;
		this.time = time;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public List<Integer> getTime() {
		return time;
	}

	public void setTime(List<Integer> time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schedule other = (Schedule) obj;
		return Objects.equals(day, other.day) && Objects.equals(time, other.time);
	}

	@Override
	public String toString() {
		return "Schedule [day=" + day + ", time=" + time + "]";
	}

}
