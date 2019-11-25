package by.htp.homework4.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.homework4.entity.Group;
import by.htp.homework4.entity.Student;
import by.htp.homework4.logic.StudentLogic;

public class GroupLogic {

	public List<Student> performanceOverNine(Group group) {

		List<Student> students = group.getStudents();
		StudentLogic studentLogic = new StudentLogic();
		List<Student> overNine = new ArrayList<Student>();

		for (int i = 0; i < students.size(); i++) {

			if (studentLogic.perfomanceOverNine(students.get(i))) {
				overNine.add(students.get(i));
			}

		}

		return overNine;
	}

}
