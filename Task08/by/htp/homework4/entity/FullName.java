package by.htp.homework4.entity;

import java.util.Objects;

public class FullName {
	
	private String name;
	private String middleName;
	private String surname;

	public FullName() {

	}

	public FullName(String... fullName) {
		try {
			this.name = fullName[0];
			this.middleName = fullName[1];
			this.surname = fullName[2];
		} catch (Exception ArrayIndexOutOfBoundsException) {
			System.out.println("Incomplete data entered \"Full Name \"");
		}
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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(middleName, name, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FullName other = (FullName) obj;
		return Objects.equals(middleName, other.middleName) && Objects.equals(name, other.name)
				&& Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return "FullName [name=" + name + ", middleName=" + middleName + ", surname=" + surname + "]";
	}

	

}
