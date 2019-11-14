package by.htp.homework4.main;

import java.util.ArrayList;

import by.htp.homework4.entity.Group;
import by.htp.homework4.entity.Student;
import by.htp.homework4.logic.GroupLogic;
import by.htp.homework4.view.GropePrinter;

public class MainGroupList {

	public static void main(String[] args) {
		
		Student student0 = new Student();
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();
		Student student6 = new Student();
		Student student7 = new Student();
		Student student8 = new Student();
		Student student9 = new Student();
		
		student7.setAcademicPerformance(5, 2, 7, 5, 4);
		student7.setSurname("Neyd");
		student7.setName("Olga");
		student7.setGropeNumber(1);
		
		student5.setAcademicPerformance(10, 10, 10, 10, 10);
		student5.setSurname("Averburg");
		student5.setName("Siarhei");
		student5.setGropeNumber(1);
		
		student8.setAcademicPerformance(6, 9, 7, 10, 8);
		student8.setSurname("Soroka");
		student8.setName("Aleksandr");
		student8.setGropeNumber(2);
		
		student1.setAcademicPerformance(9, 10, 10, 9, 10);
		student1.setSurname("Savich");
		student1.setName("Peter");
		student1.setGropeNumber(3);
		
		student9.setAcademicPerformance(9, 9, 9, 10, 10);
		student9.setSurname("Voropay");
		student9.setName("Mary");
		student9.setGropeNumber(3);
		
		student2.setAcademicPerformance(5, 8, 6, 4, 7);
		student2.setSurname("Guchi");
		student2.setName("Vova");
		student2.setGropeNumber(4);
		
		student3.setAcademicPerformance(5, 5, 6, 4, 7);
		student3.setSurname("Guci");
		student3.setName("Oleg");
		student3.setGropeNumber(4);
		
		student0.setAcademicPerformance(8, 9, 6, 9, 10);
		student0.setSurname("Davidov");
		student0.setName("Nik");
		student0.setGropeNumber(5);
		
		student4.setAcademicPerformance(9, 9, 10, 9, 10);
		student4.setSurname("Ivanov");
		student4.setName("Ivan");
		student4.setGropeNumber(5);
		
		student6.setAcademicPerformance(4, 7, 5, 5, 8);
		student6.setSurname("Ginsberg");
		student6.setName("Kate");
		student6.setGropeNumber(5);
		
		
		Group group1 = new Group(1, student7, student5);
		
		Group group2 = new Group(2, student8);
		
		Group group3 = new Group(3, student1, student9);
		
		Group group4 = new Group(4, student2, student3);
		
		Group group5 = new Group(5, student0, student4, student6);
		
		GroupLogic logic = new GroupLogic();
		
		ArrayList<Student> group1OverNine = logic.performanceOverNine(group1);
		ArrayList<Student> group2OverNine = logic.performanceOverNine(group2);
		ArrayList<Student> group3OverNine = logic.performanceOverNine(group3);
		ArrayList<Student> group4OverNine = logic.performanceOverNine(group4);
		ArrayList<Student> group5OverNine = logic.performanceOverNine(group5);
		
		GropePrinter overNine  = new GropePrinter();
		
		overNine.printArrayStudentOverNine(group1OverNine);
		overNine.printArrayStudentOverNine(group2OverNine);
		overNine.printArrayStudentOverNine(group3OverNine);
		overNine.printArrayStudentOverNine(group4OverNine);
		overNine.printArrayStudentOverNine(group5OverNine);
		
	}

}
