package by.htp.homework4.view;

import java.util.List;

import by.htp.homework4.entity.Student;

public class GropePrinter {
	
	public void printArrayStudentOverNine(List<Student> students) {
		
		if (students.size() != 0) {
			System.out.println("Группа № - " + students.get(0).getGropeNumber());
		
			System.out.println("Студенты с оценками только 9 и 10:");

			for (int i = 0; i < students.size(); i++) {

				System.out.print((i+1) + ". ");
				System.out.print(students.get(i).getSurname() + " ----- ");
				System.out.print("Grope ");
				System.out.print(students.get(i).getGropeNumber() + ";");
				System.out.println();
			
			} 
		} else {
			System.out.println("Студентов с заданной успеваемостью нет");
		}
		
		System.out.println();
	}
}
