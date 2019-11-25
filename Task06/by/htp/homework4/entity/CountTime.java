package by.htp.homework4.entity;

public class CountTime {

	private int minValue;
	private int maxValue;

	private int count;

	public CountTime() {

	}

	public CountTime(int count) {
		if (count >= minValue && count <= maxValue) {
			this.count = count;
		} else {
			this.count = 0;
		}
	}

	public long getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public long getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if (count >= minValue && count <= maxValue) {
			this.count = count;
		} else {
			this.count = 0;
		}
	}

	@Override
	public String toString() {
		return "CountTime [minValue=" + minValue + ", maxValue=" + maxValue + ", count=" + count + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + maxValue;
		result = prime * result + minValue;
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
		CountTime other = (CountTime) obj;
		if (count != other.count)
			return false;
		if (maxValue != other.maxValue)
			return false;
		if (minValue != other.minValue)
			return false;
		return true;
	}

}
