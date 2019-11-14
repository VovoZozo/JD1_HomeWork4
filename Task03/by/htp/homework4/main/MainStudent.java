package by.htp.homework4.main;

import java.util.Arrays;

import by.htp.homework4.entity.Group;
import by.htp.homework4.entity.Student;
import by.htp.homework4.logic.StudentLogic;
import by.htp.homework4.view.StudentPrinter;

public class MainStudent {

	public static void main(String[] args) {

		Student[] students = new Student[10];

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}
		
		Group group1 = new Group(1, students[7], students[5]);
		
		Group group2 = new Group(2, students[8]);
		
		Group group3 = new Group(3, students[1], students[9]);
		
		Group group4 = new Group(4, students[2], students[3]);
		
		Group group5 = new Group(5, students[0], students[4], students[6]);
		
		students[7].setAcademicPerformance(5, 2, 7, 5, 4);
		students[7].setSurname("Neyd");
		students[7].setName("Olga");
		students[7].setGropeNumber(1);
		
		students[5].setAcademicPerformance(10, 10, 10, 10, 10);
		students[5].setSurname("Averburg");
		students[5].setName("Siarhei");
		students[5].setGropeNumber(1);
		
		students[8].setAcademicPerformance(6, 9, 7, 10, 8);
		students[8].setSurname("Soroka");
		students[8].setName("Aleksandr");
		students[8].setGropeNumber(2);
		
		students[1].setAcademicPerformance(9, 10, 10, 9, 10);
		students[1].setSurname("Savich");
		students[1].setName("Peter");
		students[1].setGropeNumber(3);
		
		students[9].setAcademicPerformance(9, 9, 9, 10, 10);
		students[9].setSurname("Voropay");
		students[9].setName("Mary");
		students[9].setGropeNumber(3);
		
		students[2].setAcademicPerformance(5, 8, 6, 4, 7);
		students[2].setSurname("Guchi");
		students[2].setName("Vova");
		students[2].setGropeNumber(4);
		
		students[3].setAcademicPerformance(5, 5, 6, 4, 7);
		students[3].setSurname("Guci");
		students[3].setName("Oleg");
		students[3].setGropeNumber(4);
		
		students[0].setAcademicPerformance(8, 9, 6, 9, 10);
		students[0].setSurname("Davidov");
		students[0].setName("Nik");
		students[0].setGropeNumber(5);
		
		students[4].setAcademicPerformance(9, 9, 10, 9, 10);
		students[4].setSurname("Ivanov");
		students[4].setName("Ivan");
		students[4].setGropeNumber(5);
		
		students[6].setAcademicPerformance(4, 7, 5, 5, 8);
		students[6].setSurname("Ginsberg");
		students[6].setName("Kate");
		students[6].setGropeNumber(5);

		StudentLogic studentLogic = new StudentLogic();

		Student[] overNine = studentLogic.perfomanceOverNine(students);

		StudentPrinter studentPrinter = new StudentPrinter();
		studentPrinter.printArrayStudentOverNine(overNine);
		
		
		
	}
}

/*
		
*/