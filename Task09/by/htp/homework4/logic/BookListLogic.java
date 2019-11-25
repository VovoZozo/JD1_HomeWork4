package by.htp.homework4.logic;

import java.util.ArrayList;
import java.util.List;
import by.htp.homework4.entity.Book;
import by.htp.homework4.entity.BookList;
import by.htp.homework4.entity.Writer;

public class BookListLogic {

	public BookList booksByWriter(BookList bookList, Writer writer) {

		BookLogic checkWriter = new BookLogic();
		List<Book> byWriter = new ArrayList<Book>();

		int count = bookList.getBooks().size();
		boolean check;

		for (int i = 0; i < count; i++) {
			check = checkWriter.checkWriter(bookList.getBooks().get(i), writer);
			if (check) {
				byWriter.add(bookList.getBooks().get(i));
			}
		}

		BookList booksByWriter = new BookList(byWriter);

		return booksByWriter;
	}

	public BookList booksByPublishingHouse(BookList bookList, String publishingHouse) {

		BookLogic checkPublishingHouse = new BookLogic();
		List<Book> byPublishingHouse = new ArrayList<Book>();

		int count = bookList.getBooks().size();
		boolean check;

		for (int i = 0; i < count; i++) {
			check = checkPublishingHouse.checkPublishingHouse(bookList.getBooks().get(i), publishingHouse);

			if (check) {
				byPublishingHouse.add(bookList.getBooks().get(i));
			}

		}

		BookList booksByPublishingHouse = new BookList(byPublishingHouse);

		return booksByPublishingHouse;
	}

	public BookList booksByPublishingYear(BookList bookList, int year) {

		BookLogic checkPublishingYear = new BookLogic();
		List<Book> UpperPublishingYear = new ArrayList<Book>();

		int count = bookList.getBooks().size();
		boolean check;

		for (int i = 0; i < count; i++) {
			check = checkPublishingYear.checkPublishingYear(bookList.getBooks().get(i), year);

			if (check) {
				UpperPublishingYear.add(bookList.getBooks().get(i));
			}

		}

		BookList booksByPublishingYear = new BookList(UpperPublishingYear);

		return booksByPublishingYear;
	}
}
