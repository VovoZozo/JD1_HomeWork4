package by.htp.homework4.logic;

import by.htp.homework4.entity.Test1;

public class Test1Logic {

	public int test1Sum(Test1 test) {

		int sum;

		sum = test.getOne() + test.getTwo();

		return sum;
	}

	public int test1Max(Test1 test) {

		int max;

		if (test.getOne() > test.getTwo()) {
			max = test.getOne();
		} else {
			max = test.getTwo();
		}

		return max;
	}

}
