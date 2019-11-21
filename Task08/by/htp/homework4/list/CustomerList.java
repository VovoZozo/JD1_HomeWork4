package by.htp.homework4.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import by.htp.homework4.entity.Customer;

public class CustomerList {

	ArrayList<Customer> customers = new ArrayList<Customer>();

	public CustomerList() {

	}

	public CustomerList(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public CustomerList(Customer... customers) {
		this.customers.addAll(Arrays.asList(customers));
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public Customer getCustomers(int i) {
		return customers.get(i);
	}

	public void setCustomers(Customer customer) {
		this.customers.add(customer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(customers);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerList other = (CustomerList) obj;
		return Objects.equals(customers, other.customers);
	}

	@Override
	public String toString() {
		return "CustomerList [\ncustomers=" + customers + "]";
	}

}
