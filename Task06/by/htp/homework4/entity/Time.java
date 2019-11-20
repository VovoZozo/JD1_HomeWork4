package by.htp.homework4.entity;

public class Time {

	Minute minute = new Minute();
	Hour hour = new Hour();
	Second second = new Second();

	public Time(int hour, int minute, int second) {
		this.hour.setCount(hour);
		this.minute.setCount(minute);
		this.second.setCount(second);
	}

	public Time() {

	}

	public int getMinute() {
		return minute.getCount();
	}

	public void setMinute(int minute) {
		this.minute.setCount(minute);
	}

	public int getHour() {
		return hour.getCount();
	}

	public void setHour(int hour) {
		this.hour.setCount(hour);
	}

	public int getSecond() {
		return second.getCount();
	}

	public void setSecond(int second) {
		this.second.setCount(second);
	}

	@Override
	public String toString() {
		return "Time [\n" + hour + ",\n" + minute + ",\n" + second + ".\n]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hour == null) ? 0 : hour.hashCode());
		result = prime * result + ((minute == null) ? 0 : minute.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
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
		Time other = (Time) obj;
		if (hour == null) {
			if (other.hour != null)
				return false;
		} else if (!hour.equals(other.hour))
			return false;
		if (minute == null) {
			if (other.minute != null)
				return false;
		} else if (!minute.equals(other.minute))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}

}
