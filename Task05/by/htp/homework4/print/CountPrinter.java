package by.htp.homework4.print;

import by.htp.homework4.entity.Count;

public class CountPrinter {

	public void printCount(Count count) {
		System.out.println("Present value = " + count.getCount());
	}

	public void printRange(Count count) {
		System.out.println("Min value = " + count.getMinCount());
		System.out.println("Max value = " + count.getMaxCount());
	}
	
	public void moreThanMax(Count count) {
		System.out.println("Established value more than maximum value.");
	}
	
	public void lessThanMax(Count count) {
		System.out.println("Established value less than maximum value.");
	}
}
