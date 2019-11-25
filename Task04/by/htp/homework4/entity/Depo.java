package by.htp.homework4.entity;

import java.util.List;

public class Depo {

	private int number;
	private List<Train> trains;

	public Depo() {

	}

	public Depo(int number, List<Train> trains) {
		this.number = number;
		this.trains = trains;
	}

	@Override
	public String toString() {
		return "GroupList [number=" + number + ",\n trains=\n" + trains + "]";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<Train> getTrains() {
		return trains;
	}

	public Train getTrains(int i) {
		return trains.get(i);
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}

	public void setTrains(Train train) {
		this.trains.add(train);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + ((trains == null) ? 0 : trains.hashCode());
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
		Depo other = (Depo) obj;
		if (number != other.number)
			return false;
		if (trains == null) {
			if (other.trains != null)
				return false;
		} else if (!trains.equals(other.trains))
			return false;
		return true;
	}

}
