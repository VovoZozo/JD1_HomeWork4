package by.htp.homework4.view;

import by.htp.homework4.entity.BookList;

public class BookListPrinter {

	public void namePrint(BookList books) {

		BookPrinter print = new BookPrinter();

		books.getBooks().forEach(book -> print.namePrint(book));

		System.out.println();
	}

}
