package by.htp.homework4.logic;

import by.htp.homework4.entity.Count;
import by.htp.homework4.print.CountPrinter;

public class CountLogic {
	
	CountPrinter print = new CountPrinter();
	
	public void upCount(Count count) {
		if (count.getCount() < count.getMaxCount()) {
			count.setCount(count.getCount() + 1);
		}
	}

	public void downCount(Count count) {
		if (count.getCount() > count.getMinCount()) {
			count.setCount(count.getCount() - 1);
		}
	}

	public void upCount(Count count, int up) {
		if (count.getCount() + up < count.getMaxCount()) {
			count.setCount(count.getCount() + up);
		} else {
			print.moreThanMax(count);
		}
	}

	public void downCount(Count count, int down) {
		if (count.getCount() - down > count.getMinCount()) {
			count.setCount(count.getCount() - down);
		} else {
			print.lessThanMax(count);
		}
	}

}
