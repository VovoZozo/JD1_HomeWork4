package by.htp.homework4.view;

import by.htp.homework4.entity.Test1;

public class Test1Printer {

	public void test1Print1(Test1 test1) {

		System.out.println("Переменная 1 = " + test1.getOne());
		System.out.println("Переменная 2 = " + test1.getTwo());
	}

	public void test1PrintSum(Test1 test1, Test1 sum) {

		System.out.print(test1.getOne());
		System.out.print(" + ");
		System.out.print(test1.getTwo());
		System.out.print(" = ");
		System.out.println(sum.getOne());

	}

	public void test1PrintMax(Test1 test1, Test1 max) {

		System.out.print(max.getTwo());
		System.out.print(" большее из ");
		System.out.print(test1.getOne());
		System.out.print(" и ");
		System.out.print(test1.getTwo());

	}

}
