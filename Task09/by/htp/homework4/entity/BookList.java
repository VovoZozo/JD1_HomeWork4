package by.htp.homework4.entity;

import java.util.List;
import java.util.Objects;

public class BookList {

	private List<Book> books;

	public BookList() {

	}

	public BookList(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public int hashCode() {
		return Objects.hash(books);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookList other = (BookList) obj;
		return Objects.equals(books, other.books);
	}

	@Override
	public String toString() {
		return "BookList [books=" + books + "]";
	}

}
