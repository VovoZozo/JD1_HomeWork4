package by.htp.homework4.printer;

import by.htp.homework4.entity.Customer;
import by.htp.homework4.entity.CustomerList;
import by.htp.homework4.entity.FullName;

public class FullNamePrinter {

	public void printFullName(Customer customer) {
		printFullName(customer.getFullName());
	}

	public void printFullName(CustomerList customers) {
		customers.getCustomers().forEach(customer -> printFullName(customer.getFullName()));
	}

	public void printFullName(FullName fullName) {
		System.out.println(fullName.getName() + " " + fullName.getMiddleName() + " " + fullName.getSurname());
	}

}
