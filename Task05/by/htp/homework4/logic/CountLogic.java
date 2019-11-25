package by.htp.homework4.logic;

import by.htp.homework4.entity.Count;

public class CountLogic {

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

	public boolean upCount(Count count, int up) {
		if (count.getCount() + up < count.getMaxCount()) {
			count.setCount(count.getCount() + up);
			return true;
		} else {
			count.setCount(0);
			return false;
		}
	}

	public boolean downCount(Count count, int down) {
		if (count.getCount() - down > count.getMinCount()) {
			count.setCount(count.getCount() - down);
			return true;
		} else {
			count.setCount(0);
			return false;
		}
	}

}
