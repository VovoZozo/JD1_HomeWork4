package by.htp.homework4.logic;

import java.util.Comparator;

import by.htp.homework4.entity.Customer;

public class CustomerComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer e1, Customer e2) {
		return (e1.getFullName().toString()).compareTo(e2.getFullName().toString());
	}

	public static Comparator<Customer> FullNameComparator = new Comparator<Customer>() {

		@Override
		public int compare(Customer e1, Customer e2) {
			return (e1.getFullName().toString()).compareTo(e2.getFullName().toString());
		}
	};

	public static Comparator<Customer> CardNumberComparator = new Comparator<Customer>() {

		@Override
		public int compare(Customer e1, Customer e2) {
			return (int) ((e1.getBankInformation().getCardNumber()) - (e2.getBankInformation().getCardNumber()));
		}
	};

}
