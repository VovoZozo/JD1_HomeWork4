package by.htp.homework4.view;

import by.htp.homework4.entity.Student;

public class StudentPrinter {

	public void printArrayStudentOverNine(Student[] overNine) {

		System.out.println("Студенты с оценками только 9 и 10:");

		int count = 0;

		for (int i = 0; i < overNine.length; i++) {

			if (overNine[i] != null) {
				count++;
				System.out.print(count + ". ");
				System.out.print(overNine[i].getSurname() + " ----- ");
				System.out.print("Grope ");
				System.out.print(overNine[i].getGropeNumber() + ";");
				System.out.println();
			}
			
		}
		
		if (count == 0) {
			System.out.println("Студентов с заданной успеваемостью нет");
		}
		
		System.out.println();
	}

}
