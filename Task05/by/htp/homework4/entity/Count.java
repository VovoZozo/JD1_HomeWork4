package by.htp.homework4.entity;

public class Count {

	private int count;
	private int minCount;
	private int maxCount;

	public Count() {
		this.count = 0;
		this.minCount = Integer.MIN_VALUE;
		this.maxCount = Integer.MAX_VALUE;
	}

	public Count(int count, int minCount, int maxCount) {
		this.count = count;
		this.minCount = minCount;
		this.maxCount = maxCount;
	}

	public Count(int count) {
		this.count = count;
		this.minCount = Integer.MIN_VALUE;
		this.maxCount = Integer.MAX_VALUE;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMinCount() {
		return minCount;
	}

	public void setMinCount(int minCount) {
		this.minCount = minCount;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + maxCount;
		result = prime * result + minCount;
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
		Count other = (Count) obj;
		if (count != other.count)
			return false;
		if (maxCount != other.maxCount)
			return false;
		if (minCount != other.minCount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Count [count=" + count + ", minCount=" + minCount + ", maxCount=" + maxCount + "]";
	}

}
