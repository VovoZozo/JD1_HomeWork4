package by.htp.homework4.printer;

import by.htp.homework4.entity.Address;
import by.htp.homework4.entity.Customer;
import by.htp.homework4.list.CustomerList;

public class AddressPrinter {

	public void printAddress(Customer customer) {
		printAddress(customer.getAddress());
	}

	public void printAddress(CustomerList customers) {
		customers.getCustomers().forEach(customer -> printAddress(customer.getAddress()));
		;
	}

	public void printAddress(Address address) {
		System.out.print("Address: ");
		System.out.print(address.getCountry() + ", ");
		System.out.print(address.getState() + ", ");
		System.out.print(address.getTown() + ", ");
		System.out.print(address.getStreet() + ", ");
		System.out.print(address.getHouse() + ", ");
		System.out.print(address.getBuilding() + ", ");
		System.out.print(address.getApartment() + ", ");
		System.out.print(address.getPorch() + ", ");
		System.out.println(address.getFloor() + ".");
	}

}
