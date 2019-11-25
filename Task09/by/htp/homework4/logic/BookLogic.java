package by.htp.homework4.logic;

import java.util.Calendar;

import by.htp.homework4.entity.Book;
import by.htp.homework4.entity.Writer;

public class BookLogic {

	public boolean checkWriter(Book book, Writer writer) {

		int count = book.getWriters().size();
		boolean check = false;

		for (int i = 0; i < count; i++) {

			check = book.getWriters().get(i).equals(writer);

			if (check) {
				return check;
			}

		}

		return false;

	}

	public boolean checkPublishingHouse(Book book, String publishingHouse) {

		return book.getPublishingHouse().equals(publishingHouse);

	}

	public boolean checkPublishingYear(Book book, int year) {

		return book.getYearOfPublishing().get(Calendar.YEAR) > year;

	}

}
