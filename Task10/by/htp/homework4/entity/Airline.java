package by.htp.homework4.entity;

import java.util.List;
import java.util.Objects;

public class Airline {

	private String destination;
	private int flightNumber;
	private String typeOfAircraft;
	private List<Schedule> schedule;

	public Airline() {

	}

	public Airline(String destination, int flightNumber, String typeOfAircraft, List<Schedule> schedule) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.typeOfAircraft = typeOfAircraft;
		this.schedule = schedule;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getTypeOfAircraft() {
		return typeOfAircraft;
	}

	public void setTypeOfAircraft(String typeOfAircraft) {
		this.typeOfAircraft = typeOfAircraft;
	}

	public List<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}

	@Override
	public int hashCode() {
		return Objects.hash(destination, flightNumber, schedule, typeOfAircraft);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		return Objects.equals(destination, other.destination) && flightNumber == other.flightNumber
				&& Objects.equals(schedule, other.schedule) && Objects.equals(typeOfAircraft, other.typeOfAircraft);
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", typeOfAircraft="
				+ typeOfAircraft + ", schedule=" + schedule + "]";
	}

}
