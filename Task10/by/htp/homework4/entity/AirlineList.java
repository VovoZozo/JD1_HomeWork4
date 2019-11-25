package by.htp.homework4.entity;

import java.util.List;
import java.util.Objects;

public class AirlineList {

	private List<Airline> airlines;

	public AirlineList() {

	}

	public AirlineList(List<Airline> airlines) {
		this.airlines = airlines;
	}

	public List<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}

	@Override
	public int hashCode() {
		return Objects.hash(airlines);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirlineList other = (AirlineList) obj;
		return Objects.equals(airlines, other.airlines);
	}

	@Override
	public String toString() {
		return "AirlineList [airlines=" + airlines + "]";
	}

}
