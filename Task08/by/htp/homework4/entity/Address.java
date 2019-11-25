package by.htp.homework4.entity;

import java.util.Objects;

public class Address {

	private String country;
	private String state;
	private String town;
	private String street;
	private String house;
	private String building;
	private String apartment;
	private String porch;
	private String floor;

	public Address() {

	}

	public Address(String country, String state, String town, String street, String house, String building,
			String apartment, String porch, String floor) {
		this.country = country;
		this.state = state;
		this.town = town;
		this.street = street;
		this.house = house;
		this.building = building;
		this.apartment = apartment;
		this.porch = porch;
		this.floor = floor;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getPorch() {
		return porch;
	}

	public void setPorch(String porch) {
		this.porch = porch;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apartment, building, country, floor, house, porch, state, street, town);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(apartment, other.apartment) && Objects.equals(building, other.building)
				&& Objects.equals(country, other.country) && Objects.equals(floor, other.floor)
				&& Objects.equals(house, other.house) && Objects.equals(porch, other.porch)
				&& Objects.equals(state, other.state) && Objects.equals(street, other.street)
				&& Objects.equals(town, other.town);
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", town=" + town + ", street=" + street + ", house="
				+ house + ", building=" + building + ", apartment=" + apartment + ", porch=" + porch + ", floor="
				+ floor + "]";
	}

}
