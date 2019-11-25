package by.htp.homework4.entity;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class Book {

	private int id;
	private String title;
	private List<Writer> writers;
	private String publishingHouse;
	private Calendar yearOfPublishing;
	private int pagesNumber;
	private int cost;
	private String binding;

	public Book() {

	}

	public Book(int id, String title, List<Writer> writers, String publishingHouse, Calendar yearOfPublishing,
			int pagesNumber, int cost, String binding) {

		this.id = id;
		this.title = title;
		this.writers = writers;
		this.publishingHouse = publishingHouse;
		this.yearOfPublishing = yearOfPublishing;
		this.pagesNumber = pagesNumber;
		this.cost = cost;
		this.binding = binding;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Writer> getWriters() {
		return writers;
	}

	public void setWriters(List<Writer> writers) {
		this.writers = writers;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public Calendar getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(Calendar yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getPagesNumber() {
		return pagesNumber;
	}

	public void setPagesNumber(int pagesNumber) {
		this.pagesNumber = pagesNumber;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	@Override
	public int hashCode() {
		return Objects.hash(binding, cost, id, pagesNumber, publishingHouse, title, writers, yearOfPublishing);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(binding, other.binding) && cost == other.cost && id == other.id
				&& pagesNumber == other.pagesNumber && Objects.equals(publishingHouse, other.publishingHouse)
				&& Objects.equals(title, other.title) && Objects.equals(writers, other.writers)
				&& Objects.equals(yearOfPublishing, other.yearOfPublishing);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", writers=" + writers + ", publishingHouse=" + publishingHouse
				+ ", yearOfPublishing=" + yearOfPublishing + ", pagesNumber=" + pagesNumber + ", cost=" + cost
				+ ", binding=" + binding + "]";
	}

}
