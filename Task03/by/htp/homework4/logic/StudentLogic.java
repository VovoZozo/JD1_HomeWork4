package by.htp.homework4.logic;

import by.htp.homework4.entity.Student;

public class StudentLogic {

	public boolean perfomanceOverNine(Student student) {

		int[] marks = student.getAcademicPerformance();

		int count = 0;

		for (int i = 0; i < marks.length; i++) {

			if (marks[i] == 9 || marks[i] == 10) {
				count++;
			} else {
				break;
			}

		}

		return count == marks.length;

	}

	public Student[] perfomanceOverNine(Student[] student) {

		Student[] overNine = new Student[student.length];
		int count = 0;
		int j = 0;
		for (int i = 0; i < student.length; i++) {

			if (perfomanceOverNine(student[i])) {
				overNine[j] = student[i];
				j++;
				count++;
			}

		}

		if (count != 0) {
			return overNine;
		} else {
			return new Student[0];
		}

	}
}
