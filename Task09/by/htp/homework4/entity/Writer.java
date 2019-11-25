package by.htp.homework4.entity;

import java.util.Objects;

public class Writer {

	private String name;
	private String middleName;
	private String surname;

	public Writer() {

	}

	public Writer(String name, String middleName, String surname) {
		this.name = name;
		this.middleName = middleName;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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
		Writer other = (Writer) obj;
		return Objects.equals(middleName, other.middleName) && Objects.equals(name, other.name)
				&& Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return "Writer [name=" + name + ", middleName=" + middleName + ", surname=" + surname + "]";
	}

}
