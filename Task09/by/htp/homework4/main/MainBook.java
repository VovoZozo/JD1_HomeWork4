package by.htp.homework4.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import by.htp.homework4.entity.Book;
import by.htp.homework4.entity.BookList;
import by.htp.homework4.entity.Writer;
import by.htp.homework4.logic.BookListLogic;
import by.htp.homework4.view.BookListPrinter;

public class MainBook {

	public static void main(String[] args) {

		Writer writer1 = new Writer("Ivan", "Ivanovich", "Ivanov");
		Writer writer2 = new Writer("Agatha", "Marie", "Black");
		Writer writer3 = new Writer("Barrett", "William", "Sinclair");
		Writer writer4 = new Writer("Barrett", "Ailliam", "Sinclair");
		Writer writer5 = new Writer("Carla", "Elizabeth", "Robertson");

		List<Writer> writersList1 = new ArrayList<Writer>();
		writersList1.add(writer1);
		List<Writer> writersList2 = new ArrayList<Writer>();
		writersList2.add(writer2);
		writersList2.add(writer3);
		List<Writer> writersList3 = new ArrayList<Writer>();
		writersList3.add(writer4);
		writersList3.add(writer5);
		List<Writer> writersList4 = new ArrayList<Writer>();
		writersList4.add(writer1);
		writersList4.add(writer4);
		List<Writer> writersList5 = new ArrayList<Writer>();
		writersList5.add(writer5);

		Calendar date1 = new GregorianCalendar(1985, 11, 13);
		Calendar date2 = new GregorianCalendar(1996, 4, 17);
		Calendar date3 = new GregorianCalendar(1973, 8, 25);
		Calendar date4 = new GregorianCalendar(2006, 3, 13);
		Calendar date5 = new GregorianCalendar(2018, 5, 4);

		Book book1 = new Book(1, "Pinocchio", writersList1, "Moscow", date1, 135, 15, "Hard");
		Book book2 = new Book(2, "Plant Life", writersList2, "Minsk", date2, 853, 200, "Hard");
		Book book3 = new Book(3, "Animal Life", writersList3, "Minsk", date3, 735, 250, "Hard");
		Book book4 = new Book(4, "Java", writersList4, "Moscow", date4, 1530, 450, "Hard");
		Book book5 = new Book(5, "C++", writersList5, "Moscow", date5, 1332, 346, "Soft");

		List<Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);

		BookList library = new BookList(books);

		BookListLogic bookListLogic = new BookListLogic();

		BookList byWriter1 = bookListLogic.booksByWriter(library, writer1);
		BookList byWriter2 = bookListLogic.booksByWriter(library, writer2);
		BookList byWriter3 = bookListLogic.booksByWriter(library, writer3);
		BookList byWriter4 = bookListLogic.booksByWriter(library, writer4);
		BookList byWriter5 = bookListLogic.booksByWriter(library, writer5);

		BookList byPublishingHouse = bookListLogic.booksByPublishingHouse(library, "Minsk");
		BookList byPublishingHouse2 = bookListLogic.booksByPublishingHouse(library, "Moscow");

		BookList booksByPublishingYear = bookListLogic.booksByPublishingYear(library, 1999);

		BookListPrinter print = new BookListPrinter();

		print.namePrint(byWriter1);
		print.namePrint(byWriter2);
		print.namePrint(byWriter3);
		print.namePrint(byWriter4);
		print.namePrint(byWriter5);

		print.namePrint(byPublishingHouse);
		print.namePrint(byPublishingHouse2);

		print.namePrint(booksByPublishingYear);
	}

}
