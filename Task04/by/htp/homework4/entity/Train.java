package by.htp.homework4.entity;

import java.util.Comparator;

public class Train implements Comparable<Train> {

	private String destination;
	private String pointDeparture;
	private int trainNumber;
	private int departureHour;
	private int departureMinute;

	{
		destination = "Don't set";
		pointDeparture = "Don't set";

	}

	public Train() {

	}

	public Train(String destination, String pointDeparture, int trainNumber, int departureHour, int departureMinute) {

		this.destination = destination;
		this.pointDeparture = pointDeparture;
		this.trainNumber = trainNumber;
		this.departureHour = departureHour;
		this.departureMinute = departureMinute;

	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getPointDeparture() {
		return pointDeparture;
	}

	public void setPointDeparture(String pointDeparture) {
		this.pointDeparture = pointDeparture;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public int getDepartureHour() {
		return departureHour;
	}

	public void setDepartureHour(int departureHour) {
		this.departureHour = departureHour;
	}

	public int getDepartureMinute() {
		return departureMinute;
	}

	public void setDepartureMinute(int departureMinute) {
		this.departureMinute = departureMinute;
	}

	public String toString() {
		return "[trainNumber=" + this.trainNumber + ", destination=" + this.destination + ", " + "pointDeparture=" + this.pointDeparture + ", " + "departureHour=" + this.departureHour + ", departureMinute=" + this.departureMinute + "]" + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + departureHour;
		result = prime * result + departureMinute;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((pointDeparture == null) ? 0 : pointDeparture.hashCode());
		result = prime * result + trainNumber;
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
		Train other = (Train) obj;
		if (departureHour != other.departureHour)
			return false;
		if (departureMinute != other.departureMinute)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (pointDeparture == null) {
			if (other.pointDeparture != null)
				return false;
		} else if (!pointDeparture.equals(other.pointDeparture))
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}

	public int compareTo(Train train) {
		return (this.trainNumber - train.trainNumber);
	}

	
}
