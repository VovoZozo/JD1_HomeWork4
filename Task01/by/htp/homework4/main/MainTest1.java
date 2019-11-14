package by.htp.homework4.main;

import by.htp.homework4.entity.Test1;
import by.htp.homework4.logic.Test1Logic;
import by.htp.homework4.view.Test1Printer;

public class MainTest1 {

	public static void main(String[] args) {

		Test1 test = new Test1();

		test.setOne(5);
		test.setTwo(10);

		Test1 testSumMax = new Test1();
		Test1Logic sum = new Test1Logic();

		testSumMax.setOne(sum.test1Sum(test));
		testSumMax.setTwo(sum.test1Max(test));

		Test1Printer print = new Test1Printer();

		print.test1Print1(test);
		print.test1PrintSum(test, testSumMax);
		print.test1PrintMax(test, testSumMax);

	}

}
