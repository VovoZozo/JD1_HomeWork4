package by.htp.homework4.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class Group {

	private int number;
	ArrayList<Student> students = new ArrayList<Student>();
	
	public Group() {
		
	}
	
	public Group(int number, ArrayList<Student> students) {
		this.number = number;
		this.students = students;
	}
	
	public Group(int number, Student... students) {
		this.number = number;
		this.students.addAll(Arrays.asList(students));
	}
	
	@Override
	public String toString() {
		return "GroupList [number=" + number + ",\n students=\n" + students + "]";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public Student getStudents(int i) {
		return students.get(i);
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public void setStudents(Student student) {
		this.students.add(student);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + ((students == null) ? 0 : students.hashCode());
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
		Group other = (Group) obj;
		if (number != other.number)
			return false;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		return true;
	}
}
