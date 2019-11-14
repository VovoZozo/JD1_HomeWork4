package by.htp.homework4.entity;

import java.util.Arrays;

public class Student {

	public final int ACADEMIC_PERFORMANCA = 5;

	private String surname;
	private String name;
	private int gropeNumber;

	private int[] academicPerformance = new int[ACADEMIC_PERFORMANCA];

	public Student() {

		surname = "Not set";
		name = "Not set";
	}
	
	public Student(String surname, String name, int gropeNumber) {

		this.surname = surname;
		this.name = name;
		this.gropeNumber = gropeNumber;

	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGropeNumber() {
		return gropeNumber;
	}

	public void setGropeNumber(int gropeNumber) {
		this.gropeNumber = gropeNumber;
	}

	public int[] getAcademicPerformance() {
		return academicPerformance;
	}

	public void setAcademicPerformance(int[] academicPerformance) {
		this.academicPerformance = academicPerformance;
	}
	
	public void setAcademicPerformance(int one, int two, int three, int four, int five) {

		this.academicPerformance[0] = one;
		this.academicPerformance[1] = two;
		this.academicPerformance[2] = three;
		this.academicPerformance[3] = four;
		this.academicPerformance[4] = five;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(academicPerformance);
		result = prime * result + gropeNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Student other = (Student) obj;
		if (!Arrays.equals(academicPerformance, other.academicPerformance))
			return false;
		if (gropeNumber != other.gropeNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [surname=" + surname + ", name=" + name + ", gropeNumber=" + gropeNumber
				+ ", academicPerformance=" + Arrays.toString(academicPerformance) + "]\n";
	}

	
	
}
