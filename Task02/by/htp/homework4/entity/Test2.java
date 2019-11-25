package by.htp.homework4.entity;

import java.util.Objects;

public class Test2 {

	private int one;
	private int two;

	public Test2(int one, int two) {
		this.one = one;
		this.two = two;
	}

	public Test2() {
		this.one = 1;
		this.two = 1;
	}

	public int getOne() {
		return one;
	}

	public void setOne(int one) {
		this.one = one;
	}

	public int getTwo() {
		return two;
	}

	public void setTwo(int two) {
		this.two = two;
	}

	@Override
	public int hashCode() {
		return Objects.hash(one, two);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test2 other = (Test2) obj;
		return one == other.one && two == other.two;
	}

	@Override
	public String toString() {
		return "Test2 [one=" + one + ", two=" + two + "]";
	}

}
